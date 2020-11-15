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
 * CreditReportRequestConsumersEmployments
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequestConsumersEmployments   {
  @JsonProperty("occupation")
  private String occupation = null;

  @JsonProperty("employerName")
  private String employerName = null;

  public CreditReportRequestConsumersEmployments occupation(String occupation) {
    this.occupation = occupation;
    return this;
  }

  /**
   * Occupation
   * @return occupation
  **/
  @ApiModelProperty(value = "Occupation")
  
  @Size(max=35)   public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public CreditReportRequestConsumersEmployments employerName(String employerName) {
    this.employerName = employerName;
    return this;
  }

  /**
   * Employer
   * @return employerName
  **/
  @ApiModelProperty(value = "Employer")
  
  @Size(max=35)   public String getEmployerName() {
    return employerName;
  }

  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportRequestConsumersEmployments creditReportRequestConsumersEmployments = (CreditReportRequestConsumersEmployments) o;
    return Objects.equals(this.occupation, creditReportRequestConsumersEmployments.occupation) &&
        Objects.equals(this.employerName, creditReportRequestConsumersEmployments.employerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occupation, employerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequestConsumersEmployments {\n");
    
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
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
