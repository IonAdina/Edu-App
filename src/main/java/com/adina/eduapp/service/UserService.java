package com.adina.eduapp.service;

import com.adina.eduapp.dto.request.UserCreateDto;
import com.adina.eduapp.dto.response.UserResponseDto;
import com.adina.eduapp.entity.Professor;
import com.adina.eduapp.entity.Student;
import com.adina.eduapp.entity.User;
import com.adina.eduapp.exception.user.InvalidEmailException;
import com.adina.eduapp.exception.user.UserAlreadyExistsException;
import com.adina.eduapp.repository.UserRepository;
import com.adina.eduapp.validator.GeneralValidator;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final GeneralValidator validator;

    @Transactional
    public UserResponseDto crateUser(@Valid UserCreateDto userCreateDto){
        log.info("Creating user with username: {}", userCreateDto.getUsername());
        validateUser(userCreateDto);
        log.info("User validated");
        User user = switch (userCreateDto.getUserType().toUpperCase()) {
            case "STUDENT" -> modelMapper.map(userCreateDto, Student.class);
            case "PROFESSOR" -> modelMapper.map(userCreateDto, Professor.class);
            default -> throw new InvalidUserTypeException();
        };
    }


    @Transactional
    public void validateUser(UserCreateDto userCreateDto) {
        log.info("Validating user with username: {}", userCreateDto.getUsername());
        if (!validator.isValidEmail(userCreateDto.getUsername())) {
            log.warn("Invalid username format: {}", userCreateDto.getUsername());
            throw new InvalidEmailException();
        }
        userRepository.findByUsername(userCreateDto.getUsername())
                .ifPresent(user -> { throw new UserAlreadyExistsException(); });
    }
}
