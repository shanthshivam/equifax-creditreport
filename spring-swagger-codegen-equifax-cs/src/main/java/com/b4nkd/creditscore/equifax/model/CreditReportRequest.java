package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.CreditReportRequestConsumers;
import com.b4nkd.creditscore.equifax.model.CreditReportRequestCustomerConfiguration;
import com.b4nkd.creditscore.equifax.model.CreditReportRequestExternalDataSources;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditReportRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequest   {
  @JsonProperty("consumers")
  private CreditReportRequestConsumers consumers = null;

  @JsonProperty("externalDataSources")
  private CreditReportRequestExternalDataSources externalDataSources = null;

  @JsonProperty("customerReferenceIdentifier")
  private String customerReferenceIdentifier = null;

  @JsonProperty("customerConfiguration")
  private CreditReportRequestCustomerConfiguration customerConfiguration = null;

  public CreditReportRequest consumers(CreditReportRequestConsumers consumers) {
    this.consumers = consumers;
    return this;
  }

  /**
   * Get consumers
   * @return consumers
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public CreditReportRequestConsumers getConsumers() {
    return consumers;
  }

  public void setConsumers(CreditReportRequestConsumers consumers) {
    this.consumers = consumers;
  }

  public CreditReportRequest externalDataSources(CreditReportRequestExternalDataSources externalDataSources) {
    this.externalDataSources = externalDataSources;
    return this;
  }

  /**
   * Get externalDataSources
   * @return externalDataSources
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CreditReportRequestExternalDataSources getExternalDataSources() {
    return externalDataSources;
  }

  public void setExternalDataSources(CreditReportRequestExternalDataSources externalDataSources) {
    this.externalDataSources = externalDataSources;
  }

  public CreditReportRequest customerReferenceIdentifier(String customerReferenceIdentifier) {
    this.customerReferenceIdentifier = customerReferenceIdentifier;
    return this;
  }

  /**
   * Unique identifier provided by customer
   * @return customerReferenceIdentifier
  **/
  @ApiModelProperty(value = "Unique identifier provided by customer")
  
  @Size(max=20)   public String getCustomerReferenceIdentifier() {
    return customerReferenceIdentifier;
  }

  public void setCustomerReferenceIdentifier(String customerReferenceIdentifier) {
    this.customerReferenceIdentifier = customerReferenceIdentifier;
  }

  public CreditReportRequest customerConfiguration(CreditReportRequestCustomerConfiguration customerConfiguration) {
    this.customerConfiguration = customerConfiguration;
    return this;
  }

  /**
   * Get customerConfiguration
   * @return customerConfiguration
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public CreditReportRequestCustomerConfiguration getCustomerConfiguration() {
    return customerConfiguration;
  }

  public void setCustomerConfiguration(CreditReportRequestCustomerConfiguration customerConfiguration) {
    this.customerConfiguration = customerConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportRequest creditReportRequest = (CreditReportRequest) o;
    return Objects.equals(this.consumers, creditReportRequest.consumers) &&
        Objects.equals(this.externalDataSources, creditReportRequest.externalDataSources) &&
        Objects.equals(this.customerReferenceIdentifier, creditReportRequest.customerReferenceIdentifier) &&
        Objects.equals(this.customerConfiguration, creditReportRequest.customerConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumers, externalDataSources, customerReferenceIdentifier, customerConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequest {\n");
    
    sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
    sb.append("    externalDataSources: ").append(toIndentedString(externalDataSources)).append("\n");
    sb.append("    customerReferenceIdentifier: ").append(toIndentedString(customerReferenceIdentifier)).append("\n");
    sb.append("    customerConfiguration: ").append(toIndentedString(customerConfiguration)).append("\n");
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
