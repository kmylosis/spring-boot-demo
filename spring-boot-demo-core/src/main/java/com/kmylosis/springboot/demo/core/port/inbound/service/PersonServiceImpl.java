package com.kmylosis.springboot.demo.core.port.inbound.service;

import com.kmylosis.springboot.demo.core.port.outbound.PersonRepository;
import com.kmylosis.springboot.demo.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;

  @Override
  public Person save(Person person) {
    return personRepository.save(person);
  }

  @Override
  public Person findByIdentification(String identification) {
    return personRepository.findByIdentification(identification);
  }
}
