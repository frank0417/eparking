package pl.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import pl.eparking.accountservice.AddAccount;
import pl.eparking.accountservice.AddAccountResponse;
import pl.eparking.accountservice.FindAccount;
import pl.eparking.accountservice.FindAccountResponse;
import pl.eparking.accountservice.GetAccount;
import pl.eparking.accountservice.GetAccountResponse;
import pl.eparking.accountservice.RegisterAccount;
import pl.eparking.accountservice.RegisterAccountResponse;
import pl.eparking.base.Account;
import pl.eparking.base.Address;
import pl.eparking.base.Bill;
import pl.eparking.base.Person;
import pl.eparking.base.Vehicle;
import pl.eparking.billservice.RegisterBill;
import pl.eparking.billservice.RegisterBillResponse;
import pl.eparking.personservice.AddPerson;
import pl.eparking.personservice.AddPersonResponse;
import pl.eparkingdb.Adres;
import pl.eparkingdb.Kierowca;
import pl.eparkingdb.Konto;
import pl.eparkingdb.Pojazd;
import pl.eparkingrest.AccountRegistration;

public class Operator {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("eparkingPU");
	
	public void registerAccountAdapterValidate(AccountRegistration body) throws IllegalArgumentException{
		
		if(!Pattern.compile("[\\p{L}\\s\\.]+").matcher(body.getPerson().getFirstName()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Person FirstName in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[\\p{L}\\s\\.]+").matcher(body.getPerson().getLastName()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Person LastName in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("\\d{11}").matcher(body.getPerson().getPesel()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Person Pesel in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile(".+\\@\\w+\\.\\w+").matcher(body.getPerson().getEmail()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Person Email in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[A-z]+").matcher(body.getPerson().getAddress().getAddressType()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Address Type in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[\\p{L}\\s\\.]+").matcher(body.getPerson().getAddress().getProvince()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Address Province in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("\\d{2}\\-\\d{3}").matcher(body.getPerson().getAddress().getPostalCode()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Address PostalCode in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[\\p{L}\\s\\.]+").matcher(body.getPerson().getAddress().getCity()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Address City in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[\\p{L}\\p{N}\\s\\.\\-]+").matcher(body.getPerson().getAddress().getStreet()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Address Street in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("\\w+").matcher(body.getPerson().getAddress().getStreetNumber()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Address StreetNumber in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("\\w+").matcher(body.getPerson().getAddress().getFlatNumber()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Address FlatNumber in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("\\w+").matcher(body.getVehicle().getVehicleType()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Vehicle Type in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[\\w\\s]+").matcher(body.getVehicle().getBrand()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Vehicle Brand in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[\\w\\s]+").matcher(body.getVehicle().getModel()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Vehicle Model in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("[a-zA-Z]{1,3}\\d{1,7}([a-zA-Z]{1,2})?").matcher(body.getVehicle().getRegistrationNumber()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Vehicle RegistrationNumber in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("\\w+").matcher(body.getVehicle().getVinNumber()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Vehicle VinNumber in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("\\d{4}\\-\\d{2}-\\d{2}").matcher(body.getVehicle().getProductionDate()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Vehicle ProductionDate in registerAccount REST Request");
			throw validatorException;
		}
		if(!Pattern.compile("\\w+").matcher(body.getVehicle().getColor()).matches()){
			IllegalArgumentException  validatorException = new IllegalArgumentException("EparkingValidationException: Invalid or missing Vehicle Color in registerAccount REST Request");
			throw validatorException;
		}

	}
	
	public RegisterAccount registerAccountRestToRegisterAccount(AccountRegistration input){
		RegisterAccount output = new RegisterAccount();
		Person person = new Person();
		person.setFirstName(input.getPerson().getFirstName());
		person.setLastName(input.getPerson().getLastName());
		person.setPesel(input.getPerson().getPesel());
		person.setEmail(input.getPerson().getEmail());
		Address address = new Address();
		address.setAddressType(input.getPerson().getAddress().getAddressType());
		address.setCity(input.getPerson().getAddress().getCity());
		address.setFlatNumber(input.getPerson().getAddress().getFlatNumber());
		address.setPostalCode(input.getPerson().getAddress().getPostalCode());
		address.setProvince(input.getPerson().getAddress().getProvince());
		address.setStreet(input.getPerson().getAddress().getStreet());
		address.setStreetNumber(input.getPerson().getAddress().getStreetNumber());
		person.setAddress(address);
		output.setPerson(person);
		Vehicle vehicle = new Vehicle();
		vehicle.setBrand(input.getVehicle().getBrand());
		vehicle.setColor(input.getVehicle().getColor());
		vehicle.setModel(input.getVehicle().getModel());
		vehicle.setProductionDate(transformStringDateToGregorian(input.getVehicle().getProductionDate()));
		vehicle.setRegistrationNumber(input.getVehicle().getRegistrationNumber());
		vehicle.setVehicleType(input.getVehicle().getVehicleType());
		vehicle.setVinNumber(input.getVehicle().getVinNumber());
		output.setVehicle(vehicle);
		output.setRequestId(randomInt(1000000, 9999999).toString());
		output.setRequestDate(transformStringToGregorian(generateDate()));
		return output;
	}
	
