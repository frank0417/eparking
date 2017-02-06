
package pl.eparking.base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.base package. 
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

    private final static QName _Account_QNAME = new QName("http://eparking.pl/base", "Account");
    private final static QName _Address_QNAME = new QName("http://eparking.pl/base", "Address");
    private final static QName _Bill_QNAME = new QName("http://eparking.pl/base", "Bill");
    private final static QName _Control_QNAME = new QName("http://eparking.pl/base", "Control");
    private final static QName _Controller_QNAME = new QName("http://eparking.pl/base", "Controller");
    private final static QName _Fine_QNAME = new QName("http://eparking.pl/base", "Fine");
    private final static QName _Parking_QNAME = new QName("http://eparking.pl/base", "Parking");
    private final static QName _Person_QNAME = new QName("http://eparking.pl/base", "Person");
    private final static QName _Vehicle_QNAME = new QName("http://eparking.pl/base", "Vehicle");
    private final static QName _AccountStatusType_QNAME = new QName("http://eparking.pl/base", "AccountStatusType");
    private final static QName _AddressType_QNAME = new QName("http://eparking.pl/base", "AddressType");
    private final static QName _ParkingType_QNAME = new QName("http://eparking.pl/base", "ParkingType");
    private final static QName _FineType_QNAME = new QName("http://eparking.pl/base", "FineType");
    private final static QName _VehicleType_QNAME = new QName("http://eparking.pl/base", "VehicleType");
    private final static QName _BillRecharge_QNAME = new QName("http://eparking.pl/base", "BillRecharge");
    private final static QName _AccountSearchCriteria_QNAME = new QName("http://eparking.pl/base", "AccountSearchCriteria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Bill }
     * 
     */
    public Bill createBill() {
        return new Bill();
    }

    /**
     * Create an instance of {@link Control }
     * 
     */
    public Control createControl() {
        return new Control();
    }

    /**
     * Create an instance of {@link Controller }
     * 
     */
    public Controller createController() {
        return new Controller();
    }

    /**
     * Create an instance of {@link Fine }
     * 
     */
    public Fine createFine() {
        return new Fine();
    }

    /**
     * Create an instance of {@link Parking }
     * 
     */
    public Parking createParking() {
        return new Parking();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link BillRecharge }
     * 
     */
    public BillRecharge createBillRecharge() {
        return new BillRecharge();
    }

    /**
     * Create an instance of {@link AccountSearchCriteria }
     * 
     */
    public AccountSearchCriteria createAccountSearchCriteria() {
        return new AccountSearchCriteria();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Bill")
    public JAXBElement<Bill> createBill(Bill value) {
        return new JAXBElement<Bill>(_Bill_QNAME, Bill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Control }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Control")
    public JAXBElement<Control> createControl(Control value) {
        return new JAXBElement<Control>(_Control_QNAME, Control.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Controller }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Controller")
    public JAXBElement<Controller> createController(Controller value) {
        return new JAXBElement<Controller>(_Controller_QNAME, Controller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Fine")
    public JAXBElement<Fine> createFine(Fine value) {
        return new JAXBElement<Fine>(_Fine_QNAME, Fine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Parking")
    public JAXBElement<Parking> createParking(Parking value) {
        return new JAXBElement<Parking>(_Parking_QNAME, Parking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "Vehicle")
    public JAXBElement<Vehicle> createVehicle(Vehicle value) {
        return new JAXBElement<Vehicle>(_Vehicle_QNAME, Vehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "AccountStatusType")
    public JAXBElement<String> createAccountStatusType(String value) {
        return new JAXBElement<String>(_AccountStatusType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "AddressType")
    public JAXBElement<String> createAddressType(String value) {
        return new JAXBElement<String>(_AddressType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "ParkingType")
    public JAXBElement<String> createParkingType(String value) {
        return new JAXBElement<String>(_ParkingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "FineType")
    public JAXBElement<String> createFineType(String value) {
        return new JAXBElement<String>(_FineType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "VehicleType")
    public JAXBElement<String> createVehicleType(String value) {
        return new JAXBElement<String>(_VehicleType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillRecharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "BillRecharge")
    public JAXBElement<BillRecharge> createBillRecharge(BillRecharge value) {
        return new JAXBElement<BillRecharge>(_BillRecharge_QNAME, BillRecharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eparking.pl/base", name = "AccountSearchCriteria")
    public JAXBElement<AccountSearchCriteria> createAccountSearchCriteria(AccountSearchCriteria value) {
        return new JAXBElement<AccountSearchCriteria>(_AccountSearchCriteria_QNAME, AccountSearchCriteria.class, null, value);
    }

}
