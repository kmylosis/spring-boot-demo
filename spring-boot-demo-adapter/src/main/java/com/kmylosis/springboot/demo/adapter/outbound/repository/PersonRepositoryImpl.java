package com.kmylosis.springboot.demo.adapter.outbound.repository;

import com.kmylosis.springboot.demo.adapter.mappers.PersonMapper;
import com.kmylosis.springboot.demo.core.port.outbound.PersonRepository;
import com.kmylosis.springboot.demo.domain.Person;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class PersonRepositoryImpl implements PersonRepository {

  private final PersonEntityRepository personEntityRepository;


  @Override
  public Person save(Person person) {
    return PersonMapper.entityToDomain(personEntityRepository.save(Objects.requireNonNull(PersonMapper.domainToEntity(person))));
  }

  @Override
  public Person findByIdentification(String identification) {
    return PersonMapper.entityToDomain(personEntityRepository.findByIdentification(identification).stream().findFirst().orElse(null));
  }
}
