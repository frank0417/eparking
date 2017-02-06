
package pl.eparking.accountservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.AccountSearchCriteria;
import pl.eparking.technical.BaseRequest;


/**
 * <p>Java class for findAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/base}AccountSearchCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAccount", propOrder = {
    "accountSearchCriteria"
})
public class FindAccount
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccountSearchCriteria", namespace = "http://eparking.pl/base", required = true)
    protected AccountSearchCriteria accountSearchCriteria;

    /**
     * Gets the value of the accountSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchCriteria }
     *     
     */
    public AccountSearchCriteria getAccountSearchCriteria() {
        return accountSearchCriteria;
    }

    /**
     * Sets the value of the accountSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchCriteria }
     *     
     */
    public void setAccountSearchCriteria(AccountSearchCriteria value) {
        this.accountSearchCriteria = value;
    }

}
