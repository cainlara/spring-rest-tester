package io.github.cainlara.sprint.rest.tester.model;

import lombok.Data;

@Data
public class YetAnotherLandingDto extends AbstractLandingDto {
  private boolean field5;
  private boolean field6;

  @Override
  protected String getType() {
    return "This is another product type";
  }
}
