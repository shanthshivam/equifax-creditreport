package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.AddressRequest;
import com.b4nkd.creditscore.equifax.model.CreditReportRequestConsumersEmployments;
import com.b4nkd.creditscore.equifax.model.CreditReportRequestConsumersName;
import com.b4nkd.creditscore.equifax.model.CreditReportRequestConsumersPhoneNumbers;
import com.b4nkd.creditscore.equifax.model.CreditReportRequestConsumersSocialNum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditReportRequestConsumers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class CreditReportRequestConsumers   {
  @JsonProperty("name")
  @Valid
  private List<CreditReportRequestConsumersName> name = new ArrayList<CreditReportRequestConsumersName>();

  @JsonProperty("socialNum")
  @Valid
  private List<CreditReportRequestConsumersSocialNum> socialNum = null;

  @JsonProperty("dateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("age")
  private String age = null;

  @JsonProperty("addresses")
  @Valid
  private List<AddressRequest> addresses = null;

  @JsonProperty("phoneNumbers")
  @Valid
  private List<CreditReportRequestConsumersPhoneNumbers> phoneNumbers = null;

  @JsonProperty("employments")
  private CreditReportRequestConsumersEmployments employments = null;

  public CreditReportRequestConsumers name(List<CreditReportRequestConsumersName> name) {
    this.name = name;
    return this;
  }

  public CreditReportRequestConsumers addNameItem(CreditReportRequestConsumersName nameItem) {
    this.name.add(nameItem);
    return this;
  }

  /**
   * Consumer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Consumer name")
      @NotNull
    @Valid
    public List<CreditReportRequestConsumersName> getName() {
    return name;
  }

  public void setName(List<CreditReportRequestConsumersName> name) {
    this.name = name;
  }

  public CreditReportRequestConsumers socialNum(List<CreditReportRequestConsumersSocialNum> socialNum) {
    this.socialNum = socialNum;
    return this;
  }

  public CreditReportRequestConsumers addSocialNumItem(CreditReportRequestConsumersSocialNum socialNumItem) {
    if (this.socialNum == null) {
      this.socialNum = new ArrayList<CreditReportRequestConsumersSocialNum>();
    }
    this.socialNum.add(socialNumItem);
    return this;
  }

  /**
   * Social Security Number
   * @return socialNum
  **/
  @ApiModelProperty(value = "Social Security Number")
      @Valid
    public List<CreditReportRequestConsumersSocialNum> getSocialNum() {
    return socialNum;
  }

  public void setSocialNum(List<CreditReportRequestConsumersSocialNum> socialNum) {
    this.socialNum = socialNum;
  }

  public CreditReportRequestConsumers dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public CreditReportRequestConsumers age(String age) {
    this.age = age;
    return this;
  }

  /**
   * Age
   * @return age
  **/
  @ApiModelProperty(value = "Age")
  
  @Size(max=2)   public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public CreditReportRequestConsumers addresses(List<AddressRequest> addresses) {
    this.addresses = addresses;
    return this;
  }

  public CreditReportRequestConsumers addAddressesItem(AddressRequest addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<AddressRequest>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Address information. A maximum of 2 addresses can be sent per inquiry. If socialNum is not provided, the houseNumber, streetName, city and state are required
   * @return addresses
  **/
  @ApiModelProperty(value = "Address information. A maximum of 2 addresses can be sent per inquiry. If socialNum is not provided, the houseNumber, streetName, city and state are required")
      @Valid
  @Size(min=1,max=3)   public List<AddressRequest> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<AddressRequest> addresses) {
    this.addresses = addresses;
  }

  public CreditReportRequestConsumers phoneNumbers(List<CreditReportRequestConsumersPhoneNumbers> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public CreditReportRequestConsumers addPhoneNumbersItem(CreditReportRequestConsumersPhoneNumbers phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<CreditReportRequestConsumersPhoneNumbers>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(max=2)   public List<CreditReportRequestConsumersPhoneNumbers> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<CreditReportRequestConsumersPhoneNumbers> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public CreditReportRequestConsumers employments(CreditReportRequestConsumersEmployments employments) {
    this.employments = employments;
    return this;
  }

  /**
   * Get employments
   * @return employments
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CreditReportRequestConsumersEmployments getEmployments() {
    return employments;
  }

  public void setEmployments(CreditReportRequestConsumersEmployments employments) {
    this.employments = employments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReportRequestConsumers creditReportRequestConsumers = (CreditReportRequestConsumers) o;
    return Objects.equals(this.name, creditReportRequestConsumers.name) &&
        Objects.equals(this.socialNum, creditReportRequestConsumers.socialNum) &&
        Objects.equals(this.dateOfBirth, creditReportRequestConsumers.dateOfBirth) &&
        Objects.equals(this.age, creditReportRequestConsumers.age) &&
        Objects.equals(this.addresses, creditReportRequestConsumers.addresses) &&
        Objects.equals(this.phoneNumbers, creditReportRequestConsumers.phoneNumbers) &&
        Objects.equals(this.employments, creditReportRequestConsumers.employments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, socialNum, dateOfBirth, age, addresses, phoneNumbers, employments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReportRequestConsumers {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    socialNum: ").append(toIndentedString(socialNum)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
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
