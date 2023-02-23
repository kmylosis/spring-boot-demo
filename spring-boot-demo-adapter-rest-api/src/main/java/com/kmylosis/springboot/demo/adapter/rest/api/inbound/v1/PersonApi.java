package com.kmylosis.springboot.demo.adapter.rest.api.inbound.v1;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.kmylosis.springboot.demo.contracts.PersonDTO;
import java.math.BigInteger;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Validated
public interface PersonApi {

  @PostMapping(path = "/save", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
  ResponseEntity<PersonDTO> save(@RequestBody String jsonString);

  @GetMapping(path = "/retrieve/{identification}", produces = APPLICATION_JSON_VALUE)
  ResponseEntity<PersonDTO> findPersonByIdentification(@PathVariable("identification") BigInteger identification);

}
