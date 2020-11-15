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
 * ConsumerCreditReportConsumerReferralLocationAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportConsumerReferralLocationAddress   {
  @JsonProperty("primaryAddress")
  private String primaryAddress = null;

  @JsonProperty("secondaryAddress")
  private String secondaryAddress = null;

  @JsonProperty("cityName")
  private String cityName = null;

  @JsonProperty("stateAbbreviation")
  private String stateAbbreviation = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  public ConsumerCreditReportConsumerReferralLocationAddress primaryAddress(String primaryAddress) {
    this.primaryAddress = primaryAddress;
    return this;
  }

  /**
   * Referral Bureau primary address
   * @return primaryAddress
  **/
  @ApiModelProperty(value = "Referral Bureau primary address")
  
  @Size(max=50)   public String getPrimaryAddress() {
    return primaryAddress;
  }

  public void setPrimaryAddress(String primaryAddress) {
    this.primaryAddress = primaryAddress;
  }

  public ConsumerCreditReportConsumerReferralLocationAddress secondaryAddress(String secondaryAddress) {
    this.secondaryAddress = secondaryAddress;
    return this;
  }

  /**
   * Referral Bureau secondary address
   * @return secondaryAddress
  **/
  @ApiModelProperty(value = "Referral Bureau secondary address")
  
  @Size(max=50)   public String getSecondaryAddress() {
    return secondaryAddress;
  }

  public void setSecondaryAddress(String secondaryAddress) {
    this.secondaryAddress = secondaryAddress;
  }

  public ConsumerCreditReportConsumerReferralLocationAddress cityName(String cityName) {
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

  public ConsumerCreditReportConsumerReferralLocationAddress stateAbbreviation(String stateAbbreviation) {
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

  public ConsumerCreditReportConsumerReferralLocationAddress zipCode(String zipCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportConsumerReferralLocationAddress consumerCreditReportConsumerReferralLocationAddress = (ConsumerCreditReportConsumerReferralLocationAddress) o;
    return Objects.equals(this.primaryAddress, consumerCreditReportConsumerReferralLocationAddress.primaryAddress) &&
        Objects.equals(this.secondaryAddress, consumerCreditReportConsumerReferralLocationAddress.secondaryAddress) &&
        Objects.equals(this.cityName, consumerCreditReportConsumerReferralLocationAddress.cityName) &&
        Objects.equals(this.stateAbbreviation, consumerCreditReportConsumerReferralLocationAddress.stateAbbreviation) &&
        Objects.equals(this.zipCode, consumerCreditReportConsumerReferralLocationAddress.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryAddress, secondaryAddress, cityName, stateAbbreviation, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportConsumerReferralLocationAddress {\n");
    
    sb.append("    primaryAddress: ").append(toIndentedString(primaryAddress)).append("\n");
    sb.append("    secondaryAddress: ").append(toIndentedString(secondaryAddress)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
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
