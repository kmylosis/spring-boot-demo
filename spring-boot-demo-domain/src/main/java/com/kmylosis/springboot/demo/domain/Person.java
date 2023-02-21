package com.kmylosis.springboot.demo.domain;

import java.math.BigInteger;
import java.time.LocalDate;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {

  private String firstName;

  private String lastName;

  private LocalDate dateOfBirth;

  private BigInteger identification;

}
