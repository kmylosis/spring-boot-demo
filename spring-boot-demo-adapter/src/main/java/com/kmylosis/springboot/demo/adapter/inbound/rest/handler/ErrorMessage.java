package com.kmylosis.springboot.demo.adapter.inbound.rest.handler;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
  private int statusCode;
  private LocalDateTime timestamp;
  private String message;
  private String description;

}