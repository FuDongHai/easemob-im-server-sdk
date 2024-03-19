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
 * EMRecallMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T14:51:53.998371+08:00[Asia/Shanghai]")
public class EMRecallMessage {
  public static final String SERIALIZED_NAME_MSG_ID = "msg_id";
  @SerializedName(SERIALIZED_NAME_MSG_ID)
  private String msgId;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_CHAT_TYPE = "chat_type";
  @SerializedName(SERIALIZED_NAME_CHAT_TYPE)
  private String chatType;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force;

  public EMRecallMessage() {
  }

  public EMRecallMessage msgId(String msgId) {
    
    this.msgId = msgId;
    return this;
  }

   /**
   * 要撤回消息的消息 ID。由于每次只能撤销一条消息，因此只能传入一个消息 ID
   * @return msgId
  **/
  @javax.annotation.Nonnull
  public String getMsgId() {
    return msgId;
  }


  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }


  public EMRecallMessage to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * 要撤回消息的接收方。 - 单聊为接收方用户 ID； - 群聊为群组 ID； - 聊天室聊天为聊天室 ID。 若不传入该参数，请求失败
   * @return to
  **/
  @javax.annotation.Nonnull
  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public EMRecallMessage chatType(String chatType) {
    
    this.chatType = chatType;
    return this;
  }

   /**
   * 要撤回消息的会话类型： - chat：单聊； - groupchat：群聊 ； - chatroom：聊天室
   * @return chatType
  **/
  @javax.annotation.Nonnull
  public String getChatType() {
    return chatType;
  }


  public void setChatType(String chatType) {
    this.chatType = chatType;
  }


  public EMRecallMessage from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * 消息撤回方的用户 ID。若不传该参数，默认为 admin
   * @return from
  **/
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public EMRecallMessage force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * 是否支持撤回超过服务器存储时长的消息。 - true：是。这种情况下，你可以撤回在撤回时长内的消息，也可以撤回超过服务器存储时长的消息。对于后者，该接口会撤回接收方在本地保存的消息。若消息发送的时间介于你的撤回时长和服务器存储时长之间，则撤回失败。例如，如果消息的撤回时长为 2 分钟，在服务器上的存储时长为 7 天，你可以撤回 2 分钟以内发送的消息或发送时间超过 7 天的消息；若消息发送了 3 分钟，则撤回失败。 - false：否，不支持撤回超过服务器存储时长的消息。如果你采用默认的 2 分钟撤回时长或联系了商务设置了撤回时长，服务器只能撤回指定时长内发送的消息，超过该时长的消息无法撤回。例如，你设置的撤回时长为 3 分钟，若消息发送了 4 分钟，则撤回失败
   * @return force
  **/
  @javax.annotation.Nonnull
  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMRecallMessage recallMessage = (EMRecallMessage) o;
    return Objects.equals(this.msgId, recallMessage.msgId) &&
        Objects.equals(this.to, recallMessage.to) &&
        Objects.equals(this.chatType, recallMessage.chatType) &&
        Objects.equals(this.from, recallMessage.from) &&
        Objects.equals(this.force, recallMessage.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgId, to, chatType, from, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMRecallMessage {\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    chatType: ").append(toIndentedString(chatType)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
    openapiFields.add("msg_id");
    openapiFields.add("to");
    openapiFields.add("chat_type");
    openapiFields.add("from");
    openapiFields.add("force");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("msg_id");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("chat_type");
    openapiRequiredFields.add("force");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMRecallMessage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMRecallMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMRecallMessage is not found in the empty JSON string", EMRecallMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMRecallMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMRecallMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EMRecallMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("msg_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_id").toString()));
      }
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (!jsonObj.get("chat_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chat_type").toString()));
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMRecallMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMRecallMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMRecallMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMRecallMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<EMRecallMessage>() {
           @Override
           public void write(JsonWriter out, EMRecallMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMRecallMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMRecallMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMRecallMessage
  * @throws IOException if the JSON string is invalid with respect to EMRecallMessage
  */
  public static EMRecallMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMRecallMessage.class);
  }

 /**
  * Convert an instance of EMRecallMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
