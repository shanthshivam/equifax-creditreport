package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.OFACAlertsInner;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * It will contain data from the Compliance Data Center (CDC)  Multiple reports on the same consumer are not available with OFAC Alert. Only the first report is returned. OFAC Alert can be only returned with a Consumer Report and when a No‐Hit on the credit file occurs. 
 */
@ApiModel(description = "It will contain data from the Compliance Data Center (CDC)  Multiple reports on the same consumer are not available with OFAC Alert. Only the first report is returned. OFAC Alert can be only returned with a Consumer Report and when a No‐Hit on the credit file occurs. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class OFACAlerts extends ArrayList<OFACAlertsInner>  {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OFACAlerts {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
