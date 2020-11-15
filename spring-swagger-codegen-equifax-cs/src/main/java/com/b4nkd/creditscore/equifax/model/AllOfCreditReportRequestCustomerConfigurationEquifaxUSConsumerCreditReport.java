package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.EquifaxUSConsumerCreditRequest;
import com.b4nkd.creditscore.equifax.model.EquifaxUSConsumerCreditRequestEndUserInformation;
import com.b4nkd.creditscore.equifax.model.EquifaxUSConsumerCreditRequestModels;
import com.b4nkd.creditscore.equifax.model.EquifaxUSConsumerCreditRequestProductInformation;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AllOfCreditReportRequestCustomerConfigurationEquifaxUSConsumerCreditReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class AllOfCreditReportRequestCustomerConfigurationEquifaxUSConsumerCreditReport extends EquifaxUSConsumerCreditRequest  {

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
    sb.append("class AllOfCreditReportRequestCustomerConfigurationEquifaxUSConsumerCreditReport {\n");
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
