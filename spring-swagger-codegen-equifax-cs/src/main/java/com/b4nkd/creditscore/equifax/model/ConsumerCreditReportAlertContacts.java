package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.AlertContactAddress;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlertType;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportTelephoneNumbers;
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
 * ConsumerCreditReportAlertContacts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlertContacts   {
  @JsonProperty("alertType")
  private ConsumerCreditReportAlertType alertType = null;

  @JsonProperty("dateReported")
  private String dateReported = null;

  @JsonProperty("effectiveDate")
  private String effectiveDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("telephoneNumbers")
  @Valid
  private List<ConsumerCreditReportTelephoneNumbers> telephoneNumbers = null;

  @JsonProperty("address")
  private AlertContactAddress address = null;

  @JsonProperty("additionalInformation")
  private String additionalInformation = null;

  public ConsumerCreditReportAlertContacts alertType(ConsumerCreditReportAlertType alertType) {
    this.alertType = alertType;
    return this;
  }

  /**
   * Get alertType
   * @return alertType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportAlertType getAlertType() {
    return alertType;
  }

  public void setAlertType(ConsumerCreditReportAlertType alertType) {
    this.alertType = alertType;
  }

  public ConsumerCreditReportAlertContacts dateReported(String dateReported) {
    this.dateReported = dateReported;
    return this;
  }

  /**
   * Get dateReported
   * @return dateReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateReported() {
    return dateReported;
  }

  public void setDateReported(String dateReported) {
    this.dateReported = dateReported;
  }

  public ConsumerCreditReportAlertContacts effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ConsumerCreditReportAlertContacts status(String status) {
    this.status = status;
    return this;
  }

  /**
   *  - N: No Contact Information Provided 
   * @return status
  **/
  @ApiModelProperty(value = " - N: No Contact Information Provided ")
  
  @Size(max=1)   public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConsumerCreditReportAlertContacts telephoneNumbers(List<ConsumerCreditReportTelephoneNumbers> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
    return this;
  }

  public ConsumerCreditReportAlertContacts addTelephoneNumbersItem(ConsumerCreditReportTelephoneNumbers telephoneNumbersItem) {
    if (this.telephoneNumbers == null) {
      this.telephoneNumbers = new ArrayList<ConsumerCreditReportTelephoneNumbers>();
    }
    this.telephoneNumbers.add(telephoneNumbersItem);
    return this;
  }

  /**
   * Get telephoneNumbers
   * @return telephoneNumbers
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=3)   public List<ConsumerCreditReportTelephoneNumbers> getTelephoneNumbers() {
    return telephoneNumbers;
  }

  public void setTelephoneNumbers(List<ConsumerCreditReportTelephoneNumbers> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
  }

  public ConsumerCreditReportAlertContacts address(AlertContactAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AlertContactAddress getAddress() {
    return address;
  }

  public void setAddress(AlertContactAddress address) {
    this.address = address;
  }

  public ConsumerCreditReportAlertContacts additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Free text with extra info regarding the contact
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "Free text with extra info regarding the contact")
  
  @Size(max=100)   public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlertContacts consumerCreditReportAlertContacts = (ConsumerCreditReportAlertContacts) o;
    return Objects.equals(this.alertType, consumerCreditReportAlertContacts.alertType) &&
        Objects.equals(this.dateReported, consumerCreditReportAlertContacts.dateReported) &&
        Objects.equals(this.effectiveDate, consumerCreditReportAlertContacts.effectiveDate) &&
        Objects.equals(this.status, consumerCreditReportAlertContacts.status) &&
        Objects.equals(this.telephoneNumbers, consumerCreditReportAlertContacts.telephoneNumbers) &&
        Objects.equals(this.address, consumerCreditReportAlertContacts.address) &&
        Objects.equals(this.additionalInformation, consumerCreditReportAlertContacts.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertType, dateReported, effectiveDate, status, telephoneNumbers, address, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlertContacts {\n");
    
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    telephoneNumbers: ").append(toIndentedString(telephoneNumbers)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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
