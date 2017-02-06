
package pl.eparking.api.aplikacja;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.eparking.api.aplikacja package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.eparking.api.aplikacja
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModyfikujParking }
     * 
     */
    public ModyfikujParking createModyfikujParking() {
        return new ModyfikujParking();
    }

    /**
     * Create an instance of {@link ModyfikujParkingResponse }
     * 
     */
    public ModyfikujParkingResponse createModyfikujParkingResponse() {
        return new ModyfikujParkingResponse();
    }

    /**
     * Create an instance of {@link DodajParking }
     * 
     */
    public DodajParking createDodajParking() {
        return new DodajParking();
    }

    /**
     * Create an instance of {@link DodajParkingResponse }
     * 
     */
    public DodajParkingResponse createDodajParkingResponse() {
        return new DodajParkingResponse();
    }

    /**
     * Create an instance of {@link DodajKontrole }
     * 
     */
    public DodajKontrole createDodajKontrole() {
        return new DodajKontrole();
    }

    /**
     * Create an instance of {@link DodajKontroleResponse }
     * 
     */
    public DodajKontroleResponse createDodajKontroleResponse() {
        return new DodajKontroleResponse();
    }

    /**
     * Create an instance of {@link DodajMandat }
     * 
     */
    public DodajMandat createDodajMandat() {
        return new DodajMandat();
    }

    /**
     * Create an instance of {@link DodajMandatResponse }
     * 
     */
    public DodajMandatResponse createDodajMandatResponse() {
        return new DodajMandatResponse();
    }

}
