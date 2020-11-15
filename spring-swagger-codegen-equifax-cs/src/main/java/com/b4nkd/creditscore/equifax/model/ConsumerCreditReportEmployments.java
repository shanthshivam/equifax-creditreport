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
 * ConsumerCreditReportEmployments
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportEmployments   {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("occupation")
  private String occupation = null;

  @JsonProperty("employer")
  private String employer = null;

  @JsonProperty("dateLastReported")
  private String dateLastReported = null;

  @JsonProperty("dateFirstReported")
  private String dateFirstReported = null;

  public ConsumerCreditReportEmployments identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * It describes the type of employment
   * @return identifier
  **/
  @ApiModelProperty(example = "[\"current\",\"former\",\"secondFormer\"]", value = "It describes the type of employment")
  
  @Size(max=12)   public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ConsumerCreditReportEmployments occupation(String occupation) {
    this.occupation = occupation;
    return this;
  }

  /**
   * Subject's occupation
   * @return occupation
  **/
  @ApiModelProperty(value = "Subject's occupation")
  
  @Size(max=35)   public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public ConsumerCreditReportEmployments employer(String employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Employer's name
   * @return employer
  **/
  @ApiModelProperty(value = "Employer's name")
  
  @Size(max=35)   public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public ConsumerCreditReportEmployments dateLastReported(String dateLastReported) {
    this.dateLastReported = dateLastReported;
    return this;
  }

  /**
   * Get dateLastReported
   * @return dateLastReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getDateLastReported() {
    return dateLastReported;
  }

  public void setDateLastReported(String dateLastReported) {
    this.dateLastReported = dateLastReported;
  }

  public ConsumerCreditReportEmployments dateFirstReported(String dateFirstReported) {
    this.dateFirstReported = dateFirstReported;
    return this;
  }

  /**
   * Get dateFirstReported
   * @return dateFirstReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getDateFirstReported() {
    return dateFirstReported;
  }

  public void setDateFirstReported(String dateFirstReported) {
    this.dateFirstReported = dateFirstReported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportEmployments consumerCreditReportEmployments = (ConsumerCreditReportEmployments) o;
    return Objects.equals(this.identifier, consumerCreditReportEmployments.identifier) &&
        Objects.equals(this.occupation, consumerCreditReportEmployments.occupation) &&
        Objects.equals(this.employer, consumerCreditReportEmployments.employer) &&
        Objects.equals(this.dateLastReported, consumerCreditReportEmployments.dateLastReported) &&
        Objects.equals(this.dateFirstReported, consumerCreditReportEmployments.dateFirstReported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, occupation, employer, dateLastReported, dateFirstReported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportEmployments {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    dateLastReported: ").append(toIndentedString(dateLastReported)).append("\n");
    sb.append("    dateFirstReported: ").append(toIndentedString(dateFirstReported)).append("\n");
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
