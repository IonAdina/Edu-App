package com.adina.eduapp.validator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@Slf4j
@RequiredArgsConstructor
public class GeneralValidator {
    private static final Pattern email_pattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.){1,}[a-zA-Z]{2,7}$", Pattern.CASE_INSENSITIVE);

    public boolean isValidEmail(String email) {
        Matcher matcher = email_pattern.matcher(email);
        return matcher.matches();
    }

}