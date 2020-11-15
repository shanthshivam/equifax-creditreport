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
 * Telephone number including a valid area code
 */
@ApiModel(description = "Telephone number including a valid area code")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportConsumerReferralLocationTelephoneNumber   {
  @JsonProperty("TelephoneNumber")
  private String telephoneNumber = null;

  public ConsumerCreditReportConsumerReferralLocationTelephoneNumber telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Get telephoneNumber
   * @return telephoneNumber
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=10)   public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportConsumerReferralLocationTelephoneNumber consumerCreditReportConsumerReferralLocationTelephoneNumber = (ConsumerCreditReportConsumerReferralLocationTelephoneNumber) o;
    return Objects.equals(this.telephoneNumber, consumerCreditReportConsumerReferralLocationTelephoneNumber.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportConsumerReferralLocationTelephoneNumber {\n");
    
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
