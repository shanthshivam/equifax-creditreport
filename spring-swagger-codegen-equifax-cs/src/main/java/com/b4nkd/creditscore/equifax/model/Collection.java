package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.AccountDesignatorCode;
import com.b4nkd.creditscore.equifax.model.CollectionStatusCode;
import com.b4nkd.creditscore.equifax.model.CreditorClassificationCode;
import com.b4nkd.creditscore.equifax.model.NarrativeCodes;
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
 * Provides information about any collection item
 */
@ApiModel(description = "Provides information about any collection item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class Collection   {
  @JsonProperty("industryCode")
  private String industryCode = null;

  @JsonProperty("customerNumber")
  private String customerNumber = null;

  @JsonProperty("clientNameOrNumber")
  private String clientNameOrNumber = null;

  @JsonProperty("statusCode")
  private CollectionStatusCode statusCode = null;

  @JsonProperty("narrativeCodes")
  private NarrativeCodes narrativeCodes = null;

  @JsonProperty("rawNarrativeCodes")
  @Valid
  private List<String> rawNarrativeCodes = null;

  @JsonProperty("indicator")
  private String indicator = null;

  @JsonProperty("dateReported")
  private String dateReported = null;

  @JsonProperty("dateAssigned")
  private String dateAssigned = null;

  @JsonProperty("originalAmount")
  private String originalAmount = null;

  @JsonProperty("statusDate")
  private String statusDate = null;

  @JsonProperty("balance")
  private String balance = null;

  @JsonProperty("lastPaymentDate")
  private String lastPaymentDate = null;

  @JsonProperty("dateOfFirstDelinquency")
  private String dateOfFirstDelinquency = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("accountDesignatorCode")
  private AccountDesignatorCode accountDesignatorCode = null;

  @JsonProperty("creditorClassificationCode")
  private CreditorClassificationCode creditorClassificationCode = null;

  public Collection industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

  /**
   * Industry code
   * @return industryCode
  **/
  @ApiModelProperty(value = "Industry code")
  
    public String getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  public Collection customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Collection agency customer number
   * @return customerNumber
  **/
  @ApiModelProperty(value = "Collection agency customer number")
  
  @Size(max=10)   public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public Collection clientNameOrNumber(String clientNameOrNumber) {
    this.clientNameOrNumber = clientNameOrNumber;
    return this;
  }

  /**
   * Original creditor name/number
   * @return clientNameOrNumber
  **/
  @ApiModelProperty(value = "Original creditor name/number")
  
  @Size(max=30)   public String getClientNameOrNumber() {
    return clientNameOrNumber;
  }

  public void setClientNameOrNumber(String clientNameOrNumber) {
    this.clientNameOrNumber = clientNameOrNumber;
  }

  public Collection statusCode(CollectionStatusCode statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CollectionStatusCode getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(CollectionStatusCode statusCode) {
    this.statusCode = statusCode;
  }

  public Collection narrativeCodes(NarrativeCodes narrativeCodes) {
    this.narrativeCodes = narrativeCodes;
    return this;
  }

  /**
   * Get narrativeCodes
   * @return narrativeCodes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NarrativeCodes getNarrativeCodes() {
    return narrativeCodes;
  }

  public void setNarrativeCodes(NarrativeCodes narrativeCodes) {
    this.narrativeCodes = narrativeCodes;
  }

  public Collection rawNarrativeCodes(List<String> rawNarrativeCodes) {
    this.rawNarrativeCodes = rawNarrativeCodes;
    return this;
  }

  public Collection addRawNarrativeCodesItem(String rawNarrativeCodesItem) {
    if (this.rawNarrativeCodes == null) {
      this.rawNarrativeCodes = new ArrayList<String>();
    }
    this.rawNarrativeCodes.add(rawNarrativeCodesItem);
    return this;
  }

  /**
   * Raw narrative codes included in the report
   * @return rawNarrativeCodes
  **/
  @ApiModelProperty(value = "Raw narrative codes included in the report")
  
  @Size(max=2)   public List<String> getRawNarrativeCodes() {
    return rawNarrativeCodes;
  }

  public void setRawNarrativeCodes(List<String> rawNarrativeCodes) {
    this.rawNarrativeCodes = rawNarrativeCodes;
  }

  public Collection indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Automated Update Indicator
   * @return indicator
  **/
  @ApiModelProperty(value = "Automated Update Indicator")
  
  @Size(max=1)   public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public Collection dateReported(String dateReported) {
    this.dateReported = dateReported;
    return this;
  }

  /**
   * Get dateReported
   * @return dateReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateReported() {
    return dateReported;
  }

  public void setDateReported(String dateReported) {
    this.dateReported = dateReported;
  }

  public Collection dateAssigned(String dateAssigned) {
    this.dateAssigned = dateAssigned;
    return this;
  }

  /**
   * Get dateAssigned
   * @return dateAssigned
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateAssigned() {
    return dateAssigned;
  }

  public void setDateAssigned(String dateAssigned) {
    this.dateAssigned = dateAssigned;
  }

  public Collection originalAmount(String originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

  /**
   * Original amount in USD
   * @return originalAmount
  **/
  @ApiModelProperty(value = "Original amount in USD")
  
    public String getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(String originalAmount) {
    this.originalAmount = originalAmount;
  }

  public Collection statusDate(String statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * Get statusDate
   * @return statusDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(String statusDate) {
    this.statusDate = statusDate;
  }

  public Collection balance(String balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Balance in USD
   * @return balance
  **/
  @ApiModelProperty(value = "Balance in USD")
  
    public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public Collection lastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

  /**
   * Get lastPaymentDate
   * @return lastPaymentDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getLastPaymentDate() {
    return lastPaymentDate;
  }

  public void setLastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }

  public Collection dateOfFirstDelinquency(String dateOfFirstDelinquency) {
    this.dateOfFirstDelinquency = dateOfFirstDelinquency;
    return this;
  }

  /**
   * Get dateOfFirstDelinquency
   * @return dateOfFirstDelinquency
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateOfFirstDelinquency() {
    return dateOfFirstDelinquency;
  }

  public void setDateOfFirstDelinquency(String dateOfFirstDelinquency) {
    this.dateOfFirstDelinquency = dateOfFirstDelinquency;
  }

  public Collection accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Account number")
  
  @Size(max=30)   public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Collection accountDesignatorCode(AccountDesignatorCode accountDesignatorCode) {
    this.accountDesignatorCode = accountDesignatorCode;
    return this;
  }

  /**
   * Get accountDesignatorCode
   * @return accountDesignatorCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDesignatorCode getAccountDesignatorCode() {
    return accountDesignatorCode;
  }

  public void setAccountDesignatorCode(AccountDesignatorCode accountDesignatorCode) {
    this.accountDesignatorCode = accountDesignatorCode;
  }

  public Collection creditorClassificationCode(CreditorClassificationCode creditorClassificationCode) {
    this.creditorClassificationCode = creditorClassificationCode;
    return this;
  }

  /**
   * Get creditorClassificationCode
   * @return creditorClassificationCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CreditorClassificationCode getCreditorClassificationCode() {
    return creditorClassificationCode;
  }

  public void setCreditorClassificationCode(CreditorClassificationCode creditorClassificationCode) {
    this.creditorClassificationCode = creditorClassificationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collection collection = (Collection) o;
    return Objects.equals(this.industryCode, collection.industryCode) &&
        Objects.equals(this.customerNumber, collection.customerNumber) &&
        Objects.equals(this.clientNameOrNumber, collection.clientNameOrNumber) &&
        Objects.equals(this.statusCode, collection.statusCode) &&
        Objects.equals(this.narrativeCodes, collection.narrativeCodes) &&
        Objects.equals(this.rawNarrativeCodes, collection.rawNarrativeCodes) &&
        Objects.equals(this.indicator, collection.indicator) &&
        Objects.equals(this.dateReported, collection.dateReported) &&
        Objects.equals(this.dateAssigned, collection.dateAssigned) &&
        Objects.equals(this.originalAmount, collection.originalAmount) &&
        Objects.equals(this.statusDate, collection.statusDate) &&
        Objects.equals(this.balance, collection.balance) &&
        Objects.equals(this.lastPaymentDate, collection.lastPaymentDate) &&
        Objects.equals(this.dateOfFirstDelinquency, collection.dateOfFirstDelinquency) &&
        Objects.equals(this.accountNumber, collection.accountNumber) &&
        Objects.equals(this.accountDesignatorCode, collection.accountDesignatorCode) &&
        Objects.equals(this.creditorClassificationCode, collection.creditorClassificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(industryCode, customerNumber, clientNameOrNumber, statusCode, narrativeCodes, rawNarrativeCodes, indicator, dateReported, dateAssigned, originalAmount, statusDate, balance, lastPaymentDate, dateOfFirstDelinquency, accountNumber, accountDesignatorCode, creditorClassificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collection {\n");
    
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    clientNameOrNumber: ").append(toIndentedString(clientNameOrNumber)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    narrativeCodes: ").append(toIndentedString(narrativeCodes)).append("\n");
    sb.append("    rawNarrativeCodes: ").append(toIndentedString(rawNarrativeCodes)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    dateAssigned: ").append(toIndentedString(dateAssigned)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    dateOfFirstDelinquency: ").append(toIndentedString(dateOfFirstDelinquency)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountDesignatorCode: ").append(toIndentedString(accountDesignatorCode)).append("\n");
    sb.append("    creditorClassificationCode: ").append(toIndentedString(creditorClassificationCode)).append("\n");
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
