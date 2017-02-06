
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
    "parking_type",
    "parking_time",
    "parking_end",
    "parking_price",
    "province",
    "postal_code",
    "city",
    "street",
    "street_number"
})
public class Parking {

    @JsonProperty("parking_type")
    private String parkingType;
    @JsonProperty("parking_time")
    private String parkingTime;
    @JsonProperty("parking_end")
    private String parkingEnd;
    @JsonProperty("parking_price")
    private String parkingPrice;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The parkingType
     */
    @JsonProperty("parking_type")
    public String getParkingType() {
        return parkingType;
    }

    /**
     * 
     * @param parkingType
     *     The parking_type
     */
    @JsonProperty("parking_type")
    public void setParkingType(String parkingType) {
        this.parkingType = parkingType;
    }

    /**
     * 
     * @return
     *     The parkingTime
     */
    @JsonProperty("parking_time")
    public String getParkingTime() {
        return parkingTime;
    }

    /**
     * 
     * @param parkingTime
     *     The parking_time
     */
    @JsonProperty("parking_time")
    public void setParkingTime(String parkingTime) {
        this.parkingTime = parkingTime;
    }

    /**
     * 
     * @return
     *     The parkingEnd
     */
    @JsonProperty("parking_end")
    public String getParkingEnd() {
        return parkingEnd;
    }

    /**
     * 
     * @param parkingEnd
     *     The parking_end
     */
    @JsonProperty("parking_end")
    public void setParkingEnd(String parkingEnd) {
        this.parkingEnd = parkingEnd;
    }

    /**
     * 
     * @return
     *     The parkingPrice
     */
    @JsonProperty("parking_price")
    public String getParkingPrice() {
        return parkingPrice;
    }

    /**
     * 
     * @param parkingPrice
     *     The parking_price
     */
    @JsonProperty("parking_price")
    public void setParkingPrice(String parkingPrice) {
        this.parkingPrice = parkingPrice;
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
        return new HashCodeBuilder().append(parkingType).append(parkingTime).append(parkingEnd).append(parkingPrice).append(province).append(postalCode).append(city).append(street).append(streetNumber).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parking) == false) {
            return false;
        }
        Parking rhs = ((Parking) other);
        return new EqualsBuilder().append(parkingType, rhs.parkingType).append(parkingTime, rhs.parkingTime).append(parkingEnd, rhs.parkingEnd).append(parkingPrice, rhs.parkingPrice).append(province, rhs.province).append(postalCode, rhs.postalCode).append(city, rhs.city).append(street, rhs.street).append(streetNumber, rhs.streetNumber).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
