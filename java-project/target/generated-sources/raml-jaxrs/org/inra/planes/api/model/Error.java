
package org.inra.planes.api.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * error
 * <p>
 * Schema for API specified errors.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "status",
    "type",
    "message",
    "moreInfo",
    "details"
})
public class Error {

    /**
     * original HTTP error code, should be consistent with the response HTTP code
     * (Required)
     * 
     */
    @JsonProperty("status")
    private Integer status;
    /**
     * classification of the error type, lower case with underscore eg validation_failure
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * descriptive error message for debugging
     * 
     */
    @JsonProperty("message")
    private String message;
    /**
     * link to documentation to investigate further and finding support
     * 
     */
    @JsonProperty("moreInfo")
    private URI moreInfo;
    /**
     * list of problems causing this error
     * 
     */
    @JsonProperty("details")
    private List<Detail> details = new ArrayList<Detail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * original HTTP error code, should be consistent with the response HTTP code
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    /**
     * original HTTP error code, should be consistent with the response HTTP code
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Error withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * classification of the error type, lower case with underscore eg validation_failure
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
     * classification of the error type, lower case with underscore eg validation_failure
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Error withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * descriptive error message for debugging
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * descriptive error message for debugging
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * link to documentation to investigate further and finding support
     * 
     * @return
     *     The moreInfo
     */
    @JsonProperty("moreInfo")
    public URI getMoreInfo() {
        return moreInfo;
    }

    /**
     * link to documentation to investigate further and finding support
     * 
     * @param moreInfo
     *     The moreInfo
     */
    @JsonProperty("moreInfo")
    public void setMoreInfo(URI moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Error withMoreInfo(URI moreInfo) {
        this.moreInfo = moreInfo;
        return this;
    }

    /**
     * list of problems causing this error
     * 
     * @return
     *     The details
     */
    @JsonProperty("details")
    public List<Detail> getDetails() {
        return details;
    }

    /**
     * list of problems causing this error
     * 
     * @param details
     *     The details
     */
    @JsonProperty("details")
    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Error withDetails(List<Detail> details) {
        this.details = details;
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

    public Error withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
