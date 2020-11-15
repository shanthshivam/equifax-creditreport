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
 * OFACAlertsInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class OFACAlertsInner   {
  @JsonProperty("revisedLegalVerbiageIndicator")
  private String revisedLegalVerbiageIndicator = null;

  @JsonProperty("memberFirmCode")
  private String memberFirmCode = null;

  @JsonProperty("cdcTransactionDate")
  private String cdcTransactionDate = null;

  @JsonProperty("cdcTransactionTime")
  private String cdcTransactionTime = null;

  @JsonProperty("transactionType")
  private String transactionType = null;

  @JsonProperty("cdcResponseCode")
  private String cdcResponseCode = null;

  @JsonProperty("cdcProblemCode")
  private String cdcProblemCode = null;

  @JsonProperty("matchCodes")
  private String matchCodes = null;

  @JsonProperty("problemReportDate")
  private String problemReportDate = null;

  @JsonProperty("issueSource")
  private String issueSource = null;

  @JsonProperty("issueIDOrReference")
  private String issueIDOrReference = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("subjectName")
  private Object subjectName = null;

  @JsonProperty("address")
  private Object address = null;

  @JsonProperty("legalVerbiage")
  private String legalVerbiage = null;

  @JsonProperty("dataSegmentRegulated")
  private String dataSegmentRegulated = null;

  public OFACAlertsInner revisedLegalVerbiageIndicator(String revisedLegalVerbiageIndicator) {
    this.revisedLegalVerbiageIndicator = revisedLegalVerbiageIndicator;
    return this;
  }

  /**
   * A value of 2 indicates a revised legal verbiage will be returned
   * @return revisedLegalVerbiageIndicator
  **/
  @ApiModelProperty(value = "A value of 2 indicates a revised legal verbiage will be returned")
  
  @Size(max=1)   public String getRevisedLegalVerbiageIndicator() {
    return revisedLegalVerbiageIndicator;
  }

  public void setRevisedLegalVerbiageIndicator(String revisedLegalVerbiageIndicator) {
    this.revisedLegalVerbiageIndicator = revisedLegalVerbiageIndicator;
  }

  public OFACAlertsInner memberFirmCode(String memberFirmCode) {
    this.memberFirmCode = memberFirmCode;
    return this;
  }

  /**
   * Firm Code from CDC
   * @return memberFirmCode
  **/
  @ApiModelProperty(value = "Firm Code from CDC")
  
  @Size(max=4)   public String getMemberFirmCode() {
    return memberFirmCode;
  }

  public void setMemberFirmCode(String memberFirmCode) {
    this.memberFirmCode = memberFirmCode;
  }

  public OFACAlertsInner cdcTransactionDate(String cdcTransactionDate) {
    this.cdcTransactionDate = cdcTransactionDate;
    return this;
  }

  /**
   * Get cdcTransactionDate
   * @return cdcTransactionDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getCdcTransactionDate() {
    return cdcTransactionDate;
  }

  public void setCdcTransactionDate(String cdcTransactionDate) {
    this.cdcTransactionDate = cdcTransactionDate;
  }

  public OFACAlertsInner cdcTransactionTime(String cdcTransactionTime) {
    this.cdcTransactionTime = cdcTransactionTime;
    return this;
  }

  /**
   * Time of Compliance Data Center transaction
   * @return cdcTransactionTime
  **/
  @ApiModelProperty(example = "[\"HHMMSS\"]", value = "Time of Compliance Data Center transaction")
  
  @Size(max=6)   public String getCdcTransactionTime() {
    return cdcTransactionTime;
  }

  public void setCdcTransactionTime(String cdcTransactionTime) {
    this.cdcTransactionTime = cdcTransactionTime;
  }

  public OFACAlertsInner transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * A value of O indicates OFAC only
   * @return transactionType
  **/
  @ApiModelProperty(value = "A value of O indicates OFAC only")
  
  @Size(max=1)   public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public OFACAlertsInner cdcResponseCode(String cdcResponseCode) {
    this.cdcResponseCode = cdcResponseCode;
    return this;
  }

  /**
   * Indicates CDC database search result
   * @return cdcResponseCode
  **/
  @ApiModelProperty(value = "Indicates CDC database search result")
  
  @Size(max=1)   public String getCdcResponseCode() {
    return cdcResponseCode;
  }

  public void setCdcResponseCode(String cdcResponseCode) {
    this.cdcResponseCode = cdcResponseCode;
  }

  public OFACAlertsInner cdcProblemCode(String cdcProblemCode) {
    this.cdcProblemCode = cdcProblemCode;
    return this;
  }

  /**
   * Problem code indicates on which government list the entry appeared
   * @return cdcProblemCode
  **/
  @ApiModelProperty(value = "Problem code indicates on which government list the entry appeared")
  
  @Size(max=2)   public String getCdcProblemCode() {
    return cdcProblemCode;
  }

  public void setCdcProblemCode(String cdcProblemCode) {
    this.cdcProblemCode = cdcProblemCode;
  }

  public OFACAlertsInner matchCodes(String matchCodes) {
    this.matchCodes = matchCodes;
    return this;
  }

  /**
   * Match Code identifies which of the input ID information matched the CDC database ID information for the entry being reported. The presence of each code indicates a match on the ID item 
   * @return matchCodes
  **/
  @ApiModelProperty(value = "Match Code identifies which of the input ID information matched the CDC database ID information for the entry being reported. The presence of each code indicates a match on the ID item ")
  
  @Size(max=6)   public String getMatchCodes() {
    return matchCodes;
  }

  public void setMatchCodes(String matchCodes) {
    this.matchCodes = matchCodes;
  }

  public OFACAlertsInner problemReportDate(String problemReportDate) {
    this.problemReportDate = problemReportDate;
    return this;
  }

  /**
   * Get problemReportDate
   * @return problemReportDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getProblemReportDate() {
    return problemReportDate;
  }

  public void setProblemReportDate(String problemReportDate) {
    this.problemReportDate = problemReportDate;
  }

  public OFACAlertsInner issueSource(String issueSource) {
    this.issueSource = issueSource;
    return this;
  }

  /**
   * When OFAC information is being reported, this field may contain the blocked country name relating to the match (Belarus, Iran, etc) or a code indicating the OFAC program associated with the match
   * @return issueSource
  **/
  @ApiModelProperty(value = "When OFAC information is being reported, this field may contain the blocked country name relating to the match (Belarus, Iran, etc) or a code indicating the OFAC program associated with the match")
  
  @Size(max=20)   public String getIssueSource() {
    return issueSource;
  }

  public void setIssueSource(String issueSource) {
    this.issueSource = issueSource;
  }

  public OFACAlertsInner issueIDOrReference(String issueIDOrReference) {
    this.issueIDOrReference = issueIDOrReference;
    return this;
  }

  /**
   * If available, the issue ID, which is the unique OFAC ID code or government listing reference assigned by the U.S. Treasury or other government agency to the match name, is returned
   * @return issueIDOrReference
  **/
  @ApiModelProperty(value = "If available, the issue ID, which is the unique OFAC ID code or government listing reference assigned by the U.S. Treasury or other government agency to the match name, is returned")
  
  @Size(max=20)   public String getIssueIDOrReference() {
    return issueIDOrReference;
  }

  public void setIssueIDOrReference(String issueIDOrReference) {
    this.issueIDOrReference = issueIDOrReference;
  }

  public OFACAlertsInner comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * A variable field containing either \"O\" or \"V\" related to a possible name variation.    - O: Indicates that the hit is a match to the original name used in the inquiry.    - V: Indicates that the hit is the result of Equifax using a name variation - use the OFAC Alert last name to verify.   This field may also contain miscellaneous information, when available, such as date of birth, passport number, Cedula, Columbia National ID, Place of Birth, etc. The following statement is returned in the last 51 positions of this field for an OFAC Hit\\: PLEASE READ MSG BELOW, IF QUESTIONS CALL 8002213758 
   * @return comment
  **/
  @ApiModelProperty(value = "A variable field containing either \"O\" or \"V\" related to a possible name variation.    - O: Indicates that the hit is a match to the original name used in the inquiry.    - V: Indicates that the hit is the result of Equifax using a name variation - use the OFAC Alert last name to verify.   This field may also contain miscellaneous information, when available, such as date of birth, passport number, Cedula, Columbia National ID, Place of Birth, etc. The following statement is returned in the last 51 positions of this field for an OFAC Hit\\: PLEASE READ MSG BELOW, IF QUESTIONS CALL 8002213758 ")
  
  @Size(max=100)   public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public OFACAlertsInner subjectName(Object subjectName) {
    this.subjectName = subjectName;
    return this;
  }

  /**
   * OFAC Alert subject name information
   * @return subjectName
  **/
  @ApiModelProperty(value = "OFAC Alert subject name information")
  
    public Object getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(Object subjectName) {
    this.subjectName = subjectName;
  }

  public OFACAlertsInner address(Object address) {
    this.address = address;
    return this;
  }

  /**
   * OFAC Alert subject's address information
   * @return address
  **/
  @ApiModelProperty(value = "OFAC Alert subject's address information")
  
    public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }

  public OFACAlertsInner legalVerbiage(String legalVerbiage) {
    this.legalVerbiage = legalVerbiage;
    return this;
  }

  /**
   * Legal Verbiage for an OFAC Hit/No Hit/Error
   * @return legalVerbiage
  **/
  @ApiModelProperty(value = "Legal Verbiage for an OFAC Hit/No Hit/Error")
  
  @Size(max=260)   public String getLegalVerbiage() {
    return legalVerbiage;
  }

  public void setLegalVerbiage(String legalVerbiage) {
    this.legalVerbiage = legalVerbiage;
  }

  public OFACAlertsInner dataSegmentRegulated(String dataSegmentRegulated) {
    this.dataSegmentRegulated = dataSegmentRegulated;
    return this;
  }

  /**
   * N in this field indicates non-regulated data
   * @return dataSegmentRegulated
  **/
  @ApiModelProperty(value = "N in this field indicates non-regulated data")
  
  @Size(max=1)   public String getDataSegmentRegulated() {
    return dataSegmentRegulated;
  }

  public void setDataSegmentRegulated(String dataSegmentRegulated) {
    this.dataSegmentRegulated = dataSegmentRegulated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OFACAlertsInner ofACAlertsInner = (OFACAlertsInner) o;
    return Objects.equals(this.revisedLegalVerbiageIndicator, ofACAlertsInner.revisedLegalVerbiageIndicator) &&
        Objects.equals(this.memberFirmCode, ofACAlertsInner.memberFirmCode) &&
        Objects.equals(this.cdcTransactionDate, ofACAlertsInner.cdcTransactionDate) &&
        Objects.equals(this.cdcTransactionTime, ofACAlertsInner.cdcTransactionTime) &&
        Objects.equals(this.transactionType, ofACAlertsInner.transactionType) &&
        Objects.equals(this.cdcResponseCode, ofACAlertsInner.cdcResponseCode) &&
        Objects.equals(this.cdcProblemCode, ofACAlertsInner.cdcProblemCode) &&
        Objects.equals(this.matchCodes, ofACAlertsInner.matchCodes) &&
        Objects.equals(this.problemReportDate, ofACAlertsInner.problemReportDate) &&
        Objects.equals(this.issueSource, ofACAlertsInner.issueSource) &&
        Objects.equals(this.issueIDOrReference, ofACAlertsInner.issueIDOrReference) &&
        Objects.equals(this.comment, ofACAlertsInner.comment) &&
        Objects.equals(this.subjectName, ofACAlertsInner.subjectName) &&
        Objects.equals(this.address, ofACAlertsInner.address) &&
        Objects.equals(this.legalVerbiage, ofACAlertsInner.legalVerbiage) &&
        Objects.equals(this.dataSegmentRegulated, ofACAlertsInner.dataSegmentRegulated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revisedLegalVerbiageIndicator, memberFirmCode, cdcTransactionDate, cdcTransactionTime, transactionType, cdcResponseCode, cdcProblemCode, matchCodes, problemReportDate, issueSource, issueIDOrReference, comment, subjectName, address, legalVerbiage, dataSegmentRegulated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OFACAlertsInner {\n");
    
    sb.append("    revisedLegalVerbiageIndicator: ").append(toIndentedString(revisedLegalVerbiageIndicator)).append("\n");
    sb.append("    memberFirmCode: ").append(toIndentedString(memberFirmCode)).append("\n");
    sb.append("    cdcTransactionDate: ").append(toIndentedString(cdcTransactionDate)).append("\n");
    sb.append("    cdcTransactionTime: ").append(toIndentedString(cdcTransactionTime)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    cdcResponseCode: ").append(toIndentedString(cdcResponseCode)).append("\n");
    sb.append("    cdcProblemCode: ").append(toIndentedString(cdcProblemCode)).append("\n");
    sb.append("    matchCodes: ").append(toIndentedString(matchCodes)).append("\n");
    sb.append("    problemReportDate: ").append(toIndentedString(problemReportDate)).append("\n");
    sb.append("    issueSource: ").append(toIndentedString(issueSource)).append("\n");
    sb.append("    issueIDOrReference: ").append(toIndentedString(issueIDOrReference)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    legalVerbiage: ").append(toIndentedString(legalVerbiage)).append("\n");
    sb.append("    dataSegmentRegulated: ").append(toIndentedString(dataSegmentRegulated)).append("\n");
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
