package com.kmylosis.springboot.demo.adapter.dto;

import java.math.BigInteger;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

  private String firstName;

  private String lastName;

  private LocalDate dateOfBirth;

  private BigInteger identification;

}
