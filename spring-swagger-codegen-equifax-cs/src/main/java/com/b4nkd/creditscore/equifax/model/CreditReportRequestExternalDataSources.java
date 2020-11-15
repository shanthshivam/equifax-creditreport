package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.CreditReportRequestExternalDataSourcesAlternateDataSources;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditReportRequestExternalDataSources
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequestExternalDataSources   {
  @JsonProperty("alternateDataSources")
  private CreditReportRequestExternalDataSourcesAlternateDataSources alternateDataSources = null;

  public CreditReportRequestExternalDataSources alternateDataSources(CreditReportRequestExternalDataSourcesAlternateDataSources alternateDataSources) {
    this.alternateDataSources = alternateDataSources;
    return this;
  }

  /**
   * Get alternateDataSources
   * @return alternateDataSources
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CreditReportRequestExternalDataSourcesAlternateDataSources getAlternateDataSources() {
    return alternateDataSources;
  }

  public void setAlternateDataSources(CreditReportRequestExternalDataSourcesAlternateDataSources alternateDataSources) {
    this.alternateDataSources = alternateDataSources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportRequestExternalDataSources creditReportRequestExternalDataSources = (CreditReportRequestExternalDataSources) o;
    return Objects.equals(this.alternateDataSources, creditReportRequestExternalDataSources.alternateDataSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateDataSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequestExternalDataSources {\n");
    
    sb.append("    alternateDataSources: ").append(toIndentedString(alternateDataSources)).append("\n");
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
