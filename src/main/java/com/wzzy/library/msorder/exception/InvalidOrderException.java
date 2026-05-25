package com.wzzy.library.msorder.exception;

import com.wzzy.library.bfflibrary.exception.ValidationException;

public class InvalidOrderException extends ValidationException {
    public InvalidOrderException(String message) {
        super(message, "INVALID_ORDER");
    }
}
