package com.kmylosis.springboot.demo.adapter.inbound.rest.v1;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.kmylosis.springboot.demo.adapter.mappers.PersonMapper;
import com.kmylosis.springboot.demo.adapter.rest.api.inbound.v1.PersonApi;
import com.kmylosis.springboot.demo.contracts.PersonDTO;
import com.kmylosis.springboot.demo.core.port.inbound.service.PersonService;
import java.math.BigInteger;
import java.time.LocalDate;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/person")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class PersonController implements PersonApi {

  private final PersonService personService;

  @PostMapping(path = "/save", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
  @Override
  public ResponseEntity<PersonDTO> save(String jsonString) {
    //Json to PersonDTO
    return ResponseEntity.ok(PersonMapper.domainToDTO(personService.save(PersonMapper.dtoToDomain(createPersonDTO()))));
  }

  @GetMapping(path = "/retrieve/{identification}", produces = APPLICATION_JSON_VALUE)
  @Override
  public ResponseEntity<PersonDTO> findPersonByIdentification(BigInteger identification) {
    return ResponseEntity.ok(PersonMapper.domainToDTO(personService.findByIdentification(identification)));
  }

  private PersonDTO createPersonDTO() {
    return new PersonDTO("Kostas", "Mylosis", LocalDate.now(), BigInteger.valueOf(123456));
  }
}
