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
 * EMGroupInfoResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T14:51:53.998371+08:00[Asia/Shanghai]")
public class EMGroupInfoResource {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MEMBERSONLY = "membersonly";
  @SerializedName(SERIALIZED_NAME_MEMBERSONLY)
  private Boolean membersonly;

  public static final String SERIALIZED_NAME_ALLOWINVITES = "allowinvites";
  @SerializedName(SERIALIZED_NAME_ALLOWINVITES)
  private Boolean allowinvites;

  public static final String SERIALIZED_NAME_MAXUSERS = "maxusers";
  @SerializedName(SERIALIZED_NAME_MAXUSERS)
  private Integer maxusers;

  public static final String SERIALIZED_NAME_AFFILIATIONS = "affiliations";
  @SerializedName(SERIALIZED_NAME_AFFILIATIONS)
  private List<Object> affiliations;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private BigDecimal created;

  public static final String SERIALIZED_NAME_AFFILIATIONS_COUNT = "affiliations_count";
  @SerializedName(SERIALIZED_NAME_AFFILIATIONS_COUNT)
  private Integer affiliationsCount;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_MUTE = "mute";
  @SerializedName(SERIALIZED_NAME_MUTE)
  private Boolean mute;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private String custom;

  public EMGroupInfoResource() {
  }

  public EMGroupInfoResource id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 群组 ID，群组唯一标识符
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EMGroupInfoResource name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 群组名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EMGroupInfoResource description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 群组描述
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EMGroupInfoResource membersonly(Boolean membersonly) {
    
    this.membersonly = membersonly;
    return this;
  }

   /**
   * 加入群组是否需要群主或者群管理员审批： - true：是； - false：否
   * @return membersonly
  **/
  @javax.annotation.Nullable
  public Boolean getMembersonly() {
    return membersonly;
  }


  public void setMembersonly(Boolean membersonly) {
    this.membersonly = membersonly;
  }


  public EMGroupInfoResource allowinvites(Boolean allowinvites) {
    
    this.allowinvites = allowinvites;
    return this;
  }

   /**
   * 是否允许群成员邀请其他用户加入此群。 - true：允许群成员邀请其他用户加入此群； - false：只有群主可以邀请其他用户入群。 注：该参数仅对私有群有效，因为公开群不允许群成员邀请其他用户入群
   * @return allowinvites
  **/
  @javax.annotation.Nullable
  public Boolean getAllowinvites() {
    return allowinvites;
  }


  public void setAllowinvites(Boolean allowinvites) {
    this.allowinvites = allowinvites;
  }


  public EMGroupInfoResource maxusers(Integer maxusers) {
    
    this.maxusers = maxusers;
    return this;
  }

   /**
   * 群组最大成员数，创建群组的时候设置，可修改
   * @return maxusers
  **/
  @javax.annotation.Nullable
  public Integer getMaxusers() {
    return maxusers;
  }


  public void setMaxusers(Integer maxusers) {
    this.maxusers = maxusers;
  }


  public EMGroupInfoResource affiliations(List<Object> affiliations) {
    
    this.affiliations = affiliations;
    return this;
  }

  public EMGroupInfoResource addAffiliationsItem(Object affiliationsItem) {
    if (this.affiliations == null) {
      this.affiliations = new ArrayList<>();
    }
    this.affiliations.add(affiliationsItem);
    return this;
  }

   /**
   * 群组成员列表以及对应的角色： - owner：群主； - member：普通成员
   * @return affiliations
  **/
  @javax.annotation.Nullable
  public List<Object> getAffiliations() {
    return affiliations;
  }


  public void setAffiliations(List<Object> affiliations) {
    this.affiliations = affiliations;
  }


  public EMGroupInfoResource owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * 群主的用户 ID
   * @return owner
  **/
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public EMGroupInfoResource created(BigDecimal created) {
    
    this.created = created;
    return this;
  }

   /**
   * 创建该群组的 Unix 时间戳
   * @return created
  **/
  @javax.annotation.Nullable
  public BigDecimal getCreated() {
    return created;
  }


  public void setCreated(BigDecimal created) {
    this.created = created;
  }


  public EMGroupInfoResource affiliationsCount(Integer affiliationsCount) {
    
    this.affiliationsCount = affiliationsCount;
    return this;
  }

