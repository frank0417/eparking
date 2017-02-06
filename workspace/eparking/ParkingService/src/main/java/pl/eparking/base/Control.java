
package pl.eparking.base;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Control complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Control"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ControlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ControlDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}Controller" minOccurs="0"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}Address" minOccurs="0"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}Vehicle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Control", propOrder = {
    "controlId",
    "controlDate",
    "controller",
    "address",
    "vehicle"
})
public class Control
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ControlId")
    protected String controlId;
    @XmlElement(name = "ControlDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar controlDate;
    @XmlElement(name = "Controller")
    protected Controller controller;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Vehicle")
    protected Vehicle vehicle;

    /**
     * Gets the value of the controlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlId() {
        return controlId;
    }

    /**
     * Sets the value of the controlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlId(String value) {
        this.controlId = value;
    }

    /**
     * Gets the value of the controlDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getControlDate() {
        return controlDate;
    }

    /**
     * Sets the value of the controlDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setControlDate(XMLGregorianCalendar value) {
        this.controlDate = value;
    }

    /**
     * Gets the value of the controller property.
     * 
     * @return
     *     possible object is
     *     {@link Controller }
     *     
     */
    public Controller getController() {
        return controller;
    }

    /**
     * Sets the value of the controller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Controller }
     *     
     */
    public void setController(Controller value) {
        this.controller = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

}
