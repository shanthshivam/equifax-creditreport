package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Flags indicate if the subject&#x27;s name matches
 */
@ApiModel(description = "Flags indicate if the subject's name matches")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class ConsumerCreditReportNameMatchFlags   {
  /**
   * Flag indicates if the subject's first name matches
   */
  public enum FirstNameMatchFlagEnum {
    Y("Y"),
    
    N("N");

    private String value;

    FirstNameMatchFlagEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FirstNameMatchFlagEnum fromValue(String text) {
      for (FirstNameMatchFlagEnum b : FirstNameMatchFlagEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("firstNameMatchFlag")
  private FirstNameMatchFlagEnum firstNameMatchFlag = null;

  /**
   * Flag indicates if the subject's last name matches
   */
  public enum LastNameMatchFlagEnum {
    Y("Y"),
    
    N("N");

    private String value;

    LastNameMatchFlagEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LastNameMatchFlagEnum fromValue(String text) {
      for (LastNameMatchFlagEnum b : LastNameMatchFlagEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("lastNameMatchFlag")
  private LastNameMatchFlagEnum lastNameMatchFlag = null;

  /**
   * Flag indicates if the subject's middle name matches
   */
  public enum MiddleNameMatchFlagEnum {
    Y("Y"),
    
    N("N");

    private String value;

    MiddleNameMatchFlagEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MiddleNameMatchFlagEnum fromValue(String text) {
      for (MiddleNameMatchFlagEnum b : MiddleNameMatchFlagEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("middleNameMatchFlag")
  private MiddleNameMatchFlagEnum middleNameMatchFlag = null;

  /**
   * Flag indicates if the subject's suffix name matches
   */
  public enum SuffixMatchFlagEnum {
    Y("Y"),
    
    N("N");

    private String value;

    SuffixMatchFlagEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SuffixMatchFlagEnum fromValue(String text) {
      for (SuffixMatchFlagEnum b : SuffixMatchFlagEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("suffixMatchFlag")
  private SuffixMatchFlagEnum suffixMatchFlag = null;

  public ConsumerCreditReportNameMatchFlags firstNameMatchFlag(FirstNameMatchFlagEnum firstNameMatchFlag) {
    this.firstNameMatchFlag = firstNameMatchFlag;
    return this;
  }

  /**
   * Flag indicates if the subject's first name matches
   * @return firstNameMatchFlag
  **/
  @ApiModelProperty(value = "Flag indicates if the subject's first name matches")
  
  @Size(max=1)   public FirstNameMatchFlagEnum getFirstNameMatchFlag() {
    return firstNameMatchFlag;
  }

  public void setFirstNameMatchFlag(FirstNameMatchFlagEnum firstNameMatchFlag) {
    this.firstNameMatchFlag = firstNameMatchFlag;
  }

  public ConsumerCreditReportNameMatchFlags lastNameMatchFlag(LastNameMatchFlagEnum lastNameMatchFlag) {
    this.lastNameMatchFlag = lastNameMatchFlag;
    return this;
  }

  /**
   * Flag indicates if the subject's last name matches
   * @return lastNameMatchFlag
  **/
  @ApiModelProperty(value = "Flag indicates if the subject's last name matches")
  
  @Size(max=1)   public LastNameMatchFlagEnum getLastNameMatchFlag() {
    return lastNameMatchFlag;
  }

  public void setLastNameMatchFlag(LastNameMatchFlagEnum lastNameMatchFlag) {
    this.lastNameMatchFlag = lastNameMatchFlag;
  }

  public ConsumerCreditReportNameMatchFlags middleNameMatchFlag(MiddleNameMatchFlagEnum middleNameMatchFlag) {
    this.middleNameMatchFlag = middleNameMatchFlag;
    return this;
  }

  /**
   * Flag indicates if the subject's middle name matches
   * @return middleNameMatchFlag
  **/
  @ApiModelProperty(value = "Flag indicates if the subject's middle name matches")
  
  @Size(max=1)   public MiddleNameMatchFlagEnum getMiddleNameMatchFlag() {
    return middleNameMatchFlag;
  }

  public void setMiddleNameMatchFlag(MiddleNameMatchFlagEnum middleNameMatchFlag) {
    this.middleNameMatchFlag = middleNameMatchFlag;
  }

  public ConsumerCreditReportNameMatchFlags suffixMatchFlag(SuffixMatchFlagEnum suffixMatchFlag) {
    this.suffixMatchFlag = suffixMatchFlag;
    return this;
  }

  /**
   * Flag indicates if the subject's suffix name matches
   * @return suffixMatchFlag
  **/
  @ApiModelProperty(value = "Flag indicates if the subject's suffix name matches")
  
  @Size(max=1)   public SuffixMatchFlagEnum getSuffixMatchFlag() {
    return suffixMatchFlag;
  }

  public void setSuffixMatchFlag(SuffixMatchFlagEnum suffixMatchFlag) {
    this.suffixMatchFlag = suffixMatchFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerCreditReportNameMatchFlags consumerCreditReportNameMatchFlags = (ConsumerCreditReportNameMatchFlags) o;
    return Objects.equals(this.firstNameMatchFlag, consumerCreditReportNameMatchFlags.firstNameMatchFlag) &&
        Objects.equals(this.lastNameMatchFlag, consumerCreditReportNameMatchFlags.lastNameMatchFlag) &&
        Objects.equals(this.middleNameMatchFlag, consumerCreditReportNameMatchFlags.middleNameMatchFlag) &&
        Objects.equals(this.suffixMatchFlag, consumerCreditReportNameMatchFlags.suffixMatchFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstNameMatchFlag, lastNameMatchFlag, middleNameMatchFlag, suffixMatchFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerCreditReportNameMatchFlags {\n");
    
    sb.append("    firstNameMatchFlag: ").append(toIndentedString(firstNameMatchFlag)).append("\n");
    sb.append("    lastNameMatchFlag: ").append(toIndentedString(lastNameMatchFlag)).append("\n");
    sb.append("    middleNameMatchFlag: ").append(toIndentedString(middleNameMatchFlag)).append("\n");
    sb.append("    suffixMatchFlag: ").append(toIndentedString(suffixMatchFlag)).append("\n");
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
