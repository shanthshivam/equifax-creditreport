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
 * AddressRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")


public class AddressRequest   {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("houseNumber")
  private String houseNumber = null;

  @JsonProperty("quadrant")
  private String quadrant = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("streetType")
  private String streetType = null;

  @JsonProperty("apartmentNumber")
  private String apartmentNumber = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("zip")
  private String zip = null;

  public AddressRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Address type of the report subject
   * @return identifier
  **/
  @ApiModelProperty(example = "[\"Current\",\"Co-applicant\",\"Property address\"]", required = true, value = "Address type of the report subject")
      @NotNull

    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public AddressRequest houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * House number
   * @return houseNumber
  **/
  @ApiModelProperty(value = "House number")
  
  @Size(max=10)   public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public AddressRequest quadrant(String quadrant) {
    this.quadrant = quadrant;
    return this;
  }

  /**
   * Quadrant
   * @return quadrant
  **/
  @ApiModelProperty(value = "Quadrant")
  
  @Size(max=2)   public String getQuadrant() {
    return quadrant;
  }

  public void setQuadrant(String quadrant) {
    this.quadrant = quadrant;
  }

  public AddressRequest streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Street name
   * @return streetName
  **/
  @ApiModelProperty(value = "Street name")
  
  @Size(max=26)   public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public AddressRequest streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

  /**
   * Street type
   * @return streetType
  **/
  @ApiModelProperty(example = "[\"AV\",\"ST\"]", value = "Street type")
  
  @Size(max=2)   public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public AddressRequest apartmentNumber(String apartmentNumber) {
    this.apartmentNumber = apartmentNumber;
    return this;
  }

  /**
   * Apartment/Condo/Unit number
   * @return apartmentNumber
  **/
  @ApiModelProperty(value = "Apartment/Condo/Unit number")
  
  @Size(max=5)   public String getApartmentNumber() {
    return apartmentNumber;
  }

  public void setApartmentNumber(String apartmentNumber) {
    this.apartmentNumber = apartmentNumber;
  }

  public AddressRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City name
   * @return city
  **/
  @ApiModelProperty(required = true, value = "City name")
      @NotNull

  @Size(max=20)   public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State abbreviation
   * @return state
  **/
  @ApiModelProperty(required = true, value = "State abbreviation")
      @NotNull

  @Size(max=2)   public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressRequest zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Zip code
   * @return zip
  **/
  @ApiModelProperty(value = "Zip code")
  
  @Size(max=9)   public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressRequest addressRequest = (AddressRequest) o;
    return Objects.equals(this.identifier, addressRequest.identifier) &&
        Objects.equals(this.houseNumber, addressRequest.houseNumber) &&
        Objects.equals(this.quadrant, addressRequest.quadrant) &&
        Objects.equals(this.streetName, addressRequest.streetName) &&
        Objects.equals(this.streetType, addressRequest.streetType) &&
        Objects.equals(this.apartmentNumber, addressRequest.apartmentNumber) &&
        Objects.equals(this.city, addressRequest.city) &&
        Objects.equals(this.state, addressRequest.state) &&
        Objects.equals(this.zip, addressRequest.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, houseNumber, quadrant, streetName, streetType, apartmentNumber, city, state, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRequest {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    quadrant: ").append(toIndentedString(quadrant)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    apartmentNumber: ").append(toIndentedString(apartmentNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
