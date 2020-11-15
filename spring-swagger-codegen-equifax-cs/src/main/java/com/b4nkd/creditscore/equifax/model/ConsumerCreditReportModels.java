package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportEDASIndicatorCode;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportEDASRegionalIndicatorCode;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportFICOScoreIndicatorCode;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportInquiryKeyFactor;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportReasons;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportRejects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportRiskBasedPricingOrModel;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportScoreNumberOrMarketMaxIndustryCode;
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
 * ConsumerCreditReportModels
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportModels   {
  /**
   * Determine what type of model is
   */
  public enum TypeEnum {
    EDAS("EDAS"),
    
    FICO("FICO"),
    
    MARKETMAX("MARKETMAX"),
    
    IDSCORE("IDSCORE"),
    
    MODEL("MODEL"),
    
    RBP("RBP"),
    
    DODDFRANK("DODDFRANK");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("modelNumber")
  private String modelNumber = null;

  @JsonProperty("FICOScoreIndicatorCode")
  private ConsumerCreditReportFICOScoreIndicatorCode fiCOScoreIndicatorCode = null;

  @JsonProperty("score")
  private Integer score = null;

  @JsonProperty("reasons")
  @Valid
  private List<ConsumerCreditReportReasons> reasons = null;

  @JsonProperty("inquiryKeyFactor")
  private ConsumerCreditReportInquiryKeyFactor inquiryKeyFactor = null;

  @JsonProperty("riskBasedPricingOrModel")
  private ConsumerCreditReportRiskBasedPricingOrModel riskBasedPricingOrModel = null;

  @JsonProperty("rejects")
  @Valid
  private List<ConsumerCreditReportRejects> rejects = null;

  @JsonProperty("EDASRegionalIndicatorCode")
  private ConsumerCreditReportEDASRegionalIndicatorCode edASRegionalIndicatorCode = null;

  @JsonProperty("EDASIndicatorCode")
  private ConsumerCreditReportEDASIndicatorCode edASIndicatorCode = null;

  @JsonProperty("modelIDOrScorecard")
  private String modelIDOrScorecard = null;

  @JsonProperty("scoreNumberOrMarketMaxIndustryCode")
  private ConsumerCreditReportScoreNumberOrMarketMaxIndustryCode scoreNumberOrMarketMaxIndustryCode = null;

  @JsonProperty("numericScoreIndicator")
  private String numericScoreIndicator = null;

  public ConsumerCreditReportModels type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Determine what type of model is
   * @return type
  **/
  @ApiModelProperty(example = "[\"EDAS\",\"FICO\",\"MARKETMAX\",\"IDSCORE\",\"MODEL\",\"RBP\",\"DODDFRANK\"]", value = "Determine what type of model is")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ConsumerCreditReportModels modelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
    return this;
  }

  /**
   * Model number code
   * @return modelNumber
  **/
  @ApiModelProperty(value = "Model number code")
  
  @Size(max=5)   public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public ConsumerCreditReportModels fiCOScoreIndicatorCode(ConsumerCreditReportFICOScoreIndicatorCode fiCOScoreIndicatorCode) {
    this.fiCOScoreIndicatorCode = fiCOScoreIndicatorCode;
    return this;
  }

  /**
   * Get fiCOScoreIndicatorCode
   * @return fiCOScoreIndicatorCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportFICOScoreIndicatorCode getFiCOScoreIndicatorCode() {
    return fiCOScoreIndicatorCode;
  }

  public void setFiCOScoreIndicatorCode(ConsumerCreditReportFICOScoreIndicatorCode fiCOScoreIndicatorCode) {
    this.fiCOScoreIndicatorCode = fiCOScoreIndicatorCode;
  }

  public ConsumerCreditReportModels score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Numeric score returned by the model requested by the customer
   * maximum: 99999
   * @return score
  **/
  @ApiModelProperty(value = "Numeric score returned by the model requested by the customer")
  
   @Max(99999)   public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public ConsumerCreditReportModels reasons(List<ConsumerCreditReportReasons> reasons) {
    this.reasons = reasons;
    return this;
  }

  public ConsumerCreditReportModels addReasonsItem(ConsumerCreditReportReasons reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<ConsumerCreditReportReasons>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

  /**
   * Reason codes for the score that was returned
   * @return reasons
  **/
  @ApiModelProperty(value = "Reason codes for the score that was returned")
      @Valid
  @Size(max=4)   public List<ConsumerCreditReportReasons> getReasons() {
    return reasons;
  }

  public void setReasons(List<ConsumerCreditReportReasons> reasons) {
    this.reasons = reasons;
  }

  public ConsumerCreditReportModels inquiryKeyFactor(ConsumerCreditReportInquiryKeyFactor inquiryKeyFactor) {
    this.inquiryKeyFactor = inquiryKeyFactor;
    return this;
  }

  /**
   * Get inquiryKeyFactor
   * @return inquiryKeyFactor
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportInquiryKeyFactor getInquiryKeyFactor() {
    return inquiryKeyFactor;
  }

  public void setInquiryKeyFactor(ConsumerCreditReportInquiryKeyFactor inquiryKeyFactor) {
    this.inquiryKeyFactor = inquiryKeyFactor;
  }

  public ConsumerCreditReportModels riskBasedPricingOrModel(ConsumerCreditReportRiskBasedPricingOrModel riskBasedPricingOrModel) {
    this.riskBasedPricingOrModel = riskBasedPricingOrModel;
    return this;
  }

  /**
   * Get riskBasedPricingOrModel
   * @return riskBasedPricingOrModel
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportRiskBasedPricingOrModel getRiskBasedPricingOrModel() {
    return riskBasedPricingOrModel;
  }

  public void setRiskBasedPricingOrModel(ConsumerCreditReportRiskBasedPricingOrModel riskBasedPricingOrModel) {
    this.riskBasedPricingOrModel = riskBasedPricingOrModel;
  }

  public ConsumerCreditReportModels rejects(List<ConsumerCreditReportRejects> rejects) {
    this.rejects = rejects;
    return this;
  }

  public ConsumerCreditReportModels addRejectsItem(ConsumerCreditReportRejects rejectsItem) {
    if (this.rejects == null) {
      this.rejects = new ArrayList<ConsumerCreditReportRejects>();
    }
    this.rejects.add(rejectsItem);
    return this;
  }

  /**
   * Model unable to score file; requested reject code return instead
   * @return rejects
  **/
  @ApiModelProperty(value = "Model unable to score file; requested reject code return instead")
      @Valid
    public List<ConsumerCreditReportRejects> getRejects() {
    return rejects;
  }

  public void setRejects(List<ConsumerCreditReportRejects> rejects) {
    this.rejects = rejects;
  }

  public ConsumerCreditReportModels edASRegionalIndicatorCode(ConsumerCreditReportEDASRegionalIndicatorCode edASRegionalIndicatorCode) {
    this.edASRegionalIndicatorCode = edASRegionalIndicatorCode;
    return this;
  }

  /**
   * Get edASRegionalIndicatorCode
   * @return edASRegionalIndicatorCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportEDASRegionalIndicatorCode getEdASRegionalIndicatorCode() {
    return edASRegionalIndicatorCode;
  }

  public void setEdASRegionalIndicatorCode(ConsumerCreditReportEDASRegionalIndicatorCode edASRegionalIndicatorCode) {
    this.edASRegionalIndicatorCode = edASRegionalIndicatorCode;
  }

  public ConsumerCreditReportModels edASIndicatorCode(ConsumerCreditReportEDASIndicatorCode edASIndicatorCode) {
    this.edASIndicatorCode = edASIndicatorCode;
    return this;
  }

  /**
   * Get edASIndicatorCode
   * @return edASIndicatorCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportEDASIndicatorCode getEdASIndicatorCode() {
    return edASIndicatorCode;
  }

  public void setEdASIndicatorCode(ConsumerCreditReportEDASIndicatorCode edASIndicatorCode) {
    this.edASIndicatorCode = edASIndicatorCode;
  }

  public ConsumerCreditReportModels modelIDOrScorecard(String modelIDOrScorecard) {
    this.modelIDOrScorecard = modelIDOrScorecard;
    return this;
  }

  /**
   * Scorecard that was used to produce the score returned
   * @return modelIDOrScorecard
  **/
  @ApiModelProperty(value = "Scorecard that was used to produce the score returned")
  
  @Size(max=1)   public String getModelIDOrScorecard() {
    return modelIDOrScorecard;
  }

  public void setModelIDOrScorecard(String modelIDOrScorecard) {
    this.modelIDOrScorecard = modelIDOrScorecard;
  }

  public ConsumerCreditReportModels scoreNumberOrMarketMaxIndustryCode(ConsumerCreditReportScoreNumberOrMarketMaxIndustryCode scoreNumberOrMarketMaxIndustryCode) {
    this.scoreNumberOrMarketMaxIndustryCode = scoreNumberOrMarketMaxIndustryCode;
    return this;
  }

  /**
   * Get scoreNumberOrMarketMaxIndustryCode
   * @return scoreNumberOrMarketMaxIndustryCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportScoreNumberOrMarketMaxIndustryCode getScoreNumberOrMarketMaxIndustryCode() {
    return scoreNumberOrMarketMaxIndustryCode;
  }

  public void setScoreNumberOrMarketMaxIndustryCode(ConsumerCreditReportScoreNumberOrMarketMaxIndustryCode scoreNumberOrMarketMaxIndustryCode) {
    this.scoreNumberOrMarketMaxIndustryCode = scoreNumberOrMarketMaxIndustryCode;
  }

  public ConsumerCreditReportModels numericScoreIndicator(String numericScoreIndicator) {
    this.numericScoreIndicator = numericScoreIndicator;
    return this;
  }

  /**
   * Indicates whether the score is positive or negative
   * @return numericScoreIndicator
  **/
  @ApiModelProperty(value = "Indicates whether the score is positive or negative")
  
  @Size(max=1)   public String getNumericScoreIndicator() {
    return numericScoreIndicator;
  }

  public void setNumericScoreIndicator(String numericScoreIndicator) {
    this.numericScoreIndicator = numericScoreIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportModels consumerCreditReportModels = (ConsumerCreditReportModels) o;
    return Objects.equals(this.type, consumerCreditReportModels.type) &&
        Objects.equals(this.modelNumber, consumerCreditReportModels.modelNumber) &&
        Objects.equals(this.fiCOScoreIndicatorCode, consumerCreditReportModels.fiCOScoreIndicatorCode) &&
        Objects.equals(this.score, consumerCreditReportModels.score) &&
        Objects.equals(this.reasons, consumerCreditReportModels.reasons) &&
        Objects.equals(this.inquiryKeyFactor, consumerCreditReportModels.inquiryKeyFactor) &&
        Objects.equals(this.riskBasedPricingOrModel, consumerCreditReportModels.riskBasedPricingOrModel) &&
        Objects.equals(this.rejects, consumerCreditReportModels.rejects) &&
        Objects.equals(this.edASRegionalIndicatorCode, consumerCreditReportModels.edASRegionalIndicatorCode) &&
        Objects.equals(this.edASIndicatorCode, consumerCreditReportModels.edASIndicatorCode) &&
        Objects.equals(this.modelIDOrScorecard, consumerCreditReportModels.modelIDOrScorecard) &&
        Objects.equals(this.scoreNumberOrMarketMaxIndustryCode, consumerCreditReportModels.scoreNumberOrMarketMaxIndustryCode) &&
        Objects.equals(this.numericScoreIndicator, consumerCreditReportModels.numericScoreIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, modelNumber, fiCOScoreIndicatorCode, score, reasons, inquiryKeyFactor, riskBasedPricingOrModel, rejects, edASRegionalIndicatorCode, edASIndicatorCode, modelIDOrScorecard, scoreNumberOrMarketMaxIndustryCode, numericScoreIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportModels {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    fiCOScoreIndicatorCode: ").append(toIndentedString(fiCOScoreIndicatorCode)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    inquiryKeyFactor: ").append(toIndentedString(inquiryKeyFactor)).append("\n");
    sb.append("    riskBasedPricingOrModel: ").append(toIndentedString(riskBasedPricingOrModel)).append("\n");
    sb.append("    rejects: ").append(toIndentedString(rejects)).append("\n");
    sb.append("    edASRegionalIndicatorCode: ").append(toIndentedString(edASRegionalIndicatorCode)).append("\n");
    sb.append("    edASIndicatorCode: ").append(toIndentedString(edASIndicatorCode)).append("\n");
    sb.append("    modelIDOrScorecard: ").append(toIndentedString(modelIDOrScorecard)).append("\n");
    sb.append("    scoreNumberOrMarketMaxIndustryCode: ").append(toIndentedString(scoreNumberOrMarketMaxIndustryCode)).append("\n");
    sb.append("    numericScoreIndicator: ").append(toIndentedString(numericScoreIndicator)).append("\n");
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
