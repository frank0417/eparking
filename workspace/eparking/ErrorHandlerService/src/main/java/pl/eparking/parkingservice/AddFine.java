
package pl.eparking.parkingservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.Fine;
import pl.eparking.technical.BaseRequest;


/**
 * <p>Java class for addFine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addFine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/base}Fine"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addFine", propOrder = {
    "fine"
})
public class AddFine
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Fine", namespace = "http://eparking.pl/base", required = true)
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
