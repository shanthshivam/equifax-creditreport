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
 * Indicates if the consumer was impacted by the Equifax security incident
 */
@ApiModel(description = "Indicates if the consumer was impacted by the Equifax security incident")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator   {
  @JsonProperty("nonRegulatedIdentifier")
  private String nonRegulatedIdentifier = null;

  @JsonProperty("hitNohitIndicator")
  private String hitNohitIndicator = null;

  @JsonProperty("disclaimer")
  private String disclaimer = null;

  @JsonProperty("nameLikelyImpacted")
  private String nameLikelyImpacted = null;

  @JsonProperty("addressLikelyImpacted")
  private String addressLikelyImpacted = null;

  @JsonProperty("socialNumLikelyImpacted")
  private String socialNumLikelyImpacted = null;

  @JsonProperty("DOBLikelyImpacted")
  private String doBLikelyImpacted = null;

  @JsonProperty("driversLicenseLikelyImpacted")
  private String driversLicenseLikelyImpacted = null;

  public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator nonRegulatedIdentifier(String nonRegulatedIdentifier) {
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

  public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator hitNohitIndicator(String hitNohitIndicator) {
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

  public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator disclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
    return this;
  }

  /**
   * DISCLAIMER: THE IMPACTED DATA INDICATOR IS A FRAUD TOOL AND INFORMATION SERVICE BASED ON INFORMATION THAT WAS NOT COLLECTED, IN WHOLE OR IN PART, FOR THE PURPOSE OF SERVING AS A FACTOR IN ESTABLISHING A CONSUMER’S ELIGIBILITY FOR CREDIT OR INSURANCE TO BE USED PRIMARILY FOR PERSONAL, FAMILY OR HOUSEHOLD PURPOSES; EMPLOYMENT PURPOSES; OR ANY OTHER PURPOSE AUTHORIZED UNDER THE FCRA. ACCORDINGLY, CLIENT WILL NOT USE IMPACTED DATA INDICATOR (I)AS PART OF ITS DECISIONMAKING PROCESS FOR DETERMINING THE CONSUMER’S ELIGIBILITY FOR CREDIT OR ANY OTHER FCRA PERMISSIBLE PURPOSE OR (II) IN ANY MANNER FOR THE PURPOSE OF TAKING “ADVERSE ACTION” AGAINST A CONSUMER, AS DEFINED IN THE EQUAL CREDIT OPPORTUNITY ACT AND REGULATION B. CLIENT MAY ONLY USE THE IMPACTED DATA INDICATOR,‘FLAGS’, INDICATORS OR OTHER WARNING MESSAGE FROM THE IMPACTED DATA INDICATOR AS AN INDICATION THAT THE CONSUMER’S APPLICATION INFORMATION SHOULD BE INDEPENDENTLY VERIFIED PRIOR TO A CREDIT DECISION OR ANY OTHER PURPOSE AUTHORIZED UNDER THE FCRA. DUE TO THE METHOD OF MATCHING THE IMPACT FILE TO THE INPUT LIST, THE PRESENCE OF A FLAG (OR LACK OF FLAG) DOES NOT NECESSARILY MEAN A CONSUMER’S INFORMATION WAS IMPACTED (OR NOT IMPACTED). 
   * @return disclaimer
  **/
  @ApiModelProperty(value = "DISCLAIMER: THE IMPACTED DATA INDICATOR IS A FRAUD TOOL AND INFORMATION SERVICE BASED ON INFORMATION THAT WAS NOT COLLECTED, IN WHOLE OR IN PART, FOR THE PURPOSE OF SERVING AS A FACTOR IN ESTABLISHING A CONSUMER’S ELIGIBILITY FOR CREDIT OR INSURANCE TO BE USED PRIMARILY FOR PERSONAL, FAMILY OR HOUSEHOLD PURPOSES; EMPLOYMENT PURPOSES; OR ANY OTHER PURPOSE AUTHORIZED UNDER THE FCRA. ACCORDINGLY, CLIENT WILL NOT USE IMPACTED DATA INDICATOR (I)AS PART OF ITS DECISIONMAKING PROCESS FOR DETERMINING THE CONSUMER’S ELIGIBILITY FOR CREDIT OR ANY OTHER FCRA PERMISSIBLE PURPOSE OR (II) IN ANY MANNER FOR THE PURPOSE OF TAKING “ADVERSE ACTION” AGAINST A CONSUMER, AS DEFINED IN THE EQUAL CREDIT OPPORTUNITY ACT AND REGULATION B. CLIENT MAY ONLY USE THE IMPACTED DATA INDICATOR,‘FLAGS’, INDICATORS OR OTHER WARNING MESSAGE FROM THE IMPACTED DATA INDICATOR AS AN INDICATION THAT THE CONSUMER’S APPLICATION INFORMATION SHOULD BE INDEPENDENTLY VERIFIED PRIOR TO A CREDIT DECISION OR ANY OTHER PURPOSE AUTHORIZED UNDER THE FCRA. DUE TO THE METHOD OF MATCHING THE IMPACT FILE TO THE INPUT LIST, THE PRESENCE OF A FLAG (OR LACK OF FLAG) DOES NOT NECESSARILY MEAN A CONSUMER’S INFORMATION WAS IMPACTED (OR NOT IMPACTED). ")
  
  @Size(max=1400)   public String getDisclaimer() {
    return disclaimer;
  }

  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }

  public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator nameLikelyImpacted(String nameLikelyImpacted) {
    this.nameLikelyImpacted = nameLikelyImpacted;
    return this;
  }

  /**
   * Indicates id the name information was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined 
   * @return nameLikelyImpacted
  **/
  @ApiModelProperty(value = "Indicates id the name information was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined ")
  
  @Size(max=1)   public String getNameLikelyImpacted() {
    return nameLikelyImpacted;
  }

  public void setNameLikelyImpacted(String nameLikelyImpacted) {
    this.nameLikelyImpacted = nameLikelyImpacted;
  }

  public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator addressLikelyImpacted(String addressLikelyImpacted) {
    this.addressLikelyImpacted = addressLikelyImpacted;
    return this;
  }

  /**
   * Indicates id the address information was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined 
   * @return addressLikelyImpacted
  **/
  @ApiModelProperty(value = "Indicates id the address information was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined ")
  
  @Size(max=1)   public String getAddressLikelyImpacted() {
    return addressLikelyImpacted;
  }

  public void setAddressLikelyImpacted(String addressLikelyImpacted) {
    this.addressLikelyImpacted = addressLikelyImpacted;
  }

  public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator socialNumLikelyImpacted(String socialNumLikelyImpacted) {
    this.socialNumLikelyImpacted = socialNumLikelyImpacted;
    return this;
  }

  /**
   * Indicates id the social security number was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined 
   * @return socialNumLikelyImpacted
  **/
  @ApiModelProperty(value = "Indicates id the social security number was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined ")
  
  @Size(max=1)   public String getSocialNumLikelyImpacted() {
    return socialNumLikelyImpacted;
  }

  public void setSocialNumLikelyImpacted(String socialNumLikelyImpacted) {
    this.socialNumLikelyImpacted = socialNumLikelyImpacted;
  }

  public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator doBLikelyImpacted(String doBLikelyImpacted) {
    this.doBLikelyImpacted = doBLikelyImpacted;
    return this;
  }

  /**
   * Indicates id the date of birth information was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined 
   * @return doBLikelyImpacted
  **/
  @ApiModelProperty(value = "Indicates id the date of birth information was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined ")
  
  @Size(max=1)   public String getDoBLikelyImpacted() {
    return doBLikelyImpacted;
  }

  public void setDoBLikelyImpacted(String doBLikelyImpacted) {
    this.doBLikelyImpacted = doBLikelyImpacted;
  }

  public ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator driversLicenseLikelyImpacted(String driversLicenseLikelyImpacted) {
    this.driversLicenseLikelyImpacted = driversLicenseLikelyImpacted;
    return this;
  }

  /**
   * Indicates id the driver's license information was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined 
   * @return driversLicenseLikelyImpacted
  **/
  @ApiModelProperty(value = "Indicates id the driver's license information was impacted.  - Y: Likely impacted - N: Unlikely impacted - U: Impact cannot be determined ")
  
  @Size(max=1)   public String getDriversLicenseLikelyImpacted() {
    return driversLicenseLikelyImpacted;
  }

  public void setDriversLicenseLikelyImpacted(String driversLicenseLikelyImpacted) {
    this.driversLicenseLikelyImpacted = driversLicenseLikelyImpacted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator consumerCreditReportAlternateDataSourcesImpactedDataIndicator = (ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator) o;
    return Objects.equals(this.nonRegulatedIdentifier, consumerCreditReportAlternateDataSourcesImpactedDataIndicator.nonRegulatedIdentifier) &&
        Objects.equals(this.hitNohitIndicator, consumerCreditReportAlternateDataSourcesImpactedDataIndicator.hitNohitIndicator) &&
        Objects.equals(this.disclaimer, consumerCreditReportAlternateDataSourcesImpactedDataIndicator.disclaimer) &&
        Objects.equals(this.nameLikelyImpacted, consumerCreditReportAlternateDataSourcesImpactedDataIndicator.nameLikelyImpacted) &&
        Objects.equals(this.addressLikelyImpacted, consumerCreditReportAlternateDataSourcesImpactedDataIndicator.addressLikelyImpacted) &&
        Objects.equals(this.socialNumLikelyImpacted, consumerCreditReportAlternateDataSourcesImpactedDataIndicator.socialNumLikelyImpacted) &&
        Objects.equals(this.doBLikelyImpacted, consumerCreditReportAlternateDataSourcesImpactedDataIndicator.doBLikelyImpacted) &&
        Objects.equals(this.driversLicenseLikelyImpacted, consumerCreditReportAlternateDataSourcesImpactedDataIndicator.driversLicenseLikelyImpacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonRegulatedIdentifier, hitNohitIndicator, disclaimer, nameLikelyImpacted, addressLikelyImpacted, socialNumLikelyImpacted, doBLikelyImpacted, driversLicenseLikelyImpacted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlternateDataSourcesImpactedDataIndicator {\n");
    
    sb.append("    nonRegulatedIdentifier: ").append(toIndentedString(nonRegulatedIdentifier)).append("\n");
    sb.append("    hitNohitIndicator: ").append(toIndentedString(hitNohitIndicator)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
    sb.append("    nameLikelyImpacted: ").append(toIndentedString(nameLikelyImpacted)).append("\n");
    sb.append("    addressLikelyImpacted: ").append(toIndentedString(addressLikelyImpacted)).append("\n");
    sb.append("    socialNumLikelyImpacted: ").append(toIndentedString(socialNumLikelyImpacted)).append("\n");
    sb.append("    doBLikelyImpacted: ").append(toIndentedString(doBLikelyImpacted)).append("\n");
    sb.append("    driversLicenseLikelyImpacted: ").append(toIndentedString(driversLicenseLikelyImpacted)).append("\n");
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
