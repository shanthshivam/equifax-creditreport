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
 * Indicates fraud victim alert type
 */
@ApiModel(description = "Indicates fraud victim alert type")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportFraudVictimIndicator   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public ConsumerCreditReportFraudVictimIndicator code(String code) {
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

  public ConsumerCreditReportFraudVictimIndicator description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The following indicator codes can be returned in the Header segment:    - N: Active Duty Alert    - Q: Active Duty Alert with Fraud Victim “Initial Alert”    - R: Active Duty Alert with Fraud Victim T (police report)    - T: Fraud Victim (associated with trade)    - V: Fraud Victim “Initial Alert”    - W: Active Duty Alert with Fraud Victim “Extended Alert”    - X: Fraud Victim “Extended Alert”  Consumers or their representatives may request that an Initial Fraud Alert or, if the consumer is a member of the military on active duty, an Active Duty Alert be placed on their credit file. The Initial Fraud Alert will remain on the credit file for one year (366 days); the Active Duty Alert will remain on file for twelve months. Equifax will return an “N”, “Q”, or “V”, as applicable, in the Header segment. A user receiving a report containing an Initial Fraud Alert or Active Duty Alert may not grant credit without first determining the identity of the person making the request. If the consumer has provided a telephone number, it will be returned in a second Consumer Narrative Statement segment or Alert Contact segment and must be used for identity verification purposes before granting credit. 
   * @return description
  **/
  @ApiModelProperty(value = "The following indicator codes can be returned in the Header segment:    - N: Active Duty Alert    - Q: Active Duty Alert with Fraud Victim “Initial Alert”    - R: Active Duty Alert with Fraud Victim T (police report)    - T: Fraud Victim (associated with trade)    - V: Fraud Victim “Initial Alert”    - W: Active Duty Alert with Fraud Victim “Extended Alert”    - X: Fraud Victim “Extended Alert”  Consumers or their representatives may request that an Initial Fraud Alert or, if the consumer is a member of the military on active duty, an Active Duty Alert be placed on their credit file. The Initial Fraud Alert will remain on the credit file for one year (366 days); the Active Duty Alert will remain on file for twelve months. Equifax will return an “N”, “Q”, or “V”, as applicable, in the Header segment. A user receiving a report containing an Initial Fraud Alert or Active Duty Alert may not grant credit without first determining the identity of the person making the request. If the consumer has provided a telephone number, it will be returned in a second Consumer Narrative Statement segment or Alert Contact segment and must be used for identity verification purposes before granting credit. ")
  
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
    ConsumerCreditReportFraudVictimIndicator consumerCreditReportFraudVictimIndicator = (ConsumerCreditReportFraudVictimIndicator) o;
    return Objects.equals(this.code, consumerCreditReportFraudVictimIndicator.code) &&
        Objects.equals(this.description, consumerCreditReportFraudVictimIndicator.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportFraudVictimIndicator {\n");
    
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
