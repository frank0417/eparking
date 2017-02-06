
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
 *         &lt;element name="DodajMandatSukces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DodajMandatIdMandatu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "dodajMandatSukces",
    "dodajMandatIdMandatu"
})
@XmlRootElement(name = "DodajMandatResponse")
public class DodajMandatResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DodajMandatSukces")
    protected int dodajMandatSukces;
    @XmlElement(name = "DodajMandatIdMandatu")
    protected String dodajMandatIdMandatu;

    /**
     * Gets the value of the dodajMandatSukces property.
     * 
     */
    public int getDodajMandatSukces() {
        return dodajMandatSukces;
    }

    /**
     * Sets the value of the dodajMandatSukces property.
     * 
     */
    public void setDodajMandatSukces(int value) {
        this.dodajMandatSukces = value;
    }

    /**
     * Gets the value of the dodajMandatIdMandatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDodajMandatIdMandatu() {
        return dodajMandatIdMandatu;
    }

    /**
     * Sets the value of the dodajMandatIdMandatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDodajMandatIdMandatu(String value) {
        this.dodajMandatIdMandatu = value;
    }

}
