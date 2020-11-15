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
 * NAL - Canadian Credit Report for Consumer&#x27;s Canadian Address
 */
@ApiModel(description = "NAL - Canadian Credit Report for Consumer's Canadian Address")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlternateDataSourcesNorthAmericanLink   {
  @JsonProperty("regulatedIdentifier")
  private String regulatedIdentifier = null;

  @JsonProperty("hitNohitIndicator")
  private String hitNohitIndicator = null;

  @JsonProperty("INTL5FFFConsumerReport")
  private String inTL5FFFConsumerReport = null;

  public ConsumerCreditReportAlternateDataSourcesNorthAmericanLink regulatedIdentifier(String regulatedIdentifier) {
    this.regulatedIdentifier = regulatedIdentifier;
    return this;
  }

  /**
   * \\'RG\\' for Regulated Data Source
   * @return regulatedIdentifier
  **/
  @ApiModelProperty(value = "\\'RG\\' for Regulated Data Source")
  
  @Size(max=2)   public String getRegulatedIdentifier() {
    return regulatedIdentifier;
  }

  public void setRegulatedIdentifier(String regulatedIdentifier) {
    this.regulatedIdentifier = regulatedIdentifier;
  }

  public ConsumerCreditReportAlternateDataSourcesNorthAmericanLink hitNohitIndicator(String hitNohitIndicator) {
    this.hitNohitIndicator = hitNohitIndicator;
    return this;
  }

  /**
   * If there was a responce back from the data source or not
   * @return hitNohitIndicator
  **/
  @ApiModelProperty(value = "If there was a responce back from the data source or not")
  
  @Size(max=1)   public String getHitNohitIndicator() {
    return hitNohitIndicator;
  }

  public void setHitNohitIndicator(String hitNohitIndicator) {
    this.hitNohitIndicator = hitNohitIndicator;
  }

  public ConsumerCreditReportAlternateDataSourcesNorthAmericanLink inTL5FFFConsumerReport(String inTL5FFFConsumerReport) {
    this.inTL5FFFConsumerReport = inTL5FFFConsumerReport;
    return this;
  }

  /**
   * Contents of the Canadian Report returned
   * @return inTL5FFFConsumerReport
  **/
  @ApiModelProperty(value = "Contents of the Canadian Report returned")
  
    public String getInTL5FFFConsumerReport() {
    return inTL5FFFConsumerReport;
  }

  public void setInTL5FFFConsumerReport(String inTL5FFFConsumerReport) {
    this.inTL5FFFConsumerReport = inTL5FFFConsumerReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlternateDataSourcesNorthAmericanLink consumerCreditReportAlternateDataSourcesNorthAmericanLink = (ConsumerCreditReportAlternateDataSourcesNorthAmericanLink) o;
    return Objects.equals(this.regulatedIdentifier, consumerCreditReportAlternateDataSourcesNorthAmericanLink.regulatedIdentifier) &&
        Objects.equals(this.hitNohitIndicator, consumerCreditReportAlternateDataSourcesNorthAmericanLink.hitNohitIndicator) &&
        Objects.equals(this.inTL5FFFConsumerReport, consumerCreditReportAlternateDataSourcesNorthAmericanLink.inTL5FFFConsumerReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatedIdentifier, hitNohitIndicator, inTL5FFFConsumerReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlternateDataSourcesNorthAmericanLink {\n");
    
    sb.append("    regulatedIdentifier: ").append(toIndentedString(regulatedIdentifier)).append("\n");
    sb.append("    hitNohitIndicator: ").append(toIndentedString(hitNohitIndicator)).append("\n");
    sb.append("    inTL5FFFConsumerReport: ").append(toIndentedString(inTL5FFFConsumerReport)).append("\n");
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
