package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.AddressAddressVarianceIndicator;
import com.b4nkd.creditscore.equifax.model.AddressSourceOfAddress;
import com.b4nkd.creditscore.equifax.model.AddressSourceOfTelephoneNumber;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Subject&#x27;s address(es) information
 */
@ApiModel(description = "Subject's address(es) information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class Address   {
  /**
   * The address type:   - current: Current Address. A maximum of 1 current Address can be returned per report   - former: Former Address. A maximum of 1 former Address can be returned per report   - additional: Additional Address. A maximum of 8 additional Addresses can be returned per report 
   */
  public enum AddressTypeEnum {
    CURRENT("current"),
    
    FORMER("former"),
    
    ADDITIONAL("additional");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AddressTypeEnum fromValue(String text) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("addressType")
  private AddressTypeEnum addressType = null;

  @JsonProperty("houseNumber")
  private String houseNumber = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("streetType")
  private String streetType = null;

  @JsonProperty("cityName")
  private String cityName = null;

  @JsonProperty("stateAbbreviation")
  private String stateAbbreviation = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("rentOwnBuy")
  private String rentOwnBuy = null;

  @JsonProperty("sourceOfAddress")
  private AddressSourceOfAddress sourceOfAddress = null;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber = null;

  @JsonProperty("sourceOfTelephoneNumber")
  private AddressSourceOfTelephoneNumber sourceOfTelephoneNumber = null;

  @JsonProperty("addressVarianceIndicator")
  private AddressAddressVarianceIndicator addressVarianceIndicator = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("dateFirstReported")
  private String dateFirstReported = null;

  @JsonProperty("dateLastReported")
  private String dateLastReported = null;

  @JsonProperty("dateTelephoneReported")
  private String dateTelephoneReported = null;

  public Address addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * The address type:   - current: Current Address. A maximum of 1 current Address can be returned per report   - former: Former Address. A maximum of 1 former Address can be returned per report   - additional: Additional Address. A maximum of 8 additional Addresses can be returned per report 
   * @return addressType
  **/
  @ApiModelProperty(value = "The address type:   - current: Current Address. A maximum of 1 current Address can be returned per report   - former: Former Address. A maximum of 1 former Address can be returned per report   - additional: Additional Address. A maximum of 8 additional Addresses can be returned per report ")
  
  @Size(max=10)   public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public Address houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * Street Number/House number
   * @return houseNumber
  **/
  @ApiModelProperty(value = "Street Number/House number")
  
  @Size(max=10)   public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Street name
   * @return streetName
  **/
  @ApiModelProperty(value = "Street name")
  
  @Size(max=26)   public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

  /**
   * Street type/Direction/Apartment number
   * @return streetType
  **/
  @ApiModelProperty(value = "Street type/Direction/Apartment number")
  
  @Size(max=26)   public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public Address cityName(String cityName) {
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

  public Address stateAbbreviation(String stateAbbreviation) {
    this.stateAbbreviation = stateAbbreviation;
    return this;
  }

  /**
   * State abbreviation
   * @return stateAbbreviation
  **/
  @ApiModelProperty(value = "State abbreviation")
  
  @Size(max=2)   public String getStateAbbreviation() {
    return stateAbbreviation;
  }

  public void setStateAbbreviation(String stateAbbreviation) {
    this.stateAbbreviation = stateAbbreviation;
  }

  public Address zipCode(String zipCode) {
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

  public Address rentOwnBuy(String rentOwnBuy) {
    this.rentOwnBuy = rentOwnBuy;
    return this;
  }

  /**
   * Rent/Own/Buy
   * @return rentOwnBuy
  **/
  @ApiModelProperty(value = "Rent/Own/Buy")
  
  @Size(max=1)   public String getRentOwnBuy() {
    return rentOwnBuy;
  }

  public void setRentOwnBuy(String rentOwnBuy) {
    this.rentOwnBuy = rentOwnBuy;
  }

  public Address sourceOfAddress(AddressSourceOfAddress sourceOfAddress) {
    this.sourceOfAddress = sourceOfAddress;
    return this;
  }

  /**
   * Get sourceOfAddress
   * @return sourceOfAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddressSourceOfAddress getSourceOfAddress() {
    return sourceOfAddress;
  }

  public void setSourceOfAddress(AddressSourceOfAddress sourceOfAddress) {
    this.sourceOfAddress = sourceOfAddress;
  }

  public Address telephoneNumber(String telephoneNumber) {
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

  public Address sourceOfTelephoneNumber(AddressSourceOfTelephoneNumber sourceOfTelephoneNumber) {
    this.sourceOfTelephoneNumber = sourceOfTelephoneNumber;
    return this;
  }

  /**
   * Get sourceOfTelephoneNumber
   * @return sourceOfTelephoneNumber
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddressSourceOfTelephoneNumber getSourceOfTelephoneNumber() {
    return sourceOfTelephoneNumber;
  }

  public void setSourceOfTelephoneNumber(AddressSourceOfTelephoneNumber sourceOfTelephoneNumber) {
    this.sourceOfTelephoneNumber = sourceOfTelephoneNumber;
  }

  public Address addressVarianceIndicator(AddressAddressVarianceIndicator addressVarianceIndicator) {
    this.addressVarianceIndicator = addressVarianceIndicator;
    return this;
  }

  /**
   * Get addressVarianceIndicator
   * @return addressVarianceIndicator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddressAddressVarianceIndicator getAddressVarianceIndicator() {
    return addressVarianceIndicator;
  }

  public void setAddressVarianceIndicator(AddressAddressVarianceIndicator addressVarianceIndicator) {
    this.addressVarianceIndicator = addressVarianceIndicator;
  }

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Combination of address components
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Combination of address components")
  
  @Size(max=62)   public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address dateFirstReported(String dateFirstReported) {
    this.dateFirstReported = dateFirstReported;
    return this;
  }

  /**
   * Get dateFirstReported
   * @return dateFirstReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateFirstReported() {
    return dateFirstReported;
  }

  public void setDateFirstReported(String dateFirstReported) {
    this.dateFirstReported = dateFirstReported;
  }

  public Address dateLastReported(String dateLastReported) {
    this.dateLastReported = dateLastReported;
    return this;
  }

  /**
   * Get dateLastReported
   * @return dateLastReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateLastReported() {
    return dateLastReported;
  }

  public void setDateLastReported(String dateLastReported) {
    this.dateLastReported = dateLastReported;
  }

  public Address dateTelephoneReported(String dateTelephoneReported) {
    this.dateTelephoneReported = dateTelephoneReported;
    return this;
  }

  /**
   * Get dateTelephoneReported
   * @return dateTelephoneReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateTelephoneReported() {
    return dateTelephoneReported;
  }

  public void setDateTelephoneReported(String dateTelephoneReported) {
    this.dateTelephoneReported = dateTelephoneReported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.houseNumber, address.houseNumber) &&
        Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.streetType, address.streetType) &&
        Objects.equals(this.cityName, address.cityName) &&
        Objects.equals(this.stateAbbreviation, address.stateAbbreviation) &&
        Objects.equals(this.zipCode, address.zipCode) &&
        Objects.equals(this.rentOwnBuy, address.rentOwnBuy) &&
        Objects.equals(this.sourceOfAddress, address.sourceOfAddress) &&
        Objects.equals(this.telephoneNumber, address.telephoneNumber) &&
        Objects.equals(this.sourceOfTelephoneNumber, address.sourceOfTelephoneNumber) &&
        Objects.equals(this.addressVarianceIndicator, address.addressVarianceIndicator) &&
        Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.dateFirstReported, address.dateFirstReported) &&
        Objects.equals(this.dateLastReported, address.dateLastReported) &&
        Objects.equals(this.dateTelephoneReported, address.dateTelephoneReported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, houseNumber, streetName, streetType, cityName, stateAbbreviation, zipCode, rentOwnBuy, sourceOfAddress, telephoneNumber, sourceOfTelephoneNumber, addressVarianceIndicator, addressLine1, dateFirstReported, dateLastReported, dateTelephoneReported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    stateAbbreviation: ").append(toIndentedString(stateAbbreviation)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    rentOwnBuy: ").append(toIndentedString(rentOwnBuy)).append("\n");
    sb.append("    sourceOfAddress: ").append(toIndentedString(sourceOfAddress)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    sourceOfTelephoneNumber: ").append(toIndentedString(sourceOfTelephoneNumber)).append("\n");
    sb.append("    addressVarianceIndicator: ").append(toIndentedString(addressVarianceIndicator)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    dateFirstReported: ").append(toIndentedString(dateFirstReported)).append("\n");
    sb.append("    dateLastReported: ").append(toIndentedString(dateLastReported)).append("\n");
    sb.append("    dateTelephoneReported: ").append(toIndentedString(dateTelephoneReported)).append("\n");
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
