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
 * Consumer relationship with account
 */
@ApiModel(description = "Consumer relationship with account")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class AccountDesignatorCode   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public AccountDesignatorCode code(String code) {
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

  public AccountDesignatorCode description(String description) {
    this.description = description;
    return this;
  }

  /**
   * - A: Authorized User – This is an authorized user of this account; another individual has contractual responsibility. - B: On behalf of another person – The subject has financial responsibility for an account, which is used exclusively by another person. - C: Co-maker – The subject has co-signed for a loan, and will be responsible for payment if the borrower should default. - I: Individual Account – The subject of the report has contractual responsibility for this account and is primarily responsible for its payment. - J: Joint Account – The subject and another person (or persons) are jointly responsible for payment on this account. - M: Maker – The subject is responsible for payment of a loan, but a co-maker will be responsible for payment if maker defaults. - S: Shared, but otherwise undesignated – This code is an indication that the credit grantor knows that the subject and at least one other person share the account, but not enough information is available to designate the account as “J” or “A”. - T: Terminated – The subject’s relationship to this account has ended, although other parties who once shared the account may continue to maintain the account. - U: Undesignated - X: Deceased (Not returned on Trade Lines) 
   * @return description
  **/
  @ApiModelProperty(value = "- A: Authorized User – This is an authorized user of this account; another individual has contractual responsibility. - B: On behalf of another person – The subject has financial responsibility for an account, which is used exclusively by another person. - C: Co-maker – The subject has co-signed for a loan, and will be responsible for payment if the borrower should default. - I: Individual Account – The subject of the report has contractual responsibility for this account and is primarily responsible for its payment. - J: Joint Account – The subject and another person (or persons) are jointly responsible for payment on this account. - M: Maker – The subject is responsible for payment of a loan, but a co-maker will be responsible for payment if maker defaults. - S: Shared, but otherwise undesignated – This code is an indication that the credit grantor knows that the subject and at least one other person share the account, but not enough information is available to designate the account as “J” or “A”. - T: Terminated – The subject’s relationship to this account has ended, although other parties who once shared the account may continue to maintain the account. - U: Undesignated - X: Deceased (Not returned on Trade Lines) ")
  
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
    AccountDesignatorCode accountDesignatorCode = (AccountDesignatorCode) o;
    return Objects.equals(this.code, accountDesignatorCode.code) &&
        Objects.equals(this.description, accountDesignatorCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDesignatorCode {\n");
    
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
