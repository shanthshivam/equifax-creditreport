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
 * Information as to the subject&#x27;s consumer report SSN and subject&#x27;s SSN submitted in the inquiry
 */
@ApiModel(description = "Information as to the subject's consumer report SSN and subject's SSN submitted in the inquiry")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportIdentification   {
  @JsonProperty("subjectAge")
  private String subjectAge = null;

  @JsonProperty("subjectSocialNum")
  private String subjectSocialNum = null;

  @JsonProperty("socialNumConfirmed")
  private String socialNumConfirmed = null;

  @JsonProperty("socialMatchFlags")
  private String socialMatchFlags = null;

  @JsonProperty("inquirySocialNum")
  private String inquirySocialNum = null;

  @JsonProperty("inquirySocialNumStateIssued")
  private String inquirySocialNumStateIssued = null;

  @JsonProperty("inquirySocialNumYearIssued")
  private String inquirySocialNumYearIssued = null;

  @JsonProperty("inquirySocialNumYearOfDeath")
  private String inquirySocialNumYearOfDeath = null;

  @JsonProperty("inquirySocialNumStateOfDeath")
  private String inquirySocialNumStateOfDeath = null;

  @JsonProperty("socialNumMatch")
  private String socialNumMatch = null;

  public ConsumerCreditReportIdentification subjectAge(String subjectAge) {
    this.subjectAge = subjectAge;
    return this;
  }

  /**
   * Subject's age
   * @return subjectAge
  **/
  @ApiModelProperty(value = "Subject's age")
  
  @Size(max=2)   public String getSubjectAge() {
    return subjectAge;
  }

  public void setSubjectAge(String subjectAge) {
    this.subjectAge = subjectAge;
  }

  public ConsumerCreditReportIdentification subjectSocialNum(String subjectSocialNum) {
    this.subjectSocialNum = subjectSocialNum;
    return this;
  }

  /**
   * Last four digits of the Social Security Number may be masked with zeros for specific customers or industry codes to secure the consumers SSN
   * @return subjectSocialNum
  **/
  @ApiModelProperty(value = "Last four digits of the Social Security Number may be masked with zeros for specific customers or industry codes to secure the consumers SSN")
  
  @Size(max=9)   public String getSubjectSocialNum() {
    return subjectSocialNum;
  }

  public void setSubjectSocialNum(String subjectSocialNum) {
    this.subjectSocialNum = subjectSocialNum;
  }

  public ConsumerCreditReportIdentification socialNumConfirmed(String socialNumConfirmed) {
    this.socialNumConfirmed = socialNumConfirmed;
    return this;
  }

  /**
   * \"Confirmation\" of the Social Security Number is defined as having been received by three (3) major data suppliers. The SSN Confirmed indicator does not mean or imply the Social Security number has been validated through the Social Security Administration's records.      - Y: Yes      - N: No      - Blank: No inquiry SSN/Not available 
   * @return socialNumConfirmed
  **/
  @ApiModelProperty(value = "\"Confirmation\" of the Social Security Number is defined as having been received by three (3) major data suppliers. The SSN Confirmed indicator does not mean or imply the Social Security number has been validated through the Social Security Administration's records.      - Y: Yes      - N: No      - Blank: No inquiry SSN/Not available ")
  
  @Size(max=1)   public String getSocialNumConfirmed() {
    return socialNumConfirmed;
  }

  public void setSocialNumConfirmed(String socialNumConfirmed) {
    this.socialNumConfirmed = socialNumConfirmed;
  }

  public ConsumerCreditReportIdentification socialMatchFlags(String socialMatchFlags) {
    this.socialMatchFlags = socialMatchFlags;
    return this;
  }

  /**
   * Social Match Flags* (one per SSN digit)    - Y: Byte (digit) match    - N: Byte (digit) Not a match    - Blank: No inquiry SSN/Not available    The field will not be returned on reports when the customer number is activated for \"Social Security Number Protect\" and the social security number in the inquiry does not match what is on the consumer report.  Social Match Flags is an optional service offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of the service. 
   * @return socialMatchFlags
  **/
  @ApiModelProperty(value = "Social Match Flags* (one per SSN digit)    - Y: Byte (digit) match    - N: Byte (digit) Not a match    - Blank: No inquiry SSN/Not available    The field will not be returned on reports when the customer number is activated for \"Social Security Number Protect\" and the social security number in the inquiry does not match what is on the consumer report.  Social Match Flags is an optional service offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of the service. ")
  
  @Size(max=9)   public String getSocialMatchFlags() {
    return socialMatchFlags;
  }

  public void setSocialMatchFlags(String socialMatchFlags) {
    this.socialMatchFlags = socialMatchFlags;
  }

  public ConsumerCreditReportIdentification inquirySocialNum(String inquirySocialNum) {
    this.inquirySocialNum = inquirySocialNum;
    return this;
  }

  /**
   * Inquiry social security number
   * @return inquirySocialNum
  **/
  @ApiModelProperty(value = "Inquiry social security number")
  
  @Size(max=9)   public String getInquirySocialNum() {
    return inquirySocialNum;
  }

  public void setInquirySocialNum(String inquirySocialNum) {
    this.inquirySocialNum = inquirySocialNum;
  }

  public ConsumerCreditReportIdentification inquirySocialNumStateIssued(String inquirySocialNumStateIssued) {
    this.inquirySocialNumStateIssued = inquirySocialNumStateIssued;
    return this;
  }

  /**
   * State code where the SSN was issued.  It may contain a \"RR\", indicating that the SSN was issued to a railroad employe. Discontinued July 1, 1963. 
   * @return inquirySocialNumStateIssued
  **/
  @ApiModelProperty(value = "State code where the SSN was issued.  It may contain a \"RR\", indicating that the SSN was issued to a railroad employe. Discontinued July 1, 1963. ")
  
  @Size(max=2)   public String getInquirySocialNumStateIssued() {
    return inquirySocialNumStateIssued;
  }

  public void setInquirySocialNumStateIssued(String inquirySocialNumStateIssued) {
    this.inquirySocialNumStateIssued = inquirySocialNumStateIssued;
  }

  public ConsumerCreditReportIdentification inquirySocialNumYearIssued(String inquirySocialNumYearIssued) {
    this.inquirySocialNumYearIssued = inquirySocialNumYearIssued;
    return this;
  }

  /**
   * Inquiry SSN date issued   The actual year or \"Prior to\".   P 51 means Prior to 1951 
   * @return inquirySocialNumYearIssued
  **/
  @ApiModelProperty(example = "[\"YYYY\",\"P 51\"]", value = "Inquiry SSN date issued   The actual year or \"Prior to\".   P 51 means Prior to 1951 ")
  
  @Size(max=4)   public String getInquirySocialNumYearIssued() {
    return inquirySocialNumYearIssued;
  }

  public void setInquirySocialNumYearIssued(String inquirySocialNumYearIssued) {
    this.inquirySocialNumYearIssued = inquirySocialNumYearIssued;
  }

  public ConsumerCreditReportIdentification inquirySocialNumYearOfDeath(String inquirySocialNumYearOfDeath) {
    this.inquirySocialNumYearOfDeath = inquirySocialNumYearOfDeath;
    return this;
  }

  /**
   * Inquiry SSN death date.   The actual year or \"Prior to\".   P 91 means Prior to 1991 
   * @return inquirySocialNumYearOfDeath
  **/
  @ApiModelProperty(example = "[\"YYYY\",\"P 92\"]", value = "Inquiry SSN death date.   The actual year or \"Prior to\".   P 91 means Prior to 1991 ")
  
  @Size(max=4)   public String getInquirySocialNumYearOfDeath() {
    return inquirySocialNumYearOfDeath;
  }

  public void setInquirySocialNumYearOfDeath(String inquirySocialNumYearOfDeath) {
    this.inquirySocialNumYearOfDeath = inquirySocialNumYearOfDeath;
  }

  public ConsumerCreditReportIdentification inquirySocialNumStateOfDeath(String inquirySocialNumStateOfDeath) {
    this.inquirySocialNumStateOfDeath = inquirySocialNumStateOfDeath;
    return this;
  }

  /**
   * If party is deceased this is the state it was reported in
   * @return inquirySocialNumStateOfDeath
  **/
  @ApiModelProperty(value = "If party is deceased this is the state it was reported in")
  
  @Size(max=2)   public String getInquirySocialNumStateOfDeath() {
    return inquirySocialNumStateOfDeath;
  }

  public void setInquirySocialNumStateOfDeath(String inquirySocialNumStateOfDeath) {
    this.inquirySocialNumStateOfDeath = inquirySocialNumStateOfDeath;
  }

  public ConsumerCreditReportIdentification socialNumMatch(String socialNumMatch) {
    this.socialNumMatch = socialNumMatch;
    return this;
  }

  /**
   * Shows if the SSN match byte-to-byte   - Y: Match    - N: Not a match  The field will not be returned on reports when the customer number is activated for \"Social Security Number Protect\" and the social security number in the inquiry does not match what is on the consumer report. SSN Match is an optional service offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of the service. 
   * @return socialNumMatch
  **/
  @ApiModelProperty(value = "Shows if the SSN match byte-to-byte   - Y: Match    - N: Not a match  The field will not be returned on reports when the customer number is activated for \"Social Security Number Protect\" and the social security number in the inquiry does not match what is on the consumer report. SSN Match is an optional service offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of the service. ")
  
  @Size(max=1)   public String getSocialNumMatch() {
    return socialNumMatch;
  }

  public void setSocialNumMatch(String socialNumMatch) {
    this.socialNumMatch = socialNumMatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportIdentification consumerCreditReportIdentification = (ConsumerCreditReportIdentification) o;
    return Objects.equals(this.subjectAge, consumerCreditReportIdentification.subjectAge) &&
        Objects.equals(this.subjectSocialNum, consumerCreditReportIdentification.subjectSocialNum) &&
        Objects.equals(this.socialNumConfirmed, consumerCreditReportIdentification.socialNumConfirmed) &&
        Objects.equals(this.socialMatchFlags, consumerCreditReportIdentification.socialMatchFlags) &&
        Objects.equals(this.inquirySocialNum, consumerCreditReportIdentification.inquirySocialNum) &&
        Objects.equals(this.inquirySocialNumStateIssued, consumerCreditReportIdentification.inquirySocialNumStateIssued) &&
        Objects.equals(this.inquirySocialNumYearIssued, consumerCreditReportIdentification.inquirySocialNumYearIssued) &&
        Objects.equals(this.inquirySocialNumYearOfDeath, consumerCreditReportIdentification.inquirySocialNumYearOfDeath) &&
        Objects.equals(this.inquirySocialNumStateOfDeath, consumerCreditReportIdentification.inquirySocialNumStateOfDeath) &&
        Objects.equals(this.socialNumMatch, consumerCreditReportIdentification.socialNumMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectAge, subjectSocialNum, socialNumConfirmed, socialMatchFlags, inquirySocialNum, inquirySocialNumStateIssued, inquirySocialNumYearIssued, inquirySocialNumYearOfDeath, inquirySocialNumStateOfDeath, socialNumMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportIdentification {\n");
    
    sb.append("    subjectAge: ").append(toIndentedString(subjectAge)).append("\n");
    sb.append("    subjectSocialNum: ").append(toIndentedString(subjectSocialNum)).append("\n");
    sb.append("    socialNumConfirmed: ").append(toIndentedString(socialNumConfirmed)).append("\n");
    sb.append("    socialMatchFlags: ").append(toIndentedString(socialMatchFlags)).append("\n");
    sb.append("    inquirySocialNum: ").append(toIndentedString(inquirySocialNum)).append("\n");
    sb.append("    inquirySocialNumStateIssued: ").append(toIndentedString(inquirySocialNumStateIssued)).append("\n");
    sb.append("    inquirySocialNumYearIssued: ").append(toIndentedString(inquirySocialNumYearIssued)).append("\n");
    sb.append("    inquirySocialNumYearOfDeath: ").append(toIndentedString(inquirySocialNumYearOfDeath)).append("\n");
    sb.append("    inquirySocialNumStateOfDeath: ").append(toIndentedString(inquirySocialNumStateOfDeath)).append("\n");
    sb.append("    socialNumMatch: ").append(toIndentedString(socialNumMatch)).append("\n");
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
