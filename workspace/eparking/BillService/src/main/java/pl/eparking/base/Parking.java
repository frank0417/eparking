
package pl.eparking.base;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Parking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParkingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParkingStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ParkingEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}ParkingType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}Address" minOccurs="0"/&gt;
 *         &lt;element name="ParkingTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ParkingPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ParkingStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="started"/&gt;
 *               &lt;enumeration value="finished"/&gt;
 *               &lt;enumeration value="cancelled"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parking", propOrder = {
    "parkingId",
    "vehicleId",
    "parkingStart",
    "parkingEnd",
    "parkingType",
    "address",
    "parkingTime",
    "parkingPrice",
    "parkingStatus"
})
public class Parking
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ParkingId")
    protected String parkingId;
    @XmlElement(name = "VehicleId")
    protected String vehicleId;
    @XmlElement(name = "ParkingStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar parkingStart;
    @XmlElement(name = "ParkingEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar parkingEnd;
    @XmlElement(name = "ParkingType")
    protected String parkingType;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "ParkingTime")
    protected Double parkingTime;
    @XmlElement(name = "ParkingPrice")
    protected Double parkingPrice;
    @XmlElement(name = "ParkingStatus")
    protected String parkingStatus;

    /**
     * Gets the value of the parkingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingId() {
        return parkingId;
    }

    /**
     * Sets the value of the parkingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingId(String value) {
        this.parkingId = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleId(String value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the parkingStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParkingStart() {
        return parkingStart;
    }

    /**
     * Sets the value of the parkingStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParkingStart(XMLGregorianCalendar value) {
        this.parkingStart = value;
    }

    /**
     * Gets the value of the parkingEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParkingEnd() {
        return parkingEnd;
    }

    /**
     * Sets the value of the parkingEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParkingEnd(XMLGregorianCalendar value) {
        this.parkingEnd = value;
    }

    /**
     * Gets the value of the parkingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingType() {
        return parkingType;
    }

    /**
     * Sets the value of the parkingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingType(String value) {
        this.parkingType = value;
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
     * Gets the value of the parkingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParkingTime() {
        return parkingTime;
    }

    /**
     * Sets the value of the parkingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParkingTime(Double value) {
        this.parkingTime = value;
    }

    /**
     * Gets the value of the parkingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParkingPrice() {
        return parkingPrice;
    }

    /**
     * Sets the value of the parkingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParkingPrice(Double value) {
        this.parkingPrice = value;
    }

    /**
     * Gets the value of the parkingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingStatus() {
        return parkingStatus;
    }

    /**
     * Sets the value of the parkingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingStatus(String value) {
        this.parkingStatus = value;
    }

}
