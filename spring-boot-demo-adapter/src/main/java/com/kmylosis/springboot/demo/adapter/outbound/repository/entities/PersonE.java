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
@Table(name = "PEOPLE")
public class PersonE {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "SID")
  private Long sid;

  @Column(name = "FIRST_NAME")
  private String firstName;

  @Column(name = "LAST_NAME", nullable = false)
  private String lastName;

  @Column(name = "DATE_OF_BIRTH", nullable = false)
  private LocalDate dateOfBirth;

  @Column(name = "IDENTIFICATION", nullable = false, unique = true)
  private String identification;

}
