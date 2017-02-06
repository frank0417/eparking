package pl.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import pl.eparking.accountservice.FindAccount;
import pl.eparking.base.Account;
import pl.eparking.base.AccountSearchCriteria;
import pl.eparking.base.Address;
import pl.eparking.base.Bill;
import pl.eparking.base.BillRecharge;
import pl.eparking.base.Control;
import pl.eparking.base.Controller;
import pl.eparking.base.Fine;
import pl.eparking.base.Person;
import pl.eparking.base.Vehicle;
import pl.eparking.billservice.GetBill;
import pl.eparking.billservice.RechargeBill;
import pl.eparking.controlservice.ControlParking;
import pl.eparking.controlservice.ControlParkingResponse;
import pl.eparking.parkingservice.AddControl;
import pl.eparking.parkingservice.AddFine;
import pl.eparking.parkingservice.GetParking;

public class Operator {
	
	public AddFine controlParkingToAddFine(ControlParking input, Double fineAmount, String fineType, String accountId, String controlId){
		AddFine output = new AddFine();
		Fine fine = new Fine();
		fine.setFineAmount(fineAmount);
		fine.setControlId(controlId);
		fine.setAccountId(accountId);
		fine.setIssueDate(input.getControl().getControlDate());
		fine.setFineType(fineType);
		output.setFine(fine);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public RechargeBill controlParkingToRechargeBill(ControlParking input, Account account, Double fineAmount){
		RechargeBill output = new RechargeBill();
		BillRecharge billRecharge = new BillRecharge();
		billRecharge.setAmount(fineAmount * -1);
		Bill bill = new Bill();
		bill.setBillId(account.getBill().getBillId());
		bill.setOperation("fine_charge");
		Person person = new Person();
		person.setPersonId(account.getPerson().getPersonId());
		bill.setPerson(person);
		billRecharge.setBill(bill);
		output.setBillRecharge(billRecharge);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public Double calculateFine(String fineType){
		Double fineAmount = null;
		if(fineType.equals("inactiveParking")){
			fineAmount = 100.0;
		}else if(fineType.equals("inactiveAccount")){
			fineAmount = 200.0;
		}else{
			fineAmount = 50.0;
		}
		return fineAmount;
	}

	public ControlParkingResponse controlParkingResponseFine(String fineId, String accountId, String controlId, Double fineAmount, String fineType){
		ControlParkingResponse output = new ControlParkingResponse();
		Fine fine = new Fine();
		fine.setAccountId(accountId);
		fine.setControlId(controlId);
		fine.setFineAmount(fineAmount);
		fine.setFineId(fineId);
		fine.setFineType(fineType);
		output.setFine(fine);
		output.setStatus("SUCCESS");
		return output;
	}
	
	public ControlParkingResponse controlParkingResponseNoFine(String controlId){
		ControlParkingResponse output = new ControlParkingResponse();
		Fine fine = new Fine();
		fine.setControlId(controlId);
		output.setFine(fine);
		output.setStatus("SUCCESS");
		return output;
	}
	
	public GetParking controlParkingToGetParking(ControlParking input, String accountId){
		GetParking output = new GetParking();
		Account account = new Account();
		account.setAccountId(accountId);
		output.setAccount(account);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public GetBill controlParkingToGetBill(ControlParking input, Account account){
		GetBill output = new GetBill();
		Bill bill = new Bill();
		bill.setBillId(account.getBill().getBillId());
		Person person = new Person();
		person.setPersonId(account.getPerson().getPersonId());
		bill.setPerson(person);
		output.setBill(bill);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public FindAccount controlParkingToFindAccount(ControlParking input){
		FindAccount output = new FindAccount();
		String vehicleRegistrationNumber = input.getControl().getVehicle().getRegistrationNumber();
		AccountSearchCriteria asc = new AccountSearchCriteria();
		asc.setVehicleRegistrationNumber(vehicleRegistrationNumber);
		output.setAccountSearchCriteria(asc);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public Control updateControl(String controlId, Control input){
		Control output = new Control();
		output.setControlId(controlId);
		return output;
	}
	
	public AddControl controlParkingToAddControl(ControlParking input){
		AddControl output = new AddControl();
		output.setControl(input.getControl());
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public ControlParking controlParkingRestToControlParking(HashMap<String, Object> headers){
		ControlParking output = new ControlParking();
		output.setRequestId(randomInt(1000000, 9999999).toString());
		output.setRequestDate(transformStringDatetimeToGregorian(generateDate()));
		Control control = new Control();
		control.setControlDate(transformStringDatetimeToGregorian((String) headers.get("control-datetime")));
		Controller controller = new pl.eparking.base.Controller();
		controller.setControllerId((String) headers.get("controller-id"));
		Person person = new Person();
		person.setFirstName(headers.get("controller-name").toString().split(" ")[0]);
		person.setLastName(headers.get("controller-name").toString().split(" ")[1]);
		person.setEmail((String) headers.get("controller-mail"));
		controller.setPerson(person);
		control.setController(controller);
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleType((String) headers.get("control-vehicletype"));
		vehicle.setRegistrationNumber((String) headers.get("control-vehicleregistration"));
		control.setVehicle(vehicle);
		Address address = new Address();
		address.setCity((String) headers.get("control-city"));
		address.setPostalCode((String) headers.get("control-code"));
		address.setProvince((String) headers.get("control-province"));
		address.setStreet((String) headers.get("control-street"));
		address.setStreetNumber((String) headers.get("control-streetnumber"));
		control.setAddress(address);
		output.setControl(control);
		return output;
	}
	
	@SuppressWarnings("unused")
	public void controlParkingAdapterValidate(HashMap<String, Object> headers) throws IllegalArgumentException{
		
		XMLGregorianCalendar testCalendar;
		try {
			testCalendar = transformStringDatetimeToGregorian((String) headers.get("control-datetime"));
		} catch (Exception e) {
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing control date for controlParking " + headers.get("control-datetime"));
			throw validatorException;
		}
		
		if(!Pattern.compile("\\d{4}").matcher(headers.get("controller-id").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing controller id for controlParking " + headers.get("controller-id"));
			throw validatorException;
		}
		
		String controllerName = (String) headers.get("controller-name");
		String[] controllerNames = controllerName.split(" ");
		if(!Pattern.compile("[A-z]+").matcher(controllerNames[0]).matches() || !Pattern.compile("[A-z]+").matcher(controllerNames[1]).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing controller name for controlParking " + headers.get("controller-name"));
			throw validatorException;
		}
		if(!Pattern.compile(".+\\@\\w+\\.\\w+").matcher(headers.get("controller-mail").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing controller email for controlParking " + headers.get("controller-mail"));
			throw validatorException;
		}
		if(!Pattern.compile("\\d{2}\\-\\d{3}").matcher(headers.get("control-code").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing control code for controlParking " + headers.get("control-code"));
			throw validatorException;
		}		
		if(!Pattern.compile("[\\p{L}\\s\\.]+").matcher(headers.get("control-city").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing control city for controlParking " + headers.get("control-city"));
			throw validatorException;
		}
		if(!Pattern.compile("[\\p{L}\\s\\.]+").matcher(headers.get("control-province").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing control province for controlParking " + headers.get("control-province"));
			throw validatorException;
		}		
		if(!Pattern.compile("[\\p{L}\\p{N}\\s\\.\\-]+").matcher(headers.get("control-street").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing control street for controlParking " + headers.get("control-street"));
			throw validatorException;
		}		
		if(!Pattern.compile("\\w+").matcher(headers.get("control-streetnumber").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing control streetnumber for controlParking " + headers.get("control-streetnumber"));
			throw validatorException;
		}			
		if(!Pattern.compile("[a-zA-Z]{1,3}\\d{1,7}([a-zA-Z]{1,2})?").matcher(headers.get("control-vehicleregistration").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing control vehicleregistration for controlParking " + headers.get("control-vehicleregistration"));
			throw validatorException;
		}	
		if(!Pattern.compile("\\w+").matcher(headers.get("control-vehicletype").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing control vehicletype for controlParking " + headers.get("control-vehicletype"));
			throw validatorException;
		}		
	}
	
	public static String generateDate(){
		Date date = new Date();
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		return DATE_FORMAT.format(date);
	}
	
	public static Integer randomInt(int min, int max) {
	    Random rand = new Random();
	    return rand.nextInt((max - min) + 1) + min;
	}
	
	public XMLGregorianCalendar transformTimestampToGregorian(long input){
		Date date = new Date(input);
		return transformDateToGregorian(date);
	}
	
	public static XMLGregorianCalendar transformStringDateToGregorian(String input) {
		try {
			DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date date = DATE_FORMAT.parse(input + "T00:00:00");
			XMLGregorianCalendar xmlGregorianDate = transformDateToGregorian(date);
			xmlGregorianDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			return xmlGregorianDate;
		} catch (Exception e) {
			return null;
		}
	}

	public static XMLGregorianCalendar transformStringDatetimeToGregorian(String input) {
		try {
			DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date date = DATE_FORMAT.parse(input);
			XMLGregorianCalendar xmlGregorianDate = transformDateToGregorian(date);
			xmlGregorianDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			return xmlGregorianDate;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static XMLGregorianCalendar transformDateToGregorian(Date date) {
		try {
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(date);
			XMLGregorianCalendar xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
			return xgc;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Date transformDateGregorianToDate(XMLGregorianCalendar date){
		try {
			return date.toGregorianCalendar().getTime();
		} catch (Exception e) {
			return null;
		}
	}
	
	public double round(double value, int places) {
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
}
