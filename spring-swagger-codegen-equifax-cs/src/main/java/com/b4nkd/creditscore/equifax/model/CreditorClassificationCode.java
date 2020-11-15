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
 * A general type of business for the original creditor and is only applicable for trades reported by Debt Buyers 
 */
@ApiModel(description = "A general type of business for the original creditor and is only applicable for trades reported by Debt Buyers ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditorClassificationCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public CreditorClassificationCode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code value
   * @return code
  **/
  @ApiModelProperty(value = "Code value")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CreditorClassificationCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Business type of original creditor   - 01: RETAIL   - 02: MEDICAL/HEALTH CARE   - 03: OIL COMPANY   - 04: GOVERNMENT   - 05: PERSONAL SERVICES   - 06: INSURANCE   - 07: EDUCATIONAL   - 08: BANKING   - 09: RENTAL/LEASING   - 10: UTILITIES   - 11: CABLE/CELLULAR   - 12: FINANCIAL   - 13: CREDIT UNION   - 14: AUTOMOTIVE   - 15: CHECK GUARANTEE    
   * @return description
  **/
  @ApiModelProperty(value = "Business type of original creditor   - 01: RETAIL   - 02: MEDICAL/HEALTH CARE   - 03: OIL COMPANY   - 04: GOVERNMENT   - 05: PERSONAL SERVICES   - 06: INSURANCE   - 07: EDUCATIONAL   - 08: BANKING   - 09: RENTAL/LEASING   - 10: UTILITIES   - 11: CABLE/CELLULAR   - 12: FINANCIAL   - 13: CREDIT UNION   - 14: AUTOMOTIVE   - 15: CHECK GUARANTEE    ")
  
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
    CreditorClassificationCode creditorClassificationCode = (CreditorClassificationCode) o;
    return Objects.equals(this.code, creditorClassificationCode.code) &&
        Objects.equals(this.description, creditorClassificationCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditorClassificationCode {\n");
    
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
