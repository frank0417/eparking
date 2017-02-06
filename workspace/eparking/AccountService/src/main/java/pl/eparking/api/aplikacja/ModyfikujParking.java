
package pl.eparking.api.aplikacja;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ModyfikujParkingKonto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ModyfikujParkingParking" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ModyfikujParkingPojazd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ModyfikujParkingStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ModyfikujParkingKoniec" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ModyfikujParkingPoczta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModyfikujParkingMiasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModyfikujParkingUlica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModyfikujParkingNumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModyfikujParkingCzas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModyfikujParkingCena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "modyfikujParkingKonto",
    "modyfikujParkingParking",
    "modyfikujParkingPojazd",
    "modyfikujParkingStart",
    "modyfikujParkingKoniec",
    "modyfikujParkingPoczta",
    "modyfikujParkingMiasto",
    "modyfikujParkingUlica",
    "modyfikujParkingNumer",
    "modyfikujParkingCzas",
    "modyfikujParkingCena"
})
@XmlRootElement(name = "ModyfikujParking")
public class ModyfikujParking
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ModyfikujParkingKonto", required = true)
    protected String modyfikujParkingKonto;
    @XmlElement(name = "ModyfikujParkingParking", required = true)
    protected String modyfikujParkingParking;
    @XmlElement(name = "ModyfikujParkingPojazd", required = true)
    protected String modyfikujParkingPojazd;
    @XmlElement(name = "ModyfikujParkingStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modyfikujParkingStart;
    @XmlElement(name = "ModyfikujParkingKoniec")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modyfikujParkingKoniec;
    @XmlElement(name = "ModyfikujParkingPoczta")
    protected String modyfikujParkingPoczta;
    @XmlElement(name = "ModyfikujParkingMiasto")
    protected String modyfikujParkingMiasto;
    @XmlElement(name = "ModyfikujParkingUlica")
    protected String modyfikujParkingUlica;
    @XmlElement(name = "ModyfikujParkingNumer")
    protected String modyfikujParkingNumer;
    @XmlElement(name = "ModyfikujParkingCzas")
    protected String modyfikujParkingCzas;
    @XmlElement(name = "ModyfikujParkingCena")
    protected String modyfikujParkingCena;

    /**
     * Gets the value of the modyfikujParkingKonto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingKonto() {
        return modyfikujParkingKonto;
    }

    /**
     * Sets the value of the modyfikujParkingKonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingKonto(String value) {
        this.modyfikujParkingKonto = value;
    }

    /**
     * Gets the value of the modyfikujParkingParking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingParking() {
        return modyfikujParkingParking;
    }

    /**
     * Sets the value of the modyfikujParkingParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingParking(String value) {
        this.modyfikujParkingParking = value;
    }

    /**
     * Gets the value of the modyfikujParkingPojazd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingPojazd() {
        return modyfikujParkingPojazd;
    }

    /**
     * Sets the value of the modyfikujParkingPojazd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingPojazd(String value) {
        this.modyfikujParkingPojazd = value;
    }

    /**
     * Gets the value of the modyfikujParkingStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModyfikujParkingStart() {
        return modyfikujParkingStart;
    }

    /**
     * Sets the value of the modyfikujParkingStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModyfikujParkingStart(XMLGregorianCalendar value) {
        this.modyfikujParkingStart = value;
    }

    /**
     * Gets the value of the modyfikujParkingKoniec property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModyfikujParkingKoniec() {
        return modyfikujParkingKoniec;
    }

    /**
     * Sets the value of the modyfikujParkingKoniec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModyfikujParkingKoniec(XMLGregorianCalendar value) {
        this.modyfikujParkingKoniec = value;
    }

    /**
     * Gets the value of the modyfikujParkingPoczta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingPoczta() {
        return modyfikujParkingPoczta;
    }

    /**
     * Sets the value of the modyfikujParkingPoczta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingPoczta(String value) {
        this.modyfikujParkingPoczta = value;
    }

    /**
     * Gets the value of the modyfikujParkingMiasto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingMiasto() {
        return modyfikujParkingMiasto;
    }

    /**
     * Sets the value of the modyfikujParkingMiasto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingMiasto(String value) {
        this.modyfikujParkingMiasto = value;
    }

    /**
     * Gets the value of the modyfikujParkingUlica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingUlica() {
        return modyfikujParkingUlica;
    }

    /**
     * Sets the value of the modyfikujParkingUlica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingUlica(String value) {
        this.modyfikujParkingUlica = value;
    }

    /**
     * Gets the value of the modyfikujParkingNumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingNumer() {
        return modyfikujParkingNumer;
    }

    /**
     * Sets the value of the modyfikujParkingNumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingNumer(String value) {
        this.modyfikujParkingNumer = value;
    }

    /**
     * Gets the value of the modyfikujParkingCzas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingCzas() {
        return modyfikujParkingCzas;
    }

    /**
     * Sets the value of the modyfikujParkingCzas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingCzas(String value) {
        this.modyfikujParkingCzas = value;
    }

    /**
     * Gets the value of the modyfikujParkingCena property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModyfikujParkingCena() {
        return modyfikujParkingCena;
    }

    /**
     * Sets the value of the modyfikujParkingCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModyfikujParkingCena(String value) {
        this.modyfikujParkingCena = value;
    }

}
