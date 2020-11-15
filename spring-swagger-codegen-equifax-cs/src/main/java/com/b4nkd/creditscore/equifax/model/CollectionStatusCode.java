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
 * Current status of the collection
 */
@ApiModel(description = "Current status of the collection")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CollectionStatusCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public CollectionStatusCode code(String code) {
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

  public CollectionStatusCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * - D: UNPAID Subject has not satisfied debt. - F: FINANCIAL COUNSELOR Identifies that a subject is receiving professional guidance on financial matters, and is under a payment plan. - J: ADJUSTMENT Settlement of a debt in which full payment is not made or when the amount involved is not certain. - M: WAGE EARNER Chapter 13 (Debtors with regular income). This chapter allows an individual to reorganize finances and protect assets while a court approved repayment plan is in effect. - N: NEW LISTING Collection account which has just been turned over for collection of past due debt. - P: PAID Subject has satisfied debt. - S: ACCOUNT DISPUTED Merchant and consumer disagree on various particulars regarding merchandise, terms of agreement or amount owing. - T: PAYMENT Subject submits portion of money owing. - U: STATUS UNKNOWN Indicates status is not verified. - X: CHECKED As of the date reported, the balance was not paid and the account was verified at the request of the consumer via a dispute. - Z: IN BANKRUPTCY The legal process under the Federal Bankruptcy Act by which debtors are granted some form of relief from their financial obligations. 
   * @return description
  **/
  @ApiModelProperty(value = "- D: UNPAID Subject has not satisfied debt. - F: FINANCIAL COUNSELOR Identifies that a subject is receiving professional guidance on financial matters, and is under a payment plan. - J: ADJUSTMENT Settlement of a debt in which full payment is not made or when the amount involved is not certain. - M: WAGE EARNER Chapter 13 (Debtors with regular income). This chapter allows an individual to reorganize finances and protect assets while a court approved repayment plan is in effect. - N: NEW LISTING Collection account which has just been turned over for collection of past due debt. - P: PAID Subject has satisfied debt. - S: ACCOUNT DISPUTED Merchant and consumer disagree on various particulars regarding merchandise, terms of agreement or amount owing. - T: PAYMENT Subject submits portion of money owing. - U: STATUS UNKNOWN Indicates status is not verified. - X: CHECKED As of the date reported, the balance was not paid and the account was verified at the request of the consumer via a dispute. - Z: IN BANKRUPTCY The legal process under the Federal Bankruptcy Act by which debtors are granted some form of relief from their financial obligations. ")
  
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
    CollectionStatusCode collectionStatusCode = (CollectionStatusCode) o;
    return Objects.equals(this.code, collectionStatusCode.code) &&
        Objects.equals(this.description, collectionStatusCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionStatusCode {\n");
    
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
