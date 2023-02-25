package com.kmylosis.springboot.demo.adapter.inbound.rest.handler;

import java.time.LocalDateTime;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler(DataIntegrityViolationException.class)
  public ResponseEntity<ErrorMessage> dataIntegrityViolationException(DataIntegrityViolationException ex, WebRequest request) {
    ErrorMessage message = new ErrorMessage(HttpStatus.CONFLICT.value(), LocalDateTime.now(), ex.getMessage(), request.getDescription(false));

    return new ResponseEntity<>(message, HttpStatus.CONFLICT);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorMessage> globalExceptionHandler(Exception ex, WebRequest request) {
    ErrorMessage message = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), LocalDateTime.now(), ex.getMessage(), request.getDescription(false));

    return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
