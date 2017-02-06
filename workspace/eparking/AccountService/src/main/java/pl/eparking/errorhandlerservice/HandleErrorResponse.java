
package pl.eparking.errorhandlerservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.technical.BaseResponse;


/**
 * <p>Java class for handleErrorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="handleErrorResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/technical}BaseResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handleErrorResponse", propOrder = {
    "baseResponse"
})
public class HandleErrorResponse
    extends BaseResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BaseResponse", namespace = "http://eparking.pl/technical")
    protected BaseResponse baseResponse;

    /**
     * Gets the value of the baseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResponse }
     *     
     */
    public BaseResponse getBaseResponse() {
        return baseResponse;
    }

    /**
     * Sets the value of the baseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResponse }
     *     
     */
    public void setBaseResponse(BaseResponse value) {
        this.baseResponse = value;
    }

}
