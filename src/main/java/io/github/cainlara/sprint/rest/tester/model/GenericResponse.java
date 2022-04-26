package io.github.cainlara.sprint.rest.tester.model;

import lombok.Data;

@Data
public class GenericResponse {
  private String handledAs;

  public GenericResponse(final AbstractLandingDto requestBody) {
    this.handledAs = requestBody.getType();
  }
}
