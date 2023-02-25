package com.kmylosis.springboot.demo.domain;

import java.time.LocalDate;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {

  private String firstName;

  private String lastName;

  private LocalDate dateOfBirth;

  private String identification;

}
