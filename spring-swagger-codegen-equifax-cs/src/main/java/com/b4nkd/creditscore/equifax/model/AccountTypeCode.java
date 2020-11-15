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
 * Codes describing the account type
 */
@ApiModel(description = "Codes describing the account type")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class AccountTypeCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public AccountTypeCode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code value
   * @return code
  **/
  @ApiModelProperty(value = "Code value")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AccountTypeCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Account Type Codes:   - 00: Auto   - 01: Unsecured   - 02: Secured   - 03: Partially Secured   - 04: Home Improvement   - 05: Federal Housing Administration Home Improvement   - 06: Installment Sales Contract   - 07: Charge Account   - 08: Real Estate   - 10: Business Loan - Individual is personally liable   - 11: Recreational Merchandise   - 12: Education Loan   - 13: Lease   - 14: Co-Maker Not Borrower (Retired 9-18-09)   - 15: Line of Credit   - 17: Manufactured Housing   - 18: Credit Card   - 19: Federal Housing Administration Real Estate Mortgage   - 20: Note Loan   - 21: Note Loan With Co-Maker   - 22: Secured By Household Goods   - 23: Secured By Household Goods/Collateral   - 25: Veteran’s Administration Real Estate Mortgage   - 26: Conventional Real Estate Mortgage   - 27: Real Estate Mortgage   - 29: Rental Agreement   - 34: Debt Counseling Service   - 37: Combined Credit Plan (represents two credit plans being reported as one account)   - 43: Debit Card (used when backed by a line of credit or overdraft protection)   - 47: Credit Line Secured   - 48: Collection Agency/Attorney   - 49: Insurance Claim Pending   - 50: Family Support   - 65: Government Unsecured Guaranteed Loan   - 66: Government Secured Guaranteed Loan   - 67: Government Unsecured Direct Loan   - 68: Government Secured Direct Loan   - 69: Government Grant   - 70: Government Overpayment   - 71: Government Fine   - 72: Government Fee for Services   - 73: Government Employee Advance   - 74: Government Miscellaneous Debt   - 75: Government Benefit   - 77: Returned Check   - 78: Installment Loan   - 85: Bi-Monthly Mortgage Payment (every other month)   - 87: Semi-Monthly Mortgage Payment (twice per month)   - 89: Home Equity Line of Credit   - 90: Medical Debt   - 91: Debt Consolidation   - 92: Utility Company   - 93: Child Support   - 94: Spouse Support   - 95: Attorney Fees   - 0A: Time Share Loan (a purchased time share)   - 1A: Lender Placed Insurance   - 2A: Secured Credit Card   - 3A: Auto Lease   - 5A: Real Estate (junior liens and non-purchase money first)   - 6A: Commercial Installment Loan (Individual personally liable; company is guarantor)   - 7A: Commercial Line of Credit (Individual personally liable; company is guarantor)   - 8A: Business Credit Card (Individual has primary responsibility)   - 9A: Secured Home Improvement   - 5B: Second Mortgage   - 6B: Commercial Mortgage Loan (Individual is personally liable; company is guarantor)   - 7B: Agricultural   - 8B: Deposit Related (overdrawn account)   - 9B: Business Line Personally Guaranteed   - 0C: Debt Buyer Account   - 1C: Household Goods   - 2C: US Department of Agriculture Real Estate Mortgage Loan   - 4D: Telecommunication/Cellular   - 6D: Home Equity   - 0F: Construction Loan   - 0G: Flexible Spending Credit Card    
   * @return description
  **/
  @ApiModelProperty(value = "Account Type Codes:   - 00: Auto   - 01: Unsecured   - 02: Secured   - 03: Partially Secured   - 04: Home Improvement   - 05: Federal Housing Administration Home Improvement   - 06: Installment Sales Contract   - 07: Charge Account   - 08: Real Estate   - 10: Business Loan - Individual is personally liable   - 11: Recreational Merchandise   - 12: Education Loan   - 13: Lease   - 14: Co-Maker Not Borrower (Retired 9-18-09)   - 15: Line of Credit   - 17: Manufactured Housing   - 18: Credit Card   - 19: Federal Housing Administration Real Estate Mortgage   - 20: Note Loan   - 21: Note Loan With Co-Maker   - 22: Secured By Household Goods   - 23: Secured By Household Goods/Collateral   - 25: Veteran’s Administration Real Estate Mortgage   - 26: Conventional Real Estate Mortgage   - 27: Real Estate Mortgage   - 29: Rental Agreement   - 34: Debt Counseling Service   - 37: Combined Credit Plan (represents two credit plans being reported as one account)   - 43: Debit Card (used when backed by a line of credit or overdraft protection)   - 47: Credit Line Secured   - 48: Collection Agency/Attorney   - 49: Insurance Claim Pending   - 50: Family Support   - 65: Government Unsecured Guaranteed Loan   - 66: Government Secured Guaranteed Loan   - 67: Government Unsecured Direct Loan   - 68: Government Secured Direct Loan   - 69: Government Grant   - 70: Government Overpayment   - 71: Government Fine   - 72: Government Fee for Services   - 73: Government Employee Advance   - 74: Government Miscellaneous Debt   - 75: Government Benefit   - 77: Returned Check   - 78: Installment Loan   - 85: Bi-Monthly Mortgage Payment (every other month)   - 87: Semi-Monthly Mortgage Payment (twice per month)   - 89: Home Equity Line of Credit   - 90: Medical Debt   - 91: Debt Consolidation   - 92: Utility Company   - 93: Child Support   - 94: Spouse Support   - 95: Attorney Fees   - 0A: Time Share Loan (a purchased time share)   - 1A: Lender Placed Insurance   - 2A: Secured Credit Card   - 3A: Auto Lease   - 5A: Real Estate (junior liens and non-purchase money first)   - 6A: Commercial Installment Loan (Individual personally liable; company is guarantor)   - 7A: Commercial Line of Credit (Individual personally liable; company is guarantor)   - 8A: Business Credit Card (Individual has primary responsibility)   - 9A: Secured Home Improvement   - 5B: Second Mortgage   - 6B: Commercial Mortgage Loan (Individual is personally liable; company is guarantor)   - 7B: Agricultural   - 8B: Deposit Related (overdrawn account)   - 9B: Business Line Personally Guaranteed   - 0C: Debt Buyer Account   - 1C: Household Goods   - 2C: US Department of Agriculture Real Estate Mortgage Loan   - 4D: Telecommunication/Cellular   - 6D: Home Equity   - 0F: Construction Loan   - 0G: Flexible Spending Credit Card    ")
  
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
    AccountTypeCode accountTypeCode = (AccountTypeCode) o;
    return Objects.equals(this.code, accountTypeCode.code) &&
        Objects.equals(this.description, accountTypeCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTypeCode {\n");
    
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
