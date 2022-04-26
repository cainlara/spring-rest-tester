package io.github.cainlara.sprint.rest.tester.model;

import lombok.Data;

@Data
public class MSQLLandingDto extends AbstractLandingDto {
  private int field3;
  private int field4;

  @Override
  protected String getType() {
    return "MSQL";
  }
}
