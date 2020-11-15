package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.AccountDesignatorCode;
import com.b4nkd.creditscore.equifax.model.AccountTypeCode;
import com.b4nkd.creditscore.equifax.model.CreditorClassificationCode;
import com.b4nkd.creditscore.equifax.model.NarrativeCodes;
import com.b4nkd.creditscore.equifax.model.Trade24MonthPaymentHistory;
import com.b4nkd.creditscore.equifax.model.TradeActivityDesignatorCode;
import com.b4nkd.creditscore.equifax.model.TradeDimension;
import com.b4nkd.creditscore.equifax.model.TradePaymentHistory1to24;
import com.b4nkd.creditscore.equifax.model.TradePaymentHistory25to36;
import com.b4nkd.creditscore.equifax.model.TradePaymentHistory37to48;
import com.b4nkd.creditscore.equifax.model.TradePortfolioTypeCode;
import com.b4nkd.creditscore.equifax.model.TradePurchasedFromOrSoldCreditorIndicator;
import com.b4nkd.creditscore.equifax.model.TradeRate;
import com.b4nkd.creditscore.equifax.model.TradeRateStatusCode;
import com.b4nkd.creditscore.equifax.model.TradeTermsDurationCode;
import com.b4nkd.creditscore.equifax.model.TradeTermsFrequencyCode;
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
 * Trade
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class Trade   {
  @JsonProperty("automatedUpdateIndicator")
  private String automatedUpdateIndicator = null;

  @JsonProperty("monthsReviewed")
  private String monthsReviewed = null;

  @JsonProperty("accountDesignator")
  private AccountDesignatorCode accountDesignator = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("thirtyDayCounter")
  private Integer thirtyDayCounter = null;

  @JsonProperty("sixtyDayCounter")
  private Integer sixtyDayCounter = null;

  @JsonProperty("ninetyDayCounter")
  private Integer ninetyDayCounter = null;

  @JsonProperty("previousHighRate1")
  private Integer previousHighRate1 = null;

  @JsonProperty("previousHighDate1")
  private String previousHighDate1 = null;

  @JsonProperty("previousHighRate2")
  private Integer previousHighRate2 = null;

  @JsonProperty("previousHighDate2")
  private String previousHighDate2 = null;

  @JsonProperty("previousHighRate3")
  private Integer previousHighRate3 = null;

  @JsonProperty("previousHighDate3")
  private String previousHighDate3 = null;

  @JsonProperty("24MonthPaymentHistory")
  @Valid
  private List<Trade24MonthPaymentHistory> _24MonthPaymentHistory = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("customerNumber")
  private String customerNumber = null;

  @JsonProperty("dateReported")
  private String dateReported = null;

  @JsonProperty("dateOpened")
  private String dateOpened = null;

  @JsonProperty("highCredit")
  private Integer highCredit = null;

  @JsonProperty("creditLimit")
  private Integer creditLimit = null;

  @JsonProperty("balance")
  private Integer balance = null;

  @JsonProperty("pastDueAmount")
  private Integer pastDueAmount = null;

  @JsonProperty("portfolioTypeCode")
  private TradePortfolioTypeCode portfolioTypeCode = null;

  @JsonProperty("rateStatusCode")
  private TradeRateStatusCode rateStatusCode = null;

  @JsonProperty("rate")
  private TradeRate rate = null;

  @JsonProperty("lastActivityDate")
  private String lastActivityDate = null;

  @JsonProperty("narrativeCodes")
  private NarrativeCodes narrativeCodes = null;

  @JsonProperty("rawNarrativeCodes")
  @Valid
  private List<String> rawNarrativeCodes = null;

  @JsonProperty("accountTypeCode")
  private AccountTypeCode accountTypeCode = null;

  @JsonProperty("lastPaymentDate")
  private String lastPaymentDate = null;

  @JsonProperty("closedDate")
  private String closedDate = null;

  @JsonProperty("dateMajorDelinquencyFirstReported")
  private String dateMajorDelinquencyFirstReported = null;

  @JsonProperty("actualPaymentAmount")
  private Integer actualPaymentAmount = null;

  @JsonProperty("scheduledPaymentAmount")
  private Integer scheduledPaymentAmount = null;

  @JsonProperty("termsFrequencyCode")
  private TradeTermsFrequencyCode termsFrequencyCode = null;

  @JsonProperty("termsDurationCode")
  private TradeTermsDurationCode termsDurationCode = null;

  @JsonProperty("purchasedFromOrSoldCreditorIndicator")
  private TradePurchasedFromOrSoldCreditorIndicator purchasedFromOrSoldCreditorIndicator = null;

  @JsonProperty("purchasedFromOrSoldCreditorName")
  private String purchasedFromOrSoldCreditorName = null;

  @JsonProperty("creditorClassificationCode")
  private CreditorClassificationCode creditorClassificationCode = null;

  @JsonProperty("activityDesignatorCode")
  private TradeActivityDesignatorCode activityDesignatorCode = null;

  @JsonProperty("originalChargeOffAmount")
  private Integer originalChargeOffAmount = null;

  @JsonProperty("deferredPaymentStartDate")
  private String deferredPaymentStartDate = null;

  @JsonProperty("ballonPaymentAmount")
  private Integer ballonPaymentAmount = null;

  @JsonProperty("ballonPaymentDueDate")
  private String ballonPaymentDueDate = null;

  @JsonProperty("mortgageIDNumber")
  private String mortgageIDNumber = null;

  @JsonProperty("paymentHistory1to24")
  @Valid
  private List<TradePaymentHistory1to24> paymentHistory1to24 = null;

  @JsonProperty("paymentHistory25to36")
  @Valid
  private List<TradePaymentHistory25to36> paymentHistory25to36 = null;

  @JsonProperty("paymentHistory37to48")
  @Valid
  private List<TradePaymentHistory37to48> paymentHistory37to48 = null;

  @JsonProperty("previousHighRatePaymentHistory")
  private String previousHighRatePaymentHistory = null;

  @JsonProperty("previousHighDatePaymentHistory")
  private String previousHighDatePaymentHistory = null;

  @JsonProperty("dimensionsDataStartDate")
  private String dimensionsDataStartDate = null;

  @JsonProperty("dimensionsNumberOfMonths")
  private String dimensionsNumberOfMonths = null;

  @JsonProperty("dimension")
  @Valid
  private List<TradeDimension> dimension = null;

  public Trade automatedUpdateIndicator(String automatedUpdateIndicator) {
    this.automatedUpdateIndicator = automatedUpdateIndicator;
    return this;
  }

  /**
   * Automated Update Indicator
   * @return automatedUpdateIndicator
  **/
  @ApiModelProperty(value = "Automated Update Indicator")
  
  @Size(max=1)   public String getAutomatedUpdateIndicator() {
    return automatedUpdateIndicator;
  }

  public void setAutomatedUpdateIndicator(String automatedUpdateIndicator) {
    this.automatedUpdateIndicator = automatedUpdateIndicator;
  }

  public Trade monthsReviewed(String monthsReviewed) {
    this.monthsReviewed = monthsReviewed;
    return this;
  }

  /**
   * How many months the trade was reviewed
   * @return monthsReviewed
  **/
  @ApiModelProperty(value = "How many months the trade was reviewed")
  
  @Size(max=2)   public String getMonthsReviewed() {
    return monthsReviewed;
  }

  public void setMonthsReviewed(String monthsReviewed) {
    this.monthsReviewed = monthsReviewed;
  }

  public Trade accountDesignator(AccountDesignatorCode accountDesignator) {
    this.accountDesignator = accountDesignator;
    return this;
  }

  /**
   * Get accountDesignator
   * @return accountDesignator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDesignatorCode getAccountDesignator() {
    return accountDesignator;
  }

  public void setAccountDesignator(AccountDesignatorCode accountDesignator) {
    this.accountDesignator = accountDesignator;
  }

  public Trade accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Account number")
  
  @Size(max=20)   public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Trade thirtyDayCounter(Integer thirtyDayCounter) {
    this.thirtyDayCounter = thirtyDayCounter;
    return this;
  }

  /**
   * Number of times the consumer has been 30 days delinquent in payment
   * maximum: 99
   * @return thirtyDayCounter
  **/
  @ApiModelProperty(value = "Number of times the consumer has been 30 days delinquent in payment")
  
   @Max(99)   public Integer getThirtyDayCounter() {
    return thirtyDayCounter;
  }

  public void setThirtyDayCounter(Integer thirtyDayCounter) {
    this.thirtyDayCounter = thirtyDayCounter;
  }

  public Trade sixtyDayCounter(Integer sixtyDayCounter) {
    this.sixtyDayCounter = sixtyDayCounter;
    return this;
  }

  /**
   * Number of times the consumer has been 60 days delinquent in payment
   * maximum: 99
   * @return sixtyDayCounter
  **/
  @ApiModelProperty(value = "Number of times the consumer has been 60 days delinquent in payment")
  
   @Max(99)   public Integer getSixtyDayCounter() {
    return sixtyDayCounter;
  }

  public void setSixtyDayCounter(Integer sixtyDayCounter) {
    this.sixtyDayCounter = sixtyDayCounter;
  }

  public Trade ninetyDayCounter(Integer ninetyDayCounter) {
    this.ninetyDayCounter = ninetyDayCounter;
    return this;
  }

  /**
   * Number of times the consumer has been 90+ days delinquent in payment
   * maximum: 99
   * @return ninetyDayCounter
  **/
  @ApiModelProperty(value = "Number of times the consumer has been 90+ days delinquent in payment")
  
   @Max(99)   public Integer getNinetyDayCounter() {
    return ninetyDayCounter;
  }

  public void setNinetyDayCounter(Integer ninetyDayCounter) {
    this.ninetyDayCounter = ninetyDayCounter;
  }

  public Trade previousHighRate1(Integer previousHighRate1) {
    this.previousHighRate1 = previousHighRate1;
    return this;
  }

  /**
   * First highest rate that occurred outside of the timeframe of the payment history that has beed requested (Valid Rates\\: 2-5, 8 and 9) 
   * maximum: 999999999
   * @return previousHighRate1
  **/
  @ApiModelProperty(value = "First highest rate that occurred outside of the timeframe of the payment history that has beed requested (Valid Rates\\: 2-5, 8 and 9) ")
  
   @Max(999999999)   public Integer getPreviousHighRate1() {
    return previousHighRate1;
  }

  public void setPreviousHighRate1(Integer previousHighRate1) {
    this.previousHighRate1 = previousHighRate1;
  }

  public Trade previousHighDate1(String previousHighDate1) {
    this.previousHighDate1 = previousHighDate1;
    return this;
  }

  /**
   * Get previousHighDate1
   * @return previousHighDate1
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getPreviousHighDate1() {
    return previousHighDate1;
  }

  public void setPreviousHighDate1(String previousHighDate1) {
    this.previousHighDate1 = previousHighDate1;
  }

  public Trade previousHighRate2(Integer previousHighRate2) {
    this.previousHighRate2 = previousHighRate2;
    return this;
  }

  /**
   * Second highest rate that occurred outside of the timeframe of the payment history that has beed requested (Valid Rates\\: 2-5, 8 and 9) 
   * maximum: 999999999
   * @return previousHighRate2
  **/
  @ApiModelProperty(value = "Second highest rate that occurred outside of the timeframe of the payment history that has beed requested (Valid Rates\\: 2-5, 8 and 9) ")
  
   @Max(999999999)   public Integer getPreviousHighRate2() {
    return previousHighRate2;
  }

  public void setPreviousHighRate2(Integer previousHighRate2) {
    this.previousHighRate2 = previousHighRate2;
  }

  public Trade previousHighDate2(String previousHighDate2) {
    this.previousHighDate2 = previousHighDate2;
    return this;
  }

  /**
   * Get previousHighDate2
   * @return previousHighDate2
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getPreviousHighDate2() {
    return previousHighDate2;
  }

  public void setPreviousHighDate2(String previousHighDate2) {
    this.previousHighDate2 = previousHighDate2;
  }

  public Trade previousHighRate3(Integer previousHighRate3) {
    this.previousHighRate3 = previousHighRate3;
    return this;
  }

  /**
   * Third highest rate that occurred outside of the timeframe of the payment history that has beed requested (Valid Rates\\: 2-5, 8 and 9) 
   * maximum: 999999999
   * @return previousHighRate3
  **/
  @ApiModelProperty(value = "Third highest rate that occurred outside of the timeframe of the payment history that has beed requested (Valid Rates\\: 2-5, 8 and 9) ")
  
   @Max(999999999)   public Integer getPreviousHighRate3() {
    return previousHighRate3;
  }

  public void setPreviousHighRate3(Integer previousHighRate3) {
    this.previousHighRate3 = previousHighRate3;
  }

  public Trade previousHighDate3(String previousHighDate3) {
    this.previousHighDate3 = previousHighDate3;
    return this;
  }

  /**
   * Get previousHighDate3
   * @return previousHighDate3
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getPreviousHighDate3() {
    return previousHighDate3;
  }

  public void setPreviousHighDate3(String previousHighDate3) {
    this.previousHighDate3 = previousHighDate3;
  }

  public Trade _24MonthPaymentHistory(List<Trade24MonthPaymentHistory> _24MonthPaymentHistory) {
    this._24MonthPaymentHistory = _24MonthPaymentHistory;
    return this;
  }

  public Trade add24MonthPaymentHistoryItem(Trade24MonthPaymentHistory _24MonthPaymentHistoryItem) {
    if (this._24MonthPaymentHistory == null) {
      this._24MonthPaymentHistory = new ArrayList<Trade24MonthPaymentHistory>();
    }
    this._24MonthPaymentHistory.add(_24MonthPaymentHistoryItem);
    return this;
  }

  /**
   * Get _24MonthPaymentHistory
   * @return _24MonthPaymentHistory
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=25)   public List<Trade24MonthPaymentHistory> get24MonthPaymentHistory() {
    return _24MonthPaymentHistory;
  }

  public void set24MonthPaymentHistory(List<Trade24MonthPaymentHistory> _24MonthPaymentHistory) {
    this._24MonthPaymentHistory = _24MonthPaymentHistory;
  }

  public Trade customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Customer name
   * @return customerName
  **/
  @ApiModelProperty(value = "Customer name")
  
  @Size(max=20)   public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public Trade customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Customer number
   * @return customerNumber
  **/
  @ApiModelProperty(value = "Customer number")
  
  @Size(max=10)   public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public Trade dateReported(String dateReported) {
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

  public Trade dateOpened(String dateOpened) {
    this.dateOpened = dateOpened;
    return this;
  }

  /**
   * Get dateOpened
   * @return dateOpened
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateOpened() {
    return dateOpened;
  }

  public void setDateOpened(String dateOpened) {
    this.dateOpened = dateOpened;
  }

  public Trade highCredit(Integer highCredit) {
    this.highCredit = highCredit;
    return this;
  }

  /**
   * Highest outstanding balance or original amount
   * maximum: 999999999
   * @return highCredit
  **/
  @ApiModelProperty(value = "Highest outstanding balance or original amount")
  
   @Max(999999999)   public Integer getHighCredit() {
    return highCredit;
  }

  public void setHighCredit(Integer highCredit) {
    this.highCredit = highCredit;
  }

  public Trade creditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Highest available credit limit
   * maximum: 999999999
   * @return creditLimit
  **/
  @ApiModelProperty(value = "Highest available credit limit")
  
   @Max(999999999)   public Integer getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
  }

  public Trade balance(Integer balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Account balance
   * maximum: 999999999
   * @return balance
  **/
  @ApiModelProperty(value = "Account balance")
  
   @Max(999999999)   public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public Trade pastDueAmount(Integer pastDueAmount) {
    this.pastDueAmount = pastDueAmount;
    return this;
  }

  /**
   * Amount past due on an account (late)
   * maximum: 999999999
   * @return pastDueAmount
  **/
  @ApiModelProperty(value = "Amount past due on an account (late)")
  
   @Max(999999999)   public Integer getPastDueAmount() {
    return pastDueAmount;
  }

  public void setPastDueAmount(Integer pastDueAmount) {
    this.pastDueAmount = pastDueAmount;
  }

  public Trade portfolioTypeCode(TradePortfolioTypeCode portfolioTypeCode) {
    this.portfolioTypeCode = portfolioTypeCode;
    return this;
  }

  /**
   * Get portfolioTypeCode
   * @return portfolioTypeCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TradePortfolioTypeCode getPortfolioTypeCode() {
    return portfolioTypeCode;
  }

  public void setPortfolioTypeCode(TradePortfolioTypeCode portfolioTypeCode) {
    this.portfolioTypeCode = portfolioTypeCode;
  }

  public Trade rateStatusCode(TradeRateStatusCode rateStatusCode) {
    this.rateStatusCode = rateStatusCode;
    return this;
  }

  /**
   * Get rateStatusCode
   * @return rateStatusCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TradeRateStatusCode getRateStatusCode() {
    return rateStatusCode;
  }

  public void setRateStatusCode(TradeRateStatusCode rateStatusCode) {
    this.rateStatusCode = rateStatusCode;
  }

  public Trade rate(TradeRate rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TradeRate getRate() {
    return rate;
  }

  public void setRate(TradeRate rate) {
    this.rate = rate;
  }

  public Trade lastActivityDate(String lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

  /**
   * Contains the date of last activity
   * @return lastActivityDate
  **/
  @ApiModelProperty(example = "[\"MMYYYY\"]", value = "Contains the date of last activity")
  
  @Size(max=6)   public String getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(String lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public Trade narrativeCodes(NarrativeCodes narrativeCodes) {
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

  public Trade rawNarrativeCodes(List<String> rawNarrativeCodes) {
    this.rawNarrativeCodes = rawNarrativeCodes;
    return this;
  }

  public Trade addRawNarrativeCodesItem(String rawNarrativeCodesItem) {
    if (this.rawNarrativeCodes == null) {
      this.rawNarrativeCodes = new ArrayList<String>();
    }
    this.rawNarrativeCodes.add(rawNarrativeCodesItem);
    return this;
  }

  /**
   * Raw codes for the narratives
   * @return rawNarrativeCodes
  **/
  @ApiModelProperty(value = "Raw codes for the narratives")
  
  @Size(max=4)   public List<String> getRawNarrativeCodes() {
    return rawNarrativeCodes;
  }

  public void setRawNarrativeCodes(List<String> rawNarrativeCodes) {
    this.rawNarrativeCodes = rawNarrativeCodes;
  }

  public Trade accountTypeCode(AccountTypeCode accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

  /**
   * Get accountTypeCode
   * @return accountTypeCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountTypeCode getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(AccountTypeCode accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public Trade lastPaymentDate(String lastPaymentDate) {
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

  public Trade closedDate(String closedDate) {
    this.closedDate = closedDate;
    return this;
  }

  /**
   * Get closedDate
   * @return closedDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getClosedDate() {
    return closedDate;
  }

  public void setClosedDate(String closedDate) {
    this.closedDate = closedDate;
  }

  public Trade dateMajorDelinquencyFirstReported(String dateMajorDelinquencyFirstReported) {
    this.dateMajorDelinquencyFirstReported = dateMajorDelinquencyFirstReported;
    return this;
  }

  /**
   * Get dateMajorDelinquencyFirstReported
   * @return dateMajorDelinquencyFirstReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateMajorDelinquencyFirstReported() {
    return dateMajorDelinquencyFirstReported;
  }

  public void setDateMajorDelinquencyFirstReported(String dateMajorDelinquencyFirstReported) {
    this.dateMajorDelinquencyFirstReported = dateMajorDelinquencyFirstReported;
  }

  public Trade actualPaymentAmount(Integer actualPaymentAmount) {
    this.actualPaymentAmount = actualPaymentAmount;
    return this;
  }

  /**
   * Payment actually received for a reporting period
   * maximum: 999999999
   * @return actualPaymentAmount
  **/
  @ApiModelProperty(value = "Payment actually received for a reporting period")
  
   @Max(999999999)   public Integer getActualPaymentAmount() {
    return actualPaymentAmount;
  }

  public void setActualPaymentAmount(Integer actualPaymentAmount) {
    this.actualPaymentAmount = actualPaymentAmount;
  }

  public Trade scheduledPaymentAmount(Integer scheduledPaymentAmount) {
    this.scheduledPaymentAmount = scheduledPaymentAmount;
    return this;
  }

  /**
   * Contractual amount due for a payment period. (The figure in this field should be the monthly amount due regardless of the actual payment frequency.)  
   * maximum: 999999999
   * @return scheduledPaymentAmount
  **/
  @ApiModelProperty(value = "Contractual amount due for a payment period. (The figure in this field should be the monthly amount due regardless of the actual payment frequency.)  ")
  
   @Max(999999999)   public Integer getScheduledPaymentAmount() {
    return scheduledPaymentAmount;
  }

  public void setScheduledPaymentAmount(Integer scheduledPaymentAmount) {
    this.scheduledPaymentAmount = scheduledPaymentAmount;
  }

  public Trade termsFrequencyCode(TradeTermsFrequencyCode termsFrequencyCode) {
    this.termsFrequencyCode = termsFrequencyCode;
    return this;
  }

  /**
   * Get termsFrequencyCode
   * @return termsFrequencyCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TradeTermsFrequencyCode getTermsFrequencyCode() {
    return termsFrequencyCode;
  }

  public void setTermsFrequencyCode(TradeTermsFrequencyCode termsFrequencyCode) {
    this.termsFrequencyCode = termsFrequencyCode;
  }

  public Trade termsDurationCode(TradeTermsDurationCode termsDurationCode) {
    this.termsDurationCode = termsDurationCode;
    return this;
  }

  /**
   * Get termsDurationCode
   * @return termsDurationCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TradeTermsDurationCode getTermsDurationCode() {
    return termsDurationCode;
  }

  public void setTermsDurationCode(TradeTermsDurationCode termsDurationCode) {
    this.termsDurationCode = termsDurationCode;
  }

  public Trade purchasedFromOrSoldCreditorIndicator(TradePurchasedFromOrSoldCreditorIndicator purchasedFromOrSoldCreditorIndicator) {
    this.purchasedFromOrSoldCreditorIndicator = purchasedFromOrSoldCreditorIndicator;
    return this;
  }

  /**
   * Get purchasedFromOrSoldCreditorIndicator
   * @return purchasedFromOrSoldCreditorIndicator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TradePurchasedFromOrSoldCreditorIndicator getPurchasedFromOrSoldCreditorIndicator() {
    return purchasedFromOrSoldCreditorIndicator;
  }

  public void setPurchasedFromOrSoldCreditorIndicator(TradePurchasedFromOrSoldCreditorIndicator purchasedFromOrSoldCreditorIndicator) {
    this.purchasedFromOrSoldCreditorIndicator = purchasedFromOrSoldCreditorIndicator;
  }

  public Trade purchasedFromOrSoldCreditorName(String purchasedFromOrSoldCreditorName) {
    this.purchasedFromOrSoldCreditorName = purchasedFromOrSoldCreditorName;
    return this;
  }

  /**
   * Denotes who the account was either purchased from or sold to or the Original Creditor’s name
   * @return purchasedFromOrSoldCreditorName
  **/
  @ApiModelProperty(value = "Denotes who the account was either purchased from or sold to or the Original Creditor’s name")
  
  @Size(max=30)   public String getPurchasedFromOrSoldCreditorName() {
    return purchasedFromOrSoldCreditorName;
  }

  public void setPurchasedFromOrSoldCreditorName(String purchasedFromOrSoldCreditorName) {
    this.purchasedFromOrSoldCreditorName = purchasedFromOrSoldCreditorName;
  }

  public Trade creditorClassificationCode(CreditorClassificationCode creditorClassificationCode) {
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

  public Trade activityDesignatorCode(TradeActivityDesignatorCode activityDesignatorCode) {
    this.activityDesignatorCode = activityDesignatorCode;
    return this;
  }

  /**
   * Get activityDesignatorCode
   * @return activityDesignatorCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TradeActivityDesignatorCode getActivityDesignatorCode() {
    return activityDesignatorCode;
  }

  public void setActivityDesignatorCode(TradeActivityDesignatorCode activityDesignatorCode) {
    this.activityDesignatorCode = activityDesignatorCode;
  }

  public Trade originalChargeOffAmount(Integer originalChargeOffAmount) {
    this.originalChargeOffAmount = originalChargeOffAmount;
    return this;
  }

  /**
   * Amount originally charged to loss by the creditor
   * maximum: 999999999
   * @return originalChargeOffAmount
  **/
  @ApiModelProperty(value = "Amount originally charged to loss by the creditor")
  
   @Max(999999999)   public Integer getOriginalChargeOffAmount() {
    return originalChargeOffAmount;
  }

  public void setOriginalChargeOffAmount(Integer originalChargeOffAmount) {
    this.originalChargeOffAmount = originalChargeOffAmount;
  }

  public Trade deferredPaymentStartDate(String deferredPaymentStartDate) {
    this.deferredPaymentStartDate = deferredPaymentStartDate;
    return this;
  }

  /**
   * Get deferredPaymentStartDate
   * @return deferredPaymentStartDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDeferredPaymentStartDate() {
    return deferredPaymentStartDate;
  }

  public void setDeferredPaymentStartDate(String deferredPaymentStartDate) {
    this.deferredPaymentStartDate = deferredPaymentStartDate;
  }

  public Trade ballonPaymentAmount(Integer ballonPaymentAmount) {
    this.ballonPaymentAmount = ballonPaymentAmount;
    return this;
  }

  /**
   * Amount of the balloon payment
   * maximum: 999999999
   * @return ballonPaymentAmount
  **/
  @ApiModelProperty(value = "Amount of the balloon payment")
  
   @Max(999999999)   public Integer getBallonPaymentAmount() {
    return ballonPaymentAmount;
  }

  public void setBallonPaymentAmount(Integer ballonPaymentAmount) {
    this.ballonPaymentAmount = ballonPaymentAmount;
  }

  public Trade ballonPaymentDueDate(String ballonPaymentDueDate) {
    this.ballonPaymentDueDate = ballonPaymentDueDate;
    return this;
  }

  /**
   * Get ballonPaymentDueDate
   * @return ballonPaymentDueDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getBallonPaymentDueDate() {
    return ballonPaymentDueDate;
  }

  public void setBallonPaymentDueDate(String ballonPaymentDueDate) {
    this.ballonPaymentDueDate = ballonPaymentDueDate;
  }

  public Trade mortgageIDNumber(String mortgageIDNumber) {
    this.mortgageIDNumber = mortgageIDNumber;
    return this;
  }

  /**
   * Number assigned to a mortgage loan that remains constant throughout the life of the loan. The MIN indicates that the loan is registered with the Mortgage Electronic Registration Systems, Inc., the electronic registry for tracking the ownership of mortgage rights. 
   * @return mortgageIDNumber
  **/
  @ApiModelProperty(value = "Number assigned to a mortgage loan that remains constant throughout the life of the loan. The MIN indicates that the loan is registered with the Mortgage Electronic Registration Systems, Inc., the electronic registry for tracking the ownership of mortgage rights. ")
  
  @Size(max=18)   public String getMortgageIDNumber() {
    return mortgageIDNumber;
  }

  public void setMortgageIDNumber(String mortgageIDNumber) {
    this.mortgageIDNumber = mortgageIDNumber;
  }

  public Trade paymentHistory1to24(List<TradePaymentHistory1to24> paymentHistory1to24) {
    this.paymentHistory1to24 = paymentHistory1to24;
    return this;
  }

  public Trade addPaymentHistory1to24Item(TradePaymentHistory1to24 paymentHistory1to24Item) {
    if (this.paymentHistory1to24 == null) {
      this.paymentHistory1to24 = new ArrayList<TradePaymentHistory1to24>();
    }
    this.paymentHistory1to24.add(paymentHistory1to24Item);
    return this;
  }

  /**
   * Get paymentHistory1to24
   * @return paymentHistory1to24
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=25)   public List<TradePaymentHistory1to24> getPaymentHistory1to24() {
    return paymentHistory1to24;
  }

  public void setPaymentHistory1to24(List<TradePaymentHistory1to24> paymentHistory1to24) {
    this.paymentHistory1to24 = paymentHistory1to24;
  }

  public Trade paymentHistory25to36(List<TradePaymentHistory25to36> paymentHistory25to36) {
    this.paymentHistory25to36 = paymentHistory25to36;
    return this;
  }

  public Trade addPaymentHistory25to36Item(TradePaymentHistory25to36 paymentHistory25to36Item) {
    if (this.paymentHistory25to36 == null) {
      this.paymentHistory25to36 = new ArrayList<TradePaymentHistory25to36>();
    }
    this.paymentHistory25to36.add(paymentHistory25to36Item);
    return this;
  }

  /**
   * Get paymentHistory25to36
   * @return paymentHistory25to36
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=13)   public List<TradePaymentHistory25to36> getPaymentHistory25to36() {
    return paymentHistory25to36;
  }

  public void setPaymentHistory25to36(List<TradePaymentHistory25to36> paymentHistory25to36) {
    this.paymentHistory25to36 = paymentHistory25to36;
  }

  public Trade paymentHistory37to48(List<TradePaymentHistory37to48> paymentHistory37to48) {
    this.paymentHistory37to48 = paymentHistory37to48;
    return this;
  }

  public Trade addPaymentHistory37to48Item(TradePaymentHistory37to48 paymentHistory37to48Item) {
    if (this.paymentHistory37to48 == null) {
      this.paymentHistory37to48 = new ArrayList<TradePaymentHistory37to48>();
    }
    this.paymentHistory37to48.add(paymentHistory37to48Item);
    return this;
  }

  /**
   * Get paymentHistory37to48
   * @return paymentHistory37to48
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=13)   public List<TradePaymentHistory37to48> getPaymentHistory37to48() {
    return paymentHistory37to48;
  }

  public void setPaymentHistory37to48(List<TradePaymentHistory37to48> paymentHistory37to48) {
    this.paymentHistory37to48 = paymentHistory37to48;
  }

  public Trade previousHighRatePaymentHistory(String previousHighRatePaymentHistory) {
    this.previousHighRatePaymentHistory = previousHighRatePaymentHistory;
    return this;
  }

  /**
   * Get previousHighRatePaymentHistory
   * @return previousHighRatePaymentHistory
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=1)   public String getPreviousHighRatePaymentHistory() {
    return previousHighRatePaymentHistory;
  }

  public void setPreviousHighRatePaymentHistory(String previousHighRatePaymentHistory) {
    this.previousHighRatePaymentHistory = previousHighRatePaymentHistory;
  }

  public Trade previousHighDatePaymentHistory(String previousHighDatePaymentHistory) {
    this.previousHighDatePaymentHistory = previousHighDatePaymentHistory;
    return this;
  }

  /**
   * Get previousHighDatePaymentHistory
   * @return previousHighDatePaymentHistory
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getPreviousHighDatePaymentHistory() {
    return previousHighDatePaymentHistory;
  }

  public void setPreviousHighDatePaymentHistory(String previousHighDatePaymentHistory) {
    this.previousHighDatePaymentHistory = previousHighDatePaymentHistory;
  }

  public Trade dimensionsDataStartDate(String dimensionsDataStartDate) {
    this.dimensionsDataStartDate = dimensionsDataStartDate;
    return this;
  }

  /**
   * Get dimensionsDataStartDate
   * @return dimensionsDataStartDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getDimensionsDataStartDate() {
    return dimensionsDataStartDate;
  }

  public void setDimensionsDataStartDate(String dimensionsDataStartDate) {
    this.dimensionsDataStartDate = dimensionsDataStartDate;
  }

  public Trade dimensionsNumberOfMonths(String dimensionsNumberOfMonths) {
    this.dimensionsNumberOfMonths = dimensionsNumberOfMonths;
    return this;
  }

  /**
   * Number of months of Dimensions data requested
   * @return dimensionsNumberOfMonths
  **/
  @ApiModelProperty(value = "Number of months of Dimensions data requested")
  
  @Size(max=2)   public String getDimensionsNumberOfMonths() {
    return dimensionsNumberOfMonths;
  }

  public void setDimensionsNumberOfMonths(String dimensionsNumberOfMonths) {
    this.dimensionsNumberOfMonths = dimensionsNumberOfMonths;
  }

  public Trade dimension(List<TradeDimension> dimension) {
    this.dimension = dimension;
    return this;
  }

  public Trade addDimensionItem(TradeDimension dimensionItem) {
    if (this.dimension == null) {
      this.dimension = new ArrayList<TradeDimension>();
    }
    this.dimension.add(dimensionItem);
    return this;
  }

  /**
   * Information over the most recent 24 months of historical data. There may be gaps of historical Dimensions data if that month (or field) is not available Dimensions Data is an optional feature offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation. 
   * @return dimension
  **/
  @ApiModelProperty(value = "Information over the most recent 24 months of historical data. There may be gaps of historical Dimensions data if that month (or field) is not available Dimensions Data is an optional feature offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation. ")
      @Valid
    public List<TradeDimension> getDimension() {
    return dimension;
  }

  public void setDimension(List<TradeDimension> dimension) {
    this.dimension = dimension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trade trade = (Trade) o;
    return Objects.equals(this.automatedUpdateIndicator, trade.automatedUpdateIndicator) &&
        Objects.equals(this.monthsReviewed, trade.monthsReviewed) &&
        Objects.equals(this.accountDesignator, trade.accountDesignator) &&
        Objects.equals(this.accountNumber, trade.accountNumber) &&
        Objects.equals(this.thirtyDayCounter, trade.thirtyDayCounter) &&
        Objects.equals(this.sixtyDayCounter, trade.sixtyDayCounter) &&
        Objects.equals(this.ninetyDayCounter, trade.ninetyDayCounter) &&
        Objects.equals(this.previousHighRate1, trade.previousHighRate1) &&
        Objects.equals(this.previousHighDate1, trade.previousHighDate1) &&
        Objects.equals(this.previousHighRate2, trade.previousHighRate2) &&
        Objects.equals(this.previousHighDate2, trade.previousHighDate2) &&
        Objects.equals(this.previousHighRate3, trade.previousHighRate3) &&
        Objects.equals(this.previousHighDate3, trade.previousHighDate3) &&
        Objects.equals(this._24MonthPaymentHistory, trade._24MonthPaymentHistory) &&
        Objects.equals(this.customerName, trade.customerName) &&
        Objects.equals(this.customerNumber, trade.customerNumber) &&
        Objects.equals(this.dateReported, trade.dateReported) &&
        Objects.equals(this.dateOpened, trade.dateOpened) &&
        Objects.equals(this.highCredit, trade.highCredit) &&
        Objects.equals(this.creditLimit, trade.creditLimit) &&
        Objects.equals(this.balance, trade.balance) &&
        Objects.equals(this.pastDueAmount, trade.pastDueAmount) &&
        Objects.equals(this.portfolioTypeCode, trade.portfolioTypeCode) &&
        Objects.equals(this.rateStatusCode, trade.rateStatusCode) &&
        Objects.equals(this.rate, trade.rate) &&
        Objects.equals(this.lastActivityDate, trade.lastActivityDate) &&
        Objects.equals(this.narrativeCodes, trade.narrativeCodes) &&
        Objects.equals(this.rawNarrativeCodes, trade.rawNarrativeCodes) &&
        Objects.equals(this.accountTypeCode, trade.accountTypeCode) &&
        Objects.equals(this.lastPaymentDate, trade.lastPaymentDate) &&
        Objects.equals(this.closedDate, trade.closedDate) &&
        Objects.equals(this.dateMajorDelinquencyFirstReported, trade.dateMajorDelinquencyFirstReported) &&
        Objects.equals(this.actualPaymentAmount, trade.actualPaymentAmount) &&
        Objects.equals(this.scheduledPaymentAmount, trade.scheduledPaymentAmount) &&
        Objects.equals(this.termsFrequencyCode, trade.termsFrequencyCode) &&
        Objects.equals(this.termsDurationCode, trade.termsDurationCode) &&
        Objects.equals(this.purchasedFromOrSoldCreditorIndicator, trade.purchasedFromOrSoldCreditorIndicator) &&
        Objects.equals(this.purchasedFromOrSoldCreditorName, trade.purchasedFromOrSoldCreditorName) &&
        Objects.equals(this.creditorClassificationCode, trade.creditorClassificationCode) &&
        Objects.equals(this.activityDesignatorCode, trade.activityDesignatorCode) &&
        Objects.equals(this.originalChargeOffAmount, trade.originalChargeOffAmount) &&
        Objects.equals(this.deferredPaymentStartDate, trade.deferredPaymentStartDate) &&
        Objects.equals(this.ballonPaymentAmount, trade.ballonPaymentAmount) &&
        Objects.equals(this.ballonPaymentDueDate, trade.ballonPaymentDueDate) &&
        Objects.equals(this.mortgageIDNumber, trade.mortgageIDNumber) &&
        Objects.equals(this.paymentHistory1to24, trade.paymentHistory1to24) &&
        Objects.equals(this.paymentHistory25to36, trade.paymentHistory25to36) &&
        Objects.equals(this.paymentHistory37to48, trade.paymentHistory37to48) &&
        Objects.equals(this.previousHighRatePaymentHistory, trade.previousHighRatePaymentHistory) &&
        Objects.equals(this.previousHighDatePaymentHistory, trade.previousHighDatePaymentHistory) &&
        Objects.equals(this.dimensionsDataStartDate, trade.dimensionsDataStartDate) &&
        Objects.equals(this.dimensionsNumberOfMonths, trade.dimensionsNumberOfMonths) &&
        Objects.equals(this.dimension, trade.dimension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automatedUpdateIndicator, monthsReviewed, accountDesignator, accountNumber, thirtyDayCounter, sixtyDayCounter, ninetyDayCounter, previousHighRate1, previousHighDate1, previousHighRate2, previousHighDate2, previousHighRate3, previousHighDate3, _24MonthPaymentHistory, customerName, customerNumber, dateReported, dateOpened, highCredit, creditLimit, balance, pastDueAmount, portfolioTypeCode, rateStatusCode, rate, lastActivityDate, narrativeCodes, rawNarrativeCodes, accountTypeCode, lastPaymentDate, closedDate, dateMajorDelinquencyFirstReported, actualPaymentAmount, scheduledPaymentAmount, termsFrequencyCode, termsDurationCode, purchasedFromOrSoldCreditorIndicator, purchasedFromOrSoldCreditorName, creditorClassificationCode, activityDesignatorCode, originalChargeOffAmount, deferredPaymentStartDate, ballonPaymentAmount, ballonPaymentDueDate, mortgageIDNumber, paymentHistory1to24, paymentHistory25to36, paymentHistory37to48, previousHighRatePaymentHistory, previousHighDatePaymentHistory, dimensionsDataStartDate, dimensionsNumberOfMonths, dimension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trade {\n");
    
    sb.append("    automatedUpdateIndicator: ").append(toIndentedString(automatedUpdateIndicator)).append("\n");
    sb.append("    monthsReviewed: ").append(toIndentedString(monthsReviewed)).append("\n");
    sb.append("    accountDesignator: ").append(toIndentedString(accountDesignator)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    thirtyDayCounter: ").append(toIndentedString(thirtyDayCounter)).append("\n");
    sb.append("    sixtyDayCounter: ").append(toIndentedString(sixtyDayCounter)).append("\n");
    sb.append("    ninetyDayCounter: ").append(toIndentedString(ninetyDayCounter)).append("\n");
    sb.append("    previousHighRate1: ").append(toIndentedString(previousHighRate1)).append("\n");
    sb.append("    previousHighDate1: ").append(toIndentedString(previousHighDate1)).append("\n");
    sb.append("    previousHighRate2: ").append(toIndentedString(previousHighRate2)).append("\n");
    sb.append("    previousHighDate2: ").append(toIndentedString(previousHighDate2)).append("\n");
    sb.append("    previousHighRate3: ").append(toIndentedString(previousHighRate3)).append("\n");
    sb.append("    previousHighDate3: ").append(toIndentedString(previousHighDate3)).append("\n");
    sb.append("    _24MonthPaymentHistory: ").append(toIndentedString(_24MonthPaymentHistory)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    dateOpened: ").append(toIndentedString(dateOpened)).append("\n");
    sb.append("    highCredit: ").append(toIndentedString(highCredit)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    pastDueAmount: ").append(toIndentedString(pastDueAmount)).append("\n");
    sb.append("    portfolioTypeCode: ").append(toIndentedString(portfolioTypeCode)).append("\n");
    sb.append("    rateStatusCode: ").append(toIndentedString(rateStatusCode)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    narrativeCodes: ").append(toIndentedString(narrativeCodes)).append("\n");
    sb.append("    rawNarrativeCodes: ").append(toIndentedString(rawNarrativeCodes)).append("\n");
    sb.append("    accountTypeCode: ").append(toIndentedString(accountTypeCode)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    dateMajorDelinquencyFirstReported: ").append(toIndentedString(dateMajorDelinquencyFirstReported)).append("\n");
    sb.append("    actualPaymentAmount: ").append(toIndentedString(actualPaymentAmount)).append("\n");
    sb.append("    scheduledPaymentAmount: ").append(toIndentedString(scheduledPaymentAmount)).append("\n");
    sb.append("    termsFrequencyCode: ").append(toIndentedString(termsFrequencyCode)).append("\n");
    sb.append("    termsDurationCode: ").append(toIndentedString(termsDurationCode)).append("\n");
    sb.append("    purchasedFromOrSoldCreditorIndicator: ").append(toIndentedString(purchasedFromOrSoldCreditorIndicator)).append("\n");
    sb.append("    purchasedFromOrSoldCreditorName: ").append(toIndentedString(purchasedFromOrSoldCreditorName)).append("\n");
    sb.append("    creditorClassificationCode: ").append(toIndentedString(creditorClassificationCode)).append("\n");
    sb.append("    activityDesignatorCode: ").append(toIndentedString(activityDesignatorCode)).append("\n");
    sb.append("    originalChargeOffAmount: ").append(toIndentedString(originalChargeOffAmount)).append("\n");
    sb.append("    deferredPaymentStartDate: ").append(toIndentedString(deferredPaymentStartDate)).append("\n");
    sb.append("    ballonPaymentAmount: ").append(toIndentedString(ballonPaymentAmount)).append("\n");
    sb.append("    ballonPaymentDueDate: ").append(toIndentedString(ballonPaymentDueDate)).append("\n");
    sb.append("    mortgageIDNumber: ").append(toIndentedString(mortgageIDNumber)).append("\n");
    sb.append("    paymentHistory1to24: ").append(toIndentedString(paymentHistory1to24)).append("\n");
    sb.append("    paymentHistory25to36: ").append(toIndentedString(paymentHistory25to36)).append("\n");
    sb.append("    paymentHistory37to48: ").append(toIndentedString(paymentHistory37to48)).append("\n");
    sb.append("    previousHighRatePaymentHistory: ").append(toIndentedString(previousHighRatePaymentHistory)).append("\n");
    sb.append("    previousHighDatePaymentHistory: ").append(toIndentedString(previousHighDatePaymentHistory)).append("\n");
    sb.append("    dimensionsDataStartDate: ").append(toIndentedString(dimensionsDataStartDate)).append("\n");
    sb.append("    dimensionsNumberOfMonths: ").append(toIndentedString(dimensionsNumberOfMonths)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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
