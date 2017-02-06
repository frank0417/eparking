
package pl.eparking.parkingservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.Account;
import pl.eparking.base.Parking;
import pl.eparking.technical.BaseRequest;


/**
 * <p>Java class for getParking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getParking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseRequest"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://eparking.pl/base}Parking"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}Account"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getParking", propOrder = {
    "parking",
    "account"
})
public class GetParking
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Parking", namespace = "http://eparking.pl/base")
    protected Parking parking;
    @XmlElement(name = "Account", namespace = "http://eparking.pl/base")
    protected Account account;

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

}
