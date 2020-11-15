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
 * Describes the error
 */
@ApiModel(description = "Describes the error")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlternateDataSourcesErrorCodes   {
  @JsonProperty("verbiage")
  private String verbiage = null;

  @JsonProperty("errorText")
  private String errorText = null;

  public ConsumerCreditReportAlternateDataSourcesErrorCodes verbiage(String verbiage) {
    this.verbiage = verbiage;
    return this;
  }

  /**
   * Verbiage returned for error code
   * @return verbiage
  **/
  @ApiModelProperty(value = "Verbiage returned for error code")
  
  @Size(max=26)   public String getVerbiage() {
    return verbiage;
  }

  public void setVerbiage(String verbiage) {
    this.verbiage = verbiage;
  }

  public ConsumerCreditReportAlternateDataSourcesErrorCodes errorText(String errorText) {
    this.errorText = errorText;
    return this;
  }

  /**
   * Error description
   * @return errorText
  **/
  @ApiModelProperty(value = "Error description")
  
  @Size(max=80)   public String getErrorText() {
    return errorText;
  }

  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlternateDataSourcesErrorCodes consumerCreditReportAlternateDataSourcesErrorCodes = (ConsumerCreditReportAlternateDataSourcesErrorCodes) o;
    return Objects.equals(this.verbiage, consumerCreditReportAlternateDataSourcesErrorCodes.verbiage) &&
        Objects.equals(this.errorText, consumerCreditReportAlternateDataSourcesErrorCodes.errorText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verbiage, errorText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlternateDataSourcesErrorCodes {\n");
    
    sb.append("    verbiage: ").append(toIndentedString(verbiage)).append("\n");
    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
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
