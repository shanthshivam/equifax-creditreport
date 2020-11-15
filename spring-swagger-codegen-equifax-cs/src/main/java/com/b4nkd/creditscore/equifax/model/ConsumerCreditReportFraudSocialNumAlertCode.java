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
 * FraudIQ™ SSN Alert compares the inquiry social security number and returns a flag to alert customers
 */
@ApiModel(description = "FraudIQ™ SSN Alert compares the inquiry social security number and returns a flag to alert customers")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportFraudSocialNumAlertCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public ConsumerCreditReportFraudSocialNumAlertCode code(String code) {
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

  public ConsumerCreditReportFraudSocialNumAlertCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * FLAG FLAG VERBIAGE DESCRIPTION - A: Inquiry SSN is associated with another consumer - SSN Mismatch   The social security number provided in the inquiry matches   to another consumer on the Equifax database. A credit file   is returned for the consumer name and address provided,   however the social security number on that file is different   from the social security number provided on the inquiry.    - B: Inquiry SSN not present    Inquiry did not contain a social security number,    therefore no comparison can be made.      - N: No Alert available   The social security number provided in the inquiry    cannot be matched to a specific consumer based   on the Equifax proprietary comparison algorithm.    - P: Inquiry SSN is associated with the consumer   The social security number provided in the inquiry   matches to the requested consumer.    - V*: SSN affirm variation    Inquiry ssn has a slight variation with consumer.    The social security number provided in the inquiry   has a slight variation to the requested consumer.    - W: Inquiry SSN is associated with another consumer   The social security number provided in the inquiry   matches to another consumer in the Equifax database.    No credit file is available for the requested consumer.    - *: Optional code – requires that your Equifax Customer Number be activated to   be returned when encountered.   
   * @return description
  **/
  @ApiModelProperty(value = "FLAG FLAG VERBIAGE DESCRIPTION - A: Inquiry SSN is associated with another consumer - SSN Mismatch   The social security number provided in the inquiry matches   to another consumer on the Equifax database. A credit file   is returned for the consumer name and address provided,   however the social security number on that file is different   from the social security number provided on the inquiry.    - B: Inquiry SSN not present    Inquiry did not contain a social security number,    therefore no comparison can be made.      - N: No Alert available   The social security number provided in the inquiry    cannot be matched to a specific consumer based   on the Equifax proprietary comparison algorithm.    - P: Inquiry SSN is associated with the consumer   The social security number provided in the inquiry   matches to the requested consumer.    - V*: SSN affirm variation    Inquiry ssn has a slight variation with consumer.    The social security number provided in the inquiry   has a slight variation to the requested consumer.    - W: Inquiry SSN is associated with another consumer   The social security number provided in the inquiry   matches to another consumer in the Equifax database.    No credit file is available for the requested consumer.    - *: Optional code – requires that your Equifax Customer Number be activated to   be returned when encountered.   ")
  
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
    ConsumerCreditReportFraudSocialNumAlertCode consumerCreditReportFraudSocialNumAlertCode = (ConsumerCreditReportFraudSocialNumAlertCode) o;
    return Objects.equals(this.code, consumerCreditReportFraudSocialNumAlertCode.code) &&
        Objects.equals(this.description, consumerCreditReportFraudSocialNumAlertCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportFraudSocialNumAlertCode {\n");
    
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
