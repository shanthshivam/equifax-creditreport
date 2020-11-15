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
 * Reflects how often payments are due
 */
@ApiModel(description = "Reflects how often payments are due")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class TradeTermsFrequencyCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public TradeTermsFrequencyCode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code value
   * @return code
  **/
  @ApiModelProperty(value = "Code value")
  
  @Size(max=1)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TradeTermsFrequencyCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * - B: Biweekly (due every 2 weeks) - D: Deferred - E: Semi-monthly (due twice a month) - L: Bi-monthly (due every 2 months) - M: Monthly (due every month) - P: Single Payment Loan - Q: Quarterly (due every 3 months) - S: Semi-annually (due twice a year) - T: Tri-annually (due every 4 months) - W: Weekly (due every week) - Y: Annually (due every year) 
   * @return description
  **/
  @ApiModelProperty(value = "- B: Biweekly (due every 2 weeks) - D: Deferred - E: Semi-monthly (due twice a month) - L: Bi-monthly (due every 2 months) - M: Monthly (due every month) - P: Single Payment Loan - Q: Quarterly (due every 3 months) - S: Semi-annually (due twice a year) - T: Tri-annually (due every 4 months) - W: Weekly (due every week) - Y: Annually (due every year) ")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeTermsFrequencyCode tradeTermsFrequencyCode = (TradeTermsFrequencyCode) o;
    return Objects.equals(this.code, tradeTermsFrequencyCode.code) &&
        Objects.equals(this.description, tradeTermsFrequencyCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeTermsFrequencyCode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
