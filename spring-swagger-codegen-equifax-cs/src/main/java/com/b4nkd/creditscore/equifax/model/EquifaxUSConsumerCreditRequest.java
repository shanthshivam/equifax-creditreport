package com.b4nkd.creditscore.equifax.model;

import java.util.Objects;
import com.b4nkd.creditscore.equifax.model.EquifaxUSConsumerCreditRequestEndUserInformation;
import com.b4nkd.creditscore.equifax.model.EquifaxUSConsumerCreditRequestModels;
import com.b4nkd.creditscore.equifax.model.EquifaxUSConsumerCreditRequestProductInformation;
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
 * Configuration related to the customer request
 */
@ApiModel(description = "Configuration related to the customer request")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class EquifaxUSConsumerCreditRequest   {
  @JsonProperty("memberNumber")
  private String memberNumber = null;

  @JsonProperty("securityCode")
  private String securityCode = null;

  @JsonProperty("codeDescriptionRequired")
  private Boolean codeDescriptionRequired = null;

  @JsonProperty("endUserInformation")
  private EquifaxUSConsumerCreditRequestEndUserInformation endUserInformation = null;

  @JsonProperty("productCodes")
  @Valid
  private List<String> productCodes = null;

  @JsonProperty("productInformation")
  private EquifaxUSConsumerCreditRequestProductInformation productInformation = null;

  @JsonProperty("models")
  @Valid
  private List<EquifaxUSConsumerCreditRequestModels> models = null;

  @JsonProperty("customerCode")
  private String customerCode = null;

  @JsonProperty("multipleReportIndicator")
  private String multipleReportIndicator = null;

  @JsonProperty("ECOAInquiryType")
  private String ecOAInquiryType = null;

  @JsonProperty("optionalFeatureCode")
  @Valid
  private List<String> optionalFeatureCode = null;

  @JsonProperty("vendorIdentificationCode")
  private String vendorIdentificationCode = null;

  @JsonProperty("riskModelCodeOnly")
  private String riskModelCodeOnly = null;

  public EquifaxUSConsumerCreditRequest memberNumber(String memberNumber) {
    this.memberNumber = memberNumber;
    return this;
  }

  /**
   * This is your Equifax Customer Number. This number is used to both access and invoice for Equifax data, products and services. Please contact your Equifax Sales Associate for additional information and activation. 
   * @return memberNumber
  **/
  @ApiModelProperty(required = true, value = "This is your Equifax Customer Number. This number is used to both access and invoice for Equifax data, products and services. Please contact your Equifax Sales Associate for additional information and activation. ")
      @NotNull

  @Size(min=10,max=10)   public String getMemberNumber() {
    return memberNumber;
  }

  public void setMemberNumber(String memberNumber) {
    this.memberNumber = memberNumber;
  }

  public EquifaxUSConsumerCreditRequest securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

  /**
   * Security code
   * @return securityCode
  **/
  @ApiModelProperty(required = true, value = "Security code")
      @NotNull

  @Size(min=3,max=3)   public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }

  public EquifaxUSConsumerCreditRequest codeDescriptionRequired(Boolean codeDescriptionRequired) {
    this.codeDescriptionRequired = codeDescriptionRequired;
    return this;
  }

  /**
   * Request code descriptions
   * @return codeDescriptionRequired
  **/
  @ApiModelProperty(value = "Request code descriptions")
  
    public Boolean isCodeDescriptionRequired() {
    return codeDescriptionRequired;
  }

  public void setCodeDescriptionRequired(Boolean codeDescriptionRequired) {
    this.codeDescriptionRequired = codeDescriptionRequired;
  }

  public EquifaxUSConsumerCreditRequest endUserInformation(EquifaxUSConsumerCreditRequestEndUserInformation endUserInformation) {
    this.endUserInformation = endUserInformation;
    return this;
  }

  /**
   * Get endUserInformation
   * @return endUserInformation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EquifaxUSConsumerCreditRequestEndUserInformation getEndUserInformation() {
    return endUserInformation;
  }

  public void setEndUserInformation(EquifaxUSConsumerCreditRequestEndUserInformation endUserInformation) {
    this.endUserInformation = endUserInformation;
  }

  public EquifaxUSConsumerCreditRequest productCodes(List<String> productCodes) {
    this.productCodes = productCodes;
    return this;
  }

  public EquifaxUSConsumerCreditRequest addProductCodesItem(String productCodesItem) {
    if (this.productCodes == null) {
      this.productCodes = new ArrayList<String>();
    }
    this.productCodes.add(productCodesItem);
    return this;
  }

  /**
   * Codes related to the optional Equifax products \\: Please contact your Equifax Sales Associate for additional information and activation of the desired optional services. Product code values include:   - 01: Equifax Fraud Advisor 2.0 and up to 4 warning codes with Consumer report   - N1: Equifax Fraud Advisor 2.0 and up to 4 warning codes without Consumer report   - 03: Equifax ID Advisor Plus Raw Data returned with Consumer report   - N3: Equifax ID Advisor Plus Raw Data returned without Consumer report   - 08: Fraud Advisor 2.0 = Fraud Advisor with ID Advisor Plus Raw Data returned on high \\# risk group only (scores of 1-5) with Consumer report   - N8: Fraud Advisor 2.0 = Fraud Advisor with ID Advisor Plus Raw Data returned on high \\# risk group only (1-5) without Consumer report   - 10: Fraud Advisor 2.0 = Fraud Advisor with ID Advisor Plus Raw Data returned on all \\# risk groups (scores of 1-9) with Consumer report   - NA: Fraud Advisor 2.0 = Fraud Advisor with ID Advisor Plus Raw Data returned on all \\# risk groups (scores of 1-9) without Consumer report   - MM: MarketMax with a Consumer Report   - NZ: MarketMax without a Consumer Report   - 31: ID Score® - Risk with Consumer report   - 32: ID Score® - Risk without Consumer report 
   * @return productCodes
  **/
  @ApiModelProperty(value = "Codes related to the optional Equifax products \\: Please contact your Equifax Sales Associate for additional information and activation of the desired optional services. Product code values include:   - 01: Equifax Fraud Advisor 2.0 and up to 4 warning codes with Consumer report   - N1: Equifax Fraud Advisor 2.0 and up to 4 warning codes without Consumer report   - 03: Equifax ID Advisor Plus Raw Data returned with Consumer report   - N3: Equifax ID Advisor Plus Raw Data returned without Consumer report   - 08: Fraud Advisor 2.0 = Fraud Advisor with ID Advisor Plus Raw Data returned on high \\# risk group only (scores of 1-5) with Consumer report   - N8: Fraud Advisor 2.0 = Fraud Advisor with ID Advisor Plus Raw Data returned on high \\# risk group only (1-5) without Consumer report   - 10: Fraud Advisor 2.0 = Fraud Advisor with ID Advisor Plus Raw Data returned on all \\# risk groups (scores of 1-9) with Consumer report   - NA: Fraud Advisor 2.0 = Fraud Advisor with ID Advisor Plus Raw Data returned on all \\# risk groups (scores of 1-9) without Consumer report   - MM: MarketMax with a Consumer Report   - NZ: MarketMax without a Consumer Report   - 31: ID Score® - Risk with Consumer report   - 32: ID Score® - Risk without Consumer report ")
  
  @Size(max=20)   public List<String> getProductCodes() {
    return productCodes;
  }

  public void setProductCodes(List<String> productCodes) {
    this.productCodes = productCodes;
  }

  public EquifaxUSConsumerCreditRequest productInformation(EquifaxUSConsumerCreditRequestProductInformation productInformation) {
    this.productInformation = productInformation;
    return this;
  }

  /**
   * Get productInformation
   * @return productInformation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EquifaxUSConsumerCreditRequestProductInformation getProductInformation() {
    return productInformation;
  }

  public void setProductInformation(EquifaxUSConsumerCreditRequestProductInformation productInformation) {
    this.productInformation = productInformation;
  }

  public EquifaxUSConsumerCreditRequest models(List<EquifaxUSConsumerCreditRequestModels> models) {
    this.models = models;
    return this;
  }

  public EquifaxUSConsumerCreditRequest addModelsItem(EquifaxUSConsumerCreditRequestModels modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<EquifaxUSConsumerCreditRequestModels>();
    }
    this.models.add(modelsItem);
    return this;
  }

  /**
   * Model Score
   * @return models
  **/
  @ApiModelProperty(value = "Model Score")
      @Valid
  @Size(max=20)   public List<EquifaxUSConsumerCreditRequestModels> getModels() {
    return models;
  }

  public void setModels(List<EquifaxUSConsumerCreditRequestModels> models) {
    this.models = models;
  }

  public EquifaxUSConsumerCreditRequest customerCode(String customerCode) {
    this.customerCode = customerCode;
    return this;
  }

  /**
   * Assigned customer code
   * @return customerCode
  **/
  @ApiModelProperty(value = "Assigned customer code")
  
  @Size(max=4)   public String getCustomerCode() {
    return customerCode;
  }

  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }

  public EquifaxUSConsumerCreditRequest multipleReportIndicator(String multipleReportIndicator) {
    this.multipleReportIndicator = multipleReportIndicator;
    return this;
  }

  /**
   * Indicates if the report allows more than 1 credit report   - 1: one report   - F: multiple reports (Puerto Rico only) 
   * @return multipleReportIndicator
  **/
  @ApiModelProperty(example = "[\"1\",\"F\"]", value = "Indicates if the report allows more than 1 credit report   - 1: one report   - F: multiple reports (Puerto Rico only) ")
  
  @Size(max=1)   public String getMultipleReportIndicator() {
    return multipleReportIndicator;
  }

  public void setMultipleReportIndicator(String multipleReportIndicator) {
    this.multipleReportIndicator = multipleReportIndicator;
  }

  public EquifaxUSConsumerCreditRequest ecOAInquiryType(String ecOAInquiryType) {
    this.ecOAInquiryType = ecOAInquiryType;
    return this;
  }

  /**
   * Type of inquiry
   * @return ecOAInquiryType
  **/
  @ApiModelProperty(example = "[\"Individual\",\"Co-applicant\"]", value = "Type of inquiry")
  
    public String getEcOAInquiryType() {
    return ecOAInquiryType;
  }

  public void setEcOAInquiryType(String ecOAInquiryType) {
    this.ecOAInquiryType = ecOAInquiryType;
  }

  public EquifaxUSConsumerCreditRequest optionalFeatureCode(List<String> optionalFeatureCode) {
    this.optionalFeatureCode = optionalFeatureCode;
    return this;
  }

  public EquifaxUSConsumerCreditRequest addOptionalFeatureCodeItem(String optionalFeatureCodeItem) {
    if (this.optionalFeatureCode == null) {
      this.optionalFeatureCode = new ArrayList<String>();
    }
    this.optionalFeatureCode.add(optionalFeatureCodeItem);
    return this;
  }

  /**
   * The optional features requested in the credit report. Please contact your Equifax Sales Associate for additional information and activation Optional feature code:   - B: Military Lending Act with Credit Data   - D: ON-LINE DIRECTORY or ON-LINE DIRECTORY w/Address   - G: Dimensions Data   - M: Return Risk-Based Pricing score information in the FICO and Model Segments   - Q: Return Risk-Based Pricing score information in the FICO segment only   - V: Enhanced Delinquency Alert System (EDAS) & FICO Score based on Equifax Data   - X: FICO Score based on Equifax Data   - Z: Enhanced Delinquency Alert System (EDAS)   - &: FraudIQ Synthetic ID Alerts 
   * @return optionalFeatureCode
  **/
  @ApiModelProperty(value = "The optional features requested in the credit report. Please contact your Equifax Sales Associate for additional information and activation Optional feature code:   - B: Military Lending Act with Credit Data   - D: ON-LINE DIRECTORY or ON-LINE DIRECTORY w/Address   - G: Dimensions Data   - M: Return Risk-Based Pricing score information in the FICO and Model Segments   - Q: Return Risk-Based Pricing score information in the FICO segment only   - V: Enhanced Delinquency Alert System (EDAS) & FICO Score based on Equifax Data   - X: FICO Score based on Equifax Data   - Z: Enhanced Delinquency Alert System (EDAS)   - &: FraudIQ Synthetic ID Alerts ")
  
  @Size(max=18)   public List<String> getOptionalFeatureCode() {
    return optionalFeatureCode;
  }

  public void setOptionalFeatureCode(List<String> optionalFeatureCode) {
    this.optionalFeatureCode = optionalFeatureCode;
  }

  public EquifaxUSConsumerCreditRequest vendorIdentificationCode(String vendorIdentificationCode) {
    this.vendorIdentificationCode = vendorIdentificationCode;
    return this;
  }

  /**
   * Required for all third-party channel partners and vendors who support end-customer access to Equifax products and services
   * @return vendorIdentificationCode
  **/
  @ApiModelProperty(value = "Required for all third-party channel partners and vendors who support end-customer access to Equifax products and services")
  
  @Size(max=2)   public String getVendorIdentificationCode() {
    return vendorIdentificationCode;
  }

  public void setVendorIdentificationCode(String vendorIdentificationCode) {
    this.vendorIdentificationCode = vendorIdentificationCode;
  }

  public EquifaxUSConsumerCreditRequest riskModelCodeOnly(String riskModelCodeOnly) {
    this.riskModelCodeOnly = riskModelCodeOnly;
    return this;
  }

  /**
   * It can be one of the following indicators:     Pre-screen of One model request  - ^: For a single prescreen model          - %: For multiple prescreen models  In-Person rules require that 3 or more items in the request match to a consumer's file to be considered a hit/match.  - P: In Person rules apply based on the state code in the request          - Q: In Person rules apply based on the state code in the Current Address on the file  Mortgage Reissue   - M: if Mortgage Reissue is requested this indicator is required. Used by the mortgage industry when a consumer’s credit report is reissued to another company for additional services.  
   * @return riskModelCodeOnly
  **/
  @ApiModelProperty(value = "It can be one of the following indicators:     Pre-screen of One model request  - ^: For a single prescreen model          - %: For multiple prescreen models  In-Person rules require that 3 or more items in the request match to a consumer's file to be considered a hit/match.  - P: In Person rules apply based on the state code in the request          - Q: In Person rules apply based on the state code in the Current Address on the file  Mortgage Reissue   - M: if Mortgage Reissue is requested this indicator is required. Used by the mortgage industry when a consumer’s credit report is reissued to another company for additional services.  ")
  
    public String getRiskModelCodeOnly() {
    return riskModelCodeOnly;
  }

  public void setRiskModelCodeOnly(String riskModelCodeOnly) {
    this.riskModelCodeOnly = riskModelCodeOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquifaxUSConsumerCreditRequest equifaxUSConsumerCreditRequest = (EquifaxUSConsumerCreditRequest) o;
    return Objects.equals(this.memberNumber, equifaxUSConsumerCreditRequest.memberNumber) &&
        Objects.equals(this.securityCode, equifaxUSConsumerCreditRequest.securityCode) &&
        Objects.equals(this.codeDescriptionRequired, equifaxUSConsumerCreditRequest.codeDescriptionRequired) &&
        Objects.equals(this.endUserInformation, equifaxUSConsumerCreditRequest.endUserInformation) &&
        Objects.equals(this.productCodes, equifaxUSConsumerCreditRequest.productCodes) &&
        Objects.equals(this.productInformation, equifaxUSConsumerCreditRequest.productInformation) &&
        Objects.equals(this.models, equifaxUSConsumerCreditRequest.models) &&
        Objects.equals(this.customerCode, equifaxUSConsumerCreditRequest.customerCode) &&
        Objects.equals(this.multipleReportIndicator, equifaxUSConsumerCreditRequest.multipleReportIndicator) &&
        Objects.equals(this.ecOAInquiryType, equifaxUSConsumerCreditRequest.ecOAInquiryType) &&
        Objects.equals(this.optionalFeatureCode, equifaxUSConsumerCreditRequest.optionalFeatureCode) &&
        Objects.equals(this.vendorIdentificationCode, equifaxUSConsumerCreditRequest.vendorIdentificationCode) &&
        Objects.equals(this.riskModelCodeOnly, equifaxUSConsumerCreditRequest.riskModelCodeOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberNumber, securityCode, codeDescriptionRequired, endUserInformation, productCodes, productInformation, models, customerCode, multipleReportIndicator, ecOAInquiryType, optionalFeatureCode, vendorIdentificationCode, riskModelCodeOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquifaxUSConsumerCreditRequest {\n");
    
    sb.append("    memberNumber: ").append(toIndentedString(memberNumber)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    codeDescriptionRequired: ").append(toIndentedString(codeDescriptionRequired)).append("\n");
    sb.append("    endUserInformation: ").append(toIndentedString(endUserInformation)).append("\n");
    sb.append("    productCodes: ").append(toIndentedString(productCodes)).append("\n");
    sb.append("    productInformation: ").append(toIndentedString(productInformation)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
    sb.append("    multipleReportIndicator: ").append(toIndentedString(multipleReportIndicator)).append("\n");
    sb.append("    ecOAInquiryType: ").append(toIndentedString(ecOAInquiryType)).append("\n");
    sb.append("    optionalFeatureCode: ").append(toIndentedString(optionalFeatureCode)).append("\n");
    sb.append("    vendorIdentificationCode: ").append(toIndentedString(vendorIdentificationCode)).append("\n");
    sb.append("    riskModelCodeOnly: ").append(toIndentedString(riskModelCodeOnly)).append("\n");
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
