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
import com.easemob.im.api.model.EMUserJoinedGroupResource;
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
 * EMGetUserJoinedGroupsResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T16:52:34.444324+08:00[Asia/Shanghai]")
public class EMGetUserJoinedGroupsResult {
    public static final String SERIALIZED_NAME_ENTITIES = "entities";
    @SerializedName(SERIALIZED_NAME_ENTITIES)
    private List<EMUserJoinedGroupResource> entities;

    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private Integer total;

    public EMGetUserJoinedGroupsResult() {
    }

    public EMGetUserJoinedGroupsResult entities(List<EMUserJoinedGroupResource> entities) {

        this.entities = entities;
        return this;
    }

    public EMGetUserJoinedGroupsResult addEntitiesItem(EMUserJoinedGroupResource entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    /**
     * Get entities
     * @return entities
     **/
    @javax.annotation.Nullable
    public List<EMUserJoinedGroupResource> getEntities() {
        return entities;
    }


    public void setEntities(List<EMUserJoinedGroupResource> entities) {
        this.entities = entities;
    }


    public EMGetUserJoinedGroupsResult total(Integer total) {

        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     **/
    @javax.annotation.Nullable
    public Integer getTotal() {
        return total;
    }


    public void setTotal(Integer total) {
        this.total = total;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EMGetUserJoinedGroupsResult getUserJoinedGroupsResult = (EMGetUserJoinedGroupsResult) o;
        return Objects.equals(this.entities, getUserJoinedGroupsResult.entities) &&
                Objects.equals(this.total, getUserJoinedGroupsResult.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entities, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EMGetUserJoinedGroupsResult {\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
        openapiFields.add("entities");
        openapiFields.add("total");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EMGetUserJoinedGroupsResult
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EMGetUserJoinedGroupsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in EMGetUserJoinedGroupsResult is not found in the empty JSON string", EMGetUserJoinedGroupsResult.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EMGetUserJoinedGroupsResult.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMGetUserJoinedGroupsResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("entities") != null && !jsonObj.get("entities").isJsonNull()) {
            JsonArray jsonArrayentities = jsonObj.getAsJsonArray("entities");
            if (jsonArrayentities != null) {
                // ensure the json data is an array
                if (!jsonObj.get("entities").isJsonArray()) {
                    throw new IllegalArgumentException(String.format("Expected the field `entities` to be an array in the JSON string but got `%s`", jsonObj.get("entities").toString()));
                }

                // validate the optional field `entities` (array)
                for (int i = 0; i < jsonArrayentities.size(); i++) {
                    EMUserJoinedGroupResource.validateJsonElement(jsonArrayentities.get(i));
                };
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EMGetUserJoinedGroupsResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EMGetUserJoinedGroupsResult' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EMGetUserJoinedGroupsResult> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(EMGetUserJoinedGroupsResult.class));

            return (TypeAdapter<T>) new TypeAdapter<EMGetUserJoinedGroupsResult>() {
                @Override
                public void write(JsonWriter out, EMGetUserJoinedGroupsResult value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public EMGetUserJoinedGroupsResult read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of EMGetUserJoinedGroupsResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EMGetUserJoinedGroupsResult
     * @throws IOException if the JSON string is invalid with respect to EMGetUserJoinedGroupsResult
     */
    public static EMGetUserJoinedGroupsResult fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EMGetUserJoinedGroupsResult.class);
    }

    /**
     * Convert an instance of EMGetUserJoinedGroupsResult to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