	public pl.eparkingrest.Account registerAccountRestResponse(RegisterAccountResponse input){
		pl.eparkingrest.Account output = new pl.eparkingrest.Account();
		output.setAccountId(input.getAccount().getAccountId());
		output.setBillingId(input.getAccount().getBill().getBillId());
		output.setPersonId(input.getAccount().getPerson().getPersonId());
		output.setVehicleId(input.getAccount().getVehicle().getVehicleId());
		output.setStatus("SUCCESS");
		return output;
	} 
	
	public RegisterAccountResponse registerAccountToRegisterAccountResponse(AddAccountResponse input){
		RegisterAccountResponse output = new RegisterAccountResponse();
		output.setAccount(input.getAccount());
		output.setStatus("SUCCESS");
		return output;
	}
	
	public AddPerson registerAccountToAddPerson(RegisterAccount input){
		AddPerson output = new AddPerson();
		output.setPerson(input.getPerson());
		output.setRequestDate(input.getRequestDate());
		output.setRequestId(input.getRequestId());
		return output;
	}
	
	public RegisterBill registerAccountToRegisterBill(RegisterAccount input1, AddPersonResponse input2){
		RegisterBill output = new RegisterBill();
		Person person = new Person();
		person.setPersonId(input2.getPerson().getPersonId());
		output.setPerson(person);
		output.setRequestDate(input1.getRequestDate());
		output.setRequestId(input1.getRequestId());		
		return output;
	}
	
	public AddAccount registerAccountToAddAccount(RegisterAccount input1, AddPersonResponse input2, RegisterBillResponse input3){
		AddAccount output = new AddAccount();
		Person person = new Person();
		person.setPersonId(input2.getPerson().getPersonId());
		Bill bill = new Bill();
		bill.setBillId(input3.getBill().getBillId());
		Account account = new Account();
		account.setPerson(person);
		account.setBill(bill);
		account.setVehicle(input1.getVehicle());
		account.setAccountStatusType("new");
		output.setAccount(account);
		output.setRequestDate(input1.getRequestDate());
		output.setRequestId(input1.getRequestId());		
		return output;
	}
	
	public Konto AddAccountToKonto(AddAccount input){

		Konto output = new Konto();
		Adres adres = new Adres();
		Kierowca kierowca = new Kierowca();
		Pojazd pojazd = new Pojazd();
		
		if(input.getAccount().getPerson().getPersonId() != null){
			kierowca.setId(Integer.parseInt(input.getAccount().getPerson().getPersonId()));
		}else{
			adres.setKodPocztowy(input.getAccount().getPerson().getAddress().getPostalCode());
			adres.setMiejscowosc(input.getAccount().getPerson().getAddress().getCity());
			adres.setNumerBudynku(input.getAccount().getPerson().getAddress().getStreetNumber());
			adres.setNumerLokalu(input.getAccount().getPerson().getAddress().getFlatNumber());
			adres.setOpisDodatkowy(null);
			adres.setPietro(null);
			adres.setTyp(input.getAccount().getPerson().getAddress().getAddressType());
			adres.setUlica(input.getAccount().getPerson().getAddress().getStreet());
			adres.setWojewodztwo(input.getAccount().getPerson().getAddress().getProvince());
			kierowca.setAdres(adres);
			kierowca.setAdresEmail(input.getAccount().getPerson().getEmail());
			kierowca.setImie(input.getAccount().getPerson().getFirstName());
			kierowca.setNazwisko(input.getAccount().getPerson().getLastName());
			kierowca.setPesel(input.getAccount().getPerson().getPesel());			
		}
		
		pojazd.setDataProdukcji(transformDateGregorianToDate(input.getAccount().getVehicle().getProductionDate()));
		pojazd.setKolor(input.getAccount().getVehicle().getColor());
		pojazd.setMarka(input.getAccount().getVehicle().getBrand());
		pojazd.setModel(input.getAccount().getVehicle().getModel());
		pojazd.setNumerRejestracyjny(input.getAccount().getVehicle().getRegistrationNumber());
		pojazd.setNumerVin(input.getAccount().getVehicle().getVinNumber());
		pojazd.setTyp(input.getAccount().getVehicle().getVehicleType());
		output.setKierowca(kierowca);
		output.setPojazd(pojazd);
		output.setRachunekId(input.getAccount().getBill().getBillId());
		output.setTyp(input.getAccount().getAccountStatusType());
		return output;
	}
	
