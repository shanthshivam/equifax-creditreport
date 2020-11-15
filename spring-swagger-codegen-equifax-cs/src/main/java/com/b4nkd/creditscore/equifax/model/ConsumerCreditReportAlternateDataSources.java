package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlternateDataSourcesNorthAmericanLink;
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
 * Contains the output data for the Optional Alternate Data Sources. These Alternate Data Sources are: - Military Lending Covered Borrower Status - North American Link - FraudIQ® Synthetic ID Alert - Impacted Data Indicator 
 */
@ApiModel(description = "Contains the output data for the Optional Alternate Data Sources. These Alternate Data Sources are: - Military Lending Covered Borrower Status - North American Link - FraudIQ® Synthetic ID Alert - Impacted Data Indicator ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlternateDataSources   {
  @JsonProperty("alternateDataSourceErrorMessage")
  @Valid
  private List<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage> alternateDataSourceErrorMessage = null;

  @JsonProperty("militaryLendingCoveredBorrower")
  private ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower militaryLendingCoveredBorrower = null;

  @JsonProperty("northAmericanLink")
  private ConsumerCreditReportAlternateDataSourcesNorthAmericanLink northAmericanLink = null;

  @JsonProperty("fraudIQSyntheticIDAlerts")
  private ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts fraudIQSyntheticIDAlerts = null;

  @JsonProperty("impactedDataIndicator")
  private ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator impactedDataIndicator = null;

  public ConsumerCreditReportAlternateDataSources alternateDataSourceErrorMessage(List<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage> alternateDataSourceErrorMessage) {
    this.alternateDataSourceErrorMessage = alternateDataSourceErrorMessage;
    return this;
  }

  public ConsumerCreditReportAlternateDataSources addAlternateDataSourceErrorMessageItem(ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage alternateDataSourceErrorMessageItem) {
    if (this.alternateDataSourceErrorMessage == null) {
      this.alternateDataSourceErrorMessage = new ArrayList<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage>();
    }
    this.alternateDataSourceErrorMessage.add(alternateDataSourceErrorMessageItem);
    return this;
  }

  /**
   * It's returned whenever it encounters a communication problem or an error with the request of an Alternate Data Source. A separate \"DERR\" element will be returned per Data Source.  DERR: Alternate Data Source Message Response   CODE DESCRIPTION:   - 2001: COMMUNICATION ERROR   - 2002: COMMUNICATION ERROR   - 2003: COMMUNICATION ERROR   - 2004: COMMUNICATION ERROR   - 2005: COMMUNICATION ERROR   - 2006: COMMUNICATION ERROR   - 2007: COMMUNICATION ERROR   - 2008: COMMUNICATION ERROR   - 2009: COMMUNICATION ERROR   - 2010: COMMUNICATION ERROR   - 2011: COMMUNICATION ERROR   - 2012: COMMUNICATION ERROR   - 2013: COMMUNICATION ERROR   - 2014: COMMUNICATION ERROR   - 2015: COMMUNICATION ERROR   - 2016: COMMUNICATION ERROR   - 2017: COMMUNICATION ERROR   - 2018: COMMUNICATION ERROR   - 2019: COMMUNICATION ERROR   - 2020: COMMUNICATION ERROR   - 2021: COMMUNICATION ERROR   - 2022: COMMUNICATION ERROR   - 2023: COMMUNICATION ERROR   - 2024: COMMUNICATION ERROR   - 2025: COMMUNICATION ERROR 
   * @return alternateDataSourceErrorMessage
  **/
  @ApiModelProperty(value = "It's returned whenever it encounters a communication problem or an error with the request of an Alternate Data Source. A separate \"DERR\" element will be returned per Data Source.  DERR: Alternate Data Source Message Response   CODE DESCRIPTION:   - 2001: COMMUNICATION ERROR   - 2002: COMMUNICATION ERROR   - 2003: COMMUNICATION ERROR   - 2004: COMMUNICATION ERROR   - 2005: COMMUNICATION ERROR   - 2006: COMMUNICATION ERROR   - 2007: COMMUNICATION ERROR   - 2008: COMMUNICATION ERROR   - 2009: COMMUNICATION ERROR   - 2010: COMMUNICATION ERROR   - 2011: COMMUNICATION ERROR   - 2012: COMMUNICATION ERROR   - 2013: COMMUNICATION ERROR   - 2014: COMMUNICATION ERROR   - 2015: COMMUNICATION ERROR   - 2016: COMMUNICATION ERROR   - 2017: COMMUNICATION ERROR   - 2018: COMMUNICATION ERROR   - 2019: COMMUNICATION ERROR   - 2020: COMMUNICATION ERROR   - 2021: COMMUNICATION ERROR   - 2022: COMMUNICATION ERROR   - 2023: COMMUNICATION ERROR   - 2024: COMMUNICATION ERROR   - 2025: COMMUNICATION ERROR ")
      @Valid
  @Size(max=99)   public List<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage> getAlternateDataSourceErrorMessage() {
    return alternateDataSourceErrorMessage;
  }

  public void setAlternateDataSourceErrorMessage(List<ConsumerCreditReportAlternateDataSourcesAlternateDataSourceErrorMessage> alternateDataSourceErrorMessage) {
    this.alternateDataSourceErrorMessage = alternateDataSourceErrorMessage;
  }

  public ConsumerCreditReportAlternateDataSources militaryLendingCoveredBorrower(ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower militaryLendingCoveredBorrower) {
    this.militaryLendingCoveredBorrower = militaryLendingCoveredBorrower;
    return this;
  }

  /**
   * Get militaryLendingCoveredBorrower
   * @return militaryLendingCoveredBorrower
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower getMilitaryLendingCoveredBorrower() {
    return militaryLendingCoveredBorrower;
  }

  public void setMilitaryLendingCoveredBorrower(ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower militaryLendingCoveredBorrower) {
    this.militaryLendingCoveredBorrower = militaryLendingCoveredBorrower;
  }

  public ConsumerCreditReportAlternateDataSources northAmericanLink(ConsumerCreditReportAlternateDataSourcesNorthAmericanLink northAmericanLink) {
    this.northAmericanLink = northAmericanLink;
    return this;
  }

  /**
   * Get northAmericanLink
   * @return northAmericanLink
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportAlternateDataSourcesNorthAmericanLink getNorthAmericanLink() {
    return northAmericanLink;
  }

  public void setNorthAmericanLink(ConsumerCreditReportAlternateDataSourcesNorthAmericanLink northAmericanLink) {
    this.northAmericanLink = northAmericanLink;
  }

  public ConsumerCreditReportAlternateDataSources fraudIQSyntheticIDAlerts(ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts fraudIQSyntheticIDAlerts) {
    this.fraudIQSyntheticIDAlerts = fraudIQSyntheticIDAlerts;
    return this;
  }

  /**
   * Get fraudIQSyntheticIDAlerts
   * @return fraudIQSyntheticIDAlerts
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts getFraudIQSyntheticIDAlerts() {
    return fraudIQSyntheticIDAlerts;
  }

  public void setFraudIQSyntheticIDAlerts(ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts fraudIQSyntheticIDAlerts) {
    this.fraudIQSyntheticIDAlerts = fraudIQSyntheticIDAlerts;
  }

  public ConsumerCreditReportAlternateDataSources impactedDataIndicator(ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator impactedDataIndicator) {
    this.impactedDataIndicator = impactedDataIndicator;
    return this;
  }

  /**
   * Get impactedDataIndicator
   * @return impactedDataIndicator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator getImpactedDataIndicator() {
    return impactedDataIndicator;
  }

  public void setImpactedDataIndicator(ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator impactedDataIndicator) {
    this.impactedDataIndicator = impactedDataIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlternateDataSources consumerCreditReportAlternateDataSources = (ConsumerCreditReportAlternateDataSources) o;
    return Objects.equals(this.alternateDataSourceErrorMessage, consumerCreditReportAlternateDataSources.alternateDataSourceErrorMessage) &&
        Objects.equals(this.militaryLendingCoveredBorrower, consumerCreditReportAlternateDataSources.militaryLendingCoveredBorrower) &&
        Objects.equals(this.northAmericanLink, consumerCreditReportAlternateDataSources.northAmericanLink) &&
        Objects.equals(this.fraudIQSyntheticIDAlerts, consumerCreditReportAlternateDataSources.fraudIQSyntheticIDAlerts) &&
        Objects.equals(this.impactedDataIndicator, consumerCreditReportAlternateDataSources.impactedDataIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateDataSourceErrorMessage, militaryLendingCoveredBorrower, northAmericanLink, fraudIQSyntheticIDAlerts, impactedDataIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlternateDataSources {\n");
    
    sb.append("    alternateDataSourceErrorMessage: ").append(toIndentedString(alternateDataSourceErrorMessage)).append("\n");
    sb.append("    militaryLendingCoveredBorrower: ").append(toIndentedString(militaryLendingCoveredBorrower)).append("\n");
    sb.append("    northAmericanLink: ").append(toIndentedString(northAmericanLink)).append("\n");
    sb.append("    fraudIQSyntheticIDAlerts: ").append(toIndentedString(fraudIQSyntheticIDAlerts)).append("\n");
    sb.append("    impactedDataIndicator: ").append(toIndentedString(impactedDataIndicator)).append("\n");
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
