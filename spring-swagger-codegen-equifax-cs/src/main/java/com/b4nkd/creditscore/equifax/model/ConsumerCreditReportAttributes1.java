package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.ConsumerCreditReportAttributes;
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
 * Model Attribute data
 */
@ApiModel(description = "Model Attribute data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportAttributes1   {
  @JsonProperty("modelNumber")
  private String modelNumber = null;

  @JsonProperty("numberOfVariableFields")
  private String numberOfVariableFields = null;

  @JsonProperty("attributes")
  @Valid
  private List<ConsumerCreditReportAttributes> attributes = null;

  public ConsumerCreditReportAttributes1 modelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
    return this;
  }

  /**
   * Model number
   * @return modelNumber
  **/
  @ApiModelProperty(value = "Model number")
  
  @Size(max=5)   public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public ConsumerCreditReportAttributes1 numberOfVariableFields(String numberOfVariableFields) {
    this.numberOfVariableFields = numberOfVariableFields;
    return this;
  }

  /**
   * Indicates the number of fields with variables being returned
   * @return numberOfVariableFields
  **/
  @ApiModelProperty(value = "Indicates the number of fields with variables being returned")
  
  @Size(max=2)   public String getNumberOfVariableFields() {
    return numberOfVariableFields;
  }

  public void setNumberOfVariableFields(String numberOfVariableFields) {
    this.numberOfVariableFields = numberOfVariableFields;
  }

  public ConsumerCreditReportAttributes1 attributes(List<ConsumerCreditReportAttributes> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ConsumerCreditReportAttributes1 addAttributesItem(ConsumerCreditReportAttributes attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ConsumerCreditReportAttributes>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Fields with variables being returned
   * @return attributes
  **/
  @ApiModelProperty(value = "Fields with variables being returned")
      @Valid
    public List<ConsumerCreditReportAttributes> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ConsumerCreditReportAttributes> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportAttributes1 consumerCreditReportAttributes1 = (ConsumerCreditReportAttributes1) o;
    return Objects.equals(this.modelNumber, consumerCreditReportAttributes1.modelNumber) &&
        Objects.equals(this.numberOfVariableFields, consumerCreditReportAttributes1.numberOfVariableFields) &&
        Objects.equals(this.attributes, consumerCreditReportAttributes1.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelNumber, numberOfVariableFields, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportAttributes1 {\n");
    
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    numberOfVariableFields: ").append(toIndentedString(numberOfVariableFields)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
