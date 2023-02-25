package com.kmylosis.springboot.demo.adapter.outbound.repository.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "PERSON")
public class PersonE {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "sid")
  private Long sid;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Column(name = "date_of_birth", nullable = false)
  private LocalDate dateOfBirth;

  @Column(name = "identification", nullable = false, unique = true)
  private String identification;

}
