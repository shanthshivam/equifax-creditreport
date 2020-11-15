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
 * The EDAS/FEDAS indicator
 */
@ApiModel(description = "The EDAS/FEDAS indicator")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportEDASIndicatorCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public ConsumerCreditReportEDASIndicatorCode code(String code) {
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

  public ConsumerCreditReportEDASIndicatorCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   *  - E: Enhanced DAS - F: FACTA EDAS Enhanced Delinquency Alert System (EDAS) and FACTA Enhanced Delinquency Alert System (EDAS) are optional products offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of the Enhanced Delinquency Alert System (EDAS) option you desire. 
   * @return description
  **/
  @ApiModelProperty(value = " - E: Enhanced DAS - F: FACTA EDAS Enhanced Delinquency Alert System (EDAS) and FACTA Enhanced Delinquency Alert System (EDAS) are optional products offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of the Enhanced Delinquency Alert System (EDAS) option you desire. ")
  
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
    ConsumerCreditReportEDASIndicatorCode consumerCreditReportEDASIndicatorCode = (ConsumerCreditReportEDASIndicatorCode) o;
    return Objects.equals(this.code, consumerCreditReportEDASIndicatorCode.code) &&
        Objects.equals(this.description, consumerCreditReportEDASIndicatorCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportEDASIndicatorCode {\n");
    
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
