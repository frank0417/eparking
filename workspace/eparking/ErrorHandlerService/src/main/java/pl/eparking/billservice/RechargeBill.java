
package pl.eparking.billservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.BillRecharge;
import pl.eparking.technical.BaseRequest;


/**
 * <p>Java class for rechargeBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechargeBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/base}BillRecharge"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechargeBill", propOrder = {
    "billRecharge"
})
public class RechargeBill
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BillRecharge", namespace = "http://eparking.pl/base", required = true)
    protected BillRecharge billRecharge;

    /**
     * Gets the value of the billRecharge property.
     * 
     * @return
     *     possible object is
     *     {@link BillRecharge }
     *     
     */
    public BillRecharge getBillRecharge() {
        return billRecharge;
    }

    /**
     * Sets the value of the billRecharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillRecharge }
     *     
     */
    public void setBillRecharge(BillRecharge value) {
        this.billRecharge = value;
    }

}
