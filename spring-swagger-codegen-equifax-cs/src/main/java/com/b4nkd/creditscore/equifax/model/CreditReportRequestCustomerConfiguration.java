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
 * Configurations related to the credit report being requested
 */
@ApiModel(description = "Configurations related to the credit report being requested")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequestCustomerConfiguration   {
  @JsonProperty("equifaxUSConsumerCreditReport")
  private AllOfCreditReportRequestCustomerConfigurationEquifaxUSConsumerCreditReport equifaxUSConsumerCreditReport = null;

  public CreditReportRequestCustomerConfiguration equifaxUSConsumerCreditReport(AllOfCreditReportRequestCustomerConfigurationEquifaxUSConsumerCreditReport equifaxUSConsumerCreditReport) {
    this.equifaxUSConsumerCreditReport = equifaxUSConsumerCreditReport;
    return this;
  }

  /**
   * Get equifaxUSConsumerCreditReport
   * @return equifaxUSConsumerCreditReport
  **/
  @ApiModelProperty(value = "")
  
    public AllOfCreditReportRequestCustomerConfigurationEquifaxUSConsumerCreditReport getEquifaxUSConsumerCreditReport() {
    return equifaxUSConsumerCreditReport;
  }

  public void setEquifaxUSConsumerCreditReport(AllOfCreditReportRequestCustomerConfigurationEquifaxUSConsumerCreditReport equifaxUSConsumerCreditReport) {
    this.equifaxUSConsumerCreditReport = equifaxUSConsumerCreditReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportRequestCustomerConfiguration creditReportRequestCustomerConfiguration = (CreditReportRequestCustomerConfiguration) o;
    return Objects.equals(this.equifaxUSConsumerCreditReport, creditReportRequestCustomerConfiguration.equifaxUSConsumerCreditReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equifaxUSConsumerCreditReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequestCustomerConfiguration {\n");
    
    sb.append("    equifaxUSConsumerCreditReport: ").append(toIndentedString(equifaxUSConsumerCreditReport)).append("\n");
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
