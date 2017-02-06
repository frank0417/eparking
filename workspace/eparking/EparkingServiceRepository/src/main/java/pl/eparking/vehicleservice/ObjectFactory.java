
package pl.eparking.vehicleservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.vehicleservice package. 
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

    private final static QName _AddVehicle_QNAME = new QName("http://eparking.pl/vehicleservice", "addVehicle");
    private final static QName _AddVehicleResponse_QNAME = new QName("http://eparking.pl/vehicleservice", "addVehicleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.vehicleservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddVehicle }
     * 
     */
    public AddVehicle createAddVehicle() {
        return new AddVehicle();
    }

    /**
     * Create an instance of {@link AddVehicleResponse }
     * 
     */
    public AddVehicleResponse createAddVehicleResponse() {
        return new AddVehicleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/vehicleservice", name = "addVehicle")
    public JAXBElement<AddVehicle> createAddVehicle(AddVehicle value) {
        return new JAXBElement<AddVehicle>(_AddVehicle_QNAME, AddVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/vehicleservice", name = "addVehicleResponse")
    public JAXBElement<AddVehicleResponse> createAddVehicleResponse(AddVehicleResponse value) {
        return new JAXBElement<AddVehicleResponse>(_AddVehicleResponse_QNAME, AddVehicleResponse.class, null, value);
    }

}
