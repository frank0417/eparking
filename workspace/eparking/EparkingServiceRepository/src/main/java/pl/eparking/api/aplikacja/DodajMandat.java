
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
 *         &lt;element name="DodajMandatKwota" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajMandatIdKontroli" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajMandatIdKontaKierowcy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajMandatDataKontroli" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DodajMandatTypMandatu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "dodajMandatKwota",
    "dodajMandatIdKontroli",
    "dodajMandatIdKontaKierowcy",
    "dodajMandatDataKontroli",
    "dodajMandatTypMandatu"
})
@XmlRootElement(name = "DodajMandat")
public class DodajMandat
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DodajMandatKwota", required = true)
    protected String dodajMandatKwota;
    @XmlElement(name = "DodajMandatIdKontroli", required = true)
    protected String dodajMandatIdKontroli;
    @XmlElement(name = "DodajMandatIdKontaKierowcy", required = true)
    protected String dodajMandatIdKontaKierowcy;
    @XmlElement(name = "DodajMandatDataKontroli", required = true)
    protected String dodajMandatDataKontroli;
    @XmlElement(name = "DodajMandatTypMandatu", required = true)
    protected String dodajMandatTypMandatu;

    /**
     * Gets the value of the dodajMandatKwota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajMandatKwota() {
        return dodajMandatKwota;
    }

    /**
     * Sets the value of the dodajMandatKwota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajMandatKwota(String value) {
        this.dodajMandatKwota = value;
    }

    /**
     * Gets the value of the dodajMandatIdKontroli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajMandatIdKontroli() {
        return dodajMandatIdKontroli;
    }

    /**
     * Sets the value of the dodajMandatIdKontroli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajMandatIdKontroli(String value) {
        this.dodajMandatIdKontroli = value;
    }

    /**
     * Gets the value of the dodajMandatIdKontaKierowcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajMandatIdKontaKierowcy() {
        return dodajMandatIdKontaKierowcy;
    }

    /**
     * Sets the value of the dodajMandatIdKontaKierowcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajMandatIdKontaKierowcy(String value) {
        this.dodajMandatIdKontaKierowcy = value;
    }

    /**
     * Gets the value of the dodajMandatDataKontroli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajMandatDataKontroli() {
        return dodajMandatDataKontroli;
    }

    /**
     * Sets the value of the dodajMandatDataKontroli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajMandatDataKontroli(String value) {
        this.dodajMandatDataKontroli = value;
    }

    /**
     * Gets the value of the dodajMandatTypMandatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajMandatTypMandatu() {
        return dodajMandatTypMandatu;
    }

    /**
     * Sets the value of the dodajMandatTypMandatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajMandatTypMandatu(String value) {
        this.dodajMandatTypMandatu = value;
    }

}
