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
 * ConsumerCreditReportFormerNames
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportFormerNames   {
  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleInitial")
  private String middleInitial = null;

  @JsonProperty("suffix")
  private String suffix = null;

  public ConsumerCreditReportFormerNames lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Subject's former last name
   * @return lastName
  **/
  @ApiModelProperty(value = "Subject's former last name")
  
  @Size(max=25)   public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ConsumerCreditReportFormerNames firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Subject's former first name
   * @return firstName
  **/
  @ApiModelProperty(value = "Subject's former first name")
  
  @Size(max=15)   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ConsumerCreditReportFormerNames middleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
    return this;
  }

  /**
   * Subject's former middle name
   * @return middleInitial
  **/
  @ApiModelProperty(value = "Subject's former middle name")
  
  @Size(max=15)   public String getMiddleInitial() {
    return middleInitial;
  }

  public void setMiddleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
  }

  public ConsumerCreditReportFormerNames suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Subject's former suffix
   * @return suffix
  **/
  @ApiModelProperty(value = "Subject's former suffix")
  
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
    ConsumerCreditReportFormerNames consumerCreditReportFormerNames = (ConsumerCreditReportFormerNames) o;
    return Objects.equals(this.lastName, consumerCreditReportFormerNames.lastName) &&
        Objects.equals(this.firstName, consumerCreditReportFormerNames.firstName) &&
        Objects.equals(this.middleInitial, consumerCreditReportFormerNames.middleInitial) &&
        Objects.equals(this.suffix, consumerCreditReportFormerNames.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName, middleInitial, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportFormerNames {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleInitial: ").append(toIndentedString(middleInitial)).append("\n");
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
