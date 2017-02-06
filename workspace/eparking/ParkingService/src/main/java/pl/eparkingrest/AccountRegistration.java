
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
    "person",
    "vehicle"
})
public class AccountRegistration {

    @JsonProperty("person")
    private Person person;
    @JsonProperty("vehicle")
    private Vehicle vehicle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The person
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * 
     * @param person
     *     The person
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * 
     * @return
     *     The vehicle
     */
    @JsonProperty("vehicle")
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * 
     * @param vehicle
     *     The vehicle
     */
    @JsonProperty("vehicle")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
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
        return new HashCodeBuilder().append(person).append(vehicle).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountRegistration) == false) {
            return false;
        }
        AccountRegistration rhs = ((AccountRegistration) other);
        return new EqualsBuilder().append(person, rhs.person).append(vehicle, rhs.vehicle).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
