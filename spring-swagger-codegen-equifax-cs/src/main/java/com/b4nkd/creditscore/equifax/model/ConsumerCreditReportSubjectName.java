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
 * Subject&#x27;s full name
 */
@ApiModel(description = "Subject's full name")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportSubjectName   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("suffix")
  private String suffix = null;

  public ConsumerCreditReportSubjectName firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Subject's first name
   * @return firstName
  **/
  @ApiModelProperty(value = "Subject's first name")
  
  @Size(max=15)   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ConsumerCreditReportSubjectName lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Subject's last name
   * @return lastName
  **/
  @ApiModelProperty(value = "Subject's last name")
  
  @Size(max=25)   public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ConsumerCreditReportSubjectName middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Subject's middle name
   * @return middleName
  **/
  @ApiModelProperty(value = "Subject's middle name")
  
  @Size(max=15)   public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ConsumerCreditReportSubjectName suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Subject's suffix name
   * @return suffix
  **/
  @ApiModelProperty(value = "Subject's suffix name")
  
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
    ConsumerCreditReportSubjectName consumerCreditReportSubjectName = (ConsumerCreditReportSubjectName) o;
    return Objects.equals(this.firstName, consumerCreditReportSubjectName.firstName) &&
        Objects.equals(this.lastName, consumerCreditReportSubjectName.lastName) &&
        Objects.equals(this.middleName, consumerCreditReportSubjectName.middleName) &&
        Objects.equals(this.suffix, consumerCreditReportSubjectName.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, middleName, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportSubjectName {\n");
    
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
