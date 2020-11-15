package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditReportRequestConsumersSocialNum
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequestConsumersSocialNum   {
  @JsonProperty("identifier")
  private String identifier = "Current";

  @JsonProperty("number")
  private String number = null;

  public CreditReportRequestConsumersSocialNum identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Record identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "[\"Current\",\"Co-applicant\"]", required = true, value = "Record identifier")
      @NotNull

    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public CreditReportRequestConsumersSocialNum number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Social Security Number (SSN)
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Social Security Number (SSN)")
      @NotNull

  @Size(max=9)   public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportRequestConsumersSocialNum creditReportRequestConsumersSocialNum = (CreditReportRequestConsumersSocialNum) o;
    return Objects.equals(this.identifier, creditReportRequestConsumersSocialNum.identifier) &&
        Objects.equals(this.number, creditReportRequestConsumersSocialNum.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequestConsumersSocialNum {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
