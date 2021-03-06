package pl.eparking.personservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-02-06T20:42:07.077+01:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "PersonServiceBase", 
                  wsdlLocation = "file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/PersonService/PersonServiceBase.wsdl",
                  targetNamespace = "http://eparking.pl/personservice") 
public class PersonServiceBase_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://eparking.pl/personservice", "PersonServiceBase");
    public final static QName PersonServiceBaseSOAP = new QName("http://eparking.pl/personservice", "PersonServiceBaseSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/PersonService/PersonServiceBase.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonServiceBase_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/PersonService/PersonServiceBase.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonServiceBase_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonServiceBase_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonServiceBase_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public PersonServiceBase_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PersonServiceBase_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PersonServiceBase_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns PersonServiceBase
     */
    @WebEndpoint(name = "PersonServiceBaseSOAP")
    public PersonServiceBase getPersonServiceBaseSOAP() {
        return super.getPort(PersonServiceBaseSOAP, PersonServiceBase.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonServiceBase
     */
    @WebEndpoint(name = "PersonServiceBaseSOAP")
    public PersonServiceBase getPersonServiceBaseSOAP(WebServiceFeature... features) {
        return super.getPort(PersonServiceBaseSOAP, PersonServiceBase.class, features);
    }

}
