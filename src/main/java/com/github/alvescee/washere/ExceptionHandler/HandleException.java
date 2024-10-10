package com.github.alvescee.washere.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class HandleException {
    
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionModel> handleGeneric(RuntimeException exception, HttpServletRequest request) {

        final HttpStatus status = HttpStatus.BAD_REQUEST;

        ExceptionModel model = new ExceptionModel(exception.getMessage(), status, request.getRequestURI());
        return ResponseEntity.status(status).body(model);
    }
    
}