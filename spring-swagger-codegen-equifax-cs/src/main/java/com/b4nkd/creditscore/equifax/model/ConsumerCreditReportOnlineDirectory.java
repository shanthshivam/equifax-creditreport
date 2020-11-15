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
 * ConsumerCreditReportOnlineDirectory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportOnlineDirectory   {
  @JsonProperty("customerNumber")
  private String customerNumber = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("stateAbbreviation")
  private String stateAbbreviation = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  public ConsumerCreditReportOnlineDirectory customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Equifax customer number
   * @return customerNumber
  **/
  @ApiModelProperty(value = "Equifax customer number")
  
  @Size(max=10)   public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public ConsumerCreditReportOnlineDirectory customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Customer's name
   * @return customerName
  **/
  @ApiModelProperty(value = "Customer's name")
  
  @Size(max=20)   public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public ConsumerCreditReportOnlineDirectory telephoneNumber(String telephoneNumber) {
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

  public ConsumerCreditReportOnlineDirectory addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Customer address line 1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Customer address line 1")
  
  @Size(max=30)   public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ConsumerCreditReportOnlineDirectory addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Customer address line 2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Customer address line 2")
  
  @Size(max=30)   public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ConsumerCreditReportOnlineDirectory city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city name
   * @return city
  **/
  @ApiModelProperty(value = "The city name")
  
  @Size(max=21)   public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ConsumerCreditReportOnlineDirectory stateAbbreviation(String stateAbbreviation) {
    this.stateAbbreviation = stateAbbreviation;
    return this;
  }

  /**
   * State name's abbreviation
   * @return stateAbbreviation
  **/
  @ApiModelProperty(value = "State name's abbreviation")
  
  @Size(max=2)   public String getStateAbbreviation() {
    return stateAbbreviation;
  }

  public void setStateAbbreviation(String stateAbbreviation) {
    this.stateAbbreviation = stateAbbreviation;
  }

  public ConsumerCreditReportOnlineDirectory zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Zip code
   * @return zipCode
  **/
  @ApiModelProperty(value = "Zip code")
  
  @Size(max=10)   public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportOnlineDirectory consumerCreditReportOnlineDirectory = (ConsumerCreditReportOnlineDirectory) o;
    return Objects.equals(this.customerNumber, consumerCreditReportOnlineDirectory.customerNumber) &&
        Objects.equals(this.customerName, consumerCreditReportOnlineDirectory.customerName) &&
        Objects.equals(this.telephoneNumber, consumerCreditReportOnlineDirectory.telephoneNumber) &&
        Objects.equals(this.addressLine1, consumerCreditReportOnlineDirectory.addressLine1) &&
        Objects.equals(this.addressLine2, consumerCreditReportOnlineDirectory.addressLine2) &&
        Objects.equals(this.city, consumerCreditReportOnlineDirectory.city) &&
        Objects.equals(this.stateAbbreviation, consumerCreditReportOnlineDirectory.stateAbbreviation) &&
        Objects.equals(this.zipCode, consumerCreditReportOnlineDirectory.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, customerName, telephoneNumber, addressLine1, addressLine2, city, stateAbbreviation, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportOnlineDirectory {\n");
    
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateAbbreviation: ").append(toIndentedString(stateAbbreviation)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
