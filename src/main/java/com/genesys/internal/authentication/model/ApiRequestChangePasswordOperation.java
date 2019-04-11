/*
 * Authentication API
 * Authentication API
 *
 * OpenAPI spec version: 9.0.000.30.1614
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.authentication.model;

import java.util.Objects;
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
 * ApiRequestChangePasswordOperation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-11T15:09:45.652Z")
public class ApiRequestChangePasswordOperation {
  @SerializedName("data")
  private ChangePasswordOperation data = null;

  @SerializedName("operationId")
  private String operationId = null;

  public ApiRequestChangePasswordOperation data(ChangePasswordOperation data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public ChangePasswordOperation getData() {
    return data;
  }

  public void setData(ChangePasswordOperation data) {
    this.data = data;
  }

  public ApiRequestChangePasswordOperation operationId(String operationId) {
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
    ApiRequestChangePasswordOperation apiRequestChangePasswordOperation = (ApiRequestChangePasswordOperation) o;
    return Objects.equals(this.data, apiRequestChangePasswordOperation.data) &&
        Objects.equals(this.operationId, apiRequestChangePasswordOperation.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, operationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestChangePasswordOperation {\n");
    
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

