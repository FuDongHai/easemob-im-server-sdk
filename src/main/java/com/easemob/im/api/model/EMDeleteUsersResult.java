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
import com.easemob.im.api.model.EMUserResource;
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
 * EMDeleteUsersResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T14:51:53.998371+08:00[Asia/Shanghai]")
public class EMDeleteUsersResult {
  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private List<EMUserResource> entities;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;

  public EMDeleteUsersResult() {
  }

  public EMDeleteUsersResult entities(List<EMUserResource> entities) {
    
    this.entities = entities;
    return this;
  }

  public EMDeleteUsersResult addEntitiesItem(EMUserResource entitiesItem) {
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
  public List<EMUserResource> getEntities() {
    return entities;
  }


  public void setEntities(List<EMUserResource> entities) {
    this.entities = entities;
  }


  public EMDeleteUsersResult cursor(String cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
    this.cursor = cursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMDeleteUsersResult deleteUsersResult = (EMDeleteUsersResult) o;
    return Objects.equals(this.entities, deleteUsersResult.entities) &&
        Objects.equals(this.cursor, deleteUsersResult.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMDeleteUsersResult {\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
    openapiFields.add("cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMDeleteUsersResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMDeleteUsersResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMDeleteUsersResult is not found in the empty JSON string", EMDeleteUsersResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMDeleteUsersResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMDeleteUsersResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            EMUserResource.validateJsonElement(jsonArrayentities.get(i));
          };
        }
      }
      if ((jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) && !jsonObj.get("cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cursor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMDeleteUsersResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMDeleteUsersResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMDeleteUsersResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMDeleteUsersResult.class));

       return (TypeAdapter<T>) new TypeAdapter<EMDeleteUsersResult>() {
           @Override
           public void write(JsonWriter out, EMDeleteUsersResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMDeleteUsersResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMDeleteUsersResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMDeleteUsersResult
  * @throws IOException if the JSON string is invalid with respect to EMDeleteUsersResult
  */
  public static EMDeleteUsersResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMDeleteUsersResult.class);
  }

 /**
  * Convert an instance of EMDeleteUsersResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

