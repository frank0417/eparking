
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
 *         &lt;element name="DodajKontroleData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DodajKontroleKontroler" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajKontroleAdres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajKontrolePojazd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "dodajKontroleData",
    "dodajKontroleKontroler",
    "dodajKontroleAdres",
    "dodajKontrolePojazd"
})
@XmlRootElement(name = "DodajKontrole")
public class DodajKontrole
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DodajKontroleData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dodajKontroleData;
    @XmlElement(name = "DodajKontroleKontroler", required = true)
    protected String dodajKontroleKontroler;
    @XmlElement(name = "DodajKontroleAdres", required = true)
    protected String dodajKontroleAdres;
    @XmlElement(name = "DodajKontrolePojazd", required = true)
    protected String dodajKontrolePojazd;

    /**
     * Gets the value of the dodajKontroleData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDodajKontroleData() {
        return dodajKontroleData;
    }

    /**
     * Sets the value of the dodajKontroleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDodajKontroleData(XMLGregorianCalendar value) {
        this.dodajKontroleData = value;
    }

    /**
     * Gets the value of the dodajKontroleKontroler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajKontroleKontroler() {
        return dodajKontroleKontroler;
    }

    /**
     * Sets the value of the dodajKontroleKontroler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajKontroleKontroler(String value) {
        this.dodajKontroleKontroler = value;
    }

    /**
     * Gets the value of the dodajKontroleAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajKontroleAdres() {
        return dodajKontroleAdres;
    }

    /**
     * Sets the value of the dodajKontroleAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajKontroleAdres(String value) {
        this.dodajKontroleAdres = value;
    }

    /**
     * Gets the value of the dodajKontrolePojazd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajKontrolePojazd() {
        return dodajKontrolePojazd;
    }

    /**
     * Sets the value of the dodajKontrolePojazd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajKontrolePojazd(String value) {
        this.dodajKontrolePojazd = value;
    }

}
