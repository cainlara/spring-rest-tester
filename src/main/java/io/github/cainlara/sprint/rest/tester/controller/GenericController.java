package io.github.cainlara.sprint.rest.tester.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.cainlara.sprint.rest.tester.model.AbstractLandingDto;
import io.github.cainlara.sprint.rest.tester.model.GenericResponse;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/v1")
@Slf4j
public class GenericController {

  @PostMapping(value = "/test", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<GenericResponse> triggerUnitTestingExecution(
      final @RequestBody AbstractLandingDto requestBody) {
    log.info("Starting with " + requestBody);
    ResponseEntity<GenericResponse> httpResponse = ResponseEntity.status(HttpStatus.ACCEPTED)
        .body(new GenericResponse(requestBody));
    log.info("Ending ... ");
    return httpResponse;
  }
}
