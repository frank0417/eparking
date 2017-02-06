
package pl.eparking.parkingservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.Parking;
import pl.eparking.technical.BaseResponse;


/**
 * <p>Java class for addParkingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addParkingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/base}Parking" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addParkingResponse", propOrder = {
    "parking"
})
public class AddParkingResponse
    extends BaseResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Parking", namespace = "http://eparking.pl/base")
    protected Parking parking;

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

}
