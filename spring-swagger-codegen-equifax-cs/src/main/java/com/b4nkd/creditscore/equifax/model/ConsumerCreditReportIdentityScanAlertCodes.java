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
 * Describes the Identity Scan Alerts
 */
@ApiModel(description = "Describes the Identity Scan Alerts")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportIdentityScanAlertCodes   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public ConsumerCreditReportIdentityScanAlertCodes code(String code) {
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

  public ConsumerCreditReportIdentityScanAlertCodes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description for the given code   - A: INQUIRY SSN HAS NEVER BEEN ISSUED OR WAS ISSUED AFTER JUNE 2011   - B: INQUIRY SSN REPORTED AS MISUSED   - C: INQUIRY ADDRESS ASSOCIATED WITH MORE THAN ONE NAME OR SSN   - D: INQUIRY ADDRESS UNVERIFIABLE   - G: INQUIRY ADDRESS IS LISTED AS A U.S. POST OFFICE STREET ADDRESS   - H: INQUIRY ADDRESS IS LISTED AS A CAMPGROUND   - I: INQUIRY SSN ASSOCIATED WITH PERSON REPORTED AS DECEASED   - J: INQUIRY ADDRESS IS LISTED AS A HOTEL/MOTEL   - L: FRAUD VICTIM ALERT PRESENT IN DATABASE   - M: INQUIRY SSN ISSUED RECENTLY   - N: ACTIVE DUTY ALERT PRESENT IN DATABASE   - O: INQUIRY SSN ISSUED PRIOR TO INQUIRY DATE OF BIRTH   - P: INQUIRY ADDRESS IS LISTED AS A CORRECTIONAL INSTITUTION ADDRESS   - Q: INQUIRY SSN REPORTED AS DECEASED AND LAST NAME DOES NOT MATCH   - R: INQUIRY ADDRESS IS NOT ASSOCIATED WITH THIS CONSUMER NAME   - S: IDENTITY SCAN DID NOT DETECT ANY ALERTS   - W: INQUIRY ADDRESS IS LISTED AS A NON-RESIDENTIAL ADDRESS   - X: INQUIRY ADDRESS ASSOCIATED WITH REPORTED FRAUD   - Y: INQUIRY TELEPHONE NUMBER LISTED AS A COMMERCIAL PHONE   - Z: INQUIRY ADDRESS IS LISTED AS A MAIL RECEIVING SERVICE   - 0: INCOMPLETE SCAN - LIMITED DATA SOURCES AVAILABLE   - 1: INQUIRY ADDRESS IS LISTED AS A MULTI-DWELLING UNIT   - 2: INQUIRY ADDRESS HAS BEEN REPORTED AS MISUSED   - 4: INQUIRY SSN MAY BE A TAX ID NUMBER   - 5: INQUIRY TELEPHONE NUMBER MAY BELONG TO A MOBILE PHONE   - 7: UNABLE TO PERFORM SSN VALIDATION DUE TO INSUFFICIENT SSN INPUT   - 8: UNABLE TO PERFORM TELEPHONE VALIDATION DUE TO INSUFFICIENT TELEPHONE INPUT   - 9: INQUIRY SSN IS INVALID                                
   * @return description
  **/
  @ApiModelProperty(value = "Description for the given code   - A: INQUIRY SSN HAS NEVER BEEN ISSUED OR WAS ISSUED AFTER JUNE 2011   - B: INQUIRY SSN REPORTED AS MISUSED   - C: INQUIRY ADDRESS ASSOCIATED WITH MORE THAN ONE NAME OR SSN   - D: INQUIRY ADDRESS UNVERIFIABLE   - G: INQUIRY ADDRESS IS LISTED AS A U.S. POST OFFICE STREET ADDRESS   - H: INQUIRY ADDRESS IS LISTED AS A CAMPGROUND   - I: INQUIRY SSN ASSOCIATED WITH PERSON REPORTED AS DECEASED   - J: INQUIRY ADDRESS IS LISTED AS A HOTEL/MOTEL   - L: FRAUD VICTIM ALERT PRESENT IN DATABASE   - M: INQUIRY SSN ISSUED RECENTLY   - N: ACTIVE DUTY ALERT PRESENT IN DATABASE   - O: INQUIRY SSN ISSUED PRIOR TO INQUIRY DATE OF BIRTH   - P: INQUIRY ADDRESS IS LISTED AS A CORRECTIONAL INSTITUTION ADDRESS   - Q: INQUIRY SSN REPORTED AS DECEASED AND LAST NAME DOES NOT MATCH   - R: INQUIRY ADDRESS IS NOT ASSOCIATED WITH THIS CONSUMER NAME   - S: IDENTITY SCAN DID NOT DETECT ANY ALERTS   - W: INQUIRY ADDRESS IS LISTED AS A NON-RESIDENTIAL ADDRESS   - X: INQUIRY ADDRESS ASSOCIATED WITH REPORTED FRAUD   - Y: INQUIRY TELEPHONE NUMBER LISTED AS A COMMERCIAL PHONE   - Z: INQUIRY ADDRESS IS LISTED AS A MAIL RECEIVING SERVICE   - 0: INCOMPLETE SCAN - LIMITED DATA SOURCES AVAILABLE   - 1: INQUIRY ADDRESS IS LISTED AS A MULTI-DWELLING UNIT   - 2: INQUIRY ADDRESS HAS BEEN REPORTED AS MISUSED   - 4: INQUIRY SSN MAY BE A TAX ID NUMBER   - 5: INQUIRY TELEPHONE NUMBER MAY BELONG TO A MOBILE PHONE   - 7: UNABLE TO PERFORM SSN VALIDATION DUE TO INSUFFICIENT SSN INPUT   - 8: UNABLE TO PERFORM TELEPHONE VALIDATION DUE TO INSUFFICIENT TELEPHONE INPUT   - 9: INQUIRY SSN IS INVALID                                ")
  
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
    ConsumerCreditReportIdentityScanAlertCodes consumerCreditReportIdentityScanAlertCodes = (ConsumerCreditReportIdentityScanAlertCodes) o;
    return Objects.equals(this.code, consumerCreditReportIdentityScanAlertCodes.code) &&
        Objects.equals(this.description, consumerCreditReportIdentityScanAlertCodes.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportIdentityScanAlertCodes {\n");
    
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
