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
import java.math.BigDecimal;

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
 * EMCreateUserResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-06T17:54:13.706541+08:00[Asia/Shanghai]")
public class EMCreateUserResource {
    public static final String SERIALIZED_NAME_UUID = "uuid";
    @SerializedName(SERIALIZED_NAME_UUID)
    private String uuid;

    public static final String SERIALIZED_NAME_CREATED = "created";
    @SerializedName(SERIALIZED_NAME_CREATED)
    private BigDecimal created;

    public static final String SERIALIZED_NAME_USERNAME = "username";
    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_NICKNAME = "nickname";
    @SerializedName(SERIALIZED_NAME_NICKNAME)
    private String nickname;

    public static final String SERIALIZED_NAME_ACTIVATED = "activated";
    @SerializedName(SERIALIZED_NAME_ACTIVATED)
    private Boolean activated;

    public EMCreateUserResource() {
    }

    public EMCreateUserResource uuid(String uuid) {

        this.uuid = uuid;
        return this;
    }

    /**
     * Get uuid
     * @return uuid
     **/
    @javax.annotation.Nullable
    public String getUuid() {
        return uuid;
    }


    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public EMCreateUserResource created(BigDecimal created) {

        this.created = created;
        return this;
    }

    /**
     * Get created
     * @return created
     **/
    @javax.annotation.Nullable
    public BigDecimal getCreated() {
        return created;
    }


    public void setCreated(BigDecimal created) {
        this.created = created;
    }


    public EMCreateUserResource username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     * @return username
     **/
    @javax.annotation.Nullable
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public EMCreateUserResource nickname(String nickname) {

        this.nickname = nickname;
        return this;
    }

    /**
     * Get nickname
     * @return nickname
     **/
    @javax.annotation.Nullable
    public String getNickname() {
        return nickname;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public EMCreateUserResource activated(Boolean activated) {

        this.activated = activated;
        return this;
    }

    /**
     * Get activated
     * @return activated
     **/
    @javax.annotation.Nullable
    public Boolean getActivated() {
        return activated;
    }


    public void setActivated(Boolean activated) {
        this.activated = activated;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EMCreateUserResource createUserResource = (EMCreateUserResource) o;
        return Objects.equals(this.uuid, createUserResource.uuid) &&
                Objects.equals(this.created, createUserResource.created) &&
                Objects.equals(this.username, createUserResource.username) &&
                Objects.equals(this.nickname, createUserResource.nickname) &&
                Objects.equals(this.activated, createUserResource.activated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, created, username, nickname, activated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EMCreateUserResource {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
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
        openapiFields.add("uuid");
        openapiFields.add("created");
        openapiFields.add("username");
        openapiFields.add("nickname");
        openapiFields.add("activated");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EMCreateUserResource
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EMCreateUserResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in EMCreateUserResource is not found in the empty JSON string", EMCreateUserResource.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EMCreateUserResource.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMCreateUserResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
        }
        if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
        }
        if ((jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonNull()) && !jsonObj.get("nickname").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nickname").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EMCreateUserResource.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EMCreateUserResource' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EMCreateUserResource> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(EMCreateUserResource.class));

            return (TypeAdapter<T>) new TypeAdapter<EMCreateUserResource>() {
                @Override
                public void write(JsonWriter out, EMCreateUserResource value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public EMCreateUserResource read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of EMCreateUserResource given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EMCreateUserResource
     * @throws IOException if the JSON string is invalid with respect to EMCreateUserResource
     */
    public static EMCreateUserResource fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EMCreateUserResource.class);
    }

    /**
     * Convert an instance of EMCreateUserResource to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

