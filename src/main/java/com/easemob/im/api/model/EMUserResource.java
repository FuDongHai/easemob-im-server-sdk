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
import java.math.BigDecimal;
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
 * EMUserResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T14:51:53.998371+08:00[Asia/Shanghai]")
public class EMUserResource {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_ACTIVATED = "activated";
  @SerializedName(SERIALIZED_NAME_ACTIVATED)
  private Boolean activated;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private BigDecimal created;

  public EMUserResource() {
  }

  public EMUserResource username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * 用户 ID
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public EMUserResource uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * 用户 ID 的 uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public EMUserResource activated(Boolean activated) {
    
    this.activated = activated;
    return this;
  }

   /**
   * 用户是否被封禁
   * @return activated
  **/
  @javax.annotation.Nullable
  public Boolean getActivated() {
    return activated;
  }


  public void setActivated(Boolean activated) {
    this.activated = activated;
  }


  public EMUserResource created(BigDecimal created) {
    
    this.created = created;
    return this;
  }

   /**
   * 用户创建的时间
   * @return created
  **/
  @javax.annotation.Nullable
  public BigDecimal getCreated() {
    return created;
  }


  public void setCreated(BigDecimal created) {
    this.created = created;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMUserResource userResource = (EMUserResource) o;
    return Objects.equals(this.username, userResource.username) &&
        Objects.equals(this.uuid, userResource.uuid) &&
        Objects.equals(this.activated, userResource.activated) &&
        Objects.equals(this.created, userResource.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, uuid, activated, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMUserResource {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("uuid");
    openapiFields.add("activated");
    openapiFields.add("created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMUserResource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMUserResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMUserResource is not found in the empty JSON string", EMUserResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMUserResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMUserResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMUserResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMUserResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMUserResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMUserResource.class));

       return (TypeAdapter<T>) new TypeAdapter<EMUserResource>() {
           @Override
           public void write(JsonWriter out, EMUserResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMUserResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMUserResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMUserResource
  * @throws IOException if the JSON string is invalid with respect to EMUserResource
  */
  public static EMUserResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMUserResource.class);
  }

 /**
  * Convert an instance of EMUserResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

