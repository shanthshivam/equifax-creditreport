package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.AdditionalErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * APIErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class APIErrorResponse   {
  @JsonProperty("efxErrorCode")
  private BigDecimal efxErrorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("additionalErrorDetails")
  private AdditionalErrorDetails additionalErrorDetails = null;

  public APIErrorResponse efxErrorCode(BigDecimal efxErrorCode) {
    this.efxErrorCode = efxErrorCode;
    return this;
  }

  /**
   * Error code
   * @return efxErrorCode
  **/
  @ApiModelProperty(required = true, value = "Error code")
      @NotNull

    @Valid
    public BigDecimal getEfxErrorCode() {
    return efxErrorCode;
  }

  public void setEfxErrorCode(BigDecimal efxErrorCode) {
    this.efxErrorCode = efxErrorCode;
  }

  public APIErrorResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public APIErrorResponse additionalErrorDetails(AdditionalErrorDetails additionalErrorDetails) {
    this.additionalErrorDetails = additionalErrorDetails;
    return this;
  }

  /**
   * Get additionalErrorDetails
   * @return additionalErrorDetails
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AdditionalErrorDetails getAdditionalErrorDetails() {
    return additionalErrorDetails;
  }

  public void setAdditionalErrorDetails(AdditionalErrorDetails additionalErrorDetails) {
    this.additionalErrorDetails = additionalErrorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIErrorResponse apIErrorResponse = (APIErrorResponse) o;
    return Objects.equals(this.efxErrorCode, apIErrorResponse.efxErrorCode) &&
        Objects.equals(this.description, apIErrorResponse.description) &&
        Objects.equals(this.additionalErrorDetails, apIErrorResponse.additionalErrorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(efxErrorCode, description, additionalErrorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIErrorResponse {\n");
    
    sb.append("    efxErrorCode: ").append(toIndentedString(efxErrorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    additionalErrorDetails: ").append(toIndentedString(additionalErrorDetails)).append("\n");
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
