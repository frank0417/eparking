
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
 *         &lt;element name="DodajParkingStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DodajParkingKoniec" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DodajParkingKonto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajParkingPojazd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajParkingKodPocztowy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajParkingMiasto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajParkingUlica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajParkingNumer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajParkingCzas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajParkingCena" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajParkingSaldoDodatnie" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "dodajParkingStart",
    "dodajParkingKoniec",
    "dodajParkingKonto",
    "dodajParkingPojazd",
    "dodajParkingKodPocztowy",
    "dodajParkingMiasto",
    "dodajParkingUlica",
    "dodajParkingNumer",
    "dodajParkingCzas",
    "dodajParkingCena",
    "dodajParkingSaldoDodatnie"
})
@XmlRootElement(name = "DodajParking")
public class DodajParking
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DodajParkingStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dodajParkingStart;
    @XmlElement(name = "DodajParkingKoniec", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dodajParkingKoniec;
    @XmlElement(name = "DodajParkingKonto", required = true)
    protected String dodajParkingKonto;
    @XmlElement(name = "DodajParkingPojazd", required = true)
    protected String dodajParkingPojazd;
    @XmlElement(name = "DodajParkingKodPocztowy", required = true)
    protected String dodajParkingKodPocztowy;
    @XmlElement(name = "DodajParkingMiasto", required = true)
    protected String dodajParkingMiasto;
    @XmlElement(name = "DodajParkingUlica", required = true)
    protected String dodajParkingUlica;
    @XmlElement(name = "DodajParkingNumer", required = true)
    protected String dodajParkingNumer;
    @XmlElement(name = "DodajParkingCzas", required = true)
    protected String dodajParkingCzas;
    @XmlElement(name = "DodajParkingCena", required = true)
    protected String dodajParkingCena;
    @XmlElement(name = "DodajParkingSaldoDodatnie")
    protected boolean dodajParkingSaldoDodatnie;

    /**
     * Gets the value of the dodajParkingStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDodajParkingStart() {
        return dodajParkingStart;
    }

    /**
     * Sets the value of the dodajParkingStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDodajParkingStart(XMLGregorianCalendar value) {
        this.dodajParkingStart = value;
    }

    /**
     * Gets the value of the dodajParkingKoniec property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDodajParkingKoniec() {
        return dodajParkingKoniec;
    }

    /**
     * Sets the value of the dodajParkingKoniec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDodajParkingKoniec(XMLGregorianCalendar value) {
        this.dodajParkingKoniec = value;
    }

    /**
     * Gets the value of the dodajParkingKonto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingKonto() {
        return dodajParkingKonto;
    }

    /**
     * Sets the value of the dodajParkingKonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingKonto(String value) {
        this.dodajParkingKonto = value;
    }

    /**
     * Gets the value of the dodajParkingPojazd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingPojazd() {
        return dodajParkingPojazd;
    }

    /**
     * Sets the value of the dodajParkingPojazd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingPojazd(String value) {
        this.dodajParkingPojazd = value;
    }

    /**
     * Gets the value of the dodajParkingKodPocztowy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingKodPocztowy() {
        return dodajParkingKodPocztowy;
    }

    /**
     * Sets the value of the dodajParkingKodPocztowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingKodPocztowy(String value) {
        this.dodajParkingKodPocztowy = value;
    }

    /**
     * Gets the value of the dodajParkingMiasto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingMiasto() {
        return dodajParkingMiasto;
    }

    /**
     * Sets the value of the dodajParkingMiasto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingMiasto(String value) {
        this.dodajParkingMiasto = value;
    }

    /**
     * Gets the value of the dodajParkingUlica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingUlica() {
        return dodajParkingUlica;
    }

    /**
     * Sets the value of the dodajParkingUlica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingUlica(String value) {
        this.dodajParkingUlica = value;
    }

    /**
     * Gets the value of the dodajParkingNumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingNumer() {
        return dodajParkingNumer;
    }

    /**
     * Sets the value of the dodajParkingNumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingNumer(String value) {
        this.dodajParkingNumer = value;
    }

    /**
     * Gets the value of the dodajParkingCzas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingCzas() {
        return dodajParkingCzas;
    }

    /**
     * Sets the value of the dodajParkingCzas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingCzas(String value) {
        this.dodajParkingCzas = value;
    }

    /**
     * Gets the value of the dodajParkingCena property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajParkingCena() {
        return dodajParkingCena;
    }

    /**
     * Sets the value of the dodajParkingCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajParkingCena(String value) {
        this.dodajParkingCena = value;
    }

    /**
     * Gets the value of the dodajParkingSaldoDodatnie property.
     * 
     */
    public boolean isDodajParkingSaldoDodatnie() {
        return dodajParkingSaldoDodatnie;
    }

    /**
     * Sets the value of the dodajParkingSaldoDodatnie property.
     * 
     */
    public void setDodajParkingSaldoDodatnie(boolean value) {
        this.dodajParkingSaldoDodatnie = value;
    }

}
