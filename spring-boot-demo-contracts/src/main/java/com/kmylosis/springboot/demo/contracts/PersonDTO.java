package com.kmylosis.springboot.demo.contracts;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

public class PersonDTO {

  private String firstName;

  private String lastName;

  private LocalDate dateOfBirth;

  private BigInteger identification;

  public PersonDTO(String firstName, String lastName, LocalDate dateOfBirth, BigInteger identification) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.identification = identification;
  }

  public PersonDTO() {
  }

  public static PersonDTOBuilder builder() {
    return new PersonDTOBuilder();
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

  public BigInteger getIdentification() {
    return this.identification;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setIdentification(BigInteger identification) {
    this.identification = identification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonDTO personDTO = (PersonDTO) o;
    return getFirstName().equals(personDTO.getFirstName()) && getLastName().equals(personDTO.getLastName()) && getDateOfBirth().equals(
            personDTO.getDateOfBirth())
            && getIdentification().equals(personDTO.getIdentification());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getLastName(), getDateOfBirth(), getIdentification());
  }

  public String toString() {
    return "PersonDTO(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", dateOfBirth=" + this.getDateOfBirth() + ", identification="
            + this.getIdentification() + ")";
  }

  public static class PersonDTOBuilder {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private BigInteger identification;

    PersonDTOBuilder() {
    }

    public PersonDTOBuilder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public PersonDTOBuilder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public PersonDTOBuilder withDateOfBirth(LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public PersonDTOBuilder withIdentification(BigInteger identification) {
      this.identification = identification;
      return this;
    }

    public PersonDTO build() {
      return new PersonDTO(firstName, lastName, dateOfBirth, identification);
    }

    public String toString() {
      return "PersonDTO.PersonDTOBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth
              + ", identification="
              + this.identification + ")";
    }
  }
}
