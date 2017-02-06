
package pl.eparking.personservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.base.Person;
import pl.eparking.technical.BaseRequest;


/**
 * <p>Java class for addPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eparking.pl/base}Person"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPerson", propOrder = {
    "person"
})
public class AddPerson
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Person", namespace = "http://eparking.pl/base", required = true)
    protected Person person;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
