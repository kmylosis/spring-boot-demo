package com.kmylosis.springboot.demo.adapter.outbound.repository;

import com.kmylosis.springboot.demo.adapter.mappers.PersonMapper;
import com.kmylosis.springboot.demo.domain.Person;
import com.kmylosis.springboot.demo.domain.core.port.outbound.PersonRepository;
import java.math.BigInteger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class PersonEntityRepositoryImpl implements PersonRepository {

  private final PersonEntityRepository personEntityRepository;

  private final PersonMapper personMapper;


  @Override
  public void save(Person person) {
    personEntityRepository.save(personMapper.domainToEntity(person));
  }

  @Override
  public Person findByIdentification(BigInteger identification) {
    return personMapper.entityToDomain(personEntityRepository.findByIdentification(identification).stream().findFirst().orElse(null));
  }
}
