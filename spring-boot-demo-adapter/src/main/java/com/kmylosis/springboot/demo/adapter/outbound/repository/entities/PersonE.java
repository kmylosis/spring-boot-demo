package com.kmylosis.springboot.demo.adapter.outbound.repository.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.math.BigInteger;
import java.time.LocalDate;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
public class PersonE {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sid_seq")
  @SequenceGenerator(name = "person_sid_seq", sequenceName = "person_sid_seq", allocationSize = 1)
  @Column(name = "sid")
  private Long sid;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "date_of_birth")
  private LocalDate dateOfBirth;

  @Column(name = "identification")
  private BigInteger identification;

}
