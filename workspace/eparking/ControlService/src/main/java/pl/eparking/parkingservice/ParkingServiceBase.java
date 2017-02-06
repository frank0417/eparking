package pl.eparking.parkingservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-02-06T20:42:06.966+01:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://eparking.pl/parkingservice", name = "ParkingServiceBase")
@XmlSeeAlso({pl.eparking.base.ObjectFactory.class, ObjectFactory.class, pl.eparking.technical.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ParkingServiceBase {

    @WebMethod(action = "http://eparking.pl/parkingservice/addParking")
    @WebResult(name = "addParkingResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public AddParkingResponse addParking(
        @WebParam(partName = "parameters", name = "addParking", targetNamespace = "http://eparking.pl/parkingservice")
        AddParking parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/updateParking")
    @WebResult(name = "updateParkingResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public UpdateParkingResponse updateParking(
        @WebParam(partName = "parameters", name = "updateParking", targetNamespace = "http://eparking.pl/parkingservice")
        UpdateParking parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/startParking")
    @WebResult(name = "startParkingResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public StartParkingResponse startParking(
        @WebParam(partName = "parameters", name = "startParking", targetNamespace = "http://eparking.pl/parkingservice")
        StartParking parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/endParking")
    @WebResult(name = "endParkingResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public EndParkingResponse endParking(
        @WebParam(partName = "parameters", name = "endParking", targetNamespace = "http://eparking.pl/parkingservice")
        EndParking parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/modifyParking")
    @WebResult(name = "modifyParkingResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public ModifyParkingResponse modifyParking(
        @WebParam(partName = "parameters", name = "modifyParking", targetNamespace = "http://eparking.pl/parkingservice")
        ModifyParking parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/getParking")
    @WebResult(name = "getParkingResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public GetParkingResponse getParking(
        @WebParam(partName = "parameters", name = "getParking", targetNamespace = "http://eparking.pl/parkingservice")
        GetParking parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/addControl")
    @WebResult(name = "addControlResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public AddControlResponse addControl(
        @WebParam(partName = "parameters", name = "addControl", targetNamespace = "http://eparking.pl/parkingservice")
        AddControl parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/addFine")
    @WebResult(name = "addFineResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public AddFineResponse addFine(
        @WebParam(partName = "parameters", name = "addFine", targetNamespace = "http://eparking.pl/parkingservice")
        AddFine parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/saveParking")
    @WebResult(name = "saveParkingResponse", targetNamespace = "http://eparking.pl/parkingservice", partName = "parameters")
    public SaveParkingResponse saveParking(
        @WebParam(partName = "parameters", name = "saveParking", targetNamespace = "http://eparking.pl/parkingservice")
        SaveParking parameters
    );

    @WebMethod(action = "http://eparking.pl/parkingservice/notifyParking")
    @Oneway
    public void notifyParking(
        @WebParam(partName = "parameters", name = "notifyParking", targetNamespace = "http://eparking.pl/parkingservice")
        NotifyParking parameters
    );
}