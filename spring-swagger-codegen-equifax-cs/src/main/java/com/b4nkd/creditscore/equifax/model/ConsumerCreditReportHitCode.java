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
 * Hit code
 */
@ApiModel(description = "Hit code")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportHitCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public ConsumerCreditReportHitCode code(String code) {
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

  public ConsumerCreditReportHitCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * - 1: Hit - 2: No-Hit - 3: Manual File (Returned if credit report has been designated by Equifax as manual return only or in response to an on-line prescreen transaction when the file contains a promo block.) - 4: Manual File Review Required - Due to reasons such as unable to deliver Consumer Narrative(s), Fraud/Active Duty Alert(s), or Address Discrepancy Indicator - 5: Referred File (File is under review or file is being referred to another) - 6: Hit and Automated Consumer Narrative - 7: Fraud/Verification Product Being Requested Without Requesting a Credit File - 8: \"Thin File\" when using Fraud/Verification Products - 9: No-Hit/Auto-DTEC** - A: Consumer Requested Security Freeze on His/Her Credit File Report Unavailable (See Attachment 15 Legislative Information) - C: No-Hit With Information From Additional Data Source(s) Returned - D: Manual File With Information From Additional Data Source(s) Returned - E: Manual Consumer Narrative With Information From Additional Data Source(s) Returned - F: Referred File With Information from Additional Data Source(s) Returned - G: Consumer Requested Security Freeze on His/Her Credit File – Report Unavailable With Information From Additional Data Source(s) Returned (except MarketMax)  - I*: Information from your inquiry has been identified as potentially fraudulent or misused, therefore the credit report is not available for delivery  - J*: Information from your inquiry has been identified as potentially fraudulent or misused, therefore the credit report is not available for delivery – with information from additional data source(s) returned - L*: Consumer Requested Equifax Lock on His/Her Credit File – Report Unavailable - M*: Consumer Requested Equifax Lock on His/Her Credit File – Report Unavailable With Information From Additional Data Source(s) Returned - T: Additional data source being returned without requesting a consumer report  - *:Optional Hit Codes require your customer number to be activated through your Sales Representative. 
   * @return description
  **/
  @ApiModelProperty(value = "- 1: Hit - 2: No-Hit - 3: Manual File (Returned if credit report has been designated by Equifax as manual return only or in response to an on-line prescreen transaction when the file contains a promo block.) - 4: Manual File Review Required - Due to reasons such as unable to deliver Consumer Narrative(s), Fraud/Active Duty Alert(s), or Address Discrepancy Indicator - 5: Referred File (File is under review or file is being referred to another) - 6: Hit and Automated Consumer Narrative - 7: Fraud/Verification Product Being Requested Without Requesting a Credit File - 8: \"Thin File\" when using Fraud/Verification Products - 9: No-Hit/Auto-DTEC** - A: Consumer Requested Security Freeze on His/Her Credit File Report Unavailable (See Attachment 15 Legislative Information) - C: No-Hit With Information From Additional Data Source(s) Returned - D: Manual File With Information From Additional Data Source(s) Returned - E: Manual Consumer Narrative With Information From Additional Data Source(s) Returned - F: Referred File With Information from Additional Data Source(s) Returned - G: Consumer Requested Security Freeze on His/Her Credit File – Report Unavailable With Information From Additional Data Source(s) Returned (except MarketMax)  - I*: Information from your inquiry has been identified as potentially fraudulent or misused, therefore the credit report is not available for delivery  - J*: Information from your inquiry has been identified as potentially fraudulent or misused, therefore the credit report is not available for delivery – with information from additional data source(s) returned - L*: Consumer Requested Equifax Lock on His/Her Credit File – Report Unavailable - M*: Consumer Requested Equifax Lock on His/Her Credit File – Report Unavailable With Information From Additional Data Source(s) Returned - T: Additional data source being returned without requesting a consumer report  - *:Optional Hit Codes require your customer number to be activated through your Sales Representative. ")
  
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
    ConsumerCreditReportHitCode consumerCreditReportHitCode = (ConsumerCreditReportHitCode) o;
    return Objects.equals(this.code, consumerCreditReportHitCode.code) &&
        Objects.equals(this.description, consumerCreditReportHitCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportHitCode {\n");
    
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
