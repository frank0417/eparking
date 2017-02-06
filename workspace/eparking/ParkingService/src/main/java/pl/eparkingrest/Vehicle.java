
package pl.eparkingrest;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "vehicle_type",
    "brand",
    "model",
    "registration_number",
    "vin_number",
    "production_date",
    "color"
})
public class Vehicle {

    @JsonProperty("vehicle_type")
    private String vehicleType;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("model")
    private String model;
    @JsonProperty("registration_number")
    private String registrationNumber;
    @JsonProperty("vin_number")
    private String vinNumber;
    @JsonProperty("production_date")
    private String productionDate;
    @JsonProperty("color")
    private String color;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The vehicleType
     */
    @JsonProperty("vehicle_type")
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 
     * @param vehicleType
     *     The vehicle_type
     */
    @JsonProperty("vehicle_type")
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * 
     * @return
     *     The brand
     */
    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The brand
     */
    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The model
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    /**
     * 
     * @param model
     *     The model
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 
     * @return
     *     The registrationNumber
     */
    @JsonProperty("registration_number")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * 
     * @param registrationNumber
     *     The registration_number
     */
    @JsonProperty("registration_number")
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * 
     * @return
     *     The vinNumber
     */
    @JsonProperty("vin_number")
    public String getVinNumber() {
        return vinNumber;
    }

    /**
     * 
     * @param vinNumber
     *     The vin_number
     */
    @JsonProperty("vin_number")
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    /**
     * 
     * @return
     *     The productionDate
     */
    @JsonProperty("production_date")
    public String getProductionDate() {
        return productionDate;
    }

    /**
     * 
     * @param productionDate
     *     The production_date
     */
    @JsonProperty("production_date")
    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    /**
     * 
     * @return
     *     The color
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vehicleType).append(brand).append(model).append(registrationNumber).append(vinNumber).append(productionDate).append(color).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Vehicle) == false) {
            return false;
        }
        Vehicle rhs = ((Vehicle) other);
        return new EqualsBuilder().append(vehicleType, rhs.vehicleType).append(brand, rhs.brand).append(model, rhs.model).append(registrationNumber, rhs.registrationNumber).append(vinNumber, rhs.vinNumber).append(productionDate, rhs.productionDate).append(color, rhs.color).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
