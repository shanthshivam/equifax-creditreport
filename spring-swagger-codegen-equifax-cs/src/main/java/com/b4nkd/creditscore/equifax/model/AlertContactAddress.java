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
 * Contact&#x27;s address information
 */
@ApiModel(description = "Contact's address information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class AlertContactAddress   {
  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("cityName")
  private String cityName = null;

  @JsonProperty("stateAbbreviation")
  private String stateAbbreviation = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  public AlertContactAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * House number, street name & street type
   * @return addressLine1
  **/
  @ApiModelProperty(value = "House number, street name & street type")
  
  @Size(max=50)   public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public AlertContactAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Apartment, condo, suite, or unit number
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Apartment, condo, suite, or unit number")
  
  @Size(max=25)   public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AlertContactAddress cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  /**
   * City name
   * @return cityName
  **/
  @ApiModelProperty(value = "City name")
  
  @Size(max=20)   public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public AlertContactAddress stateAbbreviation(String stateAbbreviation) {
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

  public AlertContactAddress zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Zip code
   * @return zipCode
  **/
  @ApiModelProperty(value = "Zip code")
  
  @Size(max=9)   public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public AlertContactAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code")
  
  @Size(max=3)   public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertContactAddress alertContactAddress = (AlertContactAddress) o;
    return Objects.equals(this.addressLine1, alertContactAddress.addressLine1) &&
        Objects.equals(this.addressLine2, alertContactAddress.addressLine2) &&
        Objects.equals(this.cityName, alertContactAddress.cityName) &&
        Objects.equals(this.stateAbbreviation, alertContactAddress.stateAbbreviation) &&
        Objects.equals(this.zipCode, alertContactAddress.zipCode) &&
        Objects.equals(this.countryCode, alertContactAddress.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, cityName, stateAbbreviation, zipCode, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertContactAddress {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    stateAbbreviation: ").append(toIndentedString(stateAbbreviation)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
