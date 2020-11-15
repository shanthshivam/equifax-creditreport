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
 * CreditReportRequestConsumersName
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequestConsumersName   {
  @JsonProperty("identifier")
  private String identifier = "Current";

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("suffix")
  private String suffix = null;

  public CreditReportRequestConsumersName identifier(String identifier) {
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

  public CreditReportRequestConsumersName firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name")
      @NotNull

  @Size(max=15)   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreditReportRequestConsumersName lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name")
      @NotNull

  @Size(max=25)   public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreditReportRequestConsumersName middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name or initial
   * @return middleName
  **/
  @ApiModelProperty(value = "Middle name or initial")
  
  @Size(max=15)   public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public CreditReportRequestConsumersName suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Suffix
   * @return suffix
  **/
  @ApiModelProperty(value = "Suffix")
  
  @Size(max=2)   public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportRequestConsumersName creditReportRequestConsumersName = (CreditReportRequestConsumersName) o;
    return Objects.equals(this.identifier, creditReportRequestConsumersName.identifier) &&
        Objects.equals(this.firstName, creditReportRequestConsumersName.firstName) &&
        Objects.equals(this.lastName, creditReportRequestConsumersName.lastName) &&
        Objects.equals(this.middleName, creditReportRequestConsumersName.middleName) &&
        Objects.equals(this.suffix, creditReportRequestConsumersName.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, firstName, lastName, middleName, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequestConsumersName {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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
