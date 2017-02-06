
package pl.eparking.errorhandlerservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.errorhandlerservice package. 
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

    private final static QName _HandleError_QNAME = new QName("http://eparking.pl/errorhandlerservice", "handleError");
    private final static QName _HandleErrorResponse_QNAME = new QName("http://eparking.pl/errorhandlerservice", "handleErrorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.errorhandlerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HandleError }
     * 
     */
    public HandleError createHandleError() {
        return new HandleError();
    }

    /**
     * Create an instance of {@link HandleErrorResponse }
     * 
     */
    public HandleErrorResponse createHandleErrorResponse() {
        return new HandleErrorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/errorhandlerservice", name = "handleError")
    public JAXBElement<HandleError> createHandleError(HandleError value) {
        return new JAXBElement<HandleError>(_HandleError_QNAME, HandleError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/errorhandlerservice", name = "handleErrorResponse")
    public JAXBElement<HandleErrorResponse> createHandleErrorResponse(HandleErrorResponse value) {
        return new JAXBElement<HandleErrorResponse>(_HandleErrorResponse_QNAME, HandleErrorResponse.class, null, value);
    }

}
