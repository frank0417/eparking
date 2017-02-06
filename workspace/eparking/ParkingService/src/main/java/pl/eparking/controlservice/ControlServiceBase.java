package pl.eparking.controlservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-02-06T20:44:05.243+01:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://eparking.pl/controlservice", name = "ControlServiceBase")
@XmlSeeAlso({pl.eparking.base.ObjectFactory.class, ObjectFactory.class, pl.eparking.technical.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ControlServiceBase {

    @WebMethod(action = "http://eparking.pl/controlservice/controlParking")
    @WebResult(name = "controlParkingResponse", targetNamespace = "http://eparking.pl/controlservice", partName = "parameters")
    public ControlParkingResponse controlParking(
        @WebParam(partName = "parameters", name = "controlParking", targetNamespace = "http://eparking.pl/controlservice")
        ControlParking parameters
    );
}