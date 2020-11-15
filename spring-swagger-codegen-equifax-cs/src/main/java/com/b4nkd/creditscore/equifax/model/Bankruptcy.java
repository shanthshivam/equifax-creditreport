package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.BankruptcyCurrentIntentOrDispositionCode;
import com.b4nkd.creditscore.equifax.model.BankruptcyPriorIntentOrDispositionCode;
import com.b4nkd.creditscore.equifax.model.NarrativeCodes;
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
 * Details associated with bankruptcy
 */
@ApiModel(description = "Details associated with bankruptcy")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class Bankruptcy   {
  @JsonProperty("customerNumber")
  private String customerNumber = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("filer")
  private String filer = null;

  @JsonProperty("industryCode")
  private String industryCode = null;

  @JsonProperty("currentIntentOrDispositionCode")
  private BankruptcyCurrentIntentOrDispositionCode currentIntentOrDispositionCode = null;

  @JsonProperty("narrativeCodes")
  private NarrativeCodes narrativeCodes = null;

  @JsonProperty("rawNarrativeCodes")
  @Valid
  private List<String> rawNarrativeCodes = null;

  @JsonProperty("caseNumber")
  private String caseNumber = null;

  @JsonProperty("dispositionDate")
  private String dispositionDate = null;

  @JsonProperty("dateFiled")
  private String dateFiled = null;

  @JsonProperty("currentDispositionDate")
  private String currentDispositionDate = null;

  @JsonProperty("verifiedDate")
  private String verifiedDate = null;

  @JsonProperty("priorIntentOrDispositionCode")
  private BankruptcyPriorIntentOrDispositionCode priorIntentOrDispositionCode = null;

  @JsonProperty("dateReported")
  private String dateReported = null;

  public Bankruptcy customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Court customer number
   * @return customerNumber
  **/
  @ApiModelProperty(value = "Court customer number")
  
  @Size(max=10)   public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public Bankruptcy type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of bankruptcy: - B: Business - I: Individual 
   * @return type
  **/
  @ApiModelProperty(example = "[\"B\",\"I\"]", value = "Type of bankruptcy: - B: Business - I: Individual ")
  
  @Size(max=1)   public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Bankruptcy filer(String filer) {
    this.filer = filer;
    return this;
  }

  /**
   * How filed: - I: Individual - J: Joint - W: Spouse 
   * @return filer
  **/
  @ApiModelProperty(example = "[\"I\",\"J\",\"W\"]", value = "How filed: - I: Individual - J: Joint - W: Spouse ")
  
  @Size(max=1)   public String getFiler() {
    return filer;
  }

  public void setFiler(String filer) {
    this.filer = filer;
  }

  public Bankruptcy industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

  /**
   * Industry code
   * @return industryCode
  **/
  @ApiModelProperty(value = "Industry code")
  
    public String getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  public Bankruptcy currentIntentOrDispositionCode(BankruptcyCurrentIntentOrDispositionCode currentIntentOrDispositionCode) {
    this.currentIntentOrDispositionCode = currentIntentOrDispositionCode;
    return this;
  }

  /**
   * Get currentIntentOrDispositionCode
   * @return currentIntentOrDispositionCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BankruptcyCurrentIntentOrDispositionCode getCurrentIntentOrDispositionCode() {
    return currentIntentOrDispositionCode;
  }

  public void setCurrentIntentOrDispositionCode(BankruptcyCurrentIntentOrDispositionCode currentIntentOrDispositionCode) {
    this.currentIntentOrDispositionCode = currentIntentOrDispositionCode;
  }

  public Bankruptcy narrativeCodes(NarrativeCodes narrativeCodes) {
    this.narrativeCodes = narrativeCodes;
    return this;
  }

  /**
   * Get narrativeCodes
   * @return narrativeCodes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NarrativeCodes getNarrativeCodes() {
    return narrativeCodes;
  }

  public void setNarrativeCodes(NarrativeCodes narrativeCodes) {
    this.narrativeCodes = narrativeCodes;
  }

  public Bankruptcy rawNarrativeCodes(List<String> rawNarrativeCodes) {
    this.rawNarrativeCodes = rawNarrativeCodes;
    return this;
  }

  public Bankruptcy addRawNarrativeCodesItem(String rawNarrativeCodesItem) {
    if (this.rawNarrativeCodes == null) {
      this.rawNarrativeCodes = new ArrayList<String>();
    }
    this.rawNarrativeCodes.add(rawNarrativeCodesItem);
    return this;
  }

  /**
   * Raw narrative codes included in the report
   * @return rawNarrativeCodes
  **/
  @ApiModelProperty(value = "Raw narrative codes included in the report")
  
  @Size(max=2)   public List<String> getRawNarrativeCodes() {
    return rawNarrativeCodes;
  }

  public void setRawNarrativeCodes(List<String> rawNarrativeCodes) {
    this.rawNarrativeCodes = rawNarrativeCodes;
  }

  public Bankruptcy caseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
    return this;
  }

  /**
   * Case number
   * @return caseNumber
  **/
  @ApiModelProperty(value = "Case number")
  
  @Size(max=5)   public String getCaseNumber() {
    return caseNumber;
  }

  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }

  public Bankruptcy dispositionDate(String dispositionDate) {
    this.dispositionDate = dispositionDate;
    return this;
  }

  /**
   * Get dispositionDate
   * @return dispositionDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=6)   public String getDispositionDate() {
    return dispositionDate;
  }

  public void setDispositionDate(String dispositionDate) {
    this.dispositionDate = dispositionDate;
  }

  public Bankruptcy dateFiled(String dateFiled) {
    this.dateFiled = dateFiled;
    return this;
  }

  /**
   * Get dateFiled
   * @return dateFiled
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateFiled() {
    return dateFiled;
  }

  public void setDateFiled(String dateFiled) {
    this.dateFiled = dateFiled;
  }

  public Bankruptcy currentDispositionDate(String currentDispositionDate) {
    this.currentDispositionDate = currentDispositionDate;
    return this;
  }

  /**
   * Get currentDispositionDate
   * @return currentDispositionDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getCurrentDispositionDate() {
    return currentDispositionDate;
  }

  public void setCurrentDispositionDate(String currentDispositionDate) {
    this.currentDispositionDate = currentDispositionDate;
  }

  public Bankruptcy verifiedDate(String verifiedDate) {
    this.verifiedDate = verifiedDate;
    return this;
  }

  /**
   * Get verifiedDate
   * @return verifiedDate
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getVerifiedDate() {
    return verifiedDate;
  }

  public void setVerifiedDate(String verifiedDate) {
    this.verifiedDate = verifiedDate;
  }

  public Bankruptcy priorIntentOrDispositionCode(BankruptcyPriorIntentOrDispositionCode priorIntentOrDispositionCode) {
    this.priorIntentOrDispositionCode = priorIntentOrDispositionCode;
    return this;
  }

  /**
   * Get priorIntentOrDispositionCode
   * @return priorIntentOrDispositionCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BankruptcyPriorIntentOrDispositionCode getPriorIntentOrDispositionCode() {
    return priorIntentOrDispositionCode;
  }

  public void setPriorIntentOrDispositionCode(BankruptcyPriorIntentOrDispositionCode priorIntentOrDispositionCode) {
    this.priorIntentOrDispositionCode = priorIntentOrDispositionCode;
  }

  public Bankruptcy dateReported(String dateReported) {
    this.dateReported = dateReported;
    return this;
  }

  /**
   * Get dateReported
   * @return dateReported
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=8)   public String getDateReported() {
    return dateReported;
  }

  public void setDateReported(String dateReported) {
    this.dateReported = dateReported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bankruptcy bankruptcy = (Bankruptcy) o;
    return Objects.equals(this.customerNumber, bankruptcy.customerNumber) &&
        Objects.equals(this.type, bankruptcy.type) &&
        Objects.equals(this.filer, bankruptcy.filer) &&
        Objects.equals(this.industryCode, bankruptcy.industryCode) &&
        Objects.equals(this.currentIntentOrDispositionCode, bankruptcy.currentIntentOrDispositionCode) &&
        Objects.equals(this.narrativeCodes, bankruptcy.narrativeCodes) &&
        Objects.equals(this.rawNarrativeCodes, bankruptcy.rawNarrativeCodes) &&
        Objects.equals(this.caseNumber, bankruptcy.caseNumber) &&
        Objects.equals(this.dispositionDate, bankruptcy.dispositionDate) &&
        Objects.equals(this.dateFiled, bankruptcy.dateFiled) &&
        Objects.equals(this.currentDispositionDate, bankruptcy.currentDispositionDate) &&
        Objects.equals(this.verifiedDate, bankruptcy.verifiedDate) &&
        Objects.equals(this.priorIntentOrDispositionCode, bankruptcy.priorIntentOrDispositionCode) &&
        Objects.equals(this.dateReported, bankruptcy.dateReported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, type, filer, industryCode, currentIntentOrDispositionCode, narrativeCodes, rawNarrativeCodes, caseNumber, dispositionDate, dateFiled, currentDispositionDate, verifiedDate, priorIntentOrDispositionCode, dateReported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bankruptcy {\n");
    
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filer: ").append(toIndentedString(filer)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    currentIntentOrDispositionCode: ").append(toIndentedString(currentIntentOrDispositionCode)).append("\n");
    sb.append("    narrativeCodes: ").append(toIndentedString(narrativeCodes)).append("\n");
    sb.append("    rawNarrativeCodes: ").append(toIndentedString(rawNarrativeCodes)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    dispositionDate: ").append(toIndentedString(dispositionDate)).append("\n");
    sb.append("    dateFiled: ").append(toIndentedString(dateFiled)).append("\n");
    sb.append("    currentDispositionDate: ").append(toIndentedString(currentDispositionDate)).append("\n");
    sb.append("    verifiedDate: ").append(toIndentedString(verifiedDate)).append("\n");
    sb.append("    priorIntentOrDispositionCode: ").append(toIndentedString(priorIntentOrDispositionCode)).append("\n");
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
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
