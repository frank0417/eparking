
package pl.eparking.technical;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.technical package. 
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

    private final static QName _BaseRequest_QNAME = new QName("http://eparking.pl/technical", "BaseRequest");
    private final static QName _BaseResponse_QNAME = new QName("http://eparking.pl/technical", "BaseResponse");
    private final static QName _Error_QNAME = new QName("http://eparking.pl/technical", "Error");
    private final static QName _ExceptionInfo_QNAME = new QName("http://eparking.pl/technical", "ExceptionInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.technical
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link BaseError }
     * 
     */
    public BaseError createBaseError() {
        return new BaseError();
    }

    /**
     * Create an instance of {@link ExceptionInfo }
     * 
     */
    public ExceptionInfo createExceptionInfo() {
        return new ExceptionInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/technical", name = "BaseRequest")
    public JAXBElement<BaseRequest> createBaseRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_BaseRequest_QNAME, BaseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/technical", name = "BaseResponse")
    public JAXBElement<BaseResponse> createBaseResponse(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_BaseResponse_QNAME, BaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/technical", name = "Error")
    public JAXBElement<BaseError> createError(BaseError value) {
        return new JAXBElement<BaseError>(_Error_QNAME, BaseError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/technical", name = "ExceptionInfo")
    public JAXBElement<ExceptionInfo> createExceptionInfo(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_ExceptionInfo_QNAME, ExceptionInfo.class, null, value);
    }

}
