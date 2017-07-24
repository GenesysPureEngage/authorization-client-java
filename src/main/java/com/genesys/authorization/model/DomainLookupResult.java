/*
 * Authorization API
 * Authorization API
 *
 * OpenAPI spec version: 9.0.000.00.598
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.authorization.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DomainLookupResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T14:34:31.957Z")
public class DomainLookupResult {
  @SerializedName("authScheme")
  private String authScheme = null;

  @SerializedName("domain")
  private String domain = null;

  public DomainLookupResult authScheme(String authScheme) {
    this.authScheme = authScheme;
    return this;
  }

   /**
   * Get authScheme
   * @return authScheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAuthScheme() {
    return authScheme;
  }

  public void setAuthScheme(String authScheme) {
    this.authScheme = authScheme;
  }

  public DomainLookupResult domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainLookupResult domainLookupResult = (DomainLookupResult) o;
    return Objects.equals(this.authScheme, domainLookupResult.authScheme) &&
        Objects.equals(this.domain, domainLookupResult.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authScheme, domain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainLookupResult {\n");
    
    sb.append("    authScheme: ").append(toIndentedString(authScheme)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

