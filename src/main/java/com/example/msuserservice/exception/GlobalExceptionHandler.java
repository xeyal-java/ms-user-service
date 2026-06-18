package com.example.msuserservice.exception;

import com.example.msuserservice.dto.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<com.example.msuserservice.dto.response.ErrorResponse> handleOrderNotFound(UserNotFoundException e) {
        ErrorResponse error = ErrorResponse.builder()
                .message(e.getMessage())
                .code("USER_NOT_FOUND")
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(error,NOT_FOUND);
    }

    @ExceptionHandler(InvalidPasswordException.class)
    public ResponseEntity<ErrorResponse> handleInvalidPasswordException(InvalidPasswordException e) {
        ErrorResponse error = ErrorResponse.builder()
                .message(e.getMessage())
                .code("INVALID_PASSWORD")
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(error,BAD_REQUEST);
    }
}
