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
 * Current status or rating of the account
 */
@ApiModel(description = "Current status or rating of the account")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class TradeRateStatusCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public TradeRateStatusCode code(String code) {
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

  public TradeRateStatusCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   *  - 0: Too new to rate; Approved but not used    : - 1: Pays account as agreed    : - 2: Not more than two payments past due    : - 3: Not more than three payments past due    : - 4: Not more than four payments past due    : - 5: At least 120 days or more than four payments past due    : - 6: Collection account (Enhanced Trade Only)    : - 7: Included in Chapter 13    : - 8: Repossession    : - 9: Charge-off - Blank: No rate reported 
   * @return description
  **/
  @ApiModelProperty(value = " - 0: Too new to rate; Approved but not used    : - 1: Pays account as agreed    : - 2: Not more than two payments past due    : - 3: Not more than three payments past due    : - 4: Not more than four payments past due    : - 5: At least 120 days or more than four payments past due    : - 6: Collection account (Enhanced Trade Only)    : - 7: Included in Chapter 13    : - 8: Repossession    : - 9: Charge-off - Blank: No rate reported ")
  
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
    TradeRateStatusCode tradeRateStatusCode = (TradeRateStatusCode) o;
    return Objects.equals(this.code, tradeRateStatusCode.code) &&
        Objects.equals(this.description, tradeRateStatusCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeRateStatusCode {\n");
    
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