   /**
   * 群组现有成员总数
   * @return affiliationsCount
  **/
  @javax.annotation.Nullable
  public Integer getAffiliationsCount() {
    return affiliationsCount;
  }


  public void setAffiliationsCount(Integer affiliationsCount) {
    this.affiliationsCount = affiliationsCount;
  }


  public EMGroupInfoResource disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * 群组是否为禁用状态： - true：群组被禁用； - false：群组为启用状态
   * @return disabled
  **/
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public EMGroupInfoResource mute(Boolean mute) {
    
    this.mute = mute;
    return this;
  }

   /**
   * 是否处于全员禁言状态： - true：是； - （默认）false：否
   * @return mute
  **/
  @javax.annotation.Nullable
  public Boolean getMute() {
    return mute;
  }


  public void setMute(Boolean mute) {
    this.mute = mute;
  }


  public EMGroupInfoResource _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * 是否是公开群： - true：公开群； - false：私有群
   * @return _public
  **/
  @javax.annotation.Nullable
  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public EMGroupInfoResource custom(String custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * 群组扩展信息，例如，可以给群组添加业务相关的标记，不要超过 1,024 字符
   * @return custom
  **/
  @javax.annotation.Nullable
  public String getCustom() {
    return custom;
  }


  public void setCustom(String custom) {
    this.custom = custom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMGroupInfoResource groupInfoResource = (EMGroupInfoResource) o;
    return Objects.equals(this.id, groupInfoResource.id) &&
        Objects.equals(this.name, groupInfoResource.name) &&
        Objects.equals(this.description, groupInfoResource.description) &&
        Objects.equals(this.membersonly, groupInfoResource.membersonly) &&
        Objects.equals(this.allowinvites, groupInfoResource.allowinvites) &&
        Objects.equals(this.maxusers, groupInfoResource.maxusers) &&
        Objects.equals(this.affiliations, groupInfoResource.affiliations) &&
        Objects.equals(this.owner, groupInfoResource.owner) &&
        Objects.equals(this.created, groupInfoResource.created) &&
        Objects.equals(this.affiliationsCount, groupInfoResource.affiliationsCount) &&
        Objects.equals(this.disabled, groupInfoResource.disabled) &&
        Objects.equals(this.mute, groupInfoResource.mute) &&
        Objects.equals(this._public, groupInfoResource._public) &&
        Objects.equals(this.custom, groupInfoResource.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, membersonly, allowinvites, maxusers, affiliations, owner, created, affiliationsCount, disabled, mute, _public, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMGroupInfoResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    membersonly: ").append(toIndentedString(membersonly)).append("\n");
    sb.append("    allowinvites: ").append(toIndentedString(allowinvites)).append("\n");
    sb.append("    maxusers: ").append(toIndentedString(maxusers)).append("\n");
    sb.append("    affiliations: ").append(toIndentedString(affiliations)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    affiliationsCount: ").append(toIndentedString(affiliationsCount)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("membersonly");
    openapiFields.add("allowinvites");
    openapiFields.add("maxusers");
    openapiFields.add("affiliations");
    openapiFields.add("owner");
    openapiFields.add("created");
    openapiFields.add("affiliations_count");
    openapiFields.add("disabled");
    openapiFields.add("mute");
    openapiFields.add("public");
    openapiFields.add("custom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMGroupInfoResource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMGroupInfoResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMGroupInfoResource is not found in the empty JSON string", EMGroupInfoResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMGroupInfoResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMGroupInfoResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("affiliations") != null && !jsonObj.get("affiliations").isJsonNull() && !jsonObj.get("affiliations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `affiliations` to be an array in the JSON string but got `%s`", jsonObj.get("affiliations").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("custom") != null && !jsonObj.get("custom").isJsonNull()) && !jsonObj.get("custom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMGroupInfoResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMGroupInfoResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMGroupInfoResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMGroupInfoResource.class));

       return (TypeAdapter<T>) new TypeAdapter<EMGroupInfoResource>() {
           @Override
           public void write(JsonWriter out, EMGroupInfoResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMGroupInfoResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMGroupInfoResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMGroupInfoResource
  * @throws IOException if the JSON string is invalid with respect to EMGroupInfoResource
  */
  public static EMGroupInfoResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMGroupInfoResource.class);
  }

 /**
  * Convert an instance of EMGroupInfoResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

