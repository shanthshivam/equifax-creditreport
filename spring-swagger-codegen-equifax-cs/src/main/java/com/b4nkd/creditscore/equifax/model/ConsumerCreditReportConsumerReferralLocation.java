package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportConsumerReferralLocationAddress;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportConsumerReferralLocationTelephoneNumber;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides contact information regarding the data contained in the report
 */
@ApiModel(description = "Provides contact information regarding the data contained in the report")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportConsumerReferralLocation   {
  @JsonProperty("bureauCode")
  private String bureauCode = null;

  @JsonProperty("bureauName")
  private String bureauName = null;

  @JsonProperty("address")
  private ConsumerCreditReportConsumerReferralLocationAddress address = null;

  @JsonProperty("telephoneNumber")
  private ConsumerCreditReportConsumerReferralLocationTelephoneNumber telephoneNumber = null;

  public ConsumerCreditReportConsumerReferralLocation bureauCode(String bureauCode) {
    this.bureauCode = bureauCode;
    return this;
  }

  /**
   * Refereal Bureau Code
   * @return bureauCode
  **/
  @ApiModelProperty(value = "Refereal Bureau Code")
  
  @Size(max=3)   public String getBureauCode() {
    return bureauCode;
  }

  public void setBureauCode(String bureauCode) {
    this.bureauCode = bureauCode;
  }

  public ConsumerCreditReportConsumerReferralLocation bureauName(String bureauName) {
    this.bureauName = bureauName;
    return this;
  }

  /**
   * Referral Bureau Name
   * @return bureauName
  **/
  @ApiModelProperty(value = "Referral Bureau Name")
  
  @Size(max=50)   public String getBureauName() {
    return bureauName;
  }

  public void setBureauName(String bureauName) {
    this.bureauName = bureauName;
  }

  public ConsumerCreditReportConsumerReferralLocation address(ConsumerCreditReportConsumerReferralLocationAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportConsumerReferralLocationAddress getAddress() {
    return address;
  }

  public void setAddress(ConsumerCreditReportConsumerReferralLocationAddress address) {
    this.address = address;
  }

  public ConsumerCreditReportConsumerReferralLocation telephoneNumber(ConsumerCreditReportConsumerReferralLocationTelephoneNumber telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Get telephoneNumber
   * @return telephoneNumber
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportConsumerReferralLocationTelephoneNumber getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(ConsumerCreditReportConsumerReferralLocationTelephoneNumber telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportConsumerReferralLocation consumerCreditReportConsumerReferralLocation = (ConsumerCreditReportConsumerReferralLocation) o;
    return Objects.equals(this.bureauCode, consumerCreditReportConsumerReferralLocation.bureauCode) &&
        Objects.equals(this.bureauName, consumerCreditReportConsumerReferralLocation.bureauName) &&
        Objects.equals(this.address, consumerCreditReportConsumerReferralLocation.address) &&
        Objects.equals(this.telephoneNumber, consumerCreditReportConsumerReferralLocation.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bureauCode, bureauName, address, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportConsumerReferralLocation {\n");
    
    sb.append("    bureauCode: ").append(toIndentedString(bureauCode)).append("\n");
    sb.append("    bureauName: ").append(toIndentedString(bureauName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
