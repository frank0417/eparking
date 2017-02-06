
package pl.eparking.parkingservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.parkingservice package. 
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

    private final static QName _AddParking_QNAME = new QName("http://eparking.pl/parkingservice", "addParking");
    private final static QName _AddParkingResponse_QNAME = new QName("http://eparking.pl/parkingservice", "addParkingResponse");
    private final static QName _EndParking_QNAME = new QName("http://eparking.pl/parkingservice", "endParking");
    private final static QName _EndParkingResponse_QNAME = new QName("http://eparking.pl/parkingservice", "endParkingResponse");
    private final static QName _ModifyParking_QNAME = new QName("http://eparking.pl/parkingservice", "modifyParking");
    private final static QName _ModifyParkingResponse_QNAME = new QName("http://eparking.pl/parkingservice", "modifyParkingResponse");
    private final static QName _StartParking_QNAME = new QName("http://eparking.pl/parkingservice", "startParking");
    private final static QName _StartParkingResponse_QNAME = new QName("http://eparking.pl/parkingservice", "startParkingResponse");
    private final static QName _AddControl_QNAME = new QName("http://eparking.pl/parkingservice", "addControl");
    private final static QName _AddControlResponse_QNAME = new QName("http://eparking.pl/parkingservice", "addControlResponse");
    private final static QName _AddFine_QNAME = new QName("http://eparking.pl/parkingservice", "addFine");
    private final static QName _AddFineResponse_QNAME = new QName("http://eparking.pl/parkingservice", "addFineResponse");
    private final static QName _SaveParking_QNAME = new QName("http://eparking.pl/parkingservice", "saveParking");
    private final static QName _SaveParkingResponse_QNAME = new QName("http://eparking.pl/parkingservice", "saveParkingResponse");
    private final static QName _GetParking_QNAME = new QName("http://eparking.pl/parkingservice", "getParking");
    private final static QName _GetParkingResponse_QNAME = new QName("http://eparking.pl/parkingservice", "getParkingResponse");
    private final static QName _UpdateParking_QNAME = new QName("http://eparking.pl/parkingservice", "updateParking");
    private final static QName _UpdateParkingResponse_QNAME = new QName("http://eparking.pl/parkingservice", "updateParkingResponse");
    private final static QName _NotifyParking_QNAME = new QName("http://eparking.pl/parkingservice", "notifyParking");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.parkingservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddParking }
     * 
     */
    public AddParking createAddParking() {
        return new AddParking();
    }

    /**
     * Create an instance of {@link AddParkingResponse }
     * 
     */
    public AddParkingResponse createAddParkingResponse() {
        return new AddParkingResponse();
    }

    /**
     * Create an instance of {@link EndParking }
     * 
     */
    public EndParking createEndParking() {
        return new EndParking();
    }

    /**
     * Create an instance of {@link EndParkingResponse }
     * 
     */
    public EndParkingResponse createEndParkingResponse() {
        return new EndParkingResponse();
    }

    /**
     * Create an instance of {@link ModifyParking }
     * 
     */
    public ModifyParking createModifyParking() {
        return new ModifyParking();
    }

    /**
     * Create an instance of {@link ModifyParkingResponse }
     * 
     */
    public ModifyParkingResponse createModifyParkingResponse() {
        return new ModifyParkingResponse();
    }

    /**
     * Create an instance of {@link StartParking }
     * 
     */
    public StartParking createStartParking() {
        return new StartParking();
    }

    /**
     * Create an instance of {@link StartParkingResponse }
     * 
     */
    public StartParkingResponse createStartParkingResponse() {
        return new StartParkingResponse();
    }

    /**
     * Create an instance of {@link AddControl }
     * 
     */
    public AddControl createAddControl() {
        return new AddControl();
    }

    /**
     * Create an instance of {@link AddControlResponse }
     * 
     */
    public AddControlResponse createAddControlResponse() {
        return new AddControlResponse();
    }

    /**
     * Create an instance of {@link AddFine }
     * 
     */
    public AddFine createAddFine() {
        return new AddFine();
    }

    /**
     * Create an instance of {@link AddFineResponse }
     * 
     */
    public AddFineResponse createAddFineResponse() {
        return new AddFineResponse();
    }

    /**
     * Create an instance of {@link SaveParking }
     * 
     */
    public SaveParking createSaveParking() {
        return new SaveParking();
    }

    /**
     * Create an instance of {@link SaveParkingResponse }
     * 
     */
    public SaveParkingResponse createSaveParkingResponse() {
        return new SaveParkingResponse();
    }

    /**
     * Create an instance of {@link GetParking }
     * 
     */
    public GetParking createGetParking() {
        return new GetParking();
    }

    /**
     * Create an instance of {@link GetParkingResponse }
     * 
     */
    public GetParkingResponse createGetParkingResponse() {
        return new GetParkingResponse();
    }

    /**
     * Create an instance of {@link UpdateParking }
     * 
     */
    public UpdateParking createUpdateParking() {
        return new UpdateParking();
    }

    /**
     * Create an instance of {@link UpdateParkingResponse }
     * 
     */
    public UpdateParkingResponse createUpdateParkingResponse() {
        return new UpdateParkingResponse();
    }

    /**
     * Create an instance of {@link NotifyParking }
     * 
     */
    public NotifyParking createNotifyParking() {
        return new NotifyParking();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "addParking")
    public JAXBElement<AddParking> createAddParking(AddParking value) {
        return new JAXBElement<AddParking>(_AddParking_QNAME, AddParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "addParkingResponse")
    public JAXBElement<AddParkingResponse> createAddParkingResponse(AddParkingResponse value) {
        return new JAXBElement<AddParkingResponse>(_AddParkingResponse_QNAME, AddParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "endParking")
    public JAXBElement<EndParking> createEndParking(EndParking value) {
        return new JAXBElement<EndParking>(_EndParking_QNAME, EndParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "endParkingResponse")
    public JAXBElement<EndParkingResponse> createEndParkingResponse(EndParkingResponse value) {
        return new JAXBElement<EndParkingResponse>(_EndParkingResponse_QNAME, EndParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "modifyParking")
    public JAXBElement<ModifyParking> createModifyParking(ModifyParking value) {
        return new JAXBElement<ModifyParking>(_ModifyParking_QNAME, ModifyParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "modifyParkingResponse")
    public JAXBElement<ModifyParkingResponse> createModifyParkingResponse(ModifyParkingResponse value) {
        return new JAXBElement<ModifyParkingResponse>(_ModifyParkingResponse_QNAME, ModifyParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "startParking")
    public JAXBElement<StartParking> createStartParking(StartParking value) {
        return new JAXBElement<StartParking>(_StartParking_QNAME, StartParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "startParkingResponse")
    public JAXBElement<StartParkingResponse> createStartParkingResponse(StartParkingResponse value) {
        return new JAXBElement<StartParkingResponse>(_StartParkingResponse_QNAME, StartParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "addControl")
    public JAXBElement<AddControl> createAddControl(AddControl value) {
        return new JAXBElement<AddControl>(_AddControl_QNAME, AddControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "addControlResponse")
    public JAXBElement<AddControlResponse> createAddControlResponse(AddControlResponse value) {
        return new JAXBElement<AddControlResponse>(_AddControlResponse_QNAME, AddControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "addFine")
    public JAXBElement<AddFine> createAddFine(AddFine value) {
        return new JAXBElement<AddFine>(_AddFine_QNAME, AddFine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "addFineResponse")
    public JAXBElement<AddFineResponse> createAddFineResponse(AddFineResponse value) {
        return new JAXBElement<AddFineResponse>(_AddFineResponse_QNAME, AddFineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "saveParking")
    public JAXBElement<SaveParking> createSaveParking(SaveParking value) {
        return new JAXBElement<SaveParking>(_SaveParking_QNAME, SaveParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "saveParkingResponse")
    public JAXBElement<SaveParkingResponse> createSaveParkingResponse(SaveParkingResponse value) {
        return new JAXBElement<SaveParkingResponse>(_SaveParkingResponse_QNAME, SaveParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "getParking")
    public JAXBElement<GetParking> createGetParking(GetParking value) {
        return new JAXBElement<GetParking>(_GetParking_QNAME, GetParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "getParkingResponse")
    public JAXBElement<GetParkingResponse> createGetParkingResponse(GetParkingResponse value) {
        return new JAXBElement<GetParkingResponse>(_GetParkingResponse_QNAME, GetParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "updateParking")
    public JAXBElement<UpdateParking> createUpdateParking(UpdateParking value) {
        return new JAXBElement<UpdateParking>(_UpdateParking_QNAME, UpdateParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "updateParkingResponse")
    public JAXBElement<UpdateParkingResponse> createUpdateParkingResponse(UpdateParkingResponse value) {
        return new JAXBElement<UpdateParkingResponse>(_UpdateParkingResponse_QNAME, UpdateParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/parkingservice", name = "notifyParking")
    public JAXBElement<NotifyParking> createNotifyParking(NotifyParking value) {
        return new JAXBElement<NotifyParking>(_NotifyParking_QNAME, NotifyParking.class, null, value);
    }

}
