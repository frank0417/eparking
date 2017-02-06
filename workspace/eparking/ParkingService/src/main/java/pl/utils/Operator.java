package pl.utils;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import pl.eparking.accountservice.GetAccount;
import pl.eparking.api.aplikacja.DodajKontrole;
import pl.eparking.api.aplikacja.DodajKontroleResponse;
import pl.eparking.api.aplikacja.DodajMandat;
import pl.eparking.api.aplikacja.DodajMandatResponse;
import pl.eparking.api.aplikacja.DodajParking;
import pl.eparking.api.aplikacja.DodajParkingResponse;
import pl.eparking.api.aplikacja.ModyfikujParking;
import pl.eparking.api.aplikacja.ModyfikujParkingResponse;
import pl.eparking.base.Account;
import pl.eparking.base.Address;
import pl.eparking.base.Bill;
import pl.eparking.base.BillRecharge;
import pl.eparking.base.Control;
import pl.eparking.base.Fine;
import pl.eparking.base.Parking;
import pl.eparking.base.Person;
import pl.eparking.billservice.RechargeBill;
import pl.eparking.parkingservice.AddControl;
import pl.eparking.parkingservice.AddControlResponse;
import pl.eparking.parkingservice.AddFine;
import pl.eparking.parkingservice.AddFineResponse;
import pl.eparking.parkingservice.AddParking;
import pl.eparking.parkingservice.AddParkingResponse;
import pl.eparking.parkingservice.EndParking;
import pl.eparking.parkingservice.EndParkingResponse;
import pl.eparking.parkingservice.GetParking;
import pl.eparking.parkingservice.GetParkingResponse;
import pl.eparking.parkingservice.ModifyParking;
import pl.eparking.parkingservice.ModifyParkingResponse;
import pl.eparking.parkingservice.NotifyParking;
import pl.eparking.parkingservice.ParkingAction;
import pl.eparking.parkingservice.SaveParking;
import pl.eparking.parkingservice.SaveParkingResponse;
import pl.eparking.parkingservice.StartParking;
import pl.eparking.parkingservice.StartParkingResponse;
import pl.eparking.parkingservice.UpdateParking;
import pl.eparking.parkingservice.UpdateParkingResponse;
import pl.eparking.technical.BaseError;
import pl.eparkingdb.Konto;
import pl.eparkingdb.Pojazd;


public class Operator {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("eparkingPU");
	
	public EndParking endParkingRestToEndParking(HashMap<String, Object> headers){
		EndParking output = new EndParking();		
		Account account = new Account();
		account.setAccountId(headers.get("accountId").toString());
		output.setAccount(account);
		output.setRequestDate(transformDateToGregorian(new Date()));
		output.setRequestId(Integer.toString(randomInt(100000000, 999999999)));
		return output;
	}
	
	public StartParking startParkingRestToStartParking(HashMap<String, Object> headers, pl.eparkingrest.Parking body){
		
		StartParking output = new StartParking();
		
		Account account = new Account();
		account.setAccountId(headers.get("accountId").toString());
		output.setAccount(account);
		
		Parking parking = new Parking();
		parking.setParkingType(body.getParkingType());
		if(body.getParkingType().equals("time")){
			parking.setParkingTime(Double.parseDouble(body.getParkingTime()));
		}else if(body.getParkingType().equals("free")){
			parking.setParkingPrice(Double.parseDouble(body.getParkingPrice()));
		}else if(body.getParkingType().equals("deadline")){
			parking.setParkingEnd(transformStringToGregorian(body.getParkingEnd()));
		}
		Address address = new Address();
		address.setProvince(body.getProvince());
		address.setPostalCode(body.getPostalCode());
		address.setCity(body.getCity());
		address.setStreet(body.getStreet());
		address.setStreetNumber(body.getStreetNumber());
		parking.setAddress(address);
		output.setParking(parking);
		
		output.setRequestDate(transformDateToGregorian(new Date()));
		output.setRequestId(Integer.toString(randomInt(100000000, 999999999)));
		
		return output;
	}
	
