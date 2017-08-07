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
import com.genesys.authorization.model.ChangePasswordOperation;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ApiRequestChangePasswordOperation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-07T12:54:46.762Z")
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
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "Used for asynchronous operations to map request and response")
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

