/*
 * Authentication API
 * Authentication API
 *
 * OpenAPI spec version: 9.0.000.44.1858
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.authentication.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.authentication.model.UserRole;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class describes the user in the system. Applicable to different entities (contact-center level user, application/service, cloud system admin)
 */
@ApiModel(description = "This class describes the user in the system. Applicable to different entities (contact-center level user, application/service, cloud system admin)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-30T13:05:03.114Z")
public class OpenIdUserInfo {
  @SerializedName("aud")
  private String aud = null;

  @SerializedName("authorities")
  private List<UserRole> authorities = new ArrayList<UserRole>();

  @SerializedName("contact_center_id")
  private String contactCenterId = null;

  @SerializedName("dbid")
  private Integer dbid = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("environment_id")
  private String environmentId = null;

  @SerializedName("family_name")
  private String familyName = null;

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("sub")
  private String sub = null;

  @SerializedName("user_name")
  private String userName = null;

  public OpenIdUserInfo aud(String aud) {
    this.aud = aud;
    return this;
  }

   /**
   * OpenID Connect &#39;aud&#39; claim. This is present if user authenticated with openid scope.
   * @return aud
  **/
  @ApiModelProperty(value = "OpenID Connect 'aud' claim. This is present if user authenticated with openid scope.")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public OpenIdUserInfo authorities(List<UserRole> authorities) {
    this.authorities = authorities;
    return this;
  }

  public OpenIdUserInfo addAuthoritiesItem(UserRole authoritiesItem) {
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Authorities assigned to the user.
   * @return authorities
  **/
  @ApiModelProperty(required = true, value = "Authorities assigned to the user.")
  public List<UserRole> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(List<UserRole> authorities) {
    this.authorities = authorities;
  }

  public OpenIdUserInfo contactCenterId(String contactCenterId) {
    this.contactCenterId = contactCenterId;
    return this;
  }

   /**
   * OpenID Connect &#39;aud&#39; claim. This is present if user authenticated with openid scope.
   * @return contactCenterId
  **/
  @ApiModelProperty(value = "OpenID Connect 'aud' claim. This is present if user authenticated with openid scope.")
  public String getContactCenterId() {
    return contactCenterId;
  }

  public void setContactCenterId(String contactCenterId) {
    this.contactCenterId = contactCenterId;
  }

  public OpenIdUserInfo dbid(Integer dbid) {
    this.dbid = dbid;
    return this;
  }

   /**
   * The DBID of the corresponding user record in Configuration Server. This is present if the user belongs to a contact center.
   * @return dbid
  **/
  @ApiModelProperty(value = "The DBID of the corresponding user record in Configuration Server. This is present if the user belongs to a contact center.")
  public Integer getDbid() {
    return dbid;
  }

  public void setDbid(Integer dbid) {
    this.dbid = dbid;
  }

  public OpenIdUserInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * OpenID Connect &#39;email&#39; claim. This is present if user authenticated with openid scope.
   * @return email
  **/
  @ApiModelProperty(value = "OpenID Connect 'email' claim. This is present if user authenticated with openid scope.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OpenIdUserInfo environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * OpenID Connect &#39;environment_id&#39; claim. This is present if user authenticated with openid scope.
   * @return environmentId
  **/
  @ApiModelProperty(value = "OpenID Connect 'environment_id' claim. This is present if user authenticated with openid scope.")
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public OpenIdUserInfo familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * OpenID Connect &#39;family_name&#39; (last name) claim. This is present if user authenticated with openid scope.
   * @return familyName
  **/
  @ApiModelProperty(value = "OpenID Connect 'family_name' (last name) claim. This is present if user authenticated with openid scope.")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public OpenIdUserInfo givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * OpenID Connect &#39;given_name&#39; (first name) claim. This is present if user authenticated with openid scope.
   * @return givenName
  **/
  @ApiModelProperty(value = "OpenID Connect 'given_name' (first name) claim. This is present if user authenticated with openid scope.")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public OpenIdUserInfo properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public OpenIdUserInfo putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The user&#39;s properties
   * @return properties
  **/
  @ApiModelProperty(value = "The user's properties")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public OpenIdUserInfo sub(String sub) {
    this.sub = sub;
    return this;
  }

   /**
   * OpenID Connect &#39;sub&#39; claim. This is present if user authenticated with openid scope.
   * @return sub
  **/
  @ApiModelProperty(value = "OpenID Connect 'sub' claim. This is present if user authenticated with openid scope.")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public OpenIdUserInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * OpenID Connect &#39;aud&#39; claim. This is present if user authenticated with openid scope.
   * @return userName
  **/
  @ApiModelProperty(value = "OpenID Connect 'aud' claim. This is present if user authenticated with openid scope.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenIdUserInfo openIdUserInfo = (OpenIdUserInfo) o;
    return Objects.equals(this.aud, openIdUserInfo.aud) &&
        Objects.equals(this.authorities, openIdUserInfo.authorities) &&
        Objects.equals(this.contactCenterId, openIdUserInfo.contactCenterId) &&
        Objects.equals(this.dbid, openIdUserInfo.dbid) &&
        Objects.equals(this.email, openIdUserInfo.email) &&
        Objects.equals(this.environmentId, openIdUserInfo.environmentId) &&
        Objects.equals(this.familyName, openIdUserInfo.familyName) &&
        Objects.equals(this.givenName, openIdUserInfo.givenName) &&
        Objects.equals(this.properties, openIdUserInfo.properties) &&
        Objects.equals(this.sub, openIdUserInfo.sub) &&
        Objects.equals(this.userName, openIdUserInfo.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aud, authorities, contactCenterId, dbid, email, environmentId, familyName, givenName, properties, sub, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIdUserInfo {\n");
    
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    contactCenterId: ").append(toIndentedString(contactCenterId)).append("\n");
    sb.append("    dbid: ").append(toIndentedString(dbid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

