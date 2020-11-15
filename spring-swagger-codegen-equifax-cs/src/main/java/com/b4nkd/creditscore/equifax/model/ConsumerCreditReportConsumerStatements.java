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
 * ConsumerCreditReportConsumerStatements
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportConsumerStatements   {
  @JsonProperty("dateReported")
  private String dateReported = null;

  @JsonProperty("datePurged")
  private String datePurged = null;

  @JsonProperty("statement")
  private String statement = null;

  public ConsumerCreditReportConsumerStatements dateReported(String dateReported) {
    this.dateReported = dateReported;
    return this;
  }

  /**
   * Get dateReported
   * @return dateReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getDateReported() {
    return dateReported;
  }

  public void setDateReported(String dateReported) {
    this.dateReported = dateReported;
  }

  public ConsumerCreditReportConsumerStatements datePurged(String datePurged) {
    this.datePurged = datePurged;
    return this;
  }

  /**
   * Get datePurged
   * @return datePurged
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getDatePurged() {
    return datePurged;
  }

  public void setDatePurged(String datePurged) {
    this.datePurged = datePurged;
  }

  public ConsumerCreditReportConsumerStatements statement(String statement) {
    this.statement = statement;
    return this;
  }

  /**
   * Consumer Statement text
   * @return statement
  **/
  @ApiModelProperty(value = "Consumer Statement text")
  
  @Size(max=495)   public String getStatement() {
    return statement;
  }

  public void setStatement(String statement) {
    this.statement = statement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportConsumerStatements consumerCreditReportConsumerStatements = (ConsumerCreditReportConsumerStatements) o;
    return Objects.equals(this.dateReported, consumerCreditReportConsumerStatements.dateReported) &&
        Objects.equals(this.datePurged, consumerCreditReportConsumerStatements.datePurged) &&
        Objects.equals(this.statement, consumerCreditReportConsumerStatements.statement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateReported, datePurged, statement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportConsumerStatements {\n");
    
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    datePurged: ").append(toIndentedString(datePurged)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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
