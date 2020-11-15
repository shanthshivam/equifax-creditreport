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
 * CreditReportRequestExternalDataSourcesAlternateDataSources
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequestExternalDataSourcesAlternateDataSources   {
  @JsonProperty("consumerReportIndicator")
  private Boolean consumerReportIndicator = null;

  @JsonProperty("customerOrchestrationCode")
  private String customerOrchestrationCode = null;

  @JsonProperty("customerOrganizationCode")
  private String customerOrganizationCode = null;

  @JsonProperty("dataProviderTag")
  private String dataProviderTag = null;

  public CreditReportRequestExternalDataSourcesAlternateDataSources consumerReportIndicator(Boolean consumerReportIndicator) {
    this.consumerReportIndicator = consumerReportIndicator;
    return this;
  }

  /**
   * Get consumerReportIndicator
   * @return consumerReportIndicator
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Boolean isConsumerReportIndicator() {
    return consumerReportIndicator;
  }

  public void setConsumerReportIndicator(Boolean consumerReportIndicator) {
    this.consumerReportIndicator = consumerReportIndicator;
  }

  public CreditReportRequestExternalDataSourcesAlternateDataSources customerOrchestrationCode(String customerOrchestrationCode) {
    this.customerOrchestrationCode = customerOrchestrationCode;
    return this;
  }

  /**
   * Get customerOrchestrationCode
   * @return customerOrchestrationCode
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=20)   public String getCustomerOrchestrationCode() {
    return customerOrchestrationCode;
  }

  public void setCustomerOrchestrationCode(String customerOrchestrationCode) {
    this.customerOrchestrationCode = customerOrchestrationCode;
  }

  public CreditReportRequestExternalDataSourcesAlternateDataSources customerOrganizationCode(String customerOrganizationCode) {
    this.customerOrganizationCode = customerOrganizationCode;
    return this;
  }

  /**
   * Get customerOrganizationCode
   * @return customerOrganizationCode
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=20)   public String getCustomerOrganizationCode() {
    return customerOrganizationCode;
  }

  public void setCustomerOrganizationCode(String customerOrganizationCode) {
    this.customerOrganizationCode = customerOrganizationCode;
  }

  public CreditReportRequestExternalDataSourcesAlternateDataSources dataProviderTag(String dataProviderTag) {
    this.dataProviderTag = dataProviderTag;
    return this;
  }

  /**
   * Get dataProviderTag
   * @return dataProviderTag
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=10)   public String getDataProviderTag() {
    return dataProviderTag;
  }

  public void setDataProviderTag(String dataProviderTag) {
    this.dataProviderTag = dataProviderTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportRequestExternalDataSourcesAlternateDataSources creditReportRequestExternalDataSourcesAlternateDataSources = (CreditReportRequestExternalDataSourcesAlternateDataSources) o;
    return Objects.equals(this.consumerReportIndicator, creditReportRequestExternalDataSourcesAlternateDataSources.consumerReportIndicator) &&
        Objects.equals(this.customerOrchestrationCode, creditReportRequestExternalDataSourcesAlternateDataSources.customerOrchestrationCode) &&
        Objects.equals(this.customerOrganizationCode, creditReportRequestExternalDataSourcesAlternateDataSources.customerOrganizationCode) &&
        Objects.equals(this.dataProviderTag, creditReportRequestExternalDataSourcesAlternateDataSources.dataProviderTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerReportIndicator, customerOrchestrationCode, customerOrganizationCode, dataProviderTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequestExternalDataSourcesAlternateDataSources {\n");
    
    sb.append("    consumerReportIndicator: ").append(toIndentedString(consumerReportIndicator)).append("\n");
    sb.append("    customerOrchestrationCode: ").append(toIndentedString(customerOrchestrationCode)).append("\n");
    sb.append("    customerOrganizationCode: ").append(toIndentedString(customerOrganizationCode)).append("\n");
    sb.append("    dataProviderTag: ").append(toIndentedString(dataProviderTag)).append("\n");
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
