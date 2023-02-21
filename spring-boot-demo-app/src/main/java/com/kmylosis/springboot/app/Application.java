package com.kmylosis.springboot.app;

import com.kmylosis.springboot.SpringBootDemoBasePackage;
import com.kmylosis.springboot.demo.adapter.dto.PersonDTO;
import com.kmylosis.springboot.demo.adapter.mappers.PersonMapper;
import com.kmylosis.springboot.demo.domain.core.port.outbound.PersonRepository;
import java.math.BigInteger;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {SpringBootDemoBasePackage.class})
public class Application {

  @Autowired
  private static PersonRepository personRepository;

  @Autowired
  private static PersonMapper personMapper;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    System.out.println("Hello world!");
    PersonDTO personDTO = PersonDTO.builder().withFirstName("Konstantinos").withLastName("Mylosis").withDateOfBirth(LocalDate.now())
            .withIdentification(BigInteger.valueOf(123456)).build();
    personRepository.save(personMapper.dtoToDomain(personDTO));

    personRepository.findByIdentification(BigInteger.valueOf(123456));
  }

  public static void setPersonMapper(PersonMapper personMapper) {
    Application.personMapper = personMapper;
  }

  public static void setPersonRepository(PersonRepository personRepository) {
    Application.personRepository = personRepository;
  }
}