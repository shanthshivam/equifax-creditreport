package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.AccountTypeCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsumerCreditReportInquiries
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportInquiries   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("industryCode")
  private String industryCode = null;

  @JsonProperty("inquiryDate")
  private String inquiryDate = null;

  @JsonProperty("customerNumber")
  private String customerNumber = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("expandedAccountTypeOrInquiryIntent")
  private AccountTypeCode expandedAccountTypeOrInquiryIntent = null;

  public ConsumerCreditReportInquiries type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Inquiries from customers requesting Equifax credit reports and other products
   * @return type
  **/
  @ApiModelProperty(example = "[\"inquiryfileInquiry\"]", value = "Inquiries from customers requesting Equifax credit reports and other products")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ConsumerCreditReportInquiries industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

  /**
   * Customer's industry code
   * @return industryCode
  **/
  @ApiModelProperty(value = "Customer's industry code")
  
    public String getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  public ConsumerCreditReportInquiries inquiryDate(String inquiryDate) {
    this.inquiryDate = inquiryDate;
    return this;
  }

  /**
   * Get inquiryDate
   * @return inquiryDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getInquiryDate() {
    return inquiryDate;
  }

  public void setInquiryDate(String inquiryDate) {
    this.inquiryDate = inquiryDate;
  }

  public ConsumerCreditReportInquiries customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Customer's member number who made the inquiry
   * @return customerNumber
  **/
  @ApiModelProperty(value = "Customer's member number who made the inquiry")
  
  @Size(max=18)   public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public ConsumerCreditReportInquiries customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Customer's name who made the inquiry
   * @return customerName
  **/
  @ApiModelProperty(value = "Customer's name who made the inquiry")
  
  @Size(max=20)   public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public ConsumerCreditReportInquiries expandedAccountTypeOrInquiryIntent(AccountTypeCode expandedAccountTypeOrInquiryIntent) {
    this.expandedAccountTypeOrInquiryIntent = expandedAccountTypeOrInquiryIntent;
    return this;
  }

  /**
   * Get expandedAccountTypeOrInquiryIntent
   * @return expandedAccountTypeOrInquiryIntent
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountTypeCode getExpandedAccountTypeOrInquiryIntent() {
    return expandedAccountTypeOrInquiryIntent;
  }

  public void setExpandedAccountTypeOrInquiryIntent(AccountTypeCode expandedAccountTypeOrInquiryIntent) {
    this.expandedAccountTypeOrInquiryIntent = expandedAccountTypeOrInquiryIntent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportInquiries consumerCreditReportInquiries = (ConsumerCreditReportInquiries) o;
    return Objects.equals(this.type, consumerCreditReportInquiries.type) &&
        Objects.equals(this.industryCode, consumerCreditReportInquiries.industryCode) &&
        Objects.equals(this.inquiryDate, consumerCreditReportInquiries.inquiryDate) &&
        Objects.equals(this.customerNumber, consumerCreditReportInquiries.customerNumber) &&
        Objects.equals(this.customerName, consumerCreditReportInquiries.customerName) &&
        Objects.equals(this.expandedAccountTypeOrInquiryIntent, consumerCreditReportInquiries.expandedAccountTypeOrInquiryIntent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, industryCode, inquiryDate, customerNumber, customerName, expandedAccountTypeOrInquiryIntent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportInquiries {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    inquiryDate: ").append(toIndentedString(inquiryDate)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    expandedAccountTypeOrInquiryIntent: ").append(toIndentedString(expandedAccountTypeOrInquiryIntent)).append("\n");
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
