/*
 * EMService
 * Easemob Rest API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.easemob.im.api.model;

import java.util.Objects;
import com.easemob.im.api.model.EMReactionResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.easemob.im.JSON;

/**
 * EMGetReactionDetailResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-19T14:46:11.706022+08:00[Asia/Shanghai]")
public class EMGetReactionDetailResult {
  public static final String SERIALIZED_NAME_REQUEST_STATUS_CODE = "requestStatusCode";
  @SerializedName(SERIALIZED_NAME_REQUEST_STATUS_CODE)
  private String requestStatusCode;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private EMReactionResource data;

  public EMGetReactionDetailResult() {
  }

  public EMGetReactionDetailResult requestStatusCode(String requestStatusCode) {
    
    this.requestStatusCode = requestStatusCode;
    return this;
  }

   /**
   * Get requestStatusCode
   * @return requestStatusCode
  **/
  @javax.annotation.Nullable
  public String getRequestStatusCode() {
    return requestStatusCode;
  }


  public void setRequestStatusCode(String requestStatusCode) {
    this.requestStatusCode = requestStatusCode;
  }


  public EMGetReactionDetailResult data(EMReactionResource data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public EMReactionResource getData() {
    return data;
  }


  public void setData(EMReactionResource data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMGetReactionDetailResult getReactionDetailResult = (EMGetReactionDetailResult) o;
    return Objects.equals(this.requestStatusCode, getReactionDetailResult.requestStatusCode) &&
        Objects.equals(this.data, getReactionDetailResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestStatusCode, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMGetReactionDetailResult {\n");
    sb.append("    requestStatusCode: ").append(toIndentedString(requestStatusCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("requestStatusCode");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMGetReactionDetailResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMGetReactionDetailResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMGetReactionDetailResult is not found in the empty JSON string", EMGetReactionDetailResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMGetReactionDetailResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMGetReactionDetailResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("requestStatusCode") != null && !jsonObj.get("requestStatusCode").isJsonNull()) && !jsonObj.get("requestStatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestStatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestStatusCode").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        EMReactionResource.validateJsonElement(jsonObj.get("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMGetReactionDetailResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMGetReactionDetailResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMGetReactionDetailResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMGetReactionDetailResult.class));

       return (TypeAdapter<T>) new TypeAdapter<EMGetReactionDetailResult>() {
           @Override
           public void write(JsonWriter out, EMGetReactionDetailResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMGetReactionDetailResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMGetReactionDetailResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMGetReactionDetailResult
  * @throws IOException if the JSON string is invalid with respect to EMGetReactionDetailResult
  */
  public static EMGetReactionDetailResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMGetReactionDetailResult.class);
  }

 /**
  * Convert an instance of EMGetReactionDetailResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
