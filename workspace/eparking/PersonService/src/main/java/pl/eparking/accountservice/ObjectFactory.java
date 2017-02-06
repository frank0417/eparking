
package pl.eparking.accountservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.accountservice package. 
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

    private final static QName _AddAccount_QNAME = new QName("http://eparking.pl/accountservice", "addAccount");
    private final static QName _AddAccountResponse_QNAME = new QName("http://eparking.pl/accountservice", "addAccountResponse");
    private final static QName _RegisterAccount_QNAME = new QName("http://eparking.pl/accountservice", "registerAccount");
    private final static QName _RegisterAccountResponse_QNAME = new QName("http://eparking.pl/accountservice", "registerAccountResponse");
    private final static QName _GetAccount_QNAME = new QName("http://eparking.pl/accountservice", "getAccount");
    private final static QName _GetAccountResponse_QNAME = new QName("http://eparking.pl/accountservice", "getAccountResponse");
    private final static QName _FindAccount_QNAME = new QName("http://eparking.pl/accountservice", "findAccount");
    private final static QName _FindAccountResponse_QNAME = new QName("http://eparking.pl/accountservice", "findAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.accountservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAccount }
     * 
     */
    public AddAccount createAddAccount() {
        return new AddAccount();
    }

    /**
     * Create an instance of {@link AddAccountResponse }
     * 
     */
    public AddAccountResponse createAddAccountResponse() {
        return new AddAccountResponse();
    }

    /**
     * Create an instance of {@link RegisterAccount }
     * 
     */
    public RegisterAccount createRegisterAccount() {
        return new RegisterAccount();
    }

    /**
     * Create an instance of {@link RegisterAccountResponse }
     * 
     */
    public RegisterAccountResponse createRegisterAccountResponse() {
        return new RegisterAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link FindAccount }
     * 
     */
    public FindAccount createFindAccount() {
        return new FindAccount();
    }

    /**
     * Create an instance of {@link FindAccountResponse }
     * 
     */
    public FindAccountResponse createFindAccountResponse() {
        return new FindAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/accountservice", name = "addAccount")
    public JAXBElement<AddAccount> createAddAccount(AddAccount value) {
        return new JAXBElement<AddAccount>(_AddAccount_QNAME, AddAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/accountservice", name = "addAccountResponse")
    public JAXBElement<AddAccountResponse> createAddAccountResponse(AddAccountResponse value) {
        return new JAXBElement<AddAccountResponse>(_AddAccountResponse_QNAME, AddAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/accountservice", name = "registerAccount")
    public JAXBElement<RegisterAccount> createRegisterAccount(RegisterAccount value) {
        return new JAXBElement<RegisterAccount>(_RegisterAccount_QNAME, RegisterAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/accountservice", name = "registerAccountResponse")
    public JAXBElement<RegisterAccountResponse> createRegisterAccountResponse(RegisterAccountResponse value) {
        return new JAXBElement<RegisterAccountResponse>(_RegisterAccountResponse_QNAME, RegisterAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/accountservice", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<GetAccount>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/accountservice", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/accountservice", name = "findAccount")
    public JAXBElement<FindAccount> createFindAccount(FindAccount value) {
        return new JAXBElement<FindAccount>(_FindAccount_QNAME, FindAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/accountservice", name = "findAccountResponse")
    public JAXBElement<FindAccountResponse> createFindAccountResponse(FindAccountResponse value) {
        return new JAXBElement<FindAccountResponse>(_FindAccountResponse_QNAME, FindAccountResponse.class, null, value);
    }

}
