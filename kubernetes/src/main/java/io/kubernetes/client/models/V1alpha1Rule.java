/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Rule is a tuple of APIGroups, APIVersion, and Resources.It is recommended to make sure that all the tuple expansions are valid.
 */
@ApiModel(description = "Rule is a tuple of APIGroups, APIVersion, and Resources.It is recommended to make sure that all the tuple expansions are valid.")

public class V1alpha1Rule {
  @SerializedName("apiGroups")
  private List<String> apiGroups = null;

  @SerializedName("apiVersions")
  private List<String> apiVersions = null;

  @SerializedName("resources")
  private List<String> resources = null;

  public V1alpha1Rule apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  public V1alpha1Rule addApiGroupsItem(String apiGroupsItem) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<String>();
    }
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

   /**
   * APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return apiGroups
  **/
  @ApiModelProperty(value = "APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }

  public V1alpha1Rule apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public V1alpha1Rule addApiVersionsItem(String apiVersionsItem) {
    if (this.apiVersions == null) {
      this.apiVersions = new ArrayList<String>();
    }
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

   /**
   * APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return apiVersions
  **/
  @ApiModelProperty(value = "APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.")
  public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }

  public V1alpha1Rule resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public V1alpha1Rule addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Resources is a list of resources this rule applies to.  For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/_*&#39; means all subresources of pods. &#39;*_/scale&#39; means all scale subresources. &#39;*_/_*&#39; means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.
   * @return resources
  **/
  @ApiModelProperty(value = "Resources is a list of resources this rule applies to.  For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/_*' means all subresources of pods. '*_/scale' means all scale subresources. '*_/_*' means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Rule v1alpha1Rule = (V1alpha1Rule) o;
    return Objects.equals(this.apiGroups, v1alpha1Rule.apiGroups) &&
        Objects.equals(this.apiVersions, v1alpha1Rule.apiVersions) &&
        Objects.equals(this.resources, v1alpha1Rule.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroups, apiVersions, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Rule {\n");
    
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
