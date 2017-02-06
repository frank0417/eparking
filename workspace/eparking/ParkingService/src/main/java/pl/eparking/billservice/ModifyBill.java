
package pl.eparking.billservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.Bill;
import pl.eparking.technical.BaseRequest;


/**
 * <p>Java class for modifyBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/base}Bill"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyBill", propOrder = {
    "bill"
})
public class ModifyBill
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Bill", namespace = "http://eparking.pl/base", required = true)
    protected Bill bill;

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link Bill }
     *     
     */
    public Bill getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bill }
     *     
     */
    public void setBill(Bill value) {
        this.bill = value;
    }

}
