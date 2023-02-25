package com.kmylosis.springboot.demo.core.port.outbound;

import com.kmylosis.springboot.demo.domain.Person;

public interface PersonRepository {

  Person save(Person person);

  Person findByIdentification(String identification);


}
