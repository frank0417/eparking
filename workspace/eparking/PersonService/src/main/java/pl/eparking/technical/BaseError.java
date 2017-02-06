
package pl.eparking.technical;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExceptionRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://eparking.pl/technical}BaseRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseError", propOrder = {
    "errorCode",
    "errorDescription",
    "exceptionCode",
    "exceptionRoute",
    "baseRequest"
})
public class BaseError
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorDescription", required = true)
    protected String errorDescription;
    @XmlElement(name = "ExceptionCode")
    protected String exceptionCode;
    @XmlElement(name = "ExceptionRoute")
    protected String exceptionRoute;
    @XmlElement(name = "BaseRequest")
    protected BaseRequest baseRequest;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the exceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Sets the value of the exceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionCode(String value) {
        this.exceptionCode = value;
    }

    /**
     * Gets the value of the exceptionRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionRoute() {
        return exceptionRoute;
    }

    /**
     * Sets the value of the exceptionRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionRoute(String value) {
        this.exceptionRoute = value;
    }

    /**
     * Gets the value of the baseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRequest }
     *     
     */
    public BaseRequest getBaseRequest() {
        return baseRequest;
    }

    /**
     * Sets the value of the baseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRequest }
     *     
     */
    public void setBaseRequest(BaseRequest value) {
        this.baseRequest = value;
    }

}
