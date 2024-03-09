package com.backend.roin_engineer.redis.exception;

import java.util.Date;

public record ErrorMessage(int statusCode, Date timestamp, String message, String description) {
}
