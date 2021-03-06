
package pl.eparking.parkingservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.Account;
import pl.eparking.base.Parking;
import pl.eparking.technical.BaseRequest;


/**
 * <p>Java class for notifyParking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notifyParking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/base}Parking"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}Account"/&gt;
 *         &lt;element name="ParkingAction" type="{http://eparking.pl/parkingservice}ParkingAction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifyParking", propOrder = {
    "parking",
    "account",
    "parkingAction"
})
public class NotifyParking
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Parking", namespace = "http://eparking.pl/base", required = true)
    protected Parking parking;
    @XmlElement(name = "Account", namespace = "http://eparking.pl/base", required = true)
    protected Account account;
    @XmlElement(name = "ParkingAction", required = true)
    @XmlSchemaType(name = "string")
    protected ParkingAction parkingAction;

    /**
     * Gets the value of the parking property.
     * 
     * @return
     *     possible object is
     *     {@link Parking }
     *     
     */
    public Parking getParking() {
        return parking;
    }

    /**
     * Sets the value of the parking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parking }
     *     
     */
    public void setParking(Parking value) {
        this.parking = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the parkingAction property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAction }
     *     
     */
    public ParkingAction getParkingAction() {
        return parkingAction;
    }

    /**
     * Sets the value of the parkingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAction }
     *     
     */
    public void setParkingAction(ParkingAction value) {
        this.parkingAction = value;
    }

}
