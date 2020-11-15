package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.Address;
import com.b4nkd.creditscore.equifax.model.Bankruptcy;
import com.b4nkd.creditscore.equifax.model.Collection;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlertContacts;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlternateDataSources;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAttributes1;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportConsumerReferralLocation;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportConsumerStatements;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportEmployments;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportFormerNames;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportFraudSocialNumAlertCode;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportFraudVictimIndicator;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportHitCode;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportIdentification;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportIdentityScan;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportInquiries;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportModels;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportNameMatchFlags;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportOnlineDirectory;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportOnlineGeoCode;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportOtherIdentification;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportSubjectName;
import com.b4nkd.creditscore.equifax.model.OFACAlerts;
import com.b4nkd.creditscore.equifax.model.Trade;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsumerCreditReportEquifaxUSConsumerCreditReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportEquifaxUSConsumerCreditReport   {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("customerReferenceNumber")
  private String customerReferenceNumber = null;

  @JsonProperty("customerNumber")
  private String customerNumber = null;

  @JsonProperty("consumerReferralCode")
  private String consumerReferralCode = null;

  @JsonProperty("multipleReportIndicator")
  private String multipleReportIndicator = null;

  @JsonProperty("ECOAInquiryType")
  private String ecOAInquiryType = null;

  @JsonProperty("numberOfMonthsToCountInquiries")
  private String numberOfMonthsToCountInquiries = null;

  @JsonProperty("hitCode")
  private ConsumerCreditReportHitCode hitCode = null;

  @JsonProperty("fileSinceDate")
  private String fileSinceDate = null;

  @JsonProperty("lastActivityDate")
  private String lastActivityDate = null;

  @JsonProperty("reportDate")
  private String reportDate = null;

  @JsonProperty("subjectName")
  private ConsumerCreditReportSubjectName subjectName = null;

  @JsonProperty("subjectSocialNum")
  private String subjectSocialNum = null;

  @JsonProperty("birthDate")
  private String birthDate = null;

  @JsonProperty("age")
  private String age = null;

  @JsonProperty("nameMatchFlags")
  private ConsumerCreditReportNameMatchFlags nameMatchFlags = null;

  @JsonProperty("linkIndicator")
  private String linkIndicator = null;

  @JsonProperty("doNotCombineIndicator")
  private String doNotCombineIndicator = null;

  @JsonProperty("addressDiscrepancyIndicator")
  private String addressDiscrepancyIndicator = null;

  @JsonProperty("fraudSocialNumAlertCode")
  private ConsumerCreditReportFraudSocialNumAlertCode fraudSocialNumAlertCode = null;

  /**
   * Are you impacted by the Equifax Breach? - Y: SSN likely impacted - N: SSN unlikely impacted - U: SSN impact cannot be determined 
   */
  public enum ImpactedDataIndicatorEnum {
    Y("Y"),
    
    N("N"),
    
    U("U");

    private String value;

    ImpactedDataIndicatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImpactedDataIndicatorEnum fromValue(String text) {
      for (ImpactedDataIndicatorEnum b : ImpactedDataIndicatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("impactedDataIndicator")
  private ImpactedDataIndicatorEnum impactedDataIndicator = null;

  @JsonProperty("fraudVictimIndicator")
  private ConsumerCreditReportFraudVictimIndicator fraudVictimIndicator = null;

  @JsonProperty("addresses")
  @Valid
  private List<Address> addresses = null;

  @JsonProperty("identityScan")
  private ConsumerCreditReportIdentityScan identityScan = null;

  @JsonProperty("formerNames")
  @Valid
  private List<ConsumerCreditReportFormerNames> formerNames = null;

  @JsonProperty("deathDate")
  private String deathDate = null;

  @JsonProperty("employments")
  @Valid
  private List<ConsumerCreditReportEmployments> employments = null;

  @JsonProperty("otherIdentification")
  @Valid
  private List<ConsumerCreditReportOtherIdentification> otherIdentification = null;

  @JsonProperty("bankruptcies")
  @Valid
  private List<Bankruptcy> bankruptcies = null;

  @JsonProperty("collections")
  @Valid
  private List<Collection> collections = null;

  @JsonProperty("fileIdentificationNumber")
  private String fileIdentificationNumber = null;

  @JsonProperty("alertContacts")
  @Valid
  private List<ConsumerCreditReportAlertContacts> alertContacts = null;

  @JsonProperty("trades")
  @Valid
  private List<Trade> trades = null;

  @JsonProperty("inquiries")
  @Valid
  private List<ConsumerCreditReportInquiries> inquiries = null;

  @JsonProperty("consumerStatements")
  @Valid
  private List<ConsumerCreditReportConsumerStatements> consumerStatements = null;

  @JsonProperty("models")
  @Valid
  private List<ConsumerCreditReportModels> models = null;

  @JsonProperty("onlineDirectory")
  @Valid
  private List<ConsumerCreditReportOnlineDirectory> onlineDirectory = null;

  @JsonProperty("identification")
  private ConsumerCreditReportIdentification identification = null;

  @JsonProperty("attributes")
  @Valid
  private List<ConsumerCreditReportAttributes1> attributes = null;

  @JsonProperty("onlineGeoCode")
  @Valid
  private List<ConsumerCreditReportOnlineGeoCode> onlineGeoCode = null;

  @JsonProperty("OFACAlerts")
  private OFACAlerts ofACAlerts = null;

  @JsonProperty("consumerReferralLocation")
  private ConsumerCreditReportConsumerReferralLocation consumerReferralLocation = null;

  @JsonProperty("alternateDataSources")
  private ConsumerCreditReportAlternateDataSources alternateDataSources = null;

  public ConsumerCreditReportEquifaxUSConsumerCreditReport identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "[\"Primary Report #\",\"Secondary Report #\",\"Individual Report #\"]", value = "")
  
    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport customerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
    return this;
  }

  /**
   * This field will return a value sent in the request
   * @return customerReferenceNumber
  **/
  @ApiModelProperty(value = "This field will return a value sent in the request")
  
  @Size(max=20)   public String getCustomerReferenceNumber() {
    return customerReferenceNumber;
  }

  public void setCustomerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport customerNumber(String customerNumber) {
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

  public ConsumerCreditReportEquifaxUSConsumerCreditReport consumerReferralCode(String consumerReferralCode) {
    this.consumerReferralCode = consumerReferralCode;
    return this;
  }

  /**
   * Credit Reporting Agency Number
   * @return consumerReferralCode
  **/
  @ApiModelProperty(value = "Credit Reporting Agency Number")
  
  @Size(max=3)   public String getConsumerReferralCode() {
    return consumerReferralCode;
  }

  public void setConsumerReferralCode(String consumerReferralCode) {
    this.consumerReferralCode = consumerReferralCode;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport multipleReportIndicator(String multipleReportIndicator) {
    this.multipleReportIndicator = multipleReportIndicator;
    return this;
  }

  /**
   * Indicates if the report contains more than 1 credit report file
   * @return multipleReportIndicator
  **/
  @ApiModelProperty(value = "Indicates if the report contains more than 1 credit report file")
  
  @Size(max=1)   public String getMultipleReportIndicator() {
    return multipleReportIndicator;
  }

  public void setMultipleReportIndicator(String multipleReportIndicator) {
    this.multipleReportIndicator = multipleReportIndicator;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport ecOAInquiryType(String ecOAInquiryType) {
    this.ecOAInquiryType = ecOAInquiryType;
    return this;
  }

  /**
   * Type of inquiry
   * @return ecOAInquiryType
  **/
  @ApiModelProperty(value = "Type of inquiry")
  
  @Size(max=1)   public String getEcOAInquiryType() {
    return ecOAInquiryType;
  }

  public void setEcOAInquiryType(String ecOAInquiryType) {
    this.ecOAInquiryType = ecOAInquiryType;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport numberOfMonthsToCountInquiries(String numberOfMonthsToCountInquiries) {
    this.numberOfMonthsToCountInquiries = numberOfMonthsToCountInquiries;
    return this;
  }

  /**
   * Number of months inquiried
   * @return numberOfMonthsToCountInquiries
  **/
  @ApiModelProperty(value = "Number of months inquiried")
  
  @Size(max=1)   public String getNumberOfMonthsToCountInquiries() {
    return numberOfMonthsToCountInquiries;
  }

  public void setNumberOfMonthsToCountInquiries(String numberOfMonthsToCountInquiries) {
    this.numberOfMonthsToCountInquiries = numberOfMonthsToCountInquiries;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport hitCode(ConsumerCreditReportHitCode hitCode) {
    this.hitCode = hitCode;
    return this;
  }

  /**
   * Get hitCode
   * @return hitCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportHitCode getHitCode() {
    return hitCode;
  }

  public void setHitCode(ConsumerCreditReportHitCode hitCode) {
    this.hitCode = hitCode;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport fileSinceDate(String fileSinceDate) {
    this.fileSinceDate = fileSinceDate;
    return this;
  }

  /**
   * Get fileSinceDate
   * @return fileSinceDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getFileSinceDate() {
    return fileSinceDate;
  }

  public void setFileSinceDate(String fileSinceDate) {
    this.fileSinceDate = fileSinceDate;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport lastActivityDate(String lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

  /**
   * Get lastActivityDate
   * @return lastActivityDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(String lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport reportDate(String reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * Get reportDate
   * @return reportDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getReportDate() {
    return reportDate;
  }

  public void setReportDate(String reportDate) {
    this.reportDate = reportDate;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport subjectName(ConsumerCreditReportSubjectName subjectName) {
    this.subjectName = subjectName;
    return this;
  }

  /**
   * Get subjectName
   * @return subjectName
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportSubjectName getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(ConsumerCreditReportSubjectName subjectName) {
    this.subjectName = subjectName;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport subjectSocialNum(String subjectSocialNum) {
    this.subjectSocialNum = subjectSocialNum;
    return this;
  }

  /**
   * Subject's Social Security Number (SSN)
   * @return subjectSocialNum
  **/
  @ApiModelProperty(value = "Subject's Social Security Number (SSN)")
  
  @Size(max=9)   public String getSubjectSocialNum() {
    return subjectSocialNum;
  }

  public void setSubjectSocialNum(String subjectSocialNum) {
    this.subjectSocialNum = subjectSocialNum;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport age(String age) {
    this.age = age;
    return this;
  }

  /**
   * Subject's age
   * @return age
  **/
  @ApiModelProperty(value = "Subject's age")
  
  @Size(max=2)   public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport nameMatchFlags(ConsumerCreditReportNameMatchFlags nameMatchFlags) {
    this.nameMatchFlags = nameMatchFlags;
    return this;
  }

  /**
   * Get nameMatchFlags
   * @return nameMatchFlags
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportNameMatchFlags getNameMatchFlags() {
    return nameMatchFlags;
  }

  public void setNameMatchFlags(ConsumerCreditReportNameMatchFlags nameMatchFlags) {
    this.nameMatchFlags = nameMatchFlags;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport linkIndicator(String linkIndicator) {
    this.linkIndicator = linkIndicator;
    return this;
  }

  /**
   * The result of various conditions by the database search using the data submitted in the inquiry, such as   - A file with the same name and address is not found, but the social search finds a file believed to be the subject of the search.    - Results from a marriage or divorce. The consumer's file has the maiden name and the inquiry has the married name. The same holds true in a divorce case where the consumer reverts to a maiden name    - Results of a consumer using a middle name when applying for credit instead of the first name which is the name that resides on the data base.    - Results of a consumer using an address that does not currently reside on the consumer's credit file. 
   * @return linkIndicator
  **/
  @ApiModelProperty(value = "The result of various conditions by the database search using the data submitted in the inquiry, such as   - A file with the same name and address is not found, but the social search finds a file believed to be the subject of the search.    - Results from a marriage or divorce. The consumer's file has the maiden name and the inquiry has the married name. The same holds true in a divorce case where the consumer reverts to a maiden name    - Results of a consumer using a middle name when applying for credit instead of the first name which is the name that resides on the data base.    - Results of a consumer using an address that does not currently reside on the consumer's credit file. ")
  
    public String getLinkIndicator() {
    return linkIndicator;
  }

  public void setLinkIndicator(String linkIndicator) {
    this.linkIndicator = linkIndicator;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport doNotCombineIndicator(String doNotCombineIndicator) {
    this.doNotCombineIndicator = doNotCombineIndicator;
    return this;
  }

  /**
   * This indicator may appear on the report for various reasons, such as:   - The system encountered a condition where a father/son, brother/brother, or non‐related consumer/consumer files have been mixed by applying a consumer's data to the wrong file.    - When a fraud indicator (Q, R, T or V) is placed on the file, the Do Not Combine indicator is placed on the file to avoid the file from combining with a file that may have been created as a result of fraud. 
   * @return doNotCombineIndicator
  **/
  @ApiModelProperty(value = "This indicator may appear on the report for various reasons, such as:   - The system encountered a condition where a father/son, brother/brother, or non‐related consumer/consumer files have been mixed by applying a consumer's data to the wrong file.    - When a fraud indicator (Q, R, T or V) is placed on the file, the Do Not Combine indicator is placed on the file to avoid the file from combining with a file that may have been created as a result of fraud. ")
  
  @Size(max=1)   public String getDoNotCombineIndicator() {
    return doNotCombineIndicator;
  }

  public void setDoNotCombineIndicator(String doNotCombineIndicator) {
    this.doNotCombineIndicator = doNotCombineIndicator;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addressDiscrepancyIndicator(String addressDiscrepancyIndicator) {
    this.addressDiscrepancyIndicator = addressDiscrepancyIndicator;
    return this;
  }

  /**
   * Indicates if a substantial difference was found between address(es) submitted in the inquiry and the address(es) already existing on a credit file.  The Address Discrepancy Indicator codes that can be returned in the Header element are:   - Y: a substantial difference occurred    - N: no substantial difference occurred 
   * @return addressDiscrepancyIndicator
  **/
  @ApiModelProperty(value = "Indicates if a substantial difference was found between address(es) submitted in the inquiry and the address(es) already existing on a credit file.  The Address Discrepancy Indicator codes that can be returned in the Header element are:   - Y: a substantial difference occurred    - N: no substantial difference occurred ")
  
  @Size(max=1)   public String getAddressDiscrepancyIndicator() {
    return addressDiscrepancyIndicator;
  }

  public void setAddressDiscrepancyIndicator(String addressDiscrepancyIndicator) {
    this.addressDiscrepancyIndicator = addressDiscrepancyIndicator;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport fraudSocialNumAlertCode(ConsumerCreditReportFraudSocialNumAlertCode fraudSocialNumAlertCode) {
    this.fraudSocialNumAlertCode = fraudSocialNumAlertCode;
    return this;
  }

  /**
   * Get fraudSocialNumAlertCode
   * @return fraudSocialNumAlertCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportFraudSocialNumAlertCode getFraudSocialNumAlertCode() {
    return fraudSocialNumAlertCode;
  }

  public void setFraudSocialNumAlertCode(ConsumerCreditReportFraudSocialNumAlertCode fraudSocialNumAlertCode) {
    this.fraudSocialNumAlertCode = fraudSocialNumAlertCode;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport impactedDataIndicator(ImpactedDataIndicatorEnum impactedDataIndicator) {
    this.impactedDataIndicator = impactedDataIndicator;
    return this;
  }

  /**
   * Are you impacted by the Equifax Breach? - Y: SSN likely impacted - N: SSN unlikely impacted - U: SSN impact cannot be determined 
   * @return impactedDataIndicator
  **/
  @ApiModelProperty(value = "Are you impacted by the Equifax Breach? - Y: SSN likely impacted - N: SSN unlikely impacted - U: SSN impact cannot be determined ")
  
  @Size(max=1)   public ImpactedDataIndicatorEnum getImpactedDataIndicator() {
    return impactedDataIndicator;
  }

  public void setImpactedDataIndicator(ImpactedDataIndicatorEnum impactedDataIndicator) {
    this.impactedDataIndicator = impactedDataIndicator;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport fraudVictimIndicator(ConsumerCreditReportFraudVictimIndicator fraudVictimIndicator) {
    this.fraudVictimIndicator = fraudVictimIndicator;
    return this;
  }

  /**
   * Get fraudVictimIndicator
   * @return fraudVictimIndicator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportFraudVictimIndicator getFraudVictimIndicator() {
    return fraudVictimIndicator;
  }

  public void setFraudVictimIndicator(ConsumerCreditReportFraudVictimIndicator fraudVictimIndicator) {
    this.fraudVictimIndicator = fraudVictimIndicator;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Address>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * It contains Equifax report data pertaining to the subject's addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "It contains Equifax report data pertaining to the subject's addresses")
      @Valid
  @Size(min=1,max=10)   public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport identityScan(ConsumerCreditReportIdentityScan identityScan) {
    this.identityScan = identityScan;
    return this;
  }

  /**
   * Get identityScan
   * @return identityScan
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportIdentityScan getIdentityScan() {
    return identityScan;
  }

  public void setIdentityScan(ConsumerCreditReportIdentityScan identityScan) {
    this.identityScan = identityScan;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport formerNames(List<ConsumerCreditReportFormerNames> formerNames) {
    this.formerNames = formerNames;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addFormerNamesItem(ConsumerCreditReportFormerNames formerNamesItem) {
    if (this.formerNames == null) {
      this.formerNames = new ArrayList<ConsumerCreditReportFormerNames>();
    }
    this.formerNames.add(formerNamesItem);
    return this;
  }

  /**
   * It contains any former name of the subject
   * @return formerNames
  **/
  @ApiModelProperty(value = "It contains any former name of the subject")
      @Valid
  @Size(max=99)   public List<ConsumerCreditReportFormerNames> getFormerNames() {
    return formerNames;
  }

  public void setFormerNames(List<ConsumerCreditReportFormerNames> formerNames) {
    this.formerNames = formerNames;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport deathDate(String deathDate) {
    this.deathDate = deathDate;
    return this;
  }

  /**
   * Get deathDate
   * @return deathDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getDeathDate() {
    return deathDate;
  }

  public void setDeathDate(String deathDate) {
    this.deathDate = deathDate;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport employments(List<ConsumerCreditReportEmployments> employments) {
    this.employments = employments;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addEmploymentsItem(ConsumerCreditReportEmployments employmentsItem) {
    if (this.employments == null) {
      this.employments = new ArrayList<ConsumerCreditReportEmployments>();
    }
    this.employments.add(employmentsItem);
    return this;
  }

  /**
   * It contains information to the subject's employments
   * @return employments
  **/
  @ApiModelProperty(value = "It contains information to the subject's employments")
      @Valid
  @Size(max=3)   public List<ConsumerCreditReportEmployments> getEmployments() {
    return employments;
  }

  public void setEmployments(List<ConsumerCreditReportEmployments> employments) {
    this.employments = employments;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport otherIdentification(List<ConsumerCreditReportOtherIdentification> otherIdentification) {
    this.otherIdentification = otherIdentification;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addOtherIdentificationItem(ConsumerCreditReportOtherIdentification otherIdentificationItem) {
    if (this.otherIdentification == null) {
      this.otherIdentification = new ArrayList<ConsumerCreditReportOtherIdentification>();
    }
    this.otherIdentification.add(otherIdentificationItem);
    return this;
  }

  /**
   * It contains information related to other identification
   * @return otherIdentification
  **/
  @ApiModelProperty(value = "It contains information related to other identification")
      @Valid
  @Size(max=99)   public List<ConsumerCreditReportOtherIdentification> getOtherIdentification() {
    return otherIdentification;
  }

  public void setOtherIdentification(List<ConsumerCreditReportOtherIdentification> otherIdentification) {
    this.otherIdentification = otherIdentification;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport bankruptcies(List<Bankruptcy> bankruptcies) {
    this.bankruptcies = bankruptcies;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addBankruptciesItem(Bankruptcy bankruptciesItem) {
    if (this.bankruptcies == null) {
      this.bankruptcies = new ArrayList<Bankruptcy>();
    }
    this.bankruptcies.add(bankruptciesItem);
    return this;
  }

  /**
   * Public record information as it pertains to bankruptcy
   * @return bankruptcies
  **/
  @ApiModelProperty(value = "Public record information as it pertains to bankruptcy")
      @Valid
  @Size(max=99)   public List<Bankruptcy> getBankruptcies() {
    return bankruptcies;
  }

  public void setBankruptcies(List<Bankruptcy> bankruptcies) {
    this.bankruptcies = bankruptcies;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport collections(List<Collection> collections) {
    this.collections = collections;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addCollectionsItem(Collection collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<Collection>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

  /**
   * Get collections
   * @return collections
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=99)   public List<Collection> getCollections() {
    return collections;
  }

  public void setCollections(List<Collection> collections) {
    this.collections = collections;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport fileIdentificationNumber(String fileIdentificationNumber) {
    this.fileIdentificationNumber = fileIdentificationNumber;
    return this;
  }

  /**
   * Provides the consumer's unique file identification number.  The return of the File Identification Number is an optional feature offered by Equifax.  Contact your Equifax Sales Associate for additional information and activation. 
   * @return fileIdentificationNumber
  **/
  @ApiModelProperty(value = "Provides the consumer's unique file identification number.  The return of the File Identification Number is an optional feature offered by Equifax.  Contact your Equifax Sales Associate for additional information and activation. ")
  
  @Size(max=18)   public String getFileIdentificationNumber() {
    return fileIdentificationNumber;
  }

  public void setFileIdentificationNumber(String fileIdentificationNumber) {
    this.fileIdentificationNumber = fileIdentificationNumber;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport alertContacts(List<ConsumerCreditReportAlertContacts> alertContacts) {
    this.alertContacts = alertContacts;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addAlertContactsItem(ConsumerCreditReportAlertContacts alertContactsItem) {
    if (this.alertContacts == null) {
      this.alertContacts = new ArrayList<ConsumerCreditReportAlertContacts>();
    }
    this.alertContacts.add(alertContactsItem);
    return this;
  }

  /**
   * Contains contact information for the consumer when a Fraud or Active Duty Alert is on the report. If the credit file contains a Consumer Statement, the Alert Contact information will follow the Consumer Statement on file. A Consumer Statement may be returned regardless of a Fraud or Active Duty Alert being on file (such as when a consumer is explaining his/her circumstances for filing bankruptcy). The Consumer Statement will continue to be returned on those consumer reports. 
   * @return alertContacts
  **/
  @ApiModelProperty(value = "Contains contact information for the consumer when a Fraud or Active Duty Alert is on the report. If the credit file contains a Consumer Statement, the Alert Contact information will follow the Consumer Statement on file. A Consumer Statement may be returned regardless of a Fraud or Active Duty Alert being on file (such as when a consumer is explaining his/her circumstances for filing bankruptcy). The Consumer Statement will continue to be returned on those consumer reports. ")
      @Valid
  @Size(max=2)   public List<ConsumerCreditReportAlertContacts> getAlertContacts() {
    return alertContacts;
  }

  public void setAlertContacts(List<ConsumerCreditReportAlertContacts> alertContacts) {
    this.alertContacts = alertContacts;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport trades(List<Trade> trades) {
    this.trades = trades;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addTradesItem(Trade tradesItem) {
    if (this.trades == null) {
      this.trades = new ArrayList<Trade>();
    }
    this.trades.add(tradesItem);
    return this;
  }

  /**
   * Get trades
   * @return trades
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=198)   public List<Trade> getTrades() {
    return trades;
  }

  public void setTrades(List<Trade> trades) {
    this.trades = trades;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport inquiries(List<ConsumerCreditReportInquiries> inquiries) {
    this.inquiries = inquiries;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addInquiriesItem(ConsumerCreditReportInquiries inquiriesItem) {
    if (this.inquiries == null) {
      this.inquiries = new ArrayList<ConsumerCreditReportInquiries>();
    }
    this.inquiries.add(inquiriesItem);
    return this;
  }

  /**
   * Get inquiries
   * @return inquiries
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=198)   public List<ConsumerCreditReportInquiries> getInquiries() {
    return inquiries;
  }

  public void setInquiries(List<ConsumerCreditReportInquiries> inquiries) {
    this.inquiries = inquiries;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport consumerStatements(List<ConsumerCreditReportConsumerStatements> consumerStatements) {
    this.consumerStatements = consumerStatements;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addConsumerStatementsItem(ConsumerCreditReportConsumerStatements consumerStatementsItem) {
    if (this.consumerStatements == null) {
      this.consumerStatements = new ArrayList<ConsumerCreditReportConsumerStatements>();
    }
    this.consumerStatements.add(consumerStatementsItem);
    return this;
  }

  /**
   * Show consumer comments about the report information. A maximum of 99 Consumer Statements can be returned
   * @return consumerStatements
  **/
  @ApiModelProperty(value = "Show consumer comments about the report information. A maximum of 99 Consumer Statements can be returned")
      @Valid
  @Size(max=99)   public List<ConsumerCreditReportConsumerStatements> getConsumerStatements() {
    return consumerStatements;
  }

  public void setConsumerStatements(List<ConsumerCreditReportConsumerStatements> consumerStatements) {
    this.consumerStatements = consumerStatements;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport models(List<ConsumerCreditReportModels> models) {
    this.models = models;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addModelsItem(ConsumerCreditReportModels modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<ConsumerCreditReportModels>();
    }
    this.models.add(modelsItem);
    return this;
  }

  /**
   * Specific Scoring Model being requested by the customer (optional) Risk-Based Pricing score information, Dodd Frank, MarketMax, Models and ID Score - Risk are optional services.  Please contact your Equifax Sales Associate for additional information and activation of optional services. 
   * @return models
  **/
  @ApiModelProperty(value = "Specific Scoring Model being requested by the customer (optional) Risk-Based Pricing score information, Dodd Frank, MarketMax, Models and ID Score - Risk are optional services.  Please contact your Equifax Sales Associate for additional information and activation of optional services. ")
      @Valid
  @Size(max=101)   public List<ConsumerCreditReportModels> getModels() {
    return models;
  }

  public void setModels(List<ConsumerCreditReportModels> models) {
    this.models = models;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport onlineDirectory(List<ConsumerCreditReportOnlineDirectory> onlineDirectory) {
    this.onlineDirectory = onlineDirectory;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addOnlineDirectoryItem(ConsumerCreditReportOnlineDirectory onlineDirectoryItem) {
    if (this.onlineDirectory == null) {
      this.onlineDirectory = new ArrayList<ConsumerCreditReportOnlineDirectory>();
    }
    this.onlineDirectory.add(onlineDirectoryItem);
    return this;
  }

  /**
   * It is a convenient, value added feature that automatically delivers telephone numbers and upon request, addresses, of all collection, inquiries and trade segment companies shown on the report.  ON-LINE DIRECTORY is an optional product offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of your desired ON-LINE DIRECTORY option. 
   * @return onlineDirectory
  **/
  @ApiModelProperty(value = "It is a convenient, value added feature that automatically delivers telephone numbers and upon request, addresses, of all collection, inquiries and trade segment companies shown on the report.  ON-LINE DIRECTORY is an optional product offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of your desired ON-LINE DIRECTORY option. ")
      @Valid
  @Size(max=99)   public List<ConsumerCreditReportOnlineDirectory> getOnlineDirectory() {
    return onlineDirectory;
  }

  public void setOnlineDirectory(List<ConsumerCreditReportOnlineDirectory> onlineDirectory) {
    this.onlineDirectory = onlineDirectory;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport identification(ConsumerCreditReportIdentification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(ConsumerCreditReportIdentification identification) {
    this.identification = identification;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport attributes(List<ConsumerCreditReportAttributes1> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addAttributesItem(ConsumerCreditReportAttributes1 attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ConsumerCreditReportAttributes1>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Contains attributes associated with customer specific models. A maximum of 99 Data Attribute can be returned.  Please contact your Equifax Sales Associate for additional information. 
   * @return attributes
  **/
  @ApiModelProperty(value = "Contains attributes associated with customer specific models. A maximum of 99 Data Attribute can be returned.  Please contact your Equifax Sales Associate for additional information. ")
      @Valid
  @Size(max=99)   public List<ConsumerCreditReportAttributes1> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ConsumerCreditReportAttributes1> attributes) {
    this.attributes = attributes;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport onlineGeoCode(List<ConsumerCreditReportOnlineGeoCode> onlineGeoCode) {
    this.onlineGeoCode = onlineGeoCode;
    return this;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport addOnlineGeoCodeItem(ConsumerCreditReportOnlineGeoCode onlineGeoCodeItem) {
    if (this.onlineGeoCode == null) {
      this.onlineGeoCode = new ArrayList<ConsumerCreditReportOnlineGeoCode>();
    }
    this.onlineGeoCode.add(onlineGeoCodeItem);
    return this;
  }

  /**
   * Delivers the folowing codes:   - Geo S M S A Code      - Geo State Code      - Geo County Code      - Geo Census Tract      - Geo Block Group   These codes will be returned for the current address.  Equifax will also return the Property Address Geo Code when it is included in the inquiry.  On Line GEO Code and Micro Vision are optional services offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation. 
   * @return onlineGeoCode
  **/
  @ApiModelProperty(value = "Delivers the folowing codes:   - Geo S M S A Code      - Geo State Code      - Geo County Code      - Geo Census Tract      - Geo Block Group   These codes will be returned for the current address.  Equifax will also return the Property Address Geo Code when it is included in the inquiry.  On Line GEO Code and Micro Vision are optional services offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation. ")
      @Valid
  @Size(max=2)   public List<ConsumerCreditReportOnlineGeoCode> getOnlineGeoCode() {
    return onlineGeoCode;
  }

  public void setOnlineGeoCode(List<ConsumerCreditReportOnlineGeoCode> onlineGeoCode) {
    this.onlineGeoCode = onlineGeoCode;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport ofACAlerts(OFACAlerts ofACAlerts) {
    this.ofACAlerts = ofACAlerts;
    return this;
  }

  /**
   * Get ofACAlerts
   * @return ofACAlerts
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OFACAlerts getOfACAlerts() {
    return ofACAlerts;
  }

  public void setOfACAlerts(OFACAlerts ofACAlerts) {
    this.ofACAlerts = ofACAlerts;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport consumerReferralLocation(ConsumerCreditReportConsumerReferralLocation consumerReferralLocation) {
    this.consumerReferralLocation = consumerReferralLocation;
    return this;
  }

  /**
   * Get consumerReferralLocation
   * @return consumerReferralLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportConsumerReferralLocation getConsumerReferralLocation() {
    return consumerReferralLocation;
  }

  public void setConsumerReferralLocation(ConsumerCreditReportConsumerReferralLocation consumerReferralLocation) {
    this.consumerReferralLocation = consumerReferralLocation;
  }

  public ConsumerCreditReportEquifaxUSConsumerCreditReport alternateDataSources(ConsumerCreditReportAlternateDataSources alternateDataSources) {
    this.alternateDataSources = alternateDataSources;
    return this;
  }

  /**
   * Get alternateDataSources
   * @return alternateDataSources
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportAlternateDataSources getAlternateDataSources() {
    return alternateDataSources;
  }

  public void setAlternateDataSources(ConsumerCreditReportAlternateDataSources alternateDataSources) {
    this.alternateDataSources = alternateDataSources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportEquifaxUSConsumerCreditReport consumerCreditReportEquifaxUSConsumerCreditReport = (ConsumerCreditReportEquifaxUSConsumerCreditReport) o;
    return Objects.equals(this.identifier, consumerCreditReportEquifaxUSConsumerCreditReport.identifier) &&
        Objects.equals(this.customerReferenceNumber, consumerCreditReportEquifaxUSConsumerCreditReport.customerReferenceNumber) &&
        Objects.equals(this.customerNumber, consumerCreditReportEquifaxUSConsumerCreditReport.customerNumber) &&
        Objects.equals(this.consumerReferralCode, consumerCreditReportEquifaxUSConsumerCreditReport.consumerReferralCode) &&
        Objects.equals(this.multipleReportIndicator, consumerCreditReportEquifaxUSConsumerCreditReport.multipleReportIndicator) &&
        Objects.equals(this.ecOAInquiryType, consumerCreditReportEquifaxUSConsumerCreditReport.ecOAInquiryType) &&
        Objects.equals(this.numberOfMonthsToCountInquiries, consumerCreditReportEquifaxUSConsumerCreditReport.numberOfMonthsToCountInquiries) &&
        Objects.equals(this.hitCode, consumerCreditReportEquifaxUSConsumerCreditReport.hitCode) &&
        Objects.equals(this.fileSinceDate, consumerCreditReportEquifaxUSConsumerCreditReport.fileSinceDate) &&
        Objects.equals(this.lastActivityDate, consumerCreditReportEquifaxUSConsumerCreditReport.lastActivityDate) &&
        Objects.equals(this.reportDate, consumerCreditReportEquifaxUSConsumerCreditReport.reportDate) &&
        Objects.equals(this.subjectName, consumerCreditReportEquifaxUSConsumerCreditReport.subjectName) &&
        Objects.equals(this.subjectSocialNum, consumerCreditReportEquifaxUSConsumerCreditReport.subjectSocialNum) &&
        Objects.equals(this.birthDate, consumerCreditReportEquifaxUSConsumerCreditReport.birthDate) &&
        Objects.equals(this.age, consumerCreditReportEquifaxUSConsumerCreditReport.age) &&
        Objects.equals(this.nameMatchFlags, consumerCreditReportEquifaxUSConsumerCreditReport.nameMatchFlags) &&
        Objects.equals(this.linkIndicator, consumerCreditReportEquifaxUSConsumerCreditReport.linkIndicator) &&
        Objects.equals(this.doNotCombineIndicator, consumerCreditReportEquifaxUSConsumerCreditReport.doNotCombineIndicator) &&
        Objects.equals(this.addressDiscrepancyIndicator, consumerCreditReportEquifaxUSConsumerCreditReport.addressDiscrepancyIndicator) &&
        Objects.equals(this.fraudSocialNumAlertCode, consumerCreditReportEquifaxUSConsumerCreditReport.fraudSocialNumAlertCode) &&
        Objects.equals(this.impactedDataIndicator, consumerCreditReportEquifaxUSConsumerCreditReport.impactedDataIndicator) &&
        Objects.equals(this.fraudVictimIndicator, consumerCreditReportEquifaxUSConsumerCreditReport.fraudVictimIndicator) &&
        Objects.equals(this.addresses, consumerCreditReportEquifaxUSConsumerCreditReport.addresses) &&
        Objects.equals(this.identityScan, consumerCreditReportEquifaxUSConsumerCreditReport.identityScan) &&
        Objects.equals(this.formerNames, consumerCreditReportEquifaxUSConsumerCreditReport.formerNames) &&
        Objects.equals(this.deathDate, consumerCreditReportEquifaxUSConsumerCreditReport.deathDate) &&
        Objects.equals(this.employments, consumerCreditReportEquifaxUSConsumerCreditReport.employments) &&
        Objects.equals(this.otherIdentification, consumerCreditReportEquifaxUSConsumerCreditReport.otherIdentification) &&
        Objects.equals(this.bankruptcies, consumerCreditReportEquifaxUSConsumerCreditReport.bankruptcies) &&
        Objects.equals(this.collections, consumerCreditReportEquifaxUSConsumerCreditReport.collections) &&
        Objects.equals(this.fileIdentificationNumber, consumerCreditReportEquifaxUSConsumerCreditReport.fileIdentificationNumber) &&
        Objects.equals(this.alertContacts, consumerCreditReportEquifaxUSConsumerCreditReport.alertContacts) &&
        Objects.equals(this.trades, consumerCreditReportEquifaxUSConsumerCreditReport.trades) &&
        Objects.equals(this.inquiries, consumerCreditReportEquifaxUSConsumerCreditReport.inquiries) &&
        Objects.equals(this.consumerStatements, consumerCreditReportEquifaxUSConsumerCreditReport.consumerStatements) &&
        Objects.equals(this.models, consumerCreditReportEquifaxUSConsumerCreditReport.models) &&
        Objects.equals(this.onlineDirectory, consumerCreditReportEquifaxUSConsumerCreditReport.onlineDirectory) &&
        Objects.equals(this.identification, consumerCreditReportEquifaxUSConsumerCreditReport.identification) &&
        Objects.equals(this.attributes, consumerCreditReportEquifaxUSConsumerCreditReport.attributes) &&
        Objects.equals(this.onlineGeoCode, consumerCreditReportEquifaxUSConsumerCreditReport.onlineGeoCode) &&
        Objects.equals(this.ofACAlerts, consumerCreditReportEquifaxUSConsumerCreditReport.ofACAlerts) &&
        Objects.equals(this.consumerReferralLocation, consumerCreditReportEquifaxUSConsumerCreditReport.consumerReferralLocation) &&
        Objects.equals(this.alternateDataSources, consumerCreditReportEquifaxUSConsumerCreditReport.alternateDataSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, customerReferenceNumber, customerNumber, consumerReferralCode, multipleReportIndicator, ecOAInquiryType, numberOfMonthsToCountInquiries, hitCode, fileSinceDate, lastActivityDate, reportDate, subjectName, subjectSocialNum, birthDate, age, nameMatchFlags, linkIndicator, doNotCombineIndicator, addressDiscrepancyIndicator, fraudSocialNumAlertCode, impactedDataIndicator, fraudVictimIndicator, addresses, identityScan, formerNames, deathDate, employments, otherIdentification, bankruptcies, collections, fileIdentificationNumber, alertContacts, trades, inquiries, consumerStatements, models, onlineDirectory, identification, attributes, onlineGeoCode, ofACAlerts, consumerReferralLocation, alternateDataSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportEquifaxUSConsumerCreditReport {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    customerReferenceNumber: ").append(toIndentedString(customerReferenceNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    consumerReferralCode: ").append(toIndentedString(consumerReferralCode)).append("\n");
    sb.append("    multipleReportIndicator: ").append(toIndentedString(multipleReportIndicator)).append("\n");
    sb.append("    ecOAInquiryType: ").append(toIndentedString(ecOAInquiryType)).append("\n");
    sb.append("    numberOfMonthsToCountInquiries: ").append(toIndentedString(numberOfMonthsToCountInquiries)).append("\n");
    sb.append("    hitCode: ").append(toIndentedString(hitCode)).append("\n");
    sb.append("    fileSinceDate: ").append(toIndentedString(fileSinceDate)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    subjectSocialNum: ").append(toIndentedString(subjectSocialNum)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    nameMatchFlags: ").append(toIndentedString(nameMatchFlags)).append("\n");
    sb.append("    linkIndicator: ").append(toIndentedString(linkIndicator)).append("\n");
    sb.append("    doNotCombineIndicator: ").append(toIndentedString(doNotCombineIndicator)).append("\n");
    sb.append("    addressDiscrepancyIndicator: ").append(toIndentedString(addressDiscrepancyIndicator)).append("\n");
    sb.append("    fraudSocialNumAlertCode: ").append(toIndentedString(fraudSocialNumAlertCode)).append("\n");
    sb.append("    impactedDataIndicator: ").append(toIndentedString(impactedDataIndicator)).append("\n");
    sb.append("    fraudVictimIndicator: ").append(toIndentedString(fraudVictimIndicator)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    identityScan: ").append(toIndentedString(identityScan)).append("\n");
    sb.append("    formerNames: ").append(toIndentedString(formerNames)).append("\n");
    sb.append("    deathDate: ").append(toIndentedString(deathDate)).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
    sb.append("    otherIdentification: ").append(toIndentedString(otherIdentification)).append("\n");
    sb.append("    bankruptcies: ").append(toIndentedString(bankruptcies)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    fileIdentificationNumber: ").append(toIndentedString(fileIdentificationNumber)).append("\n");
    sb.append("    alertContacts: ").append(toIndentedString(alertContacts)).append("\n");
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
    sb.append("    inquiries: ").append(toIndentedString(inquiries)).append("\n");
    sb.append("    consumerStatements: ").append(toIndentedString(consumerStatements)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    onlineDirectory: ").append(toIndentedString(onlineDirectory)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    onlineGeoCode: ").append(toIndentedString(onlineGeoCode)).append("\n");
    sb.append("    ofACAlerts: ").append(toIndentedString(ofACAlerts)).append("\n");
    sb.append("    consumerReferralLocation: ").append(toIndentedString(consumerReferralLocation)).append("\n");
    sb.append("    alternateDataSources: ").append(toIndentedString(alternateDataSources)).append("\n");
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
