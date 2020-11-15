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
 * Indicates the chapter type and the current status of the bankruptcy
 */
@ApiModel(description = "Indicates the chapter type and the current status of the bankruptcy")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class BankruptcyCurrentIntentOrDispositionCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public BankruptcyCurrentIntentOrDispositionCode code(String code) {
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

  public BankruptcyCurrentIntentOrDispositionCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Chapter types and current status: - A: DISCHARGED CH-7 The amount owed was included in the “order of relief.” Debtor no longer liable for debts listed in “order of relief.” - C: CH-13 FILED Adjustment of debts of an individual with consistent income. Debtor petitions the court for permission to pay a percent of his income over a period of years until debt is satisfied (usually not over three years). - D: CH-11 FILED Business Reorganization. Business debtor is granted relief from payment under terms of initial contract reorganization period. - E: DISMSD/CLSD CH11 Petition for reorganization of debt has been withdrawn by debtor or honored - subject liable for debts. - F: DISCHARGED CH-11 Petition by debtor for complete relief of all debts is honored. Debtor no longer liable for debts listed in “order of relief.” - G: CH-12 FILED The Chapter 12 plan applies only to family farmers who have regular annual incomes sufficient to make payments under a proposed plan. Payment under the plan must be completed in three years. In certain situations, payment of no longer than five years is permitted. - H: DISCHARGED CH-12 A discharge is entered after the completion of all payments under the plan. However, certain payments on some long term claims, which are due after the last payment under the plan, will continue after the date of discharge. - I: INVOLUNTARY CH-7 The debtor is forced into bankruptcy by the petition of a sufficient number of his creditors. - J: DISMSD/CLSD CH12 The court may dismiss the plan or terminate the plan for various reasons, including unreasonable delays, gross mismanagement, non payment of any fees and charges, failure to file a plan in a timely manner, failure to make timely payments required by a confirmed plan, denial of confirmation or request made for additional time, and so forth. - K: DISMSD/CLSD CH13 The petition by debtor for permission to pay a percent of his income over a period of years has been withdrawn by debtor or has not been followed by debtor. Debtor remains liable for his debts under initial terms of the contract. - L: DISCHARGED CH-13 Plan by debtor to pay percent of income over a period of years has been completed. Debtor no longer liable for debts listed in payment plan. - M: DISMSD/CLSD CH7 The bankruptcy petition has been withdrawn by or has not been honored by the court. Subject remains liable for his debts under the terms of the initial contract. - V: VOLUNTARY CH-7 Bankruptcy proceeding is initiated by the debtor's own petition to be declared bankrupt and have benefit of the law. 
   * @return description
  **/
  @ApiModelProperty(value = "Chapter types and current status: - A: DISCHARGED CH-7 The amount owed was included in the “order of relief.” Debtor no longer liable for debts listed in “order of relief.” - C: CH-13 FILED Adjustment of debts of an individual with consistent income. Debtor petitions the court for permission to pay a percent of his income over a period of years until debt is satisfied (usually not over three years). - D: CH-11 FILED Business Reorganization. Business debtor is granted relief from payment under terms of initial contract reorganization period. - E: DISMSD/CLSD CH11 Petition for reorganization of debt has been withdrawn by debtor or honored - subject liable for debts. - F: DISCHARGED CH-11 Petition by debtor for complete relief of all debts is honored. Debtor no longer liable for debts listed in “order of relief.” - G: CH-12 FILED The Chapter 12 plan applies only to family farmers who have regular annual incomes sufficient to make payments under a proposed plan. Payment under the plan must be completed in three years. In certain situations, payment of no longer than five years is permitted. - H: DISCHARGED CH-12 A discharge is entered after the completion of all payments under the plan. However, certain payments on some long term claims, which are due after the last payment under the plan, will continue after the date of discharge. - I: INVOLUNTARY CH-7 The debtor is forced into bankruptcy by the petition of a sufficient number of his creditors. - J: DISMSD/CLSD CH12 The court may dismiss the plan or terminate the plan for various reasons, including unreasonable delays, gross mismanagement, non payment of any fees and charges, failure to file a plan in a timely manner, failure to make timely payments required by a confirmed plan, denial of confirmation or request made for additional time, and so forth. - K: DISMSD/CLSD CH13 The petition by debtor for permission to pay a percent of his income over a period of years has been withdrawn by debtor or has not been followed by debtor. Debtor remains liable for his debts under initial terms of the contract. - L: DISCHARGED CH-13 Plan by debtor to pay percent of income over a period of years has been completed. Debtor no longer liable for debts listed in payment plan. - M: DISMSD/CLSD CH7 The bankruptcy petition has been withdrawn by or has not been honored by the court. Subject remains liable for his debts under the terms of the initial contract. - V: VOLUNTARY CH-7 Bankruptcy proceeding is initiated by the debtor's own petition to be declared bankrupt and have benefit of the law. ")
  
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
    BankruptcyCurrentIntentOrDispositionCode bankruptcyCurrentIntentOrDispositionCode = (BankruptcyCurrentIntentOrDispositionCode) o;
    return Objects.equals(this.code, bankruptcyCurrentIntentOrDispositionCode.code) &&
        Objects.equals(this.description, bankruptcyCurrentIntentOrDispositionCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankruptcyCurrentIntentOrDispositionCode {\n");
    
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
