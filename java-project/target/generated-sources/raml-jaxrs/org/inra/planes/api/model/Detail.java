
package org.inra.planes.api.model;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * errorDetail
 * <p>
 * schema for specific error cause
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "field",
    "type",
    "message",
    "moreInfo"
})
public class Detail {

    /**
     * a bean notation expression specifying the element in request data causing the error, eg product.variants[3].name, this can be empty if violation was not field specific
     * 
     */
    @JsonProperty("field")
    private String field;
    /**
     * classification of the error detail type, lower case with underscore eg missing_value, this value must be always interpreted in context of the general error type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * descriptive error detail message for debugging
     * 
     */
    @JsonProperty("message")
    private String message;
    /**
     * link to documentation to investigate further and finding support for error detail
     * 
     */
    @JsonProperty("moreInfo")
    private URI moreInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * a bean notation expression specifying the element in request data causing the error, eg product.variants[3].name, this can be empty if violation was not field specific
     * 
     * @return
     *     The field
     */
    @JsonProperty("field")
    public String getField() {
        return field;
    }

    /**
     * a bean notation expression specifying the element in request data causing the error, eg product.variants[3].name, this can be empty if violation was not field specific
     * 
     * @param field
     *     The field
     */
    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    public Detail withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * classification of the error detail type, lower case with underscore eg missing_value, this value must be always interpreted in context of the general error type.
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * classification of the error detail type, lower case with underscore eg missing_value, this value must be always interpreted in context of the general error type.
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Detail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * descriptive error detail message for debugging
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * descriptive error detail message for debugging
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Detail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * link to documentation to investigate further and finding support for error detail
     * 
     * @return
     *     The moreInfo
     */
    @JsonProperty("moreInfo")
    public URI getMoreInfo() {
        return moreInfo;
    }

    /**
     * link to documentation to investigate further and finding support for error detail
     * 
     * @param moreInfo
     *     The moreInfo
     */
    @JsonProperty("moreInfo")
    public void setMoreInfo(URI moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Detail withMoreInfo(URI moreInfo) {
        this.moreInfo = moreInfo;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Detail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
