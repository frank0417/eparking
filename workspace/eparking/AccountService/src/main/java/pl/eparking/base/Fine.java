
package pl.eparking.base;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Fine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FineAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ControlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://eparking.pl/base}FineType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fine", propOrder = {
    "fineId",
    "fineAmount",
    "controlId",
    "accountId",
    "issueDate",
    "fineType"
})
public class Fine
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FineId")
    protected String fineId;
    @XmlElement(name = "FineAmount")
    protected Double fineAmount;
    @XmlElement(name = "ControlId")
    protected String controlId;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "FineType")
    protected String fineType;

    /**
     * Gets the value of the fineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFineId() {
        return fineId;
    }

    /**
     * Sets the value of the fineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineId(String value) {
        this.fineId = value;
    }

    /**
     * Gets the value of the fineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFineAmount() {
        return fineAmount;
    }

    /**
     * Sets the value of the fineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFineAmount(Double value) {
        this.fineAmount = value;
    }

    /**
     * Gets the value of the controlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlId() {
        return controlId;
    }

    /**
     * Sets the value of the controlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlId(String value) {
        this.controlId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the fineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFineType() {
        return fineType;
    }

    /**
     * Sets the value of the fineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineType(String value) {
        this.fineType = value;
    }

}
