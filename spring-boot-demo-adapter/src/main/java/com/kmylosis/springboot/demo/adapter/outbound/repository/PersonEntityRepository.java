package com.kmylosis.springboot.demo.adapter.outbound.repository;

import com.kmylosis.springboot.demo.adapter.outbound.repository.entities.PersonE;
import java.math.BigInteger;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonEntityRepository extends JpaRepository<PersonE, String>, JpaSpecificationExecutor<PersonE> {

  Optional<PersonE> findByIdentification(BigInteger identification);

}
