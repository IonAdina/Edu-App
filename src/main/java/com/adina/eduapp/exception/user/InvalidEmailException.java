package com.adina.eduapp.exception.user;

import com.adina.eduapp.exception.StoreException;
import org.springframework.http.HttpStatus;

public class InvalidEmailException extends StoreException {
    public InvalidEmailException() {
        this.setHttpStatus(HttpStatus.BAD_REQUEST);
        this.setMessage("Invalid username, does not match proper format");
    }
}
