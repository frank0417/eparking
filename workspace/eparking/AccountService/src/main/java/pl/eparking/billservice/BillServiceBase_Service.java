package pl.eparking.billservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-02-06T20:42:06.704+01:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "BillServiceBase", 
                  wsdlLocation = "file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/BillService/BillServiceBase.wsdl",
                  targetNamespace = "http://eparking.pl/billservice") 
public class BillServiceBase_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://eparking.pl/billservice", "BillServiceBase");
    public final static QName BillServiceBaseSOAP = new QName("http://eparking.pl/billservice", "BillServiceBaseSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/BillService/BillServiceBase.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BillServiceBase_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/BillService/BillServiceBase.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BillServiceBase_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BillServiceBase_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BillServiceBase_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public BillServiceBase_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BillServiceBase_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BillServiceBase_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns BillServiceBase
     */
    @WebEndpoint(name = "BillServiceBaseSOAP")
    public BillServiceBase getBillServiceBaseSOAP() {
        return super.getPort(BillServiceBaseSOAP, BillServiceBase.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillServiceBase
     */
    @WebEndpoint(name = "BillServiceBaseSOAP")
    public BillServiceBase getBillServiceBaseSOAP(WebServiceFeature... features) {
        return super.getPort(BillServiceBaseSOAP, BillServiceBase.class, features);
    }

}
