/*
 * Authentication API
 * Authentication API
 *
 * OpenAPI spec version: 9.0.000.68.2560
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.authentication.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.authentication.model.ChangePasswordOperation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiRequestOfChangePasswordOperation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-23T11:08:41.797Z")
public class ApiRequestOfChangePasswordOperation {
  @SerializedName("data")
  private ChangePasswordOperation data = null;

  @SerializedName("operationId")
  private String operationId = null;

  public ApiRequestOfChangePasswordOperation data(ChangePasswordOperation data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public ChangePasswordOperation getData() {
    return data;
  }

  public void setData(ChangePasswordOperation data) {
    this.data = data;
  }

  public ApiRequestOfChangePasswordOperation operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Used for asynchronous operations to map request and response
   * @return operationId
  **/
  @ApiModelProperty(value = "Used for asynchronous operations to map request and response")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestOfChangePasswordOperation apiRequestOfChangePasswordOperation = (ApiRequestOfChangePasswordOperation) o;
    return Objects.equals(this.data, apiRequestOfChangePasswordOperation.data) &&
        Objects.equals(this.operationId, apiRequestOfChangePasswordOperation.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, operationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestOfChangePasswordOperation {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

