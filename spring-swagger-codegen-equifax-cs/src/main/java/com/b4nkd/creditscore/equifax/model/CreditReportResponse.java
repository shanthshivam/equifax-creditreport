package com.b4nkd.creditscore.equifax.model;

import java.io.Serializable;
import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReport;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditReportResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportResponse  implements Serializable {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("consumers")
  private ConsumerCreditReport consumers = null;

  public CreditReportResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Transaction status. It could include some comments related to the transaction
   * @return status
  **/
  @ApiModelProperty(example = "[\"completed\",\"completed === Request Schema Validation Error\"]", value = "Transaction status. It could include some comments related to the transaction")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CreditReportResponse consumers(ConsumerCreditReport consumers) {
    this.consumers = consumers;
    return this;
  }

  /**
   * Get consumers
   * @return consumers
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReport getConsumers() {
    return consumers;
  }

  public void setConsumers(ConsumerCreditReport consumers) {
    this.consumers = consumers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportResponse creditReportResponse = (CreditReportResponse) o;
    return Objects.equals(this.status, creditReportResponse.status) &&
        Objects.equals(this.consumers, creditReportResponse.consumers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, consumers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
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
