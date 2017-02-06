
package pl.eparking.billservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.billservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegisterBill_QNAME = new QName("http://eparking.pl/billservice", "registerBill");
    private final static QName _RegisterBillResponse_QNAME = new QName("http://eparking.pl/billservice", "registerBillResponse");
    private final static QName _RechargeBill_QNAME = new QName("http://eparking.pl/billservice", "rechargeBill");
    private final static QName _RechargeBillResponse_QNAME = new QName("http://eparking.pl/billservice", "rechargeBillResponse");
    private final static QName _AddBill_QNAME = new QName("http://eparking.pl/billservice", "addBill");
    private final static QName _AddBillResponse_QNAME = new QName("http://eparking.pl/billservice", "addBillResponse");
    private final static QName _ModifyBill_QNAME = new QName("http://eparking.pl/billservice", "modifyBill");
    private final static QName _ModifyBillResponse_QNAME = new QName("http://eparking.pl/billservice", "modifyBillResponse");
    private final static QName _GetBill_QNAME = new QName("http://eparking.pl/billservice", "getBill");
    private final static QName _GetBillResponse_QNAME = new QName("http://eparking.pl/billservice", "getBillResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.billservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterBill }
     * 
     */
    public RegisterBill createRegisterBill() {
        return new RegisterBill();
    }

    /**
     * Create an instance of {@link RegisterBillResponse }
     * 
     */
    public RegisterBillResponse createRegisterBillResponse() {
        return new RegisterBillResponse();
    }

    /**
     * Create an instance of {@link RechargeBill }
     * 
     */
    public RechargeBill createRechargeBill() {
        return new RechargeBill();
    }

    /**
     * Create an instance of {@link RechargeBillResponse }
     * 
     */
    public RechargeBillResponse createRechargeBillResponse() {
        return new RechargeBillResponse();
    }

    /**
     * Create an instance of {@link AddBill }
     * 
     */
    public AddBill createAddBill() {
        return new AddBill();
    }

    /**
     * Create an instance of {@link AddBillResponse }
     * 
     */
    public AddBillResponse createAddBillResponse() {
        return new AddBillResponse();
    }

    /**
     * Create an instance of {@link ModifyBill }
     * 
     */
    public ModifyBill createModifyBill() {
        return new ModifyBill();
    }

    /**
     * Create an instance of {@link ModifyBillResponse }
     * 
     */
    public ModifyBillResponse createModifyBillResponse() {
        return new ModifyBillResponse();
    }

    /**
     * Create an instance of {@link GetBill }
     * 
     */
    public GetBill createGetBill() {
        return new GetBill();
    }

    /**
     * Create an instance of {@link GetBillResponse }
     * 
     */
    public GetBillResponse createGetBillResponse() {
        return new GetBillResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "registerBill")
    public JAXBElement<RegisterBill> createRegisterBill(RegisterBill value) {
        return new JAXBElement<RegisterBill>(_RegisterBill_QNAME, RegisterBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "registerBillResponse")
    public JAXBElement<RegisterBillResponse> createRegisterBillResponse(RegisterBillResponse value) {
        return new JAXBElement<RegisterBillResponse>(_RegisterBillResponse_QNAME, RegisterBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechargeBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "rechargeBill")
    public JAXBElement<RechargeBill> createRechargeBill(RechargeBill value) {
        return new JAXBElement<RechargeBill>(_RechargeBill_QNAME, RechargeBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechargeBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "rechargeBillResponse")
    public JAXBElement<RechargeBillResponse> createRechargeBillResponse(RechargeBillResponse value) {
        return new JAXBElement<RechargeBillResponse>(_RechargeBillResponse_QNAME, RechargeBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "addBill")
    public JAXBElement<AddBill> createAddBill(AddBill value) {
        return new JAXBElement<AddBill>(_AddBill_QNAME, AddBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "addBillResponse")
    public JAXBElement<AddBillResponse> createAddBillResponse(AddBillResponse value) {
        return new JAXBElement<AddBillResponse>(_AddBillResponse_QNAME, AddBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "modifyBill")
    public JAXBElement<ModifyBill> createModifyBill(ModifyBill value) {
        return new JAXBElement<ModifyBill>(_ModifyBill_QNAME, ModifyBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "modifyBillResponse")
    public JAXBElement<ModifyBillResponse> createModifyBillResponse(ModifyBillResponse value) {
        return new JAXBElement<ModifyBillResponse>(_ModifyBillResponse_QNAME, ModifyBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "getBill")
    public JAXBElement<GetBill> createGetBill(GetBill value) {
        return new JAXBElement<GetBill>(_GetBill_QNAME, GetBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/billservice", name = "getBillResponse")
    public JAXBElement<GetBillResponse> createGetBillResponse(GetBillResponse value) {
        return new JAXBElement<GetBillResponse>(_GetBillResponse_QNAME, GetBillResponse.class, null, value);
    }

}
