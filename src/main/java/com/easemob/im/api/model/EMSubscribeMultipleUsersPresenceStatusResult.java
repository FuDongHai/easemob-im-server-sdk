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
import com.easemob.im.api.model.EMSubscribeMultipleUsersPresenceStatusResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * EMSubscribeMultipleUsersPresenceStatusResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-19T14:46:11.706022+08:00[Asia/Shanghai]")
public class EMSubscribeMultipleUsersPresenceStatusResult {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<EMSubscribeMultipleUsersPresenceStatusResource> result;

  public EMSubscribeMultipleUsersPresenceStatusResult() {
  }

  public EMSubscribeMultipleUsersPresenceStatusResult result(List<EMSubscribeMultipleUsersPresenceStatusResource> result) {
    
    this.result = result;
    return this;
  }

  public EMSubscribeMultipleUsersPresenceStatusResult addResultItem(EMSubscribeMultipleUsersPresenceStatusResource resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public List<EMSubscribeMultipleUsersPresenceStatusResource> getResult() {
    return result;
  }


  public void setResult(List<EMSubscribeMultipleUsersPresenceStatusResource> result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMSubscribeMultipleUsersPresenceStatusResult subscribeMultipleUsersPresenceStatusResult = (EMSubscribeMultipleUsersPresenceStatusResult) o;
    return Objects.equals(this.result, subscribeMultipleUsersPresenceStatusResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMSubscribeMultipleUsersPresenceStatusResult {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMSubscribeMultipleUsersPresenceStatusResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMSubscribeMultipleUsersPresenceStatusResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMSubscribeMultipleUsersPresenceStatusResult is not found in the empty JSON string", EMSubscribeMultipleUsersPresenceStatusResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMSubscribeMultipleUsersPresenceStatusResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMSubscribeMultipleUsersPresenceStatusResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
          }

          // validate the optional field `result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            EMSubscribeMultipleUsersPresenceStatusResource.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMSubscribeMultipleUsersPresenceStatusResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMSubscribeMultipleUsersPresenceStatusResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMSubscribeMultipleUsersPresenceStatusResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMSubscribeMultipleUsersPresenceStatusResult.class));

       return (TypeAdapter<T>) new TypeAdapter<EMSubscribeMultipleUsersPresenceStatusResult>() {
           @Override
           public void write(JsonWriter out, EMSubscribeMultipleUsersPresenceStatusResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMSubscribeMultipleUsersPresenceStatusResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMSubscribeMultipleUsersPresenceStatusResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMSubscribeMultipleUsersPresenceStatusResult
  * @throws IOException if the JSON string is invalid with respect to EMSubscribeMultipleUsersPresenceStatusResult
  */
  public static EMSubscribeMultipleUsersPresenceStatusResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMSubscribeMultipleUsersPresenceStatusResult.class);
  }

 /**
  * Convert an instance of EMSubscribeMultipleUsersPresenceStatusResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

