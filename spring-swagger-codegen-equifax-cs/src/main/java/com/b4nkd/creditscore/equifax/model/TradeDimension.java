package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.AccountDesignatorCode;
import com.b4nkd.creditscore.equifax.model.AccountTypeCode;
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
 * TradeDimension
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class TradeDimension   {
  @JsonProperty("dimensionsBalance")
  private Integer dimensionsBalance = null;

  @JsonProperty("dimensionsActualPaymentAmount")
  private Integer dimensionsActualPaymentAmount = null;

  @JsonProperty("dimensionsScheduledPaymentAmount")
  private Integer dimensionsScheduledPaymentAmount = null;

  @JsonProperty("dimensionsLastPaymentDate")
  private String dimensionsLastPaymentDate = null;

  @JsonProperty("dimensionsHighCredit")
  private Integer dimensionsHighCredit = null;

  @JsonProperty("dimensionsCreditLimit")
  private Integer dimensionsCreditLimit = null;

  @JsonProperty("dimensionsPastDueAmount")
  private Integer dimensionsPastDueAmount = null;

  @JsonProperty("dimensionsNarrativeCodes")
  private NarrativeCodes dimensionsNarrativeCodes = null;

  @JsonProperty("dimensionsRawNarrativeCodes")
  @Valid
  private List<String> dimensionsRawNarrativeCodes = null;

  @JsonProperty("dimensionsAccountDesignatorCode")
  private AccountDesignatorCode dimensionsAccountDesignatorCode = null;

  @JsonProperty("dimensionsAccountTypeCode")
  private AccountTypeCode dimensionsAccountTypeCode = null;

  public TradeDimension dimensionsBalance(Integer dimensionsBalance) {
    this.dimensionsBalance = dimensionsBalance;
    return this;
  }

  /**
   * Balance during the month being reported
   * maximum: 999999999
   * @return dimensionsBalance
  **/
  @ApiModelProperty(value = "Balance during the month being reported")
  
   @Max(999999999)   public Integer getDimensionsBalance() {
    return dimensionsBalance;
  }

  public void setDimensionsBalance(Integer dimensionsBalance) {
    this.dimensionsBalance = dimensionsBalance;
  }

  public TradeDimension dimensionsActualPaymentAmount(Integer dimensionsActualPaymentAmount) {
    this.dimensionsActualPaymentAmount = dimensionsActualPaymentAmount;
    return this;
  }

  /**
   * Payment actually received for a reporting period
   * maximum: 999999999
   * @return dimensionsActualPaymentAmount
  **/
  @ApiModelProperty(value = "Payment actually received for a reporting period")
  
   @Max(999999999)   public Integer getDimensionsActualPaymentAmount() {
    return dimensionsActualPaymentAmount;
  }

  public void setDimensionsActualPaymentAmount(Integer dimensionsActualPaymentAmount) {
    this.dimensionsActualPaymentAmount = dimensionsActualPaymentAmount;
  }

  public TradeDimension dimensionsScheduledPaymentAmount(Integer dimensionsScheduledPaymentAmount) {
    this.dimensionsScheduledPaymentAmount = dimensionsScheduledPaymentAmount;
    return this;
  }

  /**
   * Contractual amount due for a payment period. (The figure in this field should be the monthly amount due regardless of the actual payment frequency.)
   * maximum: 999999999
   * @return dimensionsScheduledPaymentAmount
  **/
  @ApiModelProperty(value = "Contractual amount due for a payment period. (The figure in this field should be the monthly amount due regardless of the actual payment frequency.)")
  
   @Max(999999999)   public Integer getDimensionsScheduledPaymentAmount() {
    return dimensionsScheduledPaymentAmount;
  }

  public void setDimensionsScheduledPaymentAmount(Integer dimensionsScheduledPaymentAmount) {
    this.dimensionsScheduledPaymentAmount = dimensionsScheduledPaymentAmount;
  }

  public TradeDimension dimensionsLastPaymentDate(String dimensionsLastPaymentDate) {
    this.dimensionsLastPaymentDate = dimensionsLastPaymentDate;
    return this;
  }

  /**
   * Get dimensionsLastPaymentDate
   * @return dimensionsLastPaymentDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDimensionsLastPaymentDate() {
    return dimensionsLastPaymentDate;
  }

  public void setDimensionsLastPaymentDate(String dimensionsLastPaymentDate) {
    this.dimensionsLastPaymentDate = dimensionsLastPaymentDate;
  }

  public TradeDimension dimensionsHighCredit(Integer dimensionsHighCredit) {
    this.dimensionsHighCredit = dimensionsHighCredit;
    return this;
  }

  /**
   * Highest outstanding balance or original amount
   * maximum: 999999999
   * @return dimensionsHighCredit
  **/
  @ApiModelProperty(value = "Highest outstanding balance or original amount")
  
   @Max(999999999)   public Integer getDimensionsHighCredit() {
    return dimensionsHighCredit;
  }

  public void setDimensionsHighCredit(Integer dimensionsHighCredit) {
    this.dimensionsHighCredit = dimensionsHighCredit;
  }

  public TradeDimension dimensionsCreditLimit(Integer dimensionsCreditLimit) {
    this.dimensionsCreditLimit = dimensionsCreditLimit;
    return this;
  }

  /**
   * Highest available credit amount
   * maximum: 999999999
   * @return dimensionsCreditLimit
  **/
  @ApiModelProperty(value = "Highest available credit amount")
  
   @Max(999999999)   public Integer getDimensionsCreditLimit() {
    return dimensionsCreditLimit;
  }

  public void setDimensionsCreditLimit(Integer dimensionsCreditLimit) {
    this.dimensionsCreditLimit = dimensionsCreditLimit;
  }

  public TradeDimension dimensionsPastDueAmount(Integer dimensionsPastDueAmount) {
    this.dimensionsPastDueAmount = dimensionsPastDueAmount;
    return this;
  }

  /**
   * Current amount overdue on a trade
   * maximum: 999999999
   * @return dimensionsPastDueAmount
  **/
  @ApiModelProperty(value = "Current amount overdue on a trade")
  
   @Max(999999999)   public Integer getDimensionsPastDueAmount() {
    return dimensionsPastDueAmount;
  }

  public void setDimensionsPastDueAmount(Integer dimensionsPastDueAmount) {
    this.dimensionsPastDueAmount = dimensionsPastDueAmount;
  }

  public TradeDimension dimensionsNarrativeCodes(NarrativeCodes dimensionsNarrativeCodes) {
    this.dimensionsNarrativeCodes = dimensionsNarrativeCodes;
    return this;
  }

  /**
   * Get dimensionsNarrativeCodes
   * @return dimensionsNarrativeCodes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NarrativeCodes getDimensionsNarrativeCodes() {
    return dimensionsNarrativeCodes;
  }

  public void setDimensionsNarrativeCodes(NarrativeCodes dimensionsNarrativeCodes) {
    this.dimensionsNarrativeCodes = dimensionsNarrativeCodes;
  }

  public TradeDimension dimensionsRawNarrativeCodes(List<String> dimensionsRawNarrativeCodes) {
    this.dimensionsRawNarrativeCodes = dimensionsRawNarrativeCodes;
    return this;
  }

  public TradeDimension addDimensionsRawNarrativeCodesItem(String dimensionsRawNarrativeCodesItem) {
    if (this.dimensionsRawNarrativeCodes == null) {
      this.dimensionsRawNarrativeCodes = new ArrayList<String>();
    }
    this.dimensionsRawNarrativeCodes.add(dimensionsRawNarrativeCodesItem);
    return this;
  }

  /**
   * Raw Dimensions Data naratives. It contains up to 4 narratives
   * @return dimensionsRawNarrativeCodes
  **/
  @ApiModelProperty(value = "Raw Dimensions Data naratives. It contains up to 4 narratives")
  
  @Size(max=4)   public List<String> getDimensionsRawNarrativeCodes() {
    return dimensionsRawNarrativeCodes;
  }

  public void setDimensionsRawNarrativeCodes(List<String> dimensionsRawNarrativeCodes) {
    this.dimensionsRawNarrativeCodes = dimensionsRawNarrativeCodes;
  }

  public TradeDimension dimensionsAccountDesignatorCode(AccountDesignatorCode dimensionsAccountDesignatorCode) {
    this.dimensionsAccountDesignatorCode = dimensionsAccountDesignatorCode;
    return this;
  }

  /**
   * Get dimensionsAccountDesignatorCode
   * @return dimensionsAccountDesignatorCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDesignatorCode getDimensionsAccountDesignatorCode() {
    return dimensionsAccountDesignatorCode;
  }

  public void setDimensionsAccountDesignatorCode(AccountDesignatorCode dimensionsAccountDesignatorCode) {
    this.dimensionsAccountDesignatorCode = dimensionsAccountDesignatorCode;
  }

  public TradeDimension dimensionsAccountTypeCode(AccountTypeCode dimensionsAccountTypeCode) {
    this.dimensionsAccountTypeCode = dimensionsAccountTypeCode;
    return this;
  }

  /**
   * Get dimensionsAccountTypeCode
   * @return dimensionsAccountTypeCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountTypeCode getDimensionsAccountTypeCode() {
    return dimensionsAccountTypeCode;
  }

  public void setDimensionsAccountTypeCode(AccountTypeCode dimensionsAccountTypeCode) {
    this.dimensionsAccountTypeCode = dimensionsAccountTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeDimension tradeDimension = (TradeDimension) o;
    return Objects.equals(this.dimensionsBalance, tradeDimension.dimensionsBalance) &&
        Objects.equals(this.dimensionsActualPaymentAmount, tradeDimension.dimensionsActualPaymentAmount) &&
        Objects.equals(this.dimensionsScheduledPaymentAmount, tradeDimension.dimensionsScheduledPaymentAmount) &&
        Objects.equals(this.dimensionsLastPaymentDate, tradeDimension.dimensionsLastPaymentDate) &&
        Objects.equals(this.dimensionsHighCredit, tradeDimension.dimensionsHighCredit) &&
        Objects.equals(this.dimensionsCreditLimit, tradeDimension.dimensionsCreditLimit) &&
        Objects.equals(this.dimensionsPastDueAmount, tradeDimension.dimensionsPastDueAmount) &&
        Objects.equals(this.dimensionsNarrativeCodes, tradeDimension.dimensionsNarrativeCodes) &&
        Objects.equals(this.dimensionsRawNarrativeCodes, tradeDimension.dimensionsRawNarrativeCodes) &&
        Objects.equals(this.dimensionsAccountDesignatorCode, tradeDimension.dimensionsAccountDesignatorCode) &&
        Objects.equals(this.dimensionsAccountTypeCode, tradeDimension.dimensionsAccountTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionsBalance, dimensionsActualPaymentAmount, dimensionsScheduledPaymentAmount, dimensionsLastPaymentDate, dimensionsHighCredit, dimensionsCreditLimit, dimensionsPastDueAmount, dimensionsNarrativeCodes, dimensionsRawNarrativeCodes, dimensionsAccountDesignatorCode, dimensionsAccountTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeDimension {\n");
    
    sb.append("    dimensionsBalance: ").append(toIndentedString(dimensionsBalance)).append("\n");
    sb.append("    dimensionsActualPaymentAmount: ").append(toIndentedString(dimensionsActualPaymentAmount)).append("\n");
    sb.append("    dimensionsScheduledPaymentAmount: ").append(toIndentedString(dimensionsScheduledPaymentAmount)).append("\n");
    sb.append("    dimensionsLastPaymentDate: ").append(toIndentedString(dimensionsLastPaymentDate)).append("\n");
    sb.append("    dimensionsHighCredit: ").append(toIndentedString(dimensionsHighCredit)).append("\n");
    sb.append("    dimensionsCreditLimit: ").append(toIndentedString(dimensionsCreditLimit)).append("\n");
    sb.append("    dimensionsPastDueAmount: ").append(toIndentedString(dimensionsPastDueAmount)).append("\n");
    sb.append("    dimensionsNarrativeCodes: ").append(toIndentedString(dimensionsNarrativeCodes)).append("\n");
    sb.append("    dimensionsRawNarrativeCodes: ").append(toIndentedString(dimensionsRawNarrativeCodes)).append("\n");
    sb.append("    dimensionsAccountDesignatorCode: ").append(toIndentedString(dimensionsAccountDesignatorCode)).append("\n");
    sb.append("    dimensionsAccountTypeCode: ").append(toIndentedString(dimensionsAccountTypeCode)).append("\n");
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
