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
 * FICO Score Indicator
 */
@ApiModel(description = "FICO Score Indicator")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportFICOScoreIndicatorCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public ConsumerCreditReportFICOScoreIndicatorCode code(String code) {
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

  public ConsumerCreditReportFICOScoreIndicatorCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * NF = Non‐FACTA; F = FACTA version   - S: FICO® Score 9 based on Equifax Data (NF)   - 4: FICO® Auto Score 9 based on Equifax Data (NF)   - 8: FICO® Bankcard Score 9 based on Equifax Data (NF)   - V: FICO® Risk Score 9 based on Equifax Data (F)   - @: FICO® Auto Score 9 based on Equifax Data (F)   - $: FICO® Bankcard Score 9 based on Equifax Data (F)   - 9: FICO® Score 8 based on Equifax Data (NF)   - C: FICO® Auto Score 8 based on Equifax Data (NF)   - D: FICO® Bankcard Score 8 based on Equifax Data (NF)   - O: FICO® Mortgage Score 8 based on Equifax Data (NF)   - G: FICO® Score 8 based on Equifax Data (F)   - H: FICO® Auto Score 8 based on Equifax Data (F)   - X: FICO® Bankcard Score 8 based on Equifax Data (F)   - Q: FICO® Mortgage Score 8 based on Equifax Data (F)   - J: FICO® Score 5 based on Equifax Data (NF)   - K: FICO® Auto Score 5 based on Equifax Data (NF)   - L: FICO® Bankcard Score 5 based on Equifax Data (NF)   - M: FICO® Personal Finance Score 5 based on Equifax Data (NF)   - N: FICO® Installment Score 5 based on Equifax Data (NF)   - Z: FICO® Score 5 based on Equifax Data (F)   - R: FICO® Auto Score 5 based on Equifax Data (F)   - W: FICO® Bankcard Score 5 based on Equifax Data (F)   - U: FICO® Personal Finance Score 5 based on Equifax Data (F)   - P: FICO® Installment Score 5 based on Equifax Data (F)     
   * @return description
  **/
  @ApiModelProperty(value = "NF = Non‐FACTA; F = FACTA version   - S: FICO® Score 9 based on Equifax Data (NF)   - 4: FICO® Auto Score 9 based on Equifax Data (NF)   - 8: FICO® Bankcard Score 9 based on Equifax Data (NF)   - V: FICO® Risk Score 9 based on Equifax Data (F)   - @: FICO® Auto Score 9 based on Equifax Data (F)   - $: FICO® Bankcard Score 9 based on Equifax Data (F)   - 9: FICO® Score 8 based on Equifax Data (NF)   - C: FICO® Auto Score 8 based on Equifax Data (NF)   - D: FICO® Bankcard Score 8 based on Equifax Data (NF)   - O: FICO® Mortgage Score 8 based on Equifax Data (NF)   - G: FICO® Score 8 based on Equifax Data (F)   - H: FICO® Auto Score 8 based on Equifax Data (F)   - X: FICO® Bankcard Score 8 based on Equifax Data (F)   - Q: FICO® Mortgage Score 8 based on Equifax Data (F)   - J: FICO® Score 5 based on Equifax Data (NF)   - K: FICO® Auto Score 5 based on Equifax Data (NF)   - L: FICO® Bankcard Score 5 based on Equifax Data (NF)   - M: FICO® Personal Finance Score 5 based on Equifax Data (NF)   - N: FICO® Installment Score 5 based on Equifax Data (NF)   - Z: FICO® Score 5 based on Equifax Data (F)   - R: FICO® Auto Score 5 based on Equifax Data (F)   - W: FICO® Bankcard Score 5 based on Equifax Data (F)   - U: FICO® Personal Finance Score 5 based on Equifax Data (F)   - P: FICO® Installment Score 5 based on Equifax Data (F)     ")
  
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
    ConsumerCreditReportFICOScoreIndicatorCode consumerCreditReportFICOScoreIndicatorCode = (ConsumerCreditReportFICOScoreIndicatorCode) o;
    return Objects.equals(this.code, consumerCreditReportFICOScoreIndicatorCode.code) &&
        Objects.equals(this.description, consumerCreditReportFICOScoreIndicatorCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportFICOScoreIndicatorCode {\n");
    
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
