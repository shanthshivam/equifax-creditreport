package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
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
 * EquifaxUSConsumerCreditRequestModels
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class EquifaxUSConsumerCreditRequestModels   {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("modelField")
  @Valid
  private List<String> modelField = null;

  public EquifaxUSConsumerCreditRequestModels identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Model number
   * @return identifier
  **/
  @ApiModelProperty(value = "Model number")
  
  @Size(max=5)   public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public EquifaxUSConsumerCreditRequestModels modelField(List<String> modelField) {
    this.modelField = modelField;
    return this;
  }

  public EquifaxUSConsumerCreditRequestModels addModelFieldItem(String modelFieldItem) {
    if (this.modelField == null) {
      this.modelField = new ArrayList<String>();
    }
    this.modelField.add(modelFieldItem);
    return this;
  }

  /**
   * Get modelField
   * @return modelField
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getModelField() {
    return modelField;
  }

  public void setModelField(List<String> modelField) {
    this.modelField = modelField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquifaxUSConsumerCreditRequestModels equifaxUSConsumerCreditRequestModels = (EquifaxUSConsumerCreditRequestModels) o;
    return Objects.equals(this.identifier, equifaxUSConsumerCreditRequestModels.identifier) &&
        Objects.equals(this.modelField, equifaxUSConsumerCreditRequestModels.modelField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, modelField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquifaxUSConsumerCreditRequestModels {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    modelField: ").append(toIndentedString(modelField)).append("\n");
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
