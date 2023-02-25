package com.kmylosis.springboot.demo.core.port.inbound.service;

import com.kmylosis.springboot.demo.domain.Person;

public interface PersonService {

  Person save(Person person);

  Person findByIdentification(String identification);

}
