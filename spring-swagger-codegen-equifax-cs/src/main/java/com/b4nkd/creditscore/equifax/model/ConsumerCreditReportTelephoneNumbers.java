package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportTelephoneNumberType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contact&#x27;s telephone information
 */
@ApiModel(description = "Contact's telephone information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportTelephoneNumbers   {
  @JsonProperty("telephoneNumberType")
  private ConsumerCreditReportTelephoneNumberType telephoneNumberType = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber = null;

  @JsonProperty("extension")
  private String extension = null;

  public ConsumerCreditReportTelephoneNumbers telephoneNumberType(ConsumerCreditReportTelephoneNumberType telephoneNumberType) {
    this.telephoneNumberType = telephoneNumberType;
    return this;
  }

  /**
   * Get telephoneNumberType
   * @return telephoneNumberType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportTelephoneNumberType getTelephoneNumberType() {
    return telephoneNumberType;
  }

  public void setTelephoneNumberType(ConsumerCreditReportTelephoneNumberType telephoneNumberType) {
    this.telephoneNumberType = telephoneNumberType;
  }

  public ConsumerCreditReportTelephoneNumbers countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * the telephone's country code
   * @return countryCode
  **/
  @ApiModelProperty(value = "the telephone's country code")
  
  @Size(max=4)   public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public ConsumerCreditReportTelephoneNumbers telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Get telephoneNumber
   * @return telephoneNumber
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=10)   public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public ConsumerCreditReportTelephoneNumbers extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Telephone extension if it's present
   * @return extension
  **/
  @ApiModelProperty(value = "Telephone extension if it's present")
  
  @Size(max=5)   public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportTelephoneNumbers consumerCreditReportTelephoneNumbers = (ConsumerCreditReportTelephoneNumbers) o;
    return Objects.equals(this.telephoneNumberType, consumerCreditReportTelephoneNumbers.telephoneNumberType) &&
        Objects.equals(this.countryCode, consumerCreditReportTelephoneNumbers.countryCode) &&
        Objects.equals(this.telephoneNumber, consumerCreditReportTelephoneNumbers.telephoneNumber) &&
        Objects.equals(this.extension, consumerCreditReportTelephoneNumbers.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telephoneNumberType, countryCode, telephoneNumber, extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportTelephoneNumbers {\n");
    
    sb.append("    telephoneNumberType: ").append(toIndentedString(telephoneNumberType)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
