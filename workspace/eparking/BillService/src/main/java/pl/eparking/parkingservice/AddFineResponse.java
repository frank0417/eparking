
package pl.eparking.parkingservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.Fine;
import pl.eparking.technical.BaseResponse;


/**
 * <p>Java class for addFineResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addFineResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/base}Fine" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addFineResponse", propOrder = {
    "fine"
})
public class AddFineResponse
    extends BaseResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Fine", namespace = "http://eparking.pl/base")
    protected Fine fine;

    /**
     * Gets the value of the fine property.
     * 
     * @return
     *     possible object is
     *     {@link Fine }
     *     
     */
    public Fine getFine() {
        return fine;
    }

    /**
     * Sets the value of the fine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fine }
     *     
     */
    public void setFine(Fine value) {
        this.fine = value;
    }

}
