package com.kmylosis.springboot.demo.adapter.mappers;

import com.kmylosis.springboot.demo.contracts.PersonDTO;
import com.kmylosis.springboot.demo.adapter.outbound.repository.entities.PersonE;
import com.kmylosis.springboot.demo.domain.Person;
import java.util.Objects;

public class PersonMapper {

  private PersonMapper() {
    throw new IllegalStateException("Mapping class");
  }

  public static Person dtoToDomain(PersonDTO personDTO) {
    if (Objects.isNull(personDTO)) {
      return null;
    }
    Person person = new Person();
    person.setFirstName(personDTO.getFirstName());
    person.setLastName(personDTO.getLastName());
    person.setDateOfBirth(personDTO.getDateOfBirth());
    person.setIdentification(personDTO.getIdentification());
    return person;
  }

  public static PersonDTO domainToDTO(Person person) {
    if (Objects.isNull(person)) {
      return null;
    }
    PersonDTO personDTO = new PersonDTO();
    personDTO.setFirstName(person.getFirstName());
    personDTO.setLastName(person.getLastName());
    personDTO.setDateOfBirth(person.getDateOfBirth());
    personDTO.setIdentification(person.getIdentification());
    return personDTO;
  }

  public static PersonE domainToEntity(Person person) {
    if (Objects.isNull(person)) {
      return null;
    }
    PersonE personE = new PersonE();
    personE.setFirstName(person.getFirstName());
    personE.setLastName(person.getLastName());
    personE.setDateOfBirth(person.getDateOfBirth());
    personE.setIdentification(person.getIdentification());
    return personE;
  }

  public static Person entityToDomain(PersonE personE) {
    if (Objects.isNull(personE)) {
      return null;
    }
    Person person = new Person();
    person.setFirstName(personE.getFirstName());
    person.setLastName(personE.getLastName());
    person.setDateOfBirth(personE.getDateOfBirth());
    person.setIdentification(personE.getIdentification());
    return person;
  }

}
