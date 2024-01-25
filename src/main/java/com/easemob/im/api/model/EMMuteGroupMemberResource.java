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
 * EMMuteGroupMemberResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T14:51:53.998371+08:00[Asia/Shanghai]")
public class EMMuteGroupMemberResource {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Boolean result;

  public static final String SERIALIZED_NAME_EXPIRE = "expire";
  @SerializedName(SERIALIZED_NAME_EXPIRE)
  private BigDecimal expire;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public EMMuteGroupMemberResource() {
  }

  public EMMuteGroupMemberResource result(Boolean result) {
    
    this.result = result;
    return this;
  }

   /**
   * 操作结果： - true：添加成功； - false：添加失败
   * @return result
  **/
  @javax.annotation.Nullable
  public Boolean getResult() {
    return result;
  }


  public void setResult(Boolean result) {
    this.result = result;
  }


  public EMMuteGroupMemberResource expire(BigDecimal expire) {
    
    this.expire = expire;
    return this;
  }

   /**
   * 禁言到期的时间，单位为毫秒
   * @return expire
  **/
  @javax.annotation.Nullable
  public BigDecimal getExpire() {
    return expire;
  }


  public void setExpire(BigDecimal expire) {
    this.expire = expire;
  }


  public EMMuteGroupMemberResource user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * 被禁言用户的 ID
   * @return user
  **/
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMMuteGroupMemberResource muteGroupMemberResource = (EMMuteGroupMemberResource) o;
    return Objects.equals(this.result, muteGroupMemberResource.result) &&
        Objects.equals(this.expire, muteGroupMemberResource.expire) &&
        Objects.equals(this.user, muteGroupMemberResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, expire, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMMuteGroupMemberResource {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("expire");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMMuteGroupMemberResource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMMuteGroupMemberResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMMuteGroupMemberResource is not found in the empty JSON string", EMMuteGroupMemberResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMMuteGroupMemberResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMMuteGroupMemberResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMMuteGroupMemberResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMMuteGroupMemberResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMMuteGroupMemberResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMMuteGroupMemberResource.class));

       return (TypeAdapter<T>) new TypeAdapter<EMMuteGroupMemberResource>() {
           @Override
           public void write(JsonWriter out, EMMuteGroupMemberResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMMuteGroupMemberResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMMuteGroupMemberResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMMuteGroupMemberResource
  * @throws IOException if the JSON string is invalid with respect to EMMuteGroupMemberResource
  */
  public static EMMuteGroupMemberResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMMuteGroupMemberResource.class);
  }

 /**
  * Convert an instance of EMMuteGroupMemberResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

