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
 * CreditReportRequestConsumersPhoneNumbers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequestConsumersPhoneNumbers   {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("number")
  private String number = null;

  public CreditReportRequestConsumersPhoneNumbers identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "[\"Current\",\"Co-applicant\"]", required = true, value = "")
      @NotNull

    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public CreditReportRequestConsumersPhoneNumbers number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(max=10)   public String getNumber() {
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
    CreditReportRequestConsumersPhoneNumbers creditReportRequestConsumersPhoneNumbers = (CreditReportRequestConsumersPhoneNumbers) o;
    return Objects.equals(this.identifier, creditReportRequestConsumersPhoneNumbers.identifier) &&
        Objects.equals(this.number, creditReportRequestConsumersPhoneNumbers.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequestConsumersPhoneNumbers {\n");
    
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
