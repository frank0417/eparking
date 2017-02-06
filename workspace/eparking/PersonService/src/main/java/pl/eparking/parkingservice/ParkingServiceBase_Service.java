package pl.eparking.parkingservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-02-06T20:44:05.408+01:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "ParkingServiceBase", 
                  wsdlLocation = "file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/ParkingService/ParkingServiceBase.wsdl",
                  targetNamespace = "http://eparking.pl/parkingservice") 
public class ParkingServiceBase_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://eparking.pl/parkingservice", "ParkingServiceBase");
    public final static QName ParkingServiceBaseSOAP = new QName("http://eparking.pl/parkingservice", "ParkingServiceBaseSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/ParkingService/ParkingServiceBase.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ParkingServiceBase_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/ParkingService/ParkingServiceBase.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ParkingServiceBase_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ParkingServiceBase_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ParkingServiceBase_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ParkingServiceBase_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ParkingServiceBase_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ParkingServiceBase_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ParkingServiceBase
     */
    @WebEndpoint(name = "ParkingServiceBaseSOAP")
    public ParkingServiceBase getParkingServiceBaseSOAP() {
        return super.getPort(ParkingServiceBaseSOAP, ParkingServiceBase.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ParkingServiceBase
     */
    @WebEndpoint(name = "ParkingServiceBaseSOAP")
    public ParkingServiceBase getParkingServiceBaseSOAP(WebServiceFeature... features) {
        return super.getPort(ParkingServiceBaseSOAP, ParkingServiceBase.class, features);
    }

}
