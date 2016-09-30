
package org.inra.planes.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Model",
    "Engines",
    "Type",
    "Seats",
    "Speed-miles-ph",
    "Altitude-feet"
})
public class Plane_ {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Model")
    private String Model;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Engines")
    private Double Engines;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Type")
    private String Type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Seats")
    private Double Seats;
    @JsonProperty("Speed-miles-ph")
    private Double SpeedMilesPh;
    @JsonProperty("Altitude-feet")
    private Double AltitudeFeet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The Model
     */
    @JsonProperty("Model")
    public String getModel() {
        return Model;
    }

    /**
     * 
     * (Required)
     * 
     * @param Model
     *     The Model
     */
    @JsonProperty("Model")
    public void setModel(String Model) {
        this.Model = Model;
    }

    public Plane_ withModel(String Model) {
        this.Model = Model;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The Engines
     */
    @JsonProperty("Engines")
    public Double getEngines() {
        return Engines;
    }

    /**
     * 
     * (Required)
     * 
     * @param Engines
     *     The Engines
     */
    @JsonProperty("Engines")
    public void setEngines(Double Engines) {
        this.Engines = Engines;
    }

    public Plane_ withEngines(Double Engines) {
        this.Engines = Engines;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * 
     * (Required)
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

    public Plane_ withType(String Type) {
        this.Type = Type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The Seats
     */
    @JsonProperty("Seats")
    public Double getSeats() {
        return Seats;
    }

    /**
     * 
     * (Required)
     * 
     * @param Seats
     *     The Seats
     */
    @JsonProperty("Seats")
    public void setSeats(Double Seats) {
        this.Seats = Seats;
    }

    public Plane_ withSeats(Double Seats) {
        this.Seats = Seats;
        return this;
    }

    /**
     * 
     * @return
     *     The SpeedMilesPh
     */
    @JsonProperty("Speed-miles-ph")
    public Double getSpeedMilesPh() {
        return SpeedMilesPh;
    }

    /**
     * 
     * @param SpeedMilesPh
     *     The Speed-miles-ph
     */
    @JsonProperty("Speed-miles-ph")
    public void setSpeedMilesPh(Double SpeedMilesPh) {
        this.SpeedMilesPh = SpeedMilesPh;
    }

    public Plane_ withSpeedMilesPh(Double SpeedMilesPh) {
        this.SpeedMilesPh = SpeedMilesPh;
        return this;
    }

    /**
     * 
     * @return
     *     The AltitudeFeet
     */
    @JsonProperty("Altitude-feet")
    public Double getAltitudeFeet() {
        return AltitudeFeet;
    }

    /**
     * 
     * @param AltitudeFeet
     *     The Altitude-feet
     */
    @JsonProperty("Altitude-feet")
    public void setAltitudeFeet(Double AltitudeFeet) {
        this.AltitudeFeet = AltitudeFeet;
    }

    public Plane_ withAltitudeFeet(Double AltitudeFeet) {
        this.AltitudeFeet = AltitudeFeet;
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

    public Plane_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
