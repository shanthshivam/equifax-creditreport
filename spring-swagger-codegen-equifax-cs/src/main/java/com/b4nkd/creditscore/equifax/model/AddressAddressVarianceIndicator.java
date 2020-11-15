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
 * The Address Variance Indicator will alert you to the differences between the address submitted current and other addresses displayed on the consumer report.The Address Variance Indicator will return a code, for each address displayed on the report, informing you of the degree to which the first address submitted in the inquiry matched the address on the Equifax database. Address Variance Indicator is an optional feature offered by Equifax.  Please contact your Equifax Sales Associate for additional information and activation. 
 */
@ApiModel(description = "The Address Variance Indicator will alert you to the differences between the address submitted current and other addresses displayed on the consumer report.The Address Variance Indicator will return a code, for each address displayed on the report, informing you of the degree to which the first address submitted in the inquiry matched the address on the Equifax database. Address Variance Indicator is an optional feature offered by Equifax.  Please contact your Equifax Sales Associate for additional information and activation. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class AddressAddressVarianceIndicator   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public AddressAddressVarianceIndicator code(String code) {
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

  public AddressAddressVarianceIndicator description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
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
    AddressAddressVarianceIndicator addressAddressVarianceIndicator = (AddressAddressVarianceIndicator) o;
    return Objects.equals(this.code, addressAddressVarianceIndicator.code) &&
        Objects.equals(this.description, addressAddressVarianceIndicator.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressAddressVarianceIndicator {\n");
    
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
