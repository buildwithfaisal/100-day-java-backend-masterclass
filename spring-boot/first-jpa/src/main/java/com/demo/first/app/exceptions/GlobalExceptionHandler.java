package com.demo.first.app.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // EXCEPTION HANDLING METHOD
    @ExceptionHandler({UserNotFoundException.class, IllegalArgumentException.class, NullPointerException.class})
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(
            Exception exception
    ) {
        logger.error("Error when finding user: ", exception);
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("timestamp", LocalDateTime.now());
        errorResponse.put("status", HttpStatus.BAD_REQUEST.value());
        errorResponse.put("error", "Bad request");
        errorResponse.put("message", exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Map<String, Object>> handleMethodNotSupported(
            Exception exception
    ) {
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("timestamp", LocalDateTime.now());
        errorResponse.put("status", HttpStatus.METHOD_NOT_ALLOWED.value());
        errorResponse.put("error", "Method not allowed on this endpoint");
        errorResponse.put("message", exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.METHOD_NOT_ALLOWED);
    }
}

/*
*
* {
    "timestamp": "2025-10-28T05:54:04.053+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "path": "/user"
}
* */