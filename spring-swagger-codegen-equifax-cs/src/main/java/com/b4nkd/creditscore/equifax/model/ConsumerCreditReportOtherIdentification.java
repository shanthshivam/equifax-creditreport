package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportReasonCode;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportTypeCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsumerCreditReportOtherIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportOtherIdentification   {
  @JsonProperty("dateReported")
  private String dateReported = null;

  @JsonProperty("typeCode")
  private ConsumerCreditReportTypeCode typeCode = null;

  @JsonProperty("identificationNumber")
  private String identificationNumber = null;

  @JsonProperty("reasonCode")
  private ConsumerCreditReportReasonCode reasonCode = null;

  public ConsumerCreditReportOtherIdentification dateReported(String dateReported) {
    this.dateReported = dateReported;
    return this;
  }

  /**
   * Get dateReported
   * @return dateReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateReported() {
    return dateReported;
  }

  public void setDateReported(String dateReported) {
    this.dateReported = dateReported;
  }

  public ConsumerCreditReportOtherIdentification typeCode(ConsumerCreditReportTypeCode typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Get typeCode
   * @return typeCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportTypeCode getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(ConsumerCreditReportTypeCode typeCode) {
    this.typeCode = typeCode;
  }

  public ConsumerCreditReportOtherIdentification identificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
    return this;
  }

  /**
   * Identification number
   * @return identificationNumber
  **/
  @ApiModelProperty(value = "Identification number")
  
  @Size(max=35)   public String getIdentificationNumber() {
    return identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }

  public ConsumerCreditReportOtherIdentification reasonCode(ConsumerCreditReportReasonCode reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerCreditReportReasonCode getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(ConsumerCreditReportReasonCode reasonCode) {
    this.reasonCode = reasonCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportOtherIdentification consumerCreditReportOtherIdentification = (ConsumerCreditReportOtherIdentification) o;
    return Objects.equals(this.dateReported, consumerCreditReportOtherIdentification.dateReported) &&
        Objects.equals(this.typeCode, consumerCreditReportOtherIdentification.typeCode) &&
        Objects.equals(this.identificationNumber, consumerCreditReportOtherIdentification.identificationNumber) &&
        Objects.equals(this.reasonCode, consumerCreditReportOtherIdentification.reasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateReported, typeCode, identificationNumber, reasonCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportOtherIdentification {\n");
    
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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
