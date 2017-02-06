
package pl.eparking.base;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSearchCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="VehicleRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="VehicleVinNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="BillId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSearchCriteria", propOrder = {
    "vehicleRegistrationNumber",
    "vehicleVinNumber",
    "personId",
    "billId"
})
public class AccountSearchCriteria
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleRegistrationNumber")
    protected String vehicleRegistrationNumber;
    @XmlElement(name = "VehicleVinNumber")
    protected String vehicleVinNumber;
    @XmlElement(name = "PersonId")
    protected String personId;
    @XmlElement(name = "BillId")
    protected String billId;

    /**
     * Gets the value of the vehicleRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    /**
     * Sets the value of the vehicleRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegistrationNumber(String value) {
        this.vehicleRegistrationNumber = value;
    }

    /**
     * Gets the value of the vehicleVinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleVinNumber() {
        return vehicleVinNumber;
    }

    /**
     * Sets the value of the vehicleVinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleVinNumber(String value) {
        this.vehicleVinNumber = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillId(String value) {
        this.billId = value;
    }

}
