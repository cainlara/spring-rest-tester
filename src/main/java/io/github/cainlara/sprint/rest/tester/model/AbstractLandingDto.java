package io.github.cainlara.sprint.rest.tester.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import lombok.Data;

@Data
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "productType")
@JsonSubTypes({ @JsonSubTypes.Type(value = RefilyLandingDto.class, name = "refily"),
    @JsonSubTypes.Type(value = MSQLLandingDto.class, name = "msql"),
    @JsonSubTypes.Type(value = YetAnotherLandingDto.class, name = "other"), })
public abstract class AbstractLandingDto {
  private String productType;

  protected abstract String getType();
}
