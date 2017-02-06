
package pl.eparking.api.aplikacja;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DodajParkingSukces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DodajParkingParking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dodajParkingSukces",
    "dodajParkingParking"
})
@XmlRootElement(name = "DodajParkingResponse")
public class DodajParkingResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DodajParkingSukces")
    protected int dodajParkingSukces;
    @XmlElement(name = "DodajParkingParking")
    protected String dodajParkingParking;

    /**
     * Gets the value of the dodajParkingSukces property.
     * 
     */
    public int getDodajParkingSukces() {
        return dodajParkingSukces;
    }

    /**
     * Sets the value of the dodajParkingSukces property.
     * 
     */
    public void setDodajParkingSukces(int value) {
        this.dodajParkingSukces = value;
    }

    /**
     * Gets the value of the dodajParkingParking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingParking() {
        return dodajParkingParking;
    }

    /**
     * Sets the value of the dodajParkingParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingParking(String value) {
        this.dodajParkingParking = value;
    }

}
