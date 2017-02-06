
package pl.eparking.base;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Controller complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Controller"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ControllerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}Person" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Controller", propOrder = {
    "controllerId",
    "person"
})
public class Controller
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ControllerId", required = true)
    protected String controllerId;
    @XmlElement(name = "Person")
    protected Person person;

    /**
     * Gets the value of the controllerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerId() {
        return controllerId;
    }

    /**
     * Sets the value of the controllerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerId(String value) {
        this.controllerId = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
