package com.kmylosis.springboot.demo.core.port.inbound.service;

import com.kmylosis.springboot.demo.domain.Person;
import java.math.BigInteger;

public interface PersonService {

  Person save(Person person);

  Person findByIdentification(BigInteger identification);

}
