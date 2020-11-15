package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAlternateDataSourcesErrorCodes;
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
 * ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("errorCodes")
  @Valid
  private List<ConsumerCreditReportAlternateDataSourcesErrorCodes> errorCodes = null;

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code value
   * @return code
  **/
  @ApiModelProperty(value = "Code value")
  
  @Size(max=2)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description for the given code
   * @return description
  **/
  @ApiModelProperty(value = "Description for the given code")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode errorCodes(List<ConsumerCreditReportAlternateDataSourcesErrorCodes> errorCodes) {
    this.errorCodes = errorCodes;
    return this;
  }

  public ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode addErrorCodesItem(ConsumerCreditReportAlternateDataSourcesErrorCodes errorCodesItem) {
    if (this.errorCodes == null) {
      this.errorCodes = new ArrayList<ConsumerCreditReportAlternateDataSourcesErrorCodes>();
    }
    this.errorCodes.add(errorCodesItem);
    return this;
  }

  /**
   * Container for all the errors returned by the Alternate Data Sources
   * @return errorCodes
  **/
  @ApiModelProperty(value = "Container for all the errors returned by the Alternate Data Sources")
      @Valid
  @Size(max=4)   public List<ConsumerCreditReportAlternateDataSourcesErrorCodes> getErrorCodes() {
    return errorCodes;
  }

  public void setErrorCodes(List<ConsumerCreditReportAlternateDataSourcesErrorCodes> errorCodes) {
    this.errorCodes = errorCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode consumerCreditReportAlternateDataSourcesAlternateDataSourceCode = (ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode) o;
    return Objects.equals(this.code, consumerCreditReportAlternateDataSourcesAlternateDataSourceCode.code) &&
        Objects.equals(this.description, consumerCreditReportAlternateDataSourcesAlternateDataSourceCode.description) &&
        Objects.equals(this.errorCodes, consumerCreditReportAlternateDataSourcesAlternateDataSourceCode.errorCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, errorCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAlternateDataSourcesAlternateDataSourceCode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCodes: ").append(toIndentedString(errorCodes)).append("\n");
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
