package com.kmylosis.springboot.demo.core.port.outbound;

import com.kmylosis.springboot.demo.domain.Person;
import java.math.BigInteger;

public interface PersonRepository {

  Person save(Person person);

  Person findByIdentification(BigInteger identification);


}
