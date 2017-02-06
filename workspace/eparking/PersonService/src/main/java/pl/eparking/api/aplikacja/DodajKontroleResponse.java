
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
 *         &lt;element name="DodajKontroleSukces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DodajKontroleKontrola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "dodajKontroleSukces",
    "dodajKontroleKontrola"
})
@XmlRootElement(name = "DodajKontroleResponse")
public class DodajKontroleResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DodajKontroleSukces")
    protected int dodajKontroleSukces;
    @XmlElement(name = "DodajKontroleKontrola")
    protected String dodajKontroleKontrola;

    /**
     * Gets the value of the dodajKontroleSukces property.
     * 
     */
    public int getDodajKontroleSukces() {
        return dodajKontroleSukces;
    }

    /**
     * Sets the value of the dodajKontroleSukces property.
     * 
     */
    public void setDodajKontroleSukces(int value) {
        this.dodajKontroleSukces = value;
    }

    /**
     * Gets the value of the dodajKontroleKontrola property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajKontroleKontrola() {
        return dodajKontroleKontrola;
    }

    /**
     * Sets the value of the dodajKontroleKontrola property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajKontroleKontrola(String value) {
        this.dodajKontroleKontrola = value;
    }

}
