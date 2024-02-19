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
 * EMSetReaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-19T14:46:11.706022+08:00[Asia/Shanghai]")
public class EMSetReaction {
  public static final String SERIALIZED_NAME_MSG_ID = "msgId";
  @SerializedName(SERIALIZED_NAME_MSG_ID)
  private String msgId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public EMSetReaction() {
  }

  public EMSetReaction msgId(String msgId) {
    
    this.msgId = msgId;
    return this;
  }

   /**
   * 消息 ID
   * @return msgId
  **/
  @javax.annotation.Nullable
  public String getMsgId() {
    return msgId;
  }


  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }


  public EMSetReaction message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 表情 ID。长度不能超过 128 个字符，必须与客户端的设置一致。该参数对支持的字符集类型没有限制，若使用特殊字符，获取和删除 Reaction 时需对特殊字符进行 URL 编码
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMSetReaction setReaction = (EMSetReaction) o;
    return Objects.equals(this.msgId, setReaction.msgId) &&
        Objects.equals(this.message, setReaction.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMSetReaction {\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("msgId");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMSetReaction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMSetReaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMSetReaction is not found in the empty JSON string", EMSetReaction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMSetReaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMSetReaction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("msgId") != null && !jsonObj.get("msgId").isJsonNull()) && !jsonObj.get("msgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msgId").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMSetReaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMSetReaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMSetReaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMSetReaction.class));

       return (TypeAdapter<T>) new TypeAdapter<EMSetReaction>() {
           @Override
           public void write(JsonWriter out, EMSetReaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMSetReaction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMSetReaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMSetReaction
  * @throws IOException if the JSON string is invalid with respect to EMSetReaction
  */
  public static EMSetReaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMSetReaction.class);
  }

 /**
  * Convert an instance of EMSetReaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

