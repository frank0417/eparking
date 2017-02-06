
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
    "account_id",
    "person_id",
    "billing_id",
    "vehicle_id",
    "status"
})
public class Account {

    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("person_id")
    private String personId;
    @JsonProperty("billing_id")
    private String billingId;
    @JsonProperty("vehicle_id")
    private String vehicleId;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The accountId
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }

    /**
     * 
     * @param accountId
     *     The account_id
     */
    @JsonProperty("account_id")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * @return
     *     The personId
     */
    @JsonProperty("person_id")
    public String getPersonId() {
        return personId;
    }

    /**
     * 
     * @param personId
     *     The person_id
     */
    @JsonProperty("person_id")
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * 
     * @return
     *     The billingId
     */
    @JsonProperty("billing_id")
    public String getBillingId() {
        return billingId;
    }

    /**
     * 
     * @param billingId
     *     The billing_id
     */
    @JsonProperty("billing_id")
    public void setBillingId(String billingId) {
        this.billingId = billingId;
    }

    /**
     * 
     * @return
     *     The vehicleId
     */
    @JsonProperty("vehicle_id")
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * 
     * @param vehicleId
     *     The vehicle_id
     */
    @JsonProperty("vehicle_id")
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
        return new HashCodeBuilder().append(accountId).append(personId).append(billingId).append(vehicleId).append(status).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Account) == false) {
            return false;
        }
        Account rhs = ((Account) other);
        return new EqualsBuilder().append(accountId, rhs.accountId).append(personId, rhs.personId).append(billingId, rhs.billingId).append(vehicleId, rhs.vehicleId).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
