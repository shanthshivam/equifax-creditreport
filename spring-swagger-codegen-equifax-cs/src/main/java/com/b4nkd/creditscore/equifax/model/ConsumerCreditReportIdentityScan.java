package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportIdentityScanAlertCodes;
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
 * It contains the FraudIQ Identity Scan Alert information.  FraudIQ Identity Scan Alert is an optional product offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of your Identity Scan Alert option. 
 */
@ApiModel(description = "It contains the FraudIQ Identity Scan Alert information.  FraudIQ Identity Scan Alert is an optional product offered by Equifax. Please contact your Equifax Sales Associate for additional information and activation of your Identity Scan Alert option. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportIdentityScan   {
  @JsonProperty("alertCodes")
  @Valid
  private List<ConsumerCreditReportIdentityScanAlertCodes> alertCodes = null;

  @JsonProperty("identityScanRegulated")
  private String identityScanRegulated = null;

  public ConsumerCreditReportIdentityScan alertCodes(List<ConsumerCreditReportIdentityScanAlertCodes> alertCodes) {
    this.alertCodes = alertCodes;
    return this;
  }

  public ConsumerCreditReportIdentityScan addAlertCodesItem(ConsumerCreditReportIdentityScanAlertCodes alertCodesItem) {
    if (this.alertCodes == null) {
      this.alertCodes = new ArrayList<ConsumerCreditReportIdentityScanAlertCodes>();
    }
    this.alertCodes.add(alertCodesItem);
    return this;
  }

  /**
   * It contains up to 15 Identity Scan Alert codes
   * @return alertCodes
  **/
  @ApiModelProperty(value = "It contains up to 15 Identity Scan Alert codes")
      @Valid
  @Size(max=15)   public List<ConsumerCreditReportIdentityScanAlertCodes> getAlertCodes() {
    return alertCodes;
  }

  public void setAlertCodes(List<ConsumerCreditReportIdentityScanAlertCodes> alertCodes) {
    this.alertCodes = alertCodes;
  }

  public ConsumerCreditReportIdentityScan identityScanRegulated(String identityScanRegulated) {
    this.identityScanRegulated = identityScanRegulated;
    return this;
  }

  /**
   * byte that distinguished ID Scan is Non-regulated
   * @return identityScanRegulated
  **/
  @ApiModelProperty(value = "byte that distinguished ID Scan is Non-regulated")
  
  @Size(max=1)   public String getIdentityScanRegulated() {
    return identityScanRegulated;
  }

  public void setIdentityScanRegulated(String identityScanRegulated) {
    this.identityScanRegulated = identityScanRegulated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportIdentityScan consumerCreditReportIdentityScan = (ConsumerCreditReportIdentityScan) o;
    return Objects.equals(this.alertCodes, consumerCreditReportIdentityScan.alertCodes) &&
        Objects.equals(this.identityScanRegulated, consumerCreditReportIdentityScan.identityScanRegulated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCodes, identityScanRegulated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportIdentityScan {\n");
    
    sb.append("    alertCodes: ").append(toIndentedString(alertCodes)).append("\n");
    sb.append("    identityScanRegulated: ").append(toIndentedString(identityScanRegulated)).append("\n");
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
