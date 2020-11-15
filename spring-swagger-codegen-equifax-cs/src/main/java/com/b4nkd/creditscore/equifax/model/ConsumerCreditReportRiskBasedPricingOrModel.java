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
 * ConsumerCreditReportRiskBasedPricingOrModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportRiskBasedPricingOrModel   {
  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("lowRange")
  private String lowRange = null;

  @JsonProperty("highRange")
  private String highRange = null;

  public ConsumerCreditReportRiskBasedPricingOrModel percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage of the U.S. population that the Consumers Score for this model scores
   * @return percentage
  **/
  @ApiModelProperty(value = "Percentage of the U.S. population that the Consumers Score for this model scores")
  
  @Size(max=5)   public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public ConsumerCreditReportRiskBasedPricingOrModel lowRange(String lowRange) {
    this.lowRange = lowRange;
    return this;
  }

  /**
   * Dodd Frank Wall Street Lowest Score available on the model requested
   * @return lowRange
  **/
  @ApiModelProperty(value = "Dodd Frank Wall Street Lowest Score available on the model requested")
  
  @Size(max=5)   public String getLowRange() {
    return lowRange;
  }

  public void setLowRange(String lowRange) {
    this.lowRange = lowRange;
  }

  public ConsumerCreditReportRiskBasedPricingOrModel highRange(String highRange) {
    this.highRange = highRange;
    return this;
  }

  /**
   * Dodd Frank Wall Street Highest Score available on the model requested
   * @return highRange
  **/
  @ApiModelProperty(value = "Dodd Frank Wall Street Highest Score available on the model requested")
  
  @Size(max=5)   public String getHighRange() {
    return highRange;
  }

  public void setHighRange(String highRange) {
    this.highRange = highRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportRiskBasedPricingOrModel consumerCreditReportRiskBasedPricingOrModel = (ConsumerCreditReportRiskBasedPricingOrModel) o;
    return Objects.equals(this.percentage, consumerCreditReportRiskBasedPricingOrModel.percentage) &&
        Objects.equals(this.lowRange, consumerCreditReportRiskBasedPricingOrModel.lowRange) &&
        Objects.equals(this.highRange, consumerCreditReportRiskBasedPricingOrModel.highRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, lowRange, highRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportRiskBasedPricingOrModel {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    lowRange: ").append(toIndentedString(lowRange)).append("\n");
    sb.append("    highRange: ").append(toIndentedString(highRange)).append("\n");
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