	public void endParkingAdapterValidate(HashMap<String, Object> headers, pl.eparkingrest.Parking body) throws IllegalArgumentException{
		if(!Pattern.compile("\\w+").matcher(headers.get("accountId").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing account in endParking REST Request");
			throw validatorException;
		}
	}
	
	@SuppressWarnings("unused")
	public void startParkingAdapterValidate(HashMap<String, Object> headers, pl.eparkingrest.Parking body) throws IllegalArgumentException{

		double testDouble;
		XMLGregorianCalendar testCalendar;
		
		if(!Pattern.compile("\\w+").matcher(headers.get("accountId").toString()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing account in startParking REST Request");
			throw validatorException;
		}
		
		if(body.getParkingType().equals("time")){
			try {
				testDouble = Double.parseDouble(body.getParkingTime());
			} catch (Exception e) {
				IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing ParkingTime for ParkingType " + body.getParkingType() + " in startParking REST Request");
				throw validatorException;
			}
		}else if(body.getParkingType().equals("free")){
			try {
				testDouble = Double.parseDouble(body.getParkingPrice());
			} catch (Exception e) {
				IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing ParkingPrice for ParkingType " + body.getParkingType() + " in startParking REST Request");
				throw validatorException;
			}
		}else if(body.getParkingType().equals("deadline")){
			try {
				testCalendar = transformStringToGregorian(body.getParkingEnd());
			} catch (Exception e) {
				IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing ParkingEnd for ParkingType " + body.getParkingType() + " in startParking REST Request");
				throw validatorException;
			}
		}else{
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing ParkingType in startParking REST Request");
			throw validatorException;			
		}
		
		if(!Pattern.compile("[A-z]+").matcher(body.getProvince()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Province in startParking REST Request");
			throw validatorException;
		}

		if(!Pattern.compile("\\d{2}\\-\\d{3}").matcher(body.getPostalCode()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing PostalCode in startParking REST Request");
			throw validatorException;
		}

		if(!Pattern.compile("[A-z]+").matcher(body.getCity()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing City in startParking REST Request");
			throw validatorException;
		}
		
		if(!Pattern.compile("[A-z]+").matcher(body.getStreet()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Street in startParking REST Request");
			throw validatorException;
		}

		if(!Pattern.compile("\\w+").matcher(body.getStreetNumber()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing StreetNumber in startParking REST Request");
			throw validatorException;
		}
		
	}
	
	public UpdateParking endParkingToUpdateParking(EndParking input, Parking parking, String accountId, Boolean compensate){
		UpdateParking output = new UpdateParking();
		Account account = new Account();
		account.setAccountId(accountId);
		output.setAccount(account);
		if(compensate == false){
			parking.setParkingStatus("finished");	
		}else{
			parking.setParkingStatus("started");
		}
		output.setParking(parking);
		output.setRequestDate(input.getRequestDate());
		output.setRequestId(input.getRequestId());
		return output;
	}
	
	public ModifyParking endParkingToModifyParking(EndParking input, Account account, Parking parking){
		ModifyParking output = new ModifyParking();
		output.setAccount(account);
		output.setParking(parking);
		output.setRequestDate(input.getRequestDate());
		output.setRequestId(input.getRequestId());
		return output;
	}
	
	public GetParking startParkingToGetParking(StartParking input){
		GetParking output = new GetParking();
		output.setAccount(input.getAccount());
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}

	public GetParking endParkingToGetParking(EndParking input){
		GetParking output = new GetParking();
		output.setAccount(input.getAccount());
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public EndParkingResponse endParkingResponse(){
		EndParkingResponse output = new EndParkingResponse();
		output.setStatus("SUCCESS");
		return output;
	}
	
	public StartParkingResponse startParkingResponse(){
		StartParkingResponse output = new StartParkingResponse();
		output.setStatus("SUCCESS");
		return output;
	}
	
	public NotifyParking endParkingToNotifyParking(EndParking input, String accountId, String parkingId){
		NotifyParking output = new NotifyParking();
		Account account = new Account();
		account.setAccountId(accountId);
		output.setAccount(account);
		Parking parking = new Parking();
		parking.setParkingId(parkingId);
		output.setParking(parking);
		output.setParkingAction(ParkingAction.PARKING_END);
		output.setRequestDate(input.getRequestDate());
		output.setRequestId(input.getRequestId());
		return output;
	}
	
	public NotifyParking startParkingToNotifyParking(StartParking input, String accountId, String parkingId){
		NotifyParking output = new NotifyParking();
		Account account = new Account();
		account.setAccountId(accountId);
		output.setAccount(account);
		Parking parking = new Parking();
		parking.setParkingId(parkingId);
		output.setParking(parking);
		output.setParkingAction(ParkingAction.PARKING_START);
		output.setRequestDate(input.getRequestDate());
		output.setRequestId(input.getRequestId());
		return output;
	}
	
	public SaveParking startParkingToSaveParking(StartParking input, Account account, Parking parking){
		SaveParking output = new SaveParking();
		parking.setVehicleId(account.getVehicle().getVehicleId());
		output.setAccount(account);
		output.setParking(parking);
		output.setRequestDate(input.getRequestDate());
		output.setRequestId(input.getRequestId());		
		return output;
	}
	
	public Parking addParkingId(Parking parking, Parking input){
		parking.setParkingId(input.getParkingId());	
		return parking;
	}
	
	public AddParking startParkingToAddParking(StartParking input, Account account, Parking parking, Bill bill){
		AddParking output = new AddParking(); 
		output.setAccount(account);
		output.setBill(bill);
		output.setParking(parking);
		output.setRequestDate(input.getRequestDate());
		output.setRequestId(input.getRequestId());
		return output;
	}
	
	public RechargeBill endParkingToRechargeBill(EndParking input, Account account, Parking parking, Boolean compensate){
		RechargeBill output = new RechargeBill();
		BillRecharge billRecharge = new BillRecharge();
		Bill bill = new Bill();
		bill.setBillId(account.getBill().getBillId());
		Person person = new Person();
		person.setPersonId(account.getPerson().getPersonId());
		bill.setPerson(person);
		if(compensate == false){
			bill.setOperation("end_parking_charge");
			billRecharge.setAmount(parking.getParkingPrice() * 1);
		}else{
			bill.setOperation("cancel_end_parking_charge");
			billRecharge.setAmount(parking.getParkingPrice() * -1);
		}
		billRecharge.setBill(bill);
		output.setBillRecharge(billRecharge);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public RechargeBill startParkingToRechargeBill(StartParking input, Account account, Parking parking, Boolean compensate){
		RechargeBill output = new RechargeBill();
		BillRecharge billRecharge = new BillRecharge();
		Bill bill = new Bill();
		bill.setBillId(account.getBill().getBillId());
		Person person = new Person();		
		person.setPersonId(account.getPerson().getPersonId());
		bill.setPerson(person);
		if(compensate == false){
			bill.setOperation("start_parking_charge");
			billRecharge.setAmount(parking.getParkingPrice() * -1);
		}else{
			bill.setOperation("cancel_start_parking_charge");
			billRecharge.setAmount(parking.getParkingPrice() * 1);
		}
		billRecharge.setBill(bill);
		output.setBillRecharge(billRecharge);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public Parking calculateParkingEnd(Parking input) throws IOException{
		Date parkingStart = transformDateGregorianToDate(input.getParkingStart());
		Date parkingEnd = transformDateGregorianToDate(input.getParkingEnd());
		Calculator calc = new Calculator().CalculateParking(null, null, parkingStart, parkingEnd, "return");
		String calc_status = calc.getStatus();
		if(calc_status != "300"){
			IOException exception = new IOException("EparkingTechnicalException: Calculation error with code " + calc_status + ".");
			throw exception;
		}		
		Parking output = new Parking();
		output = input;	
		output.setParkingEnd(calc.getParkingEnd());
		output.setParkingPrice(calc.getAmount());
		output.setParkingStart(calc.getParkingStart());
		output.setParkingTime(calc.getParkingTime());
		output.setParkingStatus("finished");		
		return output;
	}
	
	public Parking calculateParkingStart(StartParking input) throws IOException{
		Parking parking = input.getParking();
		Double parkingPrice = parking.getParkingPrice();
		Double parkingTime = parking.getParkingTime();
		String parkingType = parking.getParkingType();
		Date parkingEnd = transformDateGregorianToDate(parking.getParkingEnd());
		Calculator calc = new Calculator().CalculateParking(parkingPrice, parkingTime, null, parkingEnd, parkingType);
		String calc_status = calc.getStatus();
		if(calc_status != "300"){
			IOException exception = new IOException("EparkingTechnicalException: Calculation error with code " + calc_status + ".");
			throw exception;
		}
		Parking output = new Parking();
		output = parking;
		output.setParkingEnd(calc.getParkingEnd());
		output.setParkingPrice(calc.getAmount());
		output.setParkingStart(calc.getParkingStart());
		output.setParkingTime(calc.getParkingTime());
		output.setParkingStatus("started");		
		return output;
	}

	public GetAccount endParkingToGetAccount(EndParking input){
		GetAccount output = new GetAccount();
		Account account = new Account();
		account.setAccountId(input.getAccount().getAccountId());
		output.setAccount(account);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public GetAccount startParkingToGetAccount(StartParking input){
		GetAccount output = new GetAccount();
		Account account = new Account();
		account.setAccountId(input.getAccount().getAccountId());
		output.setAccount(account);
		output.setRequestId(input.getRequestId());
		output.setRequestDate(input.getRequestDate());
		return output;
	}
	
	public String notifyParkingConnectorGetAction(String input){
		if(input.equals("parking_start")){
			return "start";
		}else{
			return "end";
		}	
	}
	
	public ModyfikujParking modifyParkingConnector(ModifyParking input){
		ModyfikujParking output = new ModyfikujParking();
		output.setModyfikujParkingParking(input.getParking().getParkingId());
		output.setModyfikujParkingPojazd(input.getParking().getVehicleId());
		output.setModyfikujParkingKonto(input.getAccount().getAccountId());
		output.setModyfikujParkingStart(input.getParking().getParkingStart());
		output.setModyfikujParkingKoniec(input.getParking().getParkingEnd());
		output.setModyfikujParkingCena(input.getParking().getParkingPrice().toString());
		output.setModyfikujParkingCzas(input.getParking().getParkingTime().toString());
		return output;
	}
	
	public ModifyParkingResponse modifyParkingConnectorResponse(ModyfikujParkingResponse input){
		ModifyParkingResponse output = new ModifyParkingResponse();
		output.setStatus("SUCCESS");
		return output;
	}
	
	public DodajParking addParkingConnector(AddParking input){
		DodajParking output = new DodajParking();
		output.setDodajParkingKodPocztowy(input.getParking().getAddress().getPostalCode());
		output.setDodajParkingMiasto(input.getParking().getAddress().getCity());
		output.setDodajParkingUlica(input.getParking().getAddress().getStreet());
		output.setDodajParkingNumer(input.getParking().getAddress().getStreetNumber());
		output.setDodajParkingStart(input.getParking().getParkingStart());
		output.setDodajParkingKoniec(input.getParking().getParkingEnd());
		output.setDodajParkingPojazd(input.getParking().getVehicleId());
		output.setDodajParkingCena(input.getParking().getParkingPrice().toString());
		output.setDodajParkingCzas(input.getParking().getParkingTime().toString());
		output.setDodajParkingKonto(input.getAccount().getAccountId());
		if(input.getBill().getBalance() >= 0){
			output.setDodajParkingSaldoDodatnie(true);
		}else{
			output.setDodajParkingSaldoDodatnie(false);
		}
		return output;
	}
	
	public AddParkingResponse addParkingConnectorResponse(DodajParkingResponse input){
		Parking parking = new Parking();
		parking.setParkingId(input.getDodajParkingParking());
		AddParkingResponse output = new AddParkingResponse();
		output.setParking(parking);
		output.setStatus("SUCCESS");
		return output;
	}
	
	public DodajKontrole addControlConnector(AddControl input){
		StringBuilder adres = new StringBuilder();
		adres.append(input.getControl().getAddress().getPostalCode()).append(' ');
		adres.append(input.getControl().getAddress().getCity()).append(' ');
		adres.append(input.getControl().getAddress().getStreet()).append(' ');
		adres.append(input.getControl().getAddress().getStreetNumber());
		StringBuilder kontroler = new StringBuilder();
		kontroler.append(input.getControl().getController().getControllerId()).append(' ');
		kontroler.append(input.getControl().getController().getPerson().getEmail()).append('|');
		kontroler.append(input.getControl().getController().getPerson().getLastName()).append('|');
		kontroler.append(input.getControl().getController().getPerson().getFirstName());
		DodajKontrole output = new DodajKontrole();
		output.setDodajKontroleAdres(adres.toString());
		output.setDodajKontroleData(input.getControl().getControlDate());
		output.setDodajKontroleKontroler(kontroler.toString());
		output.setDodajKontrolePojazd(input.getControl().getVehicle().getRegistrationNumber());
		return output;
	}
	
	public AddControlResponse addControlConnectorResponse(DodajKontroleResponse input){
		AddControlResponse output = new AddControlResponse();
		Control control = new Control();
		control.setControlId(input.getDodajKontroleKontrola());
		output.setControl(control);
		output.setStatus("SUCCESS");
		return output;
	}
	
	public DodajMandat addFineConnector(AddFine input){
		DodajMandat output = new DodajMandat();
		String typMandatu = null;
		if(input.getFine().getFineType().equals("inactiveParking")){ 
			typMandatu = "BRAK_AKTYWNEGO_PARKINGU_DLA_AKTYWNEGO_KONTA";
		}else if(input.getFine().getFineType().equals("inactiveAccount")){
			typMandatu = "BRAK_AKTYWNEGO_KONTA"; 
		}
		output.setDodajMandatDataKontroli(input.getFine().getIssueDate().toString());
		output.setDodajMandatIdKontaKierowcy(input.getFine().getAccountId());
		output.setDodajMandatIdKontroli(input.getFine().getControlId());
		output.setDodajMandatKwota(input.getFine().getFineAmount().toString());
		output.setDodajMandatTypMandatu(typMandatu);
		return output;
	}
	
	public AddFineResponse addFineConnectorResponse(DodajMandatResponse input){
		AddFineResponse output = new AddFineResponse();
		Fine fine = new Fine();
		fine.setFineId(input.getDodajMandatIdMandatu());
		output.setFine(fine);
		output.setStatus("SUCCESS");
		return output;
	}
	
	public pl.eparkingdb.Parking saveParkingToParking(SaveParking input){
		pl.eparkingdb.Parking output = new pl.eparkingdb.Parking();
		Konto konto = new Konto();
		Pojazd pojazd = new Pojazd();
		konto.setId(Integer.parseInt(input.getAccount().getAccountId()));
		output.setKonto(konto);
		pojazd.setId(Integer.parseInt(input.getParking().getVehicleId()));
		output.setPojazd(pojazd);
		output.setParkingStart(transformDateGregorianToDate(input.getParking().getParkingStart()));
		output.setParkingEnd(transformDateGregorianToDate(input.getParking().getParkingEnd()));
		output.setParkingId(Integer.parseInt(input.getParking().getParkingId()));
		output.setParkingStatus(input.getParking().getParkingStatus());
		output.setParkingType(input.getParking().getParkingType());
		return output;
	}
	
	public SaveParkingResponse parkingToSaveParkingResponse(pl.eparkingdb.Parking input){
		SaveParkingResponse output = new SaveParkingResponse();
		output.setStatus("SUCCESS");
		return output;
	}
	
	public UpdateParking startParkingToUpdateParking(StartParking input, String accountId){
		UpdateParking output = new UpdateParking();
		Account account = new Account();
		account.setAccountId(accountId);
		output.setAccount(account);
		Parking parking = new Parking();
		parking.setParkingStatus("cancelled");
		output.setParking(parking);
		output.setRequestDate(input.getRequestDate());
		output.setRequestId(input.getRequestId());
		return output;
	}
	
	public UpdateParkingResponse updateParking(UpdateParking input){
		
		EntityManager em = emf.createEntityManager();
		
		String query = "SELECT P FROM Parking P WHERE P.konto.id = :konto_id AND P.parkingStatus = 'started'";
		int konto_id = Integer.parseInt(input.getAccount().getAccountId());
		
		pl.eparkingdb.Parking parking = em.createQuery(query, pl.eparkingdb.Parking.class).setParameter("konto_id", konto_id).getResultList().get(0);
		
		parking.setParkingStatus(input.getParking().getParkingStatus());
			
		if (input.getParking().getParkingStatus().equals("finished")){
			parking.setParkingEnd(transformDateGregorianToDate(input.getParking().getParkingEnd()));
		}
		
		em.getTransaction().begin();
		em.merge(parking);
		em.flush();
		em.getTransaction().commit();
		
		UpdateParkingResponse output = new UpdateParkingResponse();
		output.setStatus("SUCCESS");
		em.close();
		return output;
	}
	
	public GetParkingResponse getParking(GetParking input){
		
		String query = null;
		pl.eparkingdb.Parking parking_db = null;
		int konto_id;
		int parking_id;
		
		GetParkingResponse output = new GetParkingResponse();
		
		EntityManager em = emf.createEntityManager();
		
		try {
			if(input.getAccount() != null){
				if(input.getAccount().getAccountId() != null){
					query = "SELECT P FROM Parking P WHERE P.konto.id = :konto_id AND P.parkingStatus = 'started'";
					konto_id = Integer.parseInt(input.getAccount().getAccountId());
					parking_db = em.createQuery(query, pl.eparkingdb.Parking.class).setParameter("konto_id", konto_id).getResultList().get(0);
				}
			}else{
				query = "SELECT P FROM Parking P WHERE P.parkingId = :parking_id";
				parking_id = Integer.parseInt(input.getParking().getParkingId());
				parking_db = em.createQuery(query, pl.eparkingdb.Parking.class).setParameter("parking_id", parking_id).getResultList().get(0);
			}			
			Parking parking = new Parking();
			parking.setParkingEnd(transformDateToGregorian(parking_db.getParkingEnd()));
			parking.setParkingId(Integer.toString(parking_db.getParkingId()));
			parking.setParkingStart(transformDateToGregorian(parking_db.getParkingStart()));
			parking.setParkingStatus(parking_db.getParkingStatus());
			parking.setParkingType(parking_db.getParkingType());
			parking.setVehicleId(Integer.toString(parking_db.getPojazd().getId()));
			output.setParking(parking);
			output.setStatus("SUCCESS");
		} catch (IndexOutOfBoundsException e) {
			BaseError error = new BaseError();
			error.setErrorCode("SIMPLE/CODE/200001");
			error.setErrorDescription("Database no results found");
			error.setExceptionCode("IndexOutOfBoundsException");
			error.setExceptionRoute("ParkingServiceConnectorGetParking");
			output.setError(error);
			output.setStatus("WARNING");
		}
		
		em.close();
		return output;
	}
	
	public int finishParking(){
		
		EntityManager em = emf.createEntityManager();
		
		String query = "SELECT P FROM Parking P WHERE P.parkingEnd < :currentDate AND P.parkingStatus = 'started'";
		Date currentDate = new Date(System.currentTimeMillis());
		
		List<pl.eparkingdb.Parking> parkings = em.createQuery(query, pl.eparkingdb.Parking.class).setParameter("currentDate", currentDate).getResultList();
		
		em.getTransaction().begin();
		
		for(pl.eparkingdb.Parking parking : parkings){
			parking.setParkingStatus("finished");
			parking.setParkingEnd(currentDate);
			em.merge(parking);
			em.flush();
		}
		
		em.getTransaction().commit();
		em.close();
		return parkings.size();
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
	
	public static double round(double value, int places) {
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

	public static XMLGregorianCalendar transformStringDateTimeToGregorian(String input){
		try {
			DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date date = DATE_FORMAT.parse(input);
			XMLGregorianCalendar xmlGregorianDate = transformDateToGregorian(date);
			xmlGregorianDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			return xmlGregorianDate;
		} catch (ParseException e) {
			return null;
		}
	}
	
}
