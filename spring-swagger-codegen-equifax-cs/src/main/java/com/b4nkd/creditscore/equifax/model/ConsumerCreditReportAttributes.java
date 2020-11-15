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
 * ConsumerCreditReportAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAttributes   {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("value")
  private String value = null;

  public ConsumerCreditReportAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Variable identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "Variable identifier")
  
    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ConsumerCreditReportAttributes value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the variable
   * @return value
  **/
  @ApiModelProperty(value = "Value of the variable")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAttributes consumerCreditReportAttributes = (ConsumerCreditReportAttributes) o;
    return Objects.equals(this.identifier, consumerCreditReportAttributes.identifier) &&
        Objects.equals(this.value, consumerCreditReportAttributes.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAttributes {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
