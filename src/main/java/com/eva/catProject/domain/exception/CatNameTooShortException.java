package com.eva.catProject.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CatNameTooShortException extends RuntimeException {
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    public CatNameTooShortException(String message) {
        super(message);
        this.message = message;
    }
}
