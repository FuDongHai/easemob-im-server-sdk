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
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.easemob.im.JSON;

/**
 * EMCreateUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-06T17:54:13.706541+08:00[Asia/Shanghai]")
public class EMCreateUser {
    public static final String SERIALIZED_NAME_USERNAME = "username";
    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_PASSWORD = "password";
    @SerializedName(SERIALIZED_NAME_PASSWORD)
    private String password;

    public static final String SERIALIZED_NAME_NICKNAME = "nickname";
    @SerializedName(SERIALIZED_NAME_NICKNAME)
    private String nickname;

    public EMCreateUser() {
    }

    public EMCreateUser username(String username) {

        this.username = username;
        return this;
    }

    /**
     * 用户 ID，长度不可超过 64 字节
     * @return username
     **/
    @javax.annotation.Nullable
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public EMCreateUser password(String password) {

        this.password = password;
        return this;
    }

    /**
     * 用户的登录密码，长度不可超过 64 个字符
     * @return password
     **/
    @javax.annotation.Nullable
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public EMCreateUser nickname(String nickname) {

        this.nickname = nickname;
        return this;
    }

    /**
     * 离线推送时在接收方的客户端推送通知栏中显示的发送方的昵称。你可以自定义该昵称，长度不能超过 100 个字符。
     * @return nickname
     **/
    @javax.annotation.Nullable
    public String getNickname() {
        return nickname;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EMCreateUser createUser = (EMCreateUser) o;
        return Objects.equals(this.username, createUser.username) &&
                Objects.equals(this.password, createUser.password) &&
                Objects.equals(this.nickname, createUser.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, nickname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EMCreateUser {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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
        openapiFields.add("password");
        openapiFields.add("nickname");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EMCreateUser
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EMCreateUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in EMCreateUser is not found in the empty JSON string", EMCreateUser.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EMCreateUser.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMCreateUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
        }
        if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
        }
        if ((jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonNull()) && !jsonObj.get("nickname").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nickname").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EMCreateUser.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EMCreateUser' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EMCreateUser> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(EMCreateUser.class));

            return (TypeAdapter<T>) new TypeAdapter<EMCreateUser>() {
                @Override
                public void write(JsonWriter out, EMCreateUser value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public EMCreateUser read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of EMCreateUser given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EMCreateUser
     * @throws IOException if the JSON string is invalid with respect to EMCreateUser
     */
    public static EMCreateUser fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EMCreateUser.class);
    }

    /**
     * Convert an instance of EMCreateUser to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
