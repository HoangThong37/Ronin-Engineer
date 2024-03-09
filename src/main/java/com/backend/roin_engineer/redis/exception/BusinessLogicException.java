package com.backend.roin_engineer.redis.exception;

public class BusinessLogicException extends RuntimeException {

    public BusinessLogicException(String message) {
        super(message);
    }
}