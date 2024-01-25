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
 * EMRemoveUserFromGroupBlockListResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T14:51:53.998371+08:00[Asia/Shanghai]")
public class EMRemoveUserFromGroupBlockListResource {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Boolean result;

  public EMRemoveUserFromGroupBlockListResource() {
  }

  public EMRemoveUserFromGroupBlockListResource result(Boolean result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public Boolean getResult() {
    return result;
  }


  public void setResult(Boolean result) {
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
    EMRemoveUserFromGroupBlockListResource removeUserFromGroupBlockListResource = (EMRemoveUserFromGroupBlockListResource) o;
    return Objects.equals(this.result, removeUserFromGroupBlockListResource.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMRemoveUserFromGroupBlockListResource {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to EMRemoveUserFromGroupBlockListResource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMRemoveUserFromGroupBlockListResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMRemoveUserFromGroupBlockListResource is not found in the empty JSON string", EMRemoveUserFromGroupBlockListResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMRemoveUserFromGroupBlockListResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMRemoveUserFromGroupBlockListResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMRemoveUserFromGroupBlockListResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMRemoveUserFromGroupBlockListResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMRemoveUserFromGroupBlockListResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMRemoveUserFromGroupBlockListResource.class));

       return (TypeAdapter<T>) new TypeAdapter<EMRemoveUserFromGroupBlockListResource>() {
           @Override
           public void write(JsonWriter out, EMRemoveUserFromGroupBlockListResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMRemoveUserFromGroupBlockListResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMRemoveUserFromGroupBlockListResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMRemoveUserFromGroupBlockListResource
  * @throws IOException if the JSON string is invalid with respect to EMRemoveUserFromGroupBlockListResource
  */
  public static EMRemoveUserFromGroupBlockListResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMRemoveUserFromGroupBlockListResource.class);
  }

 /**
  * Convert an instance of EMRemoveUserFromGroupBlockListResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

