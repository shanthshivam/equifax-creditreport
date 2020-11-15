package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode;
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
 * Returned if an error occurs
 */
@ApiModel(description = "Returned if an error occurs")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage   {
  @JsonProperty("customerReferenceNumber")
  private String customerReferenceNumber = null;

  @JsonProperty("customerNumber")
  private String customerNumber = null;

  @JsonProperty("errorType")
  private String errorType = null;

  @JsonProperty("alternateDataSourceCode")
  @Valid
  private List<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode> alternateDataSourceCode = null;

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage customerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
    return this;
  }

  /**
   * This field will return the same value provided in the request
   * @return customerReferenceNumber
  **/
  @ApiModelProperty(value = "This field will return the same value provided in the request")
  
  @Size(max=20)   public String getCustomerReferenceNumber() {
    return customerReferenceNumber;
  }

  public void setCustomerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
  }

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * This field returns the same value provided in the request
   * @return customerNumber
  **/
  @ApiModelProperty(value = "This field returns the same value provided in the request")
  
  @Size(max=10)   public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Get errorType
   * @return errorType
  **/
  @ApiModelProperty(example = "[\"DERR\"]", value = "")
  
    public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage alternateDataSourceCode(List<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode> alternateDataSourceCode) {
    this.alternateDataSourceCode = alternateDataSourceCode;
    return this;
  }

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage addAlternateDataSourceCodeItem(ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode alternateDataSourceCodeItem) {
    if (this.alternateDataSourceCode == null) {
      this.alternateDataSourceCode = new ArrayList<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode>();
    }
    this.alternateDataSourceCode.add(alternateDataSourceCodeItem);
    return this;
  }

  /**
   * Get alternateDataSourceCode
   * @return alternateDataSourceCode
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=99)   public List<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode> getAlternateDataSourceCode() {
    return alternateDataSourceCode;
  }

  public void setAlternateDataSourceCode(List<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode> alternateDataSourceCode) {
    this.alternateDataSourceCode = alternateDataSourceCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage consumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage = (ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage) o;
    return Objects.equals(this.customerReferenceNumber, consumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage.customerReferenceNumber) &&
        Objects.equals(this.customerNumber, consumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage.customerNumber) &&
        Objects.equals(this.errorType, consumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage.errorType) &&
        Objects.equals(this.alternateDataSourceCode, consumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage.alternateDataSourceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReferenceNumber, customerNumber, errorType, alternateDataSourceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage {\n");
    
    sb.append("    customerReferenceNumber: ").append(toIndentedString(customerReferenceNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    alternateDataSourceCode: ").append(toIndentedString(alternateDataSourceCode)).append("\n");
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
