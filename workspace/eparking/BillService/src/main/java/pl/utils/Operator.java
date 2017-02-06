package pl.utils;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import pl.eparking.base.Bill;
import pl.eparking.base.BillRecharge;
import pl.eparking.base.Person;
import pl.eparking.billservice.AddBill;
import pl.eparking.billservice.AddBillResponse;
import pl.eparking.billservice.GetBill;
import pl.eparking.billservice.GetBillResponse;
import pl.eparking.billservice.ModifyBill;
import pl.eparking.billservice.ModifyBillResponse;
import pl.eparking.billservice.RechargeBill;
import pl.eparking.billservice.RechargeBillResponse;
import pl.eparking.billservice.RegisterBill;
import pl.eparking.billservice.RegisterBillResponse;

public class Operator {
	
	@SuppressWarnings("unused")
	public void rechargeBillAdapterValidate(HashMap<String, Object> headers) throws IllegalArgumentException{
		
		if(!Pattern.compile("[A-Z0-9]{32,32}").matcher(headers.get("billId").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing billId in rechargeBill REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[0-9]*").matcher(headers.get("personId").toString()).matches()){
			IllegalArgumentException validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing personId in rechargeBill REST Request");
			throw validatorException;
		}
		try {
			double amountDouble = Double.parseDouble(headers.get("amount").toString());
		} catch (Exception e) {
			IllegalArgumentException validatorException = new IllegalArgumentException("EparkingValidationException: " + e);
			throw validatorException;
		}
	}
	
	public RechargeBill rechargeBillAdapter(String billId, String personId, Double amount){
		RechargeBill rechargeBill = new RechargeBill();
		BillRecharge billRecharge = new BillRecharge();
		Bill bill = new Bill();
		Person person = new Person();
		person.setPersonId(personId);
		billRecharge.setAmount(amount);
		bill.setBillId(billId);
		bill.setPerson(person);
		billRecharge.setBill(bill);
		rechargeBill.setBillRecharge(billRecharge);
		rechargeBill.setRequestId(randomInt(1000000, 9999999).toString());
		rechargeBill.setRequestDate(transformStringToGregorian(generateDate()));
		return rechargeBill;
	}
	
	public AddBill registerBillToAddBill(RegisterBill request){
		AddBill response = new AddBill();
		response.setPerson(request.getPerson());
		response.setRequestDate(request.getRequestDate());
		response.setRequestId(request.getRequestId());
		return response;
	}
	
	public RegisterBillResponse addBillResponseToRegisterBillResponse(AddBillResponse request){
		RegisterBillResponse response = new RegisterBillResponse();
		response.setBill(request.getBill());
		response.setStatus("SUCCESS");
		return response;
	}
	
	public GetBill rechargeBillToGetBill(RechargeBill request){
		GetBill response = new GetBill();
		response.setBill(request.getBillRecharge().getBill());
		response.setRequestDate(request.getRequestDate());
		response.setRequestId(request.getRequestId());
		return response;
	}
	
	public AddBillResponse addBillResponse(Bill request){
		AddBillResponse response = new AddBillResponse();
		response.setBill(request);
		response.setStatus("SUCCESS");
		return response;
	}
	
	public ModifyBill getBillResponseToModifyBill(GetBillResponse request, RechargeBill request2){
		ModifyBill response = new ModifyBill();
		Bill bill = request.getBill();
		Double oldAmount = request.getBill().getBalance();
		Double rechargeAmount = request2.getBillRecharge().getAmount();
		Double newAmount = oldAmount + rechargeAmount;
		bill.setBalance(newAmount);
		if(request2.getBillRecharge().getBill().getOperation() != null){
			bill.setOperation(request2.getBillRecharge().getBill().getOperation());
		}else{
			bill.setOperation("bill_recharge");
		}
		response.setBill(bill);
		response.setRequestDate(request2.getRequestDate());
		response.setRequestId(request2.getRequestId());
		return response;
	}
	
	public RechargeBillResponse modifyBillResponseToRechargeBillResponse(GetBillResponse request, ModifyBill request2){
		RechargeBillResponse response = new RechargeBillResponse();
		Bill bill = request.getBill();
		bill.setBalance(round(request2.getBill().getBalance(), 2));
		response.setBill(bill);
		response.setStatus("SUCCESS");
		return response;
	}
	
	public Bill createBill(AddBill request){
		Bill response = new Bill();
		response.setBalance(0.0);
		response.setBankNumber(generateAccountNumber());
		response.setBillId(generateBillId());
		response.setPerson(request.getPerson());
		response.setOperation("bill_register");
		return response;
	}
	
	public Map<String, Object> transformBill(Bill request){
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("BILLID", request.getBillId());
		response.put("PERSONID", request.getPerson().getPersonId());
		response.put("BANKNUMBER", request.getBankNumber());
		response.put("BALANCE", round(request.getBalance(), 2));
		response.put("MODIFYDATE", generateDate());
		response.put("OPERATION", request.getOperation());
		return response;
	}
	
	public AddBillResponse registerBill(Bill request){
		AddBillResponse response = new AddBillResponse();
		response.setBill(request);
		response.setStatus("SUCCESS");
		return response;
	}
	
	public GetBillResponse getBillResponse(List<List<String>> request){
		List<String> line = request.get(request.size() - 1);
		GetBillResponse response = new GetBillResponse();
		Bill bill = new Bill();
		Person person = new Person();
		bill.setBillId(line.get(0));
		person.setPersonId(line.get(1));
		bill.setBankNumber(line.get(2));
		bill.setBalance(round(Double.parseDouble(line.get(3)), 2));
		bill.setPerson(person);
		bill.setPerson(person);
		response.setBill(bill);
		response.setStatus("SUCCESS");
		return response;
	}
	
	public ModifyBillResponse modifyBillResponse(){
		ModifyBillResponse response = new ModifyBillResponse();
		response.setStatus("SUCCESS");
		return response;
	}

	public String generateBillId(){
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	
	public String generateAccountNumber(){
		StringBuilder sb = new StringBuilder();
		sb.append("PL");
		sb.append("53");
		sb.append("1106");
		sb.append(randomInt(1000, 9999).toString());
		sb.append(randomInt(1000, 9999).toString());
		sb.append(randomInt(1000, 9999).toString());
		sb.append(randomInt(1000, 9999).toString());
		sb.append(randomInt(1000, 9999).toString());
		sb.append(randomInt(1000, 9999).toString());
		return sb.toString();
	}
	
	public static String generateDate(){
		Date date = new Date();
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		return DATE_FORMAT.format(date);
	}
	
	public String getBillFileName(Bill bill){
		
		StringBuilder sb = new StringBuilder();
		
		//create subfolder path with first char of bill id and first char of person id
		sb.append("/").append(bill.getBillId().substring(0, 1)).append("/").append(bill.getPerson().getPersonId().substring(0, 1)).append("/");
		
		//create file name
		sb.append("BILL_").append(bill.getBillId());
		sb.append("_PERSON_").append(bill.getPerson().getPersonId());
		sb.append(".CSV"); 
		
		return sb.toString();
	}
	
	public File getFile(String fileLocation, String fileName){ 
	    return new File(fileLocation + "/" + fileName);
	}
	
	public static Integer randomInt(int min, int max) {
	    Random rand = new Random();
	    return rand.nextInt((max - min) + 1) + min;
	}
	
	public static XMLGregorianCalendar transformTimestampToGregorian(long input){
		Date date = new Date(input);
		return transformDateToGregorian(date);
	}
	
	public static XMLGregorianCalendar transformStringToGregorian(String input) {
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
