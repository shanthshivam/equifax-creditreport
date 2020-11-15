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
 * EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber   {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("driverLicenseNumber")
  private String driverLicenseNumber = null;

  public EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Owner of the drivers license
   * @return identifier
  **/
  @ApiModelProperty(example = "[\"Current\",\"Co-applicant\"]", value = "Owner of the drivers license")
  
    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber driverLicenseNumber(String driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
    return this;
  }

  /**
   * Subject's drivers license number
   * @return driverLicenseNumber
  **/
  @ApiModelProperty(value = "Subject's drivers license number")
  
  @Size(max=25)   public String getDriverLicenseNumber() {
    return driverLicenseNumber;
  }

  public void setDriverLicenseNumber(String driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber equifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber = (EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber) o;
    return Objects.equals(this.identifier, equifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber.identifier) &&
        Objects.equals(this.driverLicenseNumber, equifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber.driverLicenseNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, driverLicenseNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    driverLicenseNumber: ").append(toIndentedString(driverLicenseNumber)).append("\n");
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
