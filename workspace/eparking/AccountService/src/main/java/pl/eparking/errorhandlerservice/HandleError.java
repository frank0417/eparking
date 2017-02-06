
package pl.eparking.errorhandlerservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.technical.BaseRequest;
import pl.eparking.technical.ExceptionInfo;


/**
 * <p>Java class for handleError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="handleError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/technical}ExceptionInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handleError", propOrder = {
    "exceptionInfo"
})
public class HandleError
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ExceptionInfo", namespace = "http://eparking.pl/technical", required = true)
    protected ExceptionInfo exceptionInfo;

    /**
     * Gets the value of the exceptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionInfo }
     *     
     */
    public ExceptionInfo getExceptionInfo() {
        return exceptionInfo;
    }

    /**
     * Sets the value of the exceptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionInfo }
     *     
     */
    public void setExceptionInfo(ExceptionInfo value) {
        this.exceptionInfo = value;
    }

}
