package pl.eparking.personservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-02-06T20:42:07.075+01:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://eparking.pl/personservice", name = "PersonServiceBase")
@XmlSeeAlso({ObjectFactory.class, pl.eparking.base.ObjectFactory.class, pl.eparking.technical.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PersonServiceBase {

    @WebMethod(action = "http://eparking.pl/personservice/addPerson")
    @WebResult(name = "addPersonResponse", targetNamespace = "http://eparking.pl/personservice", partName = "parameters")
    public AddPersonResponse addPerson(
        @WebParam(partName = "parameters", name = "addPerson", targetNamespace = "http://eparking.pl/personservice")
        AddPerson parameters
    );
}
