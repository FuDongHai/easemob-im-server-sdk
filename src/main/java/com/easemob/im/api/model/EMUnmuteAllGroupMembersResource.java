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
 * EMUnmuteAllGroupMembersResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T14:51:53.998371+08:00[Asia/Shanghai]")
public class EMUnmuteAllGroupMembersResource {
  public static final String SERIALIZED_NAME_MUTE = "mute";
  @SerializedName(SERIALIZED_NAME_MUTE)
  private Boolean mute;

  public EMUnmuteAllGroupMembersResource() {
  }

  public EMUnmuteAllGroupMembersResource mute(Boolean mute) {
    
    this.mute = mute;
    return this;
  }

   /**
   * Get mute
   * @return mute
  **/
  @javax.annotation.Nullable
  public Boolean getMute() {
    return mute;
  }


  public void setMute(Boolean mute) {
    this.mute = mute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMUnmuteAllGroupMembersResource unmuteAllGroupMembersResource = (EMUnmuteAllGroupMembersResource) o;
    return Objects.equals(this.mute, unmuteAllGroupMembersResource.mute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMUnmuteAllGroupMembersResource {\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
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
    openapiFields.add("mute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMUnmuteAllGroupMembersResource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMUnmuteAllGroupMembersResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMUnmuteAllGroupMembersResource is not found in the empty JSON string", EMUnmuteAllGroupMembersResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMUnmuteAllGroupMembersResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMUnmuteAllGroupMembersResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMUnmuteAllGroupMembersResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMUnmuteAllGroupMembersResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMUnmuteAllGroupMembersResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMUnmuteAllGroupMembersResource.class));

       return (TypeAdapter<T>) new TypeAdapter<EMUnmuteAllGroupMembersResource>() {
           @Override
           public void write(JsonWriter out, EMUnmuteAllGroupMembersResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMUnmuteAllGroupMembersResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMUnmuteAllGroupMembersResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMUnmuteAllGroupMembersResource
  * @throws IOException if the JSON string is invalid with respect to EMUnmuteAllGroupMembersResource
  */
  public static EMUnmuteAllGroupMembersResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMUnmuteAllGroupMembersResource.class);
  }

 /**
  * Convert an instance of EMUnmuteAllGroupMembersResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

