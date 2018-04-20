/*
 * Authentication API
 * Authentication API
 *
 * OpenAPI spec version: 9.0.000.10.1112
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.authentication.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChangePasswordOperation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-20T17:04:34.293Z")
public class ChangePasswordOperation {
  @SerializedName("userName")
  private String userName = null;

  @SerializedName("oldPassword")
  private String oldPassword = null;

  @SerializedName("newPassword")
  private String newPassword = null;

  public ChangePasswordOperation userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ChangePasswordOperation oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

   /**
   * Get oldPassword
   * @return oldPassword
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public ChangePasswordOperation newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * Get newPassword
   * @return newPassword
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePasswordOperation changePasswordOperation = (ChangePasswordOperation) o;
    return Objects.equals(this.userName, changePasswordOperation.userName) &&
        Objects.equals(this.oldPassword, changePasswordOperation.oldPassword) &&
        Objects.equals(this.newPassword, changePasswordOperation.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, oldPassword, newPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordOperation {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

