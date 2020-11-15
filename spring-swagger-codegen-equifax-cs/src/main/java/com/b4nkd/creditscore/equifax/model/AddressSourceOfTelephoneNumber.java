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
 * Source of Telephone data
 */
@ApiModel(description = "Source of Telephone data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class AddressSourceOfTelephoneNumber   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public AddressSourceOfTelephoneNumber code(String code) {
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

  public AddressSourceOfTelephoneNumber description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Sources of telephone number:   - 1: Special Vendor        - 2: Equifax        - 3: OTH/Sys-Sys        - 4: Automated Update Indicator 
   * @return description
  **/
  @ApiModelProperty(value = "Sources of telephone number:   - 1: Special Vendor        - 2: Equifax        - 3: OTH/Sys-Sys        - 4: Automated Update Indicator ")
  
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
    AddressSourceOfTelephoneNumber addressSourceOfTelephoneNumber = (AddressSourceOfTelephoneNumber) o;
    return Objects.equals(this.code, addressSourceOfTelephoneNumber.code) &&
        Objects.equals(this.description, addressSourceOfTelephoneNumber.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressSourceOfTelephoneNumber {\n");
    
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
