package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportReturnCode1;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportReturnCode2;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportReturnCode3;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportReturnCode4;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportTypeOfAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsumerCreditReportOnlineGeoCode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportOnlineGeoCode   {
  @JsonProperty("geoSMSACode")
  private String geoSMSACode = null;

  @JsonProperty("geoStateCode")
  private String geoStateCode = null;

  @JsonProperty("geoCountyCode")
  private String geoCountyCode = null;

  @JsonProperty("geoCensusTract")
  private String geoCensusTract = null;

  @JsonProperty("geoSuffix")
  private String geoSuffix = null;

  @JsonProperty("geoBlockGroup")
  private String geoBlockGroup = null;

  @JsonProperty("streetNumber")
  private String streetNumber = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("streetTypeOrDirection")
  private String streetTypeOrDirection = null;

  @JsonProperty("geoSMSA5DigitCode")
  private String geoSMSA5DigitCode = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("stateAbbreviation")
  private String stateAbbreviation = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("typeOfAddress")
  private ConsumerCreditReportTypeOfAddress typeOfAddress = null;

  @JsonProperty("returnCode1")
  private ConsumerCreditReportReturnCode1 returnCode1 = null;

  @JsonProperty("returnCode2")
  private ConsumerCreditReportReturnCode2 returnCode2 = null;

  @JsonProperty("returnCode3")
  private ConsumerCreditReportReturnCode3 returnCode3 = null;

  @JsonProperty("returnCode4")
  private ConsumerCreditReportReturnCode4 returnCode4 = null;

  @JsonProperty("microVisionCode")
  private String microVisionCode = null;

  @JsonProperty("microVisionReturnCode")
  private String microVisionReturnCode = null;

  public ConsumerCreditReportOnlineGeoCode geoSMSACode(String geoSMSACode) {
    this.geoSMSACode = geoSMSACode;
    return this;
  }

  /**
   * Metropolitan Statistical Area Code
   * @return geoSMSACode
  **/
  @ApiModelProperty(value = "Metropolitan Statistical Area Code")
  
  @Size(max=4)   public String getGeoSMSACode() {
    return geoSMSACode;
  }

  public void setGeoSMSACode(String geoSMSACode) {
    this.geoSMSACode = geoSMSACode;
  }

  public ConsumerCreditReportOnlineGeoCode geoStateCode(String geoStateCode) {
    this.geoStateCode = geoStateCode;
    return this;
  }

  /**
   * State code
   * @return geoStateCode
  **/
  @ApiModelProperty(value = "State code")
  
  @Size(max=2)   public String getGeoStateCode() {
    return geoStateCode;
  }

  public void setGeoStateCode(String geoStateCode) {
    this.geoStateCode = geoStateCode;
  }

  public ConsumerCreditReportOnlineGeoCode geoCountyCode(String geoCountyCode) {
    this.geoCountyCode = geoCountyCode;
    return this;
  }

  /**
   * County code
   * @return geoCountyCode
  **/
  @ApiModelProperty(value = "County code")
  
  @Size(max=3)   public String getGeoCountyCode() {
    return geoCountyCode;
  }

  public void setGeoCountyCode(String geoCountyCode) {
    this.geoCountyCode = geoCountyCode;
  }

  public ConsumerCreditReportOnlineGeoCode geoCensusTract(String geoCensusTract) {
    this.geoCensusTract = geoCensusTract;
    return this;
  }

  /**
   * Census tract code
   * @return geoCensusTract
  **/
  @ApiModelProperty(value = "Census tract code")
  
  @Size(max=4)   public String getGeoCensusTract() {
    return geoCensusTract;
  }

  public void setGeoCensusTract(String geoCensusTract) {
    this.geoCensusTract = geoCensusTract;
  }

  public ConsumerCreditReportOnlineGeoCode geoSuffix(String geoSuffix) {
    this.geoSuffix = geoSuffix;
    return this;
  }

  /**
   * Census tract code suffix
   * @return geoSuffix
  **/
  @ApiModelProperty(value = "Census tract code suffix")
  
  @Size(max=2)   public String getGeoSuffix() {
    return geoSuffix;
  }

  public void setGeoSuffix(String geoSuffix) {
    this.geoSuffix = geoSuffix;
  }

  public ConsumerCreditReportOnlineGeoCode geoBlockGroup(String geoBlockGroup) {
    this.geoBlockGroup = geoBlockGroup;
    return this;
  }

  /**
   * Block group code.
   * @return geoBlockGroup
  **/
  @ApiModelProperty(value = "Block group code.")
  
  @Size(max=1)   public String getGeoBlockGroup() {
    return geoBlockGroup;
  }

  public void setGeoBlockGroup(String geoBlockGroup) {
    this.geoBlockGroup = geoBlockGroup;
  }

  public ConsumerCreditReportOnlineGeoCode streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  /**
   * Street number
   * @return streetNumber
  **/
  @ApiModelProperty(value = "Street number")
  
  @Size(max=10)   public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public ConsumerCreditReportOnlineGeoCode streetName(String streetName) {
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

  public ConsumerCreditReportOnlineGeoCode streetTypeOrDirection(String streetTypeOrDirection) {
    this.streetTypeOrDirection = streetTypeOrDirection;
    return this;
  }

  /**
   * Street Type or Direction - Drive, Street, Road, etc. East, West, etc
   * @return streetTypeOrDirection
  **/
  @ApiModelProperty(value = "Street Type or Direction - Drive, Street, Road, etc. East, West, etc")
  
  @Size(max=21)   public String getStreetTypeOrDirection() {
    return streetTypeOrDirection;
  }

  public void setStreetTypeOrDirection(String streetTypeOrDirection) {
    this.streetTypeOrDirection = streetTypeOrDirection;
  }

  public ConsumerCreditReportOnlineGeoCode geoSMSA5DigitCode(String geoSMSA5DigitCode) {
    this.geoSMSA5DigitCode = geoSMSA5DigitCode;
    return this;
  }

  /**
   * Standard Metropolitan Statistical Area Code
   * @return geoSMSA5DigitCode
  **/
  @ApiModelProperty(value = "Standard Metropolitan Statistical Area Code")
  
  @Size(max=5)   public String getGeoSMSA5DigitCode() {
    return geoSMSA5DigitCode;
  }

  public void setGeoSMSA5DigitCode(String geoSMSA5DigitCode) {
    this.geoSMSA5DigitCode = geoSMSA5DigitCode;
  }

  public ConsumerCreditReportOnlineGeoCode city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City name
   * @return city
  **/
  @ApiModelProperty(value = "City name")
  
  @Size(max=20)   public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ConsumerCreditReportOnlineGeoCode stateAbbreviation(String stateAbbreviation) {
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

  public ConsumerCreditReportOnlineGeoCode zipCode(String zipCode) {
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

  public ConsumerCreditReportOnlineGeoCode typeOfAddress(ConsumerCreditReportTypeOfAddress typeOfAddress) {
    this.typeOfAddress = typeOfAddress;
    return this;
  }

  /**
   * Get typeOfAddress
   * @return typeOfAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportTypeOfAddress getTypeOfAddress() {
    return typeOfAddress;
  }

  public void setTypeOfAddress(ConsumerCreditReportTypeOfAddress typeOfAddress) {
    this.typeOfAddress = typeOfAddress;
  }

  public ConsumerCreditReportOnlineGeoCode returnCode1(ConsumerCreditReportReturnCode1 returnCode1) {
    this.returnCode1 = returnCode1;
    return this;
  }

  /**
   * Get returnCode1
   * @return returnCode1
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportReturnCode1 getReturnCode1() {
    return returnCode1;
  }

  public void setReturnCode1(ConsumerCreditReportReturnCode1 returnCode1) {
    this.returnCode1 = returnCode1;
  }

  public ConsumerCreditReportOnlineGeoCode returnCode2(ConsumerCreditReportReturnCode2 returnCode2) {
    this.returnCode2 = returnCode2;
    return this;
  }

  /**
   * Get returnCode2
   * @return returnCode2
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportReturnCode2 getReturnCode2() {
    return returnCode2;
  }

  public void setReturnCode2(ConsumerCreditReportReturnCode2 returnCode2) {
    this.returnCode2 = returnCode2;
  }

  public ConsumerCreditReportOnlineGeoCode returnCode3(ConsumerCreditReportReturnCode3 returnCode3) {
    this.returnCode3 = returnCode3;
    return this;
  }

  /**
   * Get returnCode3
   * @return returnCode3
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportReturnCode3 getReturnCode3() {
    return returnCode3;
  }

  public void setReturnCode3(ConsumerCreditReportReturnCode3 returnCode3) {
    this.returnCode3 = returnCode3;
  }

  public ConsumerCreditReportOnlineGeoCode returnCode4(ConsumerCreditReportReturnCode4 returnCode4) {
    this.returnCode4 = returnCode4;
    return this;
  }

  /**
   * Get returnCode4
   * @return returnCode4
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportReturnCode4 getReturnCode4() {
    return returnCode4;
  }

  public void setReturnCode4(ConsumerCreditReportReturnCode4 returnCode4) {
    this.returnCode4 = returnCode4;
  }

  public ConsumerCreditReportOnlineGeoCode microVisionCode(String microVisionCode) {
    this.microVisionCode = microVisionCode;
    return this;
  }

  /**
   * Get microVisionCode
   * @return microVisionCode
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=2)   public String getMicroVisionCode() {
    return microVisionCode;
  }

  public void setMicroVisionCode(String microVisionCode) {
    this.microVisionCode = microVisionCode;
  }

  public ConsumerCreditReportOnlineGeoCode microVisionReturnCode(String microVisionReturnCode) {
    this.microVisionReturnCode = microVisionReturnCode;
    return this;
  }

  /**
   * Get microVisionReturnCode
   * @return microVisionReturnCode
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=1)   public String getMicroVisionReturnCode() {
    return microVisionReturnCode;
  }

  public void setMicroVisionReturnCode(String microVisionReturnCode) {
    this.microVisionReturnCode = microVisionReturnCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportOnlineGeoCode consumerCreditReportOnlineGeoCode = (ConsumerCreditReportOnlineGeoCode) o;
    return Objects.equals(this.geoSMSACode, consumerCreditReportOnlineGeoCode.geoSMSACode) &&
        Objects.equals(this.geoStateCode, consumerCreditReportOnlineGeoCode.geoStateCode) &&
        Objects.equals(this.geoCountyCode, consumerCreditReportOnlineGeoCode.geoCountyCode) &&
        Objects.equals(this.geoCensusTract, consumerCreditReportOnlineGeoCode.geoCensusTract) &&
        Objects.equals(this.geoSuffix, consumerCreditReportOnlineGeoCode.geoSuffix) &&
        Objects.equals(this.geoBlockGroup, consumerCreditReportOnlineGeoCode.geoBlockGroup) &&
        Objects.equals(this.streetNumber, consumerCreditReportOnlineGeoCode.streetNumber) &&
        Objects.equals(this.streetName, consumerCreditReportOnlineGeoCode.streetName) &&
        Objects.equals(this.streetTypeOrDirection, consumerCreditReportOnlineGeoCode.streetTypeOrDirection) &&
        Objects.equals(this.geoSMSA5DigitCode, consumerCreditReportOnlineGeoCode.geoSMSA5DigitCode) &&
        Objects.equals(this.city, consumerCreditReportOnlineGeoCode.city) &&
        Objects.equals(this.stateAbbreviation, consumerCreditReportOnlineGeoCode.stateAbbreviation) &&
        Objects.equals(this.zipCode, consumerCreditReportOnlineGeoCode.zipCode) &&
        Objects.equals(this.typeOfAddress, consumerCreditReportOnlineGeoCode.typeOfAddress) &&
        Objects.equals(this.returnCode1, consumerCreditReportOnlineGeoCode.returnCode1) &&
        Objects.equals(this.returnCode2, consumerCreditReportOnlineGeoCode.returnCode2) &&
        Objects.equals(this.returnCode3, consumerCreditReportOnlineGeoCode.returnCode3) &&
        Objects.equals(this.returnCode4, consumerCreditReportOnlineGeoCode.returnCode4) &&
        Objects.equals(this.microVisionCode, consumerCreditReportOnlineGeoCode.microVisionCode) &&
        Objects.equals(this.microVisionReturnCode, consumerCreditReportOnlineGeoCode.microVisionReturnCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoSMSACode, geoStateCode, geoCountyCode, geoCensusTract, geoSuffix, geoBlockGroup, streetNumber, streetName, streetTypeOrDirection, geoSMSA5DigitCode, city, stateAbbreviation, zipCode, typeOfAddress, returnCode1, returnCode2, returnCode3, returnCode4, microVisionCode, microVisionReturnCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportOnlineGeoCode {\n");
    
    sb.append("    geoSMSACode: ").append(toIndentedString(geoSMSACode)).append("\n");
    sb.append("    geoStateCode: ").append(toIndentedString(geoStateCode)).append("\n");
    sb.append("    geoCountyCode: ").append(toIndentedString(geoCountyCode)).append("\n");
    sb.append("    geoCensusTract: ").append(toIndentedString(geoCensusTract)).append("\n");
    sb.append("    geoSuffix: ").append(toIndentedString(geoSuffix)).append("\n");
    sb.append("    geoBlockGroup: ").append(toIndentedString(geoBlockGroup)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetTypeOrDirection: ").append(toIndentedString(streetTypeOrDirection)).append("\n");
    sb.append("    geoSMSA5DigitCode: ").append(toIndentedString(geoSMSA5DigitCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateAbbreviation: ").append(toIndentedString(stateAbbreviation)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    typeOfAddress: ").append(toIndentedString(typeOfAddress)).append("\n");
    sb.append("    returnCode1: ").append(toIndentedString(returnCode1)).append("\n");
    sb.append("    returnCode2: ").append(toIndentedString(returnCode2)).append("\n");
    sb.append("    returnCode3: ").append(toIndentedString(returnCode3)).append("\n");
    sb.append("    returnCode4: ").append(toIndentedString(returnCode4)).append("\n");
    sb.append("    microVisionCode: ").append(toIndentedString(microVisionCode)).append("\n");
    sb.append("    microVisionReturnCode: ").append(toIndentedString(microVisionReturnCode)).append("\n");
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
