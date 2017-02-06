package pl.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.camel.Exchange;

import pl.eparking.base.Address;
import pl.eparking.base.Person;
import pl.eparking.personservice.AddPerson;
import pl.eparking.personservice.AddPersonResponse;
import pl.eparkingdb.Adres;
import pl.eparkingdb.Kierowca;

public class Operator {
	
	public AddPerson tester(String firstName){
		AddPerson output = new AddPerson();
		Person person = new Person();
		//person = input.getPerson();
		//String email = input.getPerson().getFirstName() + "." + input.getPerson().getLastName() + "@eparking.pl";
		person.setEmail(firstName + "@eparking.pl");
		return output;
	}
	
	public Kierowca AddPersonToKierowca(Person input){
		
		Kierowca output = new Kierowca();
		Adres adres = new Adres();
		adres.setKodPocztowy(input.getAddress().getPostalCode());
		adres.setMiejscowosc(input.getAddress().getCity());
		adres.setNumerBudynku(input.getAddress().getStreetNumber());
		adres.setNumerLokalu(input.getAddress().getFlatNumber());
		adres.setTyp(input.getAddress().getAddressType());
		adres.setUlica(input.getAddress().getStreet());
		adres.setWojewodztwo(input.getAddress().getProvince());
		adres.setOpisDodatkowy(null);
		adres.setPietro(null);
		output.setAdres(adres);
		output.setAdresEmail(input.getEmail());
		output.setImie(input.getFirstName());
		output.setNazwisko(input.getLastName());
		output.setPesel(input.getPesel());
		return output;
	}
	
	public AddPersonResponse KierowcaToAddPersonResponse(Kierowca input){
		AddPersonResponse output = new AddPersonResponse();
		Person person = new Person();
		Address address = new Address();
		address.setAddressId(Integer.toString(input.getAdres().getId()));
		address.setAddressType(input.getAdres().getTyp());
		address.setCity(input.getAdres().getMiejscowosc());
		address.setStreetNumber(input.getAdres().getNumerBudynku());
		address.setFlatNumber(input.getAdres().getNumerLokalu());
		address.setPostalCode(input.getAdres().getKodPocztowy());
		address.setProvince(input.getAdres().getWojewodztwo());
		address.setStreet(input.getAdres().getUlica());
		person.setAddress(address);
		person.setEmail(input.getAdresEmail());
		person.setFirstName(input.getImie());
		person.setLastName(input.getNazwisko());
		person.setPersonId(Integer.toString(input.getId()));
		person.setPesel(input.getPesel());
		output.setPerson(person);
		output.setStatus("SUCCESS");
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
	
	public double round(double value, int places) {
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
