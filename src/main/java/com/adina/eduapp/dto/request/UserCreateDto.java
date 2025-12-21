package com.adina.eduapp.dto.request;

import com.adina.eduapp.annotation.AllowedValues;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto {
    @NotBlank
    @Email
    private String username;

    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    @Size(min=8, message="Password must be at least 8 characters long")
    private String password;

    @AllowedValues(values={"STUDENT", "PROFESSOR"})
    private String userType;
}
