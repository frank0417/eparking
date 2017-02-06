package pl.eparking.accountservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-02-06T20:42:06.538+01:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "AccountServiceBase", 
                  wsdlLocation = "file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/AccountService/AccountServiceBase.wsdl",
                  targetNamespace = "http://eparking.pl/accountservice") 
public class AccountServiceBase_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://eparking.pl/accountservice", "AccountServiceBase");
    public final static QName AccountServiceBaseSOAP = new QName("http://eparking.pl/accountservice", "AccountServiceBaseSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/AccountService/AccountServiceBase.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AccountServiceBase_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/projects/eparking/workspace/eparking/EparkingServiceRepository/src/main/resources/AccountService/AccountServiceBase.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AccountServiceBase_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AccountServiceBase_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountServiceBase_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AccountServiceBase_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AccountServiceBase_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AccountServiceBase_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AccountServiceBase
     */
    @WebEndpoint(name = "AccountServiceBaseSOAP")
    public AccountServiceBase getAccountServiceBaseSOAP() {
        return super.getPort(AccountServiceBaseSOAP, AccountServiceBase.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountServiceBase
     */
    @WebEndpoint(name = "AccountServiceBaseSOAP")
    public AccountServiceBase getAccountServiceBaseSOAP(WebServiceFeature... features) {
        return super.getPort(AccountServiceBaseSOAP, AccountServiceBase.class, features);
    }

}
