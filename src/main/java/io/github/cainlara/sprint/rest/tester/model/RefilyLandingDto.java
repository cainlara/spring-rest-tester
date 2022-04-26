package io.github.cainlara.sprint.rest.tester.model;

import lombok.Data;

@Data
public class RefilyLandingDto extends AbstractLandingDto {
  private String field1;
  private String field2;

  @Override
  protected String getType() {
    return "Refily";
  }
}
