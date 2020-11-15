package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ErrorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Additional error details
 */
@ApiModel(description = "Additional error details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class AdditionalErrorDetails   {
  @JsonProperty("status")
  private BigDecimal status = null;

  @JsonProperty("errors")
  private ErrorResponse errors = null;

  @JsonProperty("code")
  private BigDecimal code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("timeStamp")
  private String timeStamp = null;

  public AdditionalErrorDetails status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code
   * @return status
  **/
  @ApiModelProperty(required = true, value = "HTTP status code")
      @NotNull

    @Valid
    public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public AdditionalErrorDetails errors(ErrorResponse errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ErrorResponse getErrors() {
    return errors;
  }

  public void setErrors(ErrorResponse errors) {
    this.errors = errors;
  }

  public AdditionalErrorDetails code(BigDecimal code) {
    this.code = code;
    return this;
  }

  /**
   * Internal code to identify the error
   * @return code
  **/
  @ApiModelProperty(value = "Internal code to identify the error")
  
    @Valid
    public BigDecimal getCode() {
    return code;
  }

  public void setCode(BigDecimal code) {
    this.code = code;
  }

  public AdditionalErrorDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Short error message
   * @return message
  **/
  @ApiModelProperty(value = "Short error message")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AdditionalErrorDetails timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Date and time when the error occurred
   * @return timeStamp
  **/
  @ApiModelProperty(value = "Date and time when the error occurred")
  
    public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalErrorDetails additionalErrorDetails = (AdditionalErrorDetails) o;
    return Objects.equals(this.status, additionalErrorDetails.status) &&
        Objects.equals(this.errors, additionalErrorDetails.errors) &&
        Objects.equals(this.code, additionalErrorDetails.code) &&
        Objects.equals(this.message, additionalErrorDetails.message) &&
        Objects.equals(this.timeStamp, additionalErrorDetails.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errors, code, message, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalErrorDetails {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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
