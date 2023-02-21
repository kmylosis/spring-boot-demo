package com.kmylosis.springboot.demo.domain.core.port.outbound;

import com.kmylosis.springboot.demo.domain.Person;
import java.math.BigInteger;

public interface PersonRepository {

  void save(Person person);

  Person findByIdentification(BigInteger identification);


}
