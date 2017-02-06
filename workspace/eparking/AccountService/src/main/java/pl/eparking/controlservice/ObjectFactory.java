
package pl.eparking.controlservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.controlservice package. 
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

    private final static QName _ControlParking_QNAME = new QName("http://eparking.pl/controlservice", "controlParking");
    private final static QName _ControlParkingResponse_QNAME = new QName("http://eparking.pl/controlservice", "controlParkingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.controlservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ControlParking }
     * 
     */
    public ControlParking createControlParking() {
        return new ControlParking();
    }

    /**
     * Create an instance of {@link ControlParkingResponse }
     * 
     */
    public ControlParkingResponse createControlParkingResponse() {
        return new ControlParkingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/controlservice", name = "controlParking")
    public JAXBElement<ControlParking> createControlParking(ControlParking value) {
        return new JAXBElement<ControlParking>(_ControlParking_QNAME, ControlParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/controlservice", name = "controlParkingResponse")
    public JAXBElement<ControlParkingResponse> createControlParkingResponse(ControlParkingResponse value) {
        return new JAXBElement<ControlParkingResponse>(_ControlParkingResponse_QNAME, ControlParkingResponse.class, null, value);
    }

}
