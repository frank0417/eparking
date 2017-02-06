
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
    "address_type",
    "province",
    "postal_code",
    "city",
    "street",
    "street_number",
    "flat_number"
})
public class Address {

    @JsonProperty("address_type")
    private String addressType;
    @JsonProperty("province")
    private String province;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("street")
    private String street;
    @JsonProperty("street_number")
    private String streetNumber;
    @JsonProperty("flat_number")
    private String flatNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The addressType
     */
    @JsonProperty("address_type")
    public String getAddressType() {
        return addressType;
    }

    /**
     * 
     * @param addressType
     *     The address_type
     */
    @JsonProperty("address_type")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    /**
     * 
     * @return
     *     The province
     */
    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    /**
     * 
     * @param province
     *     The province
     */
    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postal_code
     */
    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The street
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * 
     * @param street
     *     The street
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 
     * @return
     *     The streetNumber
     */
    @JsonProperty("street_number")
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * 
     * @param streetNumber
     *     The street_number
     */
    @JsonProperty("street_number")
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * 
     * @return
     *     The flatNumber
     */
    @JsonProperty("flat_number")
    public String getFlatNumber() {
        return flatNumber;
    }

    /**
     * 
     * @param flatNumber
     *     The flat_number
     */
    @JsonProperty("flat_number")
    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
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
        return new HashCodeBuilder().append(addressType).append(province).append(postalCode).append(city).append(street).append(streetNumber).append(flatNumber).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(addressType, rhs.addressType).append(province, rhs.province).append(postalCode, rhs.postalCode).append(city, rhs.city).append(street, rhs.street).append(streetNumber, rhs.streetNumber).append(flatNumber, rhs.flatNumber).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