	public AddAccountResponse KontoToAddAccountResponse(Konto input){
		AddAccountResponse output = new AddAccountResponse();
		Account account = new Account();
		Bill bill = new Bill();
		bill.setBillId(input.getRachunekId());
		Person person = new Person();
		person.setPersonId(Integer.toString(input.getKierowca().getId()));
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(Integer.toString(input.getPojazd().getId()));
		account.setAccountId(Integer.toString(input.getId()));
		account.setAccountStatusType(input.getTyp());
		account.setBill(bill);
		account.setPerson(person);
		account.setVehicle(vehicle);
		output.setAccount(account);
		output.setStatus("SUCCESS");
		return output;
	}
	
	public GetAccountResponse getAccount(GetAccount input){
		
		EntityManager em = emf.createEntityManager();
		
		String query = "SELECT K FROM Konto K WHERE K.id = :konto_id";
		int konto_id = Integer.parseInt(input.getAccount().getAccountId());
		Konto konto_db = em.createQuery(query, pl.eparkingdb.Konto.class).setParameter("konto_id", konto_id).getResultList().get(0);
		Account account = new Account();
		account.setAccountId(Integer.toString(konto_db.getId()));
		account.setAccountStatusType(konto_db.getTyp());
		Bill bill = new Bill();
		bill.setBillId(konto_db.getRachunekId());
		account.setBill(bill);
		Person person = new Person();
		person.setPersonId(Integer.toString(konto_db.getKierowca().getId()));
		account.setPerson(person);
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(Integer.toString(konto_db.getPojazd().getId()));
		account.setVehicle(vehicle);
		GetAccountResponse output = new GetAccountResponse();
		output.setAccount(account);
		output.setStatus("SUCCESS");
		em.close();
		return output;
	}
	
	public FindAccountResponse findAccount(FindAccount input){
		
		String query = null;
		Konto konto_db = null;
		List<Konto> kontos_db = null;
		
		EntityManager em = emf.createEntityManager();
		
		if(input.getAccountSearchCriteria().getVehicleRegistrationNumber() != null){
			query = "SELECT K FROM Konto K WHERE K.pojazd.numerRejestracyjny = :numer_rejestracyjny";
			String numer_rejestracyjny = input.getAccountSearchCriteria().getVehicleRegistrationNumber();
			kontos_db = em.createQuery(query, Konto.class).setParameter("numer_rejestracyjny", numer_rejestracyjny).getResultList();
		}else if(input.getAccountSearchCriteria().getVehicleVinNumber() != null){
			query = "SELECT K FROM Konto K WHERE K.pojazd.numerVin = :numer_vin";
			String numer_vin = input.getAccountSearchCriteria().getVehicleVinNumber();
			kontos_db = em.createQuery(query, Konto.class).setParameter("numer_vin", numer_vin).getResultList();
		}else if(input.getAccountSearchCriteria().getPersonId() != null){
			query = "SELECT K FROM Konto K WHERE K.kierowca.id = :kierowca_id";
			int kierowca_id = Integer.parseInt(input.getAccountSearchCriteria().getPersonId());
			kontos_db = em.createQuery(query, Konto.class).setParameter("kierowca_id", kierowca_id).getResultList();		
		}else{
			query = "SELECT K FROM Konto K WHERE K.rachunekId = :rachunek_id";
			String rachunek_id = input.getAccountSearchCriteria().getBillId();
			kontos_db = em.createQuery(query, Konto.class).setParameter("rachunek_id", rachunek_id).getResultList();		
		}
		
		FindAccountResponse output = new FindAccountResponse();
		
		if(kontos_db.size() > 0){
			konto_db = kontos_db.get(0);
			Account account = new Account();
			account.setAccountId(Integer.toString(konto_db.getId()));
			account.setAccountStatusType(konto_db.getTyp());
			Bill bill = new Bill();
			bill.setBillId(konto_db.getRachunekId());
			account.setBill(bill);
			Person person = new Person();
			person.setPersonId(Integer.toString(konto_db.getKierowca().getId()));
			account.setPerson(person);
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleId(Integer.toString(konto_db.getPojazd().getId()));
			account.setVehicle(vehicle);
			output.setAccount(account);
			output.setStatus("SUCCESS");
		}else{
			output.setStatus("WARNING");
		}
		em.close();
		return output;
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
	
	public static XMLGregorianCalendar transformStringDateToGregorian(String input){
		try {
			DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date date = DATE_FORMAT.parse(input + "T00:00:00");
			XMLGregorianCalendar xmlGregorianDate = transformDateToGregorian(date);
			xmlGregorianDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			return xmlGregorianDate;
		} catch (ParseException e) {
			return null;
		}
	}
	
	public double round(double value, int places) {
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
