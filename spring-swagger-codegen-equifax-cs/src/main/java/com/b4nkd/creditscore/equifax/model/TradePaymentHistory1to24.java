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
 * TradePaymentHistory1to24
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class TradePaymentHistory1to24   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public TradePaymentHistory1to24 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=1)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TradePaymentHistory1to24 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The valid values for the standard 24, 36 and 48 Month Payment History are:    - Blank: not populated based on the Date Open (payment history will only be populated for each of the months that the account has been open)   - E: Zero balance and current account    - \\*: Rate/Status was not available for that month  - 2 – 6, 8 and 9 (See Rate/Status Codes for values)  - 6: Valid value for Payment History 
   * @return description
  **/
  @ApiModelProperty(value = "The valid values for the standard 24, 36 and 48 Month Payment History are:    - Blank: not populated based on the Date Open (payment history will only be populated for each of the months that the account has been open)   - E: Zero balance and current account    - \\*: Rate/Status was not available for that month  - 2 – 6, 8 and 9 (See Rate/Status Codes for values)  - 6: Valid value for Payment History ")
  
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
    TradePaymentHistory1to24 tradePaymentHistory1to24 = (TradePaymentHistory1to24) o;
    return Objects.equals(this.code, tradePaymentHistory1to24.code) &&
        Objects.equals(this.description, tradePaymentHistory1to24.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradePaymentHistory1to24 {\n");
    
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
