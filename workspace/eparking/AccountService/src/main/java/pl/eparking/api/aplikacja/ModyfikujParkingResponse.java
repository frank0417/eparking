
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
 *         &lt;element name="ModyfikujParkingSukces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "modyfikujParkingSukces"
})
@XmlRootElement(name = "ModyfikujParkingResponse")
public class ModyfikujParkingResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ModyfikujParkingSukces")
    protected int modyfikujParkingSukces;

    /**
     * Gets the value of the modyfikujParkingSukces property.
     * 
     */
    public int getModyfikujParkingSukces() {
        return modyfikujParkingSukces;
    }

    /**
     * Sets the value of the modyfikujParkingSukces property.
     * 
     */
    public void setModyfikujParkingSukces(int value) {
        this.modyfikujParkingSukces = value;
    }

}
