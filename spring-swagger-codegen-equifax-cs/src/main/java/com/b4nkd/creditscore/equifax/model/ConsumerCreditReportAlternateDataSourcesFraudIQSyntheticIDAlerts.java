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
 * FraudIQ Synthetic ID Alerts provide real‐time alerts that help determine if the identity presented is real or synthetic
 */
@ApiModel(description = "FraudIQ Synthetic ID Alerts provide real‐time alerts that help determine if the identity presented is real or synthetic")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts   {
  @JsonProperty("nonRegulatedIdentifier")
  private String nonRegulatedIdentifier = null;

  @JsonProperty("hitNohitIndicator")
  private String hitNohitIndicator = null;

  @JsonProperty("disclaimer")
  private String disclaimer = null;

  @JsonProperty("finalAssessmentFlag")
  private String finalAssessmentFlag = null;

  @JsonProperty("authorizedUserVelocityFlag")
  private String authorizedUserVelocityFlag = null;

  @JsonProperty("idDiscrepancyFlag")
  private String idDiscrepancyFlag = null;

  @JsonProperty("numberOfAuthorizedUsers")
  private String numberOfAuthorizedUsers = null;

  @JsonProperty("numberOfTerminatedUsers")
  private String numberOfTerminatedUsers = null;

  public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts nonRegulatedIdentifier(String nonRegulatedIdentifier) {
    this.nonRegulatedIdentifier = nonRegulatedIdentifier;
    return this;
  }

  /**
   * \\'NR\\' Non Regulated Data Source
   * @return nonRegulatedIdentifier
  **/
  @ApiModelProperty(value = "\\'NR\\' Non Regulated Data Source")
  
  @Size(max=2)   public String getNonRegulatedIdentifier() {
    return nonRegulatedIdentifier;
  }

  public void setNonRegulatedIdentifier(String nonRegulatedIdentifier) {
    this.nonRegulatedIdentifier = nonRegulatedIdentifier;
  }

  public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts hitNohitIndicator(String hitNohitIndicator) {
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

  public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts disclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
    return this;
  }

  /**
   * DISCLAIMER:[SYNTHETIC ID ALERT]  Indicator is for identity fraud risk alert purposes only and is not to be used for determining an individual’s eligibility for any credit or any other FCRA permissible purpose. Client shall use the [SYNTHETIC ID ALERT]  exclusively within Client’s own organization for the purpose of identity fraud prevention.  Accordingly, Client will not use an alert or warning message from the [SYNTHETIC ID ALERT] system in its decision-making process for denying credit, but will use the message as an indication that the consumer's identity and personally identifiable information should be independently verified to form a reasonable belief that it knows the true identity of the consumer. Client understands that the information supplied by [SYNTHETIC ID ALERT] may or may not apply to the consumer who has applied to Client for credit, service, dealings, or other financial transactions. Client also understands and agrees that data from the [SYNTHETIC ID ALERT] system is proprietary to Equifax and shall not be used as a component of any database or file built or maintained by Client. The use of such data shall be limited to the specific transaction for which the [SYNTHETIC ID ALERT] message is provided. Equifax may, by written notice to Client, immediately terminate the Client’s agreement for service or suspend the [SYNTHETIC ID ALERT] service if Equifax has a reasonable belief that Client has violated the terms of this disclaimer or the agreement for service. 
   * @return disclaimer
  **/
  @ApiModelProperty(value = "DISCLAIMER:[SYNTHETIC ID ALERT]  Indicator is for identity fraud risk alert purposes only and is not to be used for determining an individual’s eligibility for any credit or any other FCRA permissible purpose. Client shall use the [SYNTHETIC ID ALERT]  exclusively within Client’s own organization for the purpose of identity fraud prevention.  Accordingly, Client will not use an alert or warning message from the [SYNTHETIC ID ALERT] system in its decision-making process for denying credit, but will use the message as an indication that the consumer's identity and personally identifiable information should be independently verified to form a reasonable belief that it knows the true identity of the consumer. Client understands that the information supplied by [SYNTHETIC ID ALERT] may or may not apply to the consumer who has applied to Client for credit, service, dealings, or other financial transactions. Client also understands and agrees that data from the [SYNTHETIC ID ALERT] system is proprietary to Equifax and shall not be used as a component of any database or file built or maintained by Client. The use of such data shall be limited to the specific transaction for which the [SYNTHETIC ID ALERT] message is provided. Equifax may, by written notice to Client, immediately terminate the Client’s agreement for service or suspend the [SYNTHETIC ID ALERT] service if Equifax has a reasonable belief that Client has violated the terms of this disclaimer or the agreement for service. ")
  
  @Size(max=1600)   public String getDisclaimer() {
    return disclaimer;
  }

  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }

  public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts finalAssessmentFlag(String finalAssessmentFlag) {
    this.finalAssessmentFlag = finalAssessmentFlag;
    return this;
  }

  /**
   * Final Synthetic ID Alert assessment will be Y if either Authorized User Velocity (AUV) Flag or ID Discrepancy Flag are Y 
   * @return finalAssessmentFlag
  **/
  @ApiModelProperty(value = "Final Synthetic ID Alert assessment will be Y if either Authorized User Velocity (AUV) Flag or ID Discrepancy Flag are Y ")
  
  @Size(max=1)   public String getFinalAssessmentFlag() {
    return finalAssessmentFlag;
  }

  public void setFinalAssessmentFlag(String finalAssessmentFlag) {
    this.finalAssessmentFlag = finalAssessmentFlag;
  }

  public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts authorizedUserVelocityFlag(String authorizedUserVelocityFlag) {
    this.authorizedUserVelocityFlag = authorizedUserVelocityFlag;
    return this;
  }

  /**
   * Flag will be Y if combination of Number Authorized users & Number Terminated trades meets the defined criteria for the AUV Flag 
   * @return authorizedUserVelocityFlag
  **/
  @ApiModelProperty(value = "Flag will be Y if combination of Number Authorized users & Number Terminated trades meets the defined criteria for the AUV Flag ")
  
  @Size(max=1)   public String getAuthorizedUserVelocityFlag() {
    return authorizedUserVelocityFlag;
  }

  public void setAuthorizedUserVelocityFlag(String authorizedUserVelocityFlag) {
    this.authorizedUserVelocityFlag = authorizedUserVelocityFlag;
  }

  public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts idDiscrepancyFlag(String idDiscrepancyFlag) {
    this.idDiscrepancyFlag = idDiscrepancyFlag;
    return this;
  }

  /**
   * Flag will be Y if it meets the defined criteria for the current Identity discrepancy attributes (based on patterns exhibited by synthetic fraudsters and identity mismatches between authorized users and primary account holders like count of last name mismatches, etc) 
   * @return idDiscrepancyFlag
  **/
  @ApiModelProperty(value = "Flag will be Y if it meets the defined criteria for the current Identity discrepancy attributes (based on patterns exhibited by synthetic fraudsters and identity mismatches between authorized users and primary account holders like count of last name mismatches, etc) ")
  
  @Size(max=1)   public String getIdDiscrepancyFlag() {
    return idDiscrepancyFlag;
  }

  public void setIdDiscrepancyFlag(String idDiscrepancyFlag) {
    this.idDiscrepancyFlag = idDiscrepancyFlag;
  }

  public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts numberOfAuthorizedUsers(String numberOfAuthorizedUsers) {
    this.numberOfAuthorizedUsers = numberOfAuthorizedUsers;
    return this;
  }

  /**
   * Count of active Authorized Users potentially associated with consumer
   * @return numberOfAuthorizedUsers
  **/
  @ApiModelProperty(value = "Count of active Authorized Users potentially associated with consumer")
  
  @Size(max=2)   public String getNumberOfAuthorizedUsers() {
    return numberOfAuthorizedUsers;
  }

  public void setNumberOfAuthorizedUsers(String numberOfAuthorizedUsers) {
    this.numberOfAuthorizedUsers = numberOfAuthorizedUsers;
  }

  public ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts numberOfTerminatedUsers(String numberOfTerminatedUsers) {
    this.numberOfTerminatedUsers = numberOfTerminatedUsers;
    return this;
  }

  /**
   * Count of Terminated Trades potentially associated with consumer
   * @return numberOfTerminatedUsers
  **/
  @ApiModelProperty(value = "Count of Terminated Trades potentially associated with consumer")
  
  @Size(max=2)   public String getNumberOfTerminatedUsers() {
    return numberOfTerminatedUsers;
  }

  public void setNumberOfTerminatedUsers(String numberOfTerminatedUsers) {
    this.numberOfTerminatedUsers = numberOfTerminatedUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts = (ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts) o;
    return Objects.equals(this.nonRegulatedIdentifier, consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts.nonRegulatedIdentifier) &&
        Objects.equals(this.hitNohitIndicator, consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts.hitNohitIndicator) &&
        Objects.equals(this.disclaimer, consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts.disclaimer) &&
        Objects.equals(this.finalAssessmentFlag, consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts.finalAssessmentFlag) &&
        Objects.equals(this.authorizedUserVelocityFlag, consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts.authorizedUserVelocityFlag) &&
        Objects.equals(this.idDiscrepancyFlag, consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts.idDiscrepancyFlag) &&
        Objects.equals(this.numberOfAuthorizedUsers, consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts.numberOfAuthorizedUsers) &&
        Objects.equals(this.numberOfTerminatedUsers, consumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts.numberOfTerminatedUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonRegulatedIdentifier, hitNohitIndicator, disclaimer, finalAssessmentFlag, authorizedUserVelocityFlag, idDiscrepancyFlag, numberOfAuthorizedUsers, numberOfTerminatedUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlternateDataSourcesFraudIQSyntheticIDAlerts {\n");
    
    sb.append("    nonRegulatedIdentifier: ").append(toIndentedString(nonRegulatedIdentifier)).append("\n");
    sb.append("    hitNohitIndicator: ").append(toIndentedString(hitNohitIndicator)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
    sb.append("    finalAssessmentFlag: ").append(toIndentedString(finalAssessmentFlag)).append("\n");
    sb.append("    authorizedUserVelocityFlag: ").append(toIndentedString(authorizedUserVelocityFlag)).append("\n");
    sb.append("    idDiscrepancyFlag: ").append(toIndentedString(idDiscrepancyFlag)).append("\n");
    sb.append("    numberOfAuthorizedUsers: ").append(toIndentedString(numberOfAuthorizedUsers)).append("\n");
    sb.append("    numberOfTerminatedUsers: ").append(toIndentedString(numberOfTerminatedUsers)).append("\n");
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
