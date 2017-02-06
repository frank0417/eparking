
package pl.eparking.technical;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CamelExceptionClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CamelExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CamelExceptionCauseClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CamelExceptionCauseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CamelRootCauseClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CamelRootCauseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CamelExceptionRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionInfo", propOrder = {
    "camelExceptionClass",
    "camelExceptionMessage",
    "camelExceptionCauseClass",
    "camelExceptionCauseMessage",
    "camelRootCauseClass",
    "camelRootCauseMessage",
    "camelExceptionRoute"
})
public class ExceptionInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CamelExceptionClass")
    protected String camelExceptionClass;
    @XmlElement(name = "CamelExceptionMessage")
    protected String camelExceptionMessage;
    @XmlElement(name = "CamelExceptionCauseClass")
    protected String camelExceptionCauseClass;
    @XmlElement(name = "CamelExceptionCauseMessage")
    protected String camelExceptionCauseMessage;
    @XmlElement(name = "CamelRootCauseClass")
    protected String camelRootCauseClass;
    @XmlElement(name = "CamelRootCauseMessage")
    protected String camelRootCauseMessage;
    @XmlElement(name = "CamelExceptionRoute")
    protected String camelExceptionRoute;

    /**
     * Gets the value of the camelExceptionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelExceptionClass() {
        return camelExceptionClass;
    }

    /**
     * Sets the value of the camelExceptionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelExceptionClass(String value) {
        this.camelExceptionClass = value;
    }

    /**
     * Gets the value of the camelExceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelExceptionMessage() {
        return camelExceptionMessage;
    }

    /**
     * Sets the value of the camelExceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelExceptionMessage(String value) {
        this.camelExceptionMessage = value;
    }

    /**
     * Gets the value of the camelExceptionCauseClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelExceptionCauseClass() {
        return camelExceptionCauseClass;
    }

    /**
     * Sets the value of the camelExceptionCauseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelExceptionCauseClass(String value) {
        this.camelExceptionCauseClass = value;
    }

    /**
     * Gets the value of the camelExceptionCauseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelExceptionCauseMessage() {
        return camelExceptionCauseMessage;
    }

    /**
     * Sets the value of the camelExceptionCauseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelExceptionCauseMessage(String value) {
        this.camelExceptionCauseMessage = value;
    }

    /**
     * Gets the value of the camelRootCauseClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelRootCauseClass() {
        return camelRootCauseClass;
    }

    /**
     * Sets the value of the camelRootCauseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelRootCauseClass(String value) {
        this.camelRootCauseClass = value;
    }

    /**
     * Gets the value of the camelRootCauseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelRootCauseMessage() {
        return camelRootCauseMessage;
    }

    /**
     * Sets the value of the camelRootCauseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelRootCauseMessage(String value) {
        this.camelRootCauseMessage = value;
    }

    /**
     * Gets the value of the camelExceptionRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelExceptionRoute() {
        return camelExceptionRoute;
    }

    /**
     * Sets the value of the camelExceptionRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelExceptionRoute(String value) {
        this.camelExceptionRoute = value;
    }

}
