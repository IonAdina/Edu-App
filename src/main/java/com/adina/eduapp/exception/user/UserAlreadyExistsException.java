package com.adina.eduapp.exception.user;

import com.adina.eduapp.exception.StoreException;
import org.springframework.http.HttpStatus;

public class UserAlreadyExistsException extends StoreException {
    public UserAlreadyExistsException() {
        this.setHttpStatus(HttpStatus.CONFLICT);
        this.setMessage("user exists with this username");
    }
}