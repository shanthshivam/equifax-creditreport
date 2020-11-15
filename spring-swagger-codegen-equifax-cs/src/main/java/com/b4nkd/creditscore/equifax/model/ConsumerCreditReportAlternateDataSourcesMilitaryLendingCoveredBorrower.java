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
 * Provides information relating to the Military Lending Act – MLA Covered Borrower Status.
 */
@ApiModel(description = "Provides information relating to the Military Lending Act – MLA Covered Borrower Status.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower   {
  @JsonProperty("regulatedIdentifier")
  private String regulatedIdentifier = null;

  @JsonProperty("disclaimer")
  private String disclaimer = null;

  @JsonProperty("coveredBorrowerStatus")
  private String coveredBorrowerStatus = null;

  @JsonProperty("insufficientDataProvidedForMatch")
  private String insufficientDataProvidedForMatch = null;

  @JsonProperty("referralContactNumber")
  private String referralContactNumber = null;

  public ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower regulatedIdentifier(String regulatedIdentifier) {
    this.regulatedIdentifier = regulatedIdentifier;
    return this;
  }

  /**
   * RG - indicates that this is Regulated Data
   * @return regulatedIdentifier
  **/
  @ApiModelProperty(value = "RG - indicates that this is Regulated Data")
  
  @Size(max=2)   public String getRegulatedIdentifier() {
    return regulatedIdentifier;
  }

  public void setRegulatedIdentifier(String regulatedIdentifier) {
    this.regulatedIdentifier = regulatedIdentifier;
  }

  public ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower disclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
    return this;
  }

  /**
   * Diclaimer Text THE DEPARTMENT OF DEFENSE (\"DOD\") COVERED BORROWER DATA (\"DATA\") IS FROM THE DEFENSE MANPOWER DATA CENTER (\"DMDC\") BY WAY OF CONTRACT BETWEEN EQUIFAX INFORMATION SERVICES LLC (\"EQUIFAX\") AND DOD. ALL DOD DATA IS USED AND STORED BY EQUIFAX IN ACCORDANCE WITH ITS LEGAL AND CONTRACTUAL OBLIGATIONS. THE DOD DATA IS NOT PART OF EQUIFAX’S NATIONWIDE CREDIT DATABASE, AND EQUIFAX IS REQUIRED TO MAINTAIN THE DOD DATA SEPARATE FROM AND NOT COMMINGLED WITH ANY CREDIT DATA MAINTAINED BY EQUIFAX. 
   * @return disclaimer
  **/
  @ApiModelProperty(value = "Diclaimer Text THE DEPARTMENT OF DEFENSE (\"DOD\") COVERED BORROWER DATA (\"DATA\") IS FROM THE DEFENSE MANPOWER DATA CENTER (\"DMDC\") BY WAY OF CONTRACT BETWEEN EQUIFAX INFORMATION SERVICES LLC (\"EQUIFAX\") AND DOD. ALL DOD DATA IS USED AND STORED BY EQUIFAX IN ACCORDANCE WITH ITS LEGAL AND CONTRACTUAL OBLIGATIONS. THE DOD DATA IS NOT PART OF EQUIFAX’S NATIONWIDE CREDIT DATABASE, AND EQUIFAX IS REQUIRED TO MAINTAIN THE DOD DATA SEPARATE FROM AND NOT COMMINGLED WITH ANY CREDIT DATA MAINTAINED BY EQUIFAX. ")
  
  @Size(max=500)   public String getDisclaimer() {
    return disclaimer;
  }

  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }

  public ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower coveredBorrowerStatus(String coveredBorrowerStatus) {
    this.coveredBorrowerStatus = coveredBorrowerStatus;
    return this;
  }

  /**
   * Yes or No in Military
   * @return coveredBorrowerStatus
  **/
  @ApiModelProperty(value = "Yes or No in Military")
  
  @Size(max=1)   public String getCoveredBorrowerStatus() {
    return coveredBorrowerStatus;
  }

  public void setCoveredBorrowerStatus(String coveredBorrowerStatus) {
    this.coveredBorrowerStatus = coveredBorrowerStatus;
  }

  public ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower insufficientDataProvidedForMatch(String insufficientDataProvidedForMatch) {
    this.insufficientDataProvidedForMatch = insufficientDataProvidedForMatch;
    return this;
  }

  /**
   * Insufficient data provided for match
   * @return insufficientDataProvidedForMatch
  **/
  @ApiModelProperty(value = "Insufficient data provided for match")
  
  @Size(max=1)   public String getInsufficientDataProvidedForMatch() {
    return insufficientDataProvidedForMatch;
  }

  public void setInsufficientDataProvidedForMatch(String insufficientDataProvidedForMatch) {
    this.insufficientDataProvidedForMatch = insufficientDataProvidedForMatch;
  }

  public ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower referralContactNumber(String referralContactNumber) {
    this.referralContactNumber = referralContactNumber;
    return this;
  }

  /**
   * Contact number for MLA
   * @return referralContactNumber
  **/
  @ApiModelProperty(value = "Contact number for MLA")
  
  @Size(max=12)   public String getReferralContactNumber() {
    return referralContactNumber;
  }

  public void setReferralContactNumber(String referralContactNumber) {
    this.referralContactNumber = referralContactNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower consumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower = (ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower) o;
    return Objects.equals(this.regulatedIdentifier, consumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower.regulatedIdentifier) &&
        Objects.equals(this.disclaimer, consumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower.disclaimer) &&
        Objects.equals(this.coveredBorrowerStatus, consumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower.coveredBorrowerStatus) &&
        Objects.equals(this.insufficientDataProvidedForMatch, consumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower.insufficientDataProvidedForMatch) &&
        Objects.equals(this.referralContactNumber, consumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower.referralContactNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatedIdentifier, disclaimer, coveredBorrowerStatus, insufficientDataProvidedForMatch, referralContactNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlternateDataSourcesMilitaryLendingCoveredBorrower {\n");
    
    sb.append("    regulatedIdentifier: ").append(toIndentedString(regulatedIdentifier)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
    sb.append("    coveredBorrowerStatus: ").append(toIndentedString(coveredBorrowerStatus)).append("\n");
    sb.append("    insufficientDataProvidedForMatch: ").append(toIndentedString(insufficientDataProvidedForMatch)).append("\n");
    sb.append("    referralContactNumber: ").append(toIndentedString(referralContactNumber)).append("\n");
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
