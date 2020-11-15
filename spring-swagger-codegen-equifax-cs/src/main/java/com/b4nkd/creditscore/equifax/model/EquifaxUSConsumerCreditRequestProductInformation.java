package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EquifaxUSConsumerCreditRequestProductInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class EquifaxUSConsumerCreditRequestProductInformation   {
  @JsonProperty("driverLicenseNumber")
  @Valid
  private List<EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber> driverLicenseNumber = null;

  @JsonProperty("coApplicantDateOfBirth")
  private String coApplicantDateOfBirth = null;

  public EquifaxUSConsumerCreditRequestProductInformation driverLicenseNumber(List<EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber> driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
    return this;
  }

  public EquifaxUSConsumerCreditRequestProductInformation addDriverLicenseNumberItem(EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber driverLicenseNumberItem) {
    if (this.driverLicenseNumber == null) {
      this.driverLicenseNumber = new ArrayList<EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber>();
    }
    this.driverLicenseNumber.add(driverLicenseNumberItem);
    return this;
  }

  /**
   * Get driverLicenseNumber
   * @return driverLicenseNumber
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber> getDriverLicenseNumber() {
    return driverLicenseNumber;
  }

  public void setDriverLicenseNumber(List<EquifaxUSConsumerCreditRequestProductInformationDriverLicenseNumber> driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
  }

  public EquifaxUSConsumerCreditRequestProductInformation coApplicantDateOfBirth(String coApplicantDateOfBirth) {
    this.coApplicantDateOfBirth = coApplicantDateOfBirth;
    return this;
  }

  /**
   * Get coApplicantDateOfBirth
   * @return coApplicantDateOfBirth
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getCoApplicantDateOfBirth() {
    return coApplicantDateOfBirth;
  }

  public void setCoApplicantDateOfBirth(String coApplicantDateOfBirth) {
    this.coApplicantDateOfBirth = coApplicantDateOfBirth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquifaxUSConsumerCreditRequestProductInformation equifaxUSConsumerCreditRequestProductInformation = (EquifaxUSConsumerCreditRequestProductInformation) o;
    return Objects.equals(this.driverLicenseNumber, equifaxUSConsumerCreditRequestProductInformation.driverLicenseNumber) &&
        Objects.equals(this.coApplicantDateOfBirth, equifaxUSConsumerCreditRequestProductInformation.coApplicantDateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverLicenseNumber, coApplicantDateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquifaxUSConsumerCreditRequestProductInformation {\n");
    
    sb.append("    driverLicenseNumber: ").append(toIndentedString(driverLicenseNumber)).append("\n");
    sb.append("    coApplicantDateOfBirth: ").append(toIndentedString(coApplicantDateOfBirth)).append("\n");
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
