package pl.utils;

import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

	private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);
	
	private XMLGregorianCalendar parkingStart;
	private XMLGregorianCalendar parkingEnd;
	private Double parkingTime;
	private Double amount;
	private Double amountAfterReturn;
	private String status;
	
	//300 - OK
	//301 - nieznany typ parkingu
	//302 - brak danych wejsciowych do policzenia parkingu typu time
	//303 - brak danych wejsciowych do policzenia parkingu typu deadline
	//304 - brak danych wejsciowych do policzenia parkingu typu free
	//305 - brak danych wejsciowych do policzenia zwrotu
	//306 - daty niezgodne z wzorem: data startu parkingu < nowa data konca parkingu (data biezaca) < data konca parkingu orginalna 

	public Calculator CalculateParking(Double amountIn, Double parkingTimeIn, Date parkingStartIn, Date parkingEndIn, String parkingTypeIn){
		
		//parking charge = 0.1 pln per minute
		Double parkingCharge = 0.1;
		
		Calculator parkingCalculation = new Calculator();
		
		if(parkingTypeIn.equals("time")){
			if(parkingTimeIn != null){
				long parkingTimeMills = (long) (parkingTimeIn * 60 * 60 * 1000);
				long parkingStartMills = System.currentTimeMillis();
				Date parkingEnd = new Date(parkingStartMills + parkingTimeMills);
				Double calculatedAmount = Operator.round((double) parkingTimeIn * 60 * parkingCharge, 2);
				XMLGregorianCalendar parkingStartGregorian = Operator.transformDateToGregorian(new Date(parkingStartMills));
				parkingStartGregorian.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
				parkingCalculation.setParkingStart(parkingStartGregorian);
				XMLGregorianCalendar parkingEndGregorian = Operator.transformDateToGregorian(parkingEnd);
				parkingEndGregorian.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
				parkingCalculation.setParkingEnd(parkingEndGregorian);
				parkingCalculation.setAmount(Operator.round(calculatedAmount,2));
				parkingCalculation.setParkingTime(parkingTimeIn);
				parkingCalculation.setStatus("300");
			}else{
				parkingCalculation.setStatus("302");
			}
		}else if(parkingTypeIn.equals("deadline")){
			if(parkingEndIn != null){
				Long parkingStartMills = System.currentTimeMillis();
				Long parkingEndMills = parkingEndIn.getTime();
				Long parkingTimeMills = parkingEndMills - parkingStartMills;
				Double calculatedAmount = Operator.round((double) parkingTimeMills / 1000 / 60 * parkingCharge, 2);
				Date calculatedParkingStart = new Date(parkingStartMills);
				XMLGregorianCalendar calculatedParkingStartGregorian = Operator.transformDateToGregorian(calculatedParkingStart);
				calculatedParkingStartGregorian.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
				parkingCalculation.setParkingStart(calculatedParkingStartGregorian);
				XMLGregorianCalendar parkingEndInGregorian = Operator.transformDateToGregorian(parkingEndIn);
				parkingEndInGregorian.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
				parkingCalculation.setParkingEnd(parkingEndInGregorian);
				parkingCalculation.setAmount(Operator.round(calculatedAmount,2));
				parkingCalculation.setParkingTime(Operator.round((double) parkingTimeMills / 1000 / 60 / 60, 2));
				parkingCalculation.setStatus("300");
			}else{
				parkingCalculation.setStatus("303");
			}
		}else if(parkingTypeIn.equals("free")){
			if(amountIn != null){
				Double calculatedParkingTime = Operator.round((double) amountIn / parkingCharge, 2);
				Long calculatedParkingTimeMills = (long) (calculatedParkingTime * 60 * 1000);
				Long parkingStartMills = System.currentTimeMillis();
				Long parkingEndMills = parkingStartMills + calculatedParkingTimeMills;
				Date calculatedParkingStart = new Date(parkingStartMills);
				Date calculatedParkingEnd = new Date(parkingEndMills);
				XMLGregorianCalendar calculatedParkingStartGregorian = Operator.transformDateToGregorian(calculatedParkingStart);
				calculatedParkingStartGregorian.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
				parkingCalculation.setParkingStart(calculatedParkingStartGregorian);
				XMLGregorianCalendar calculatedParkingEndGregorian = Operator.transformDateToGregorian(calculatedParkingEnd);
				calculatedParkingEndGregorian.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
				parkingCalculation.setParkingEnd(calculatedParkingEndGregorian);
				parkingCalculation.setAmount(Operator.round(amountIn,2));
				parkingCalculation.setParkingTime(Operator.round((double) calculatedParkingTimeMills / 1000 / 60 / 60, 2));
				parkingCalculation.setStatus("300");
			}else{
				parkingCalculation.setStatus("304");
			}
		}else if(parkingTypeIn.equals("return")){
			if(parkingStartIn != null && parkingEndIn != null){
				Long currentDateMills = System.currentTimeMillis();
				Date currentDate = new Date(currentDateMills);
				if(currentDate.after(parkingStartIn) && currentDate.before(parkingEndIn)){
					Calendar cal = Calendar.getInstance();
					cal.setTime(parkingStartIn);
					cal.set(Calendar.MILLISECOND, 0);
					Long parkingStartMills = cal.getTimeInMillis();
					Long parkingEndMills = parkingEndIn.getTime();
					Long parkingTimeMills = currentDateMills - parkingStartMills;
					Long parkingShortMills = parkingEndMills - currentDateMills;
					Double calculatedAmount = Operator.round((double) parkingShortMills / 1000 / 60 * parkingCharge, 2);
					Double calculatedAmountAfterReturn = Operator.round((double) parkingTimeMills / 1000 / 60 * parkingCharge, 2);
					parkingCalculation.setAmount(Operator.round(calculatedAmount,2));
					parkingCalculation.setAmountAfterReturn(Operator.round(calculatedAmountAfterReturn,2));
					XMLGregorianCalendar parkingStartInGregorian = Operator.transformDateToGregorian(new Date(parkingStartMills));
					parkingStartInGregorian.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
					parkingCalculation.setParkingStart(parkingStartInGregorian);
					XMLGregorianCalendar currentDateGregorian = Operator.transformDateToGregorian(currentDate);
					currentDateGregorian.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
					parkingCalculation.setParkingEnd(currentDateGregorian);
					parkingCalculation.setParkingTime(Operator.round((double) parkingTimeMills / 1000 / 60 / 60, 2));
					parkingCalculation.setStatus("300");
				}else{
					parkingCalculation.setStatus("306");
				}
			}else{
				parkingCalculation.setStatus("305");
			}
		}else{
			parkingCalculation.setStatus("301");
		}
		
		/*LOG.info("CALC | Amount: 			" + parkingCalculation.getAmount());
		if(parkingTypeIn.equals("return")){
			LOG.info("CALC | AmountAfterReturn:	" + parkingCalculation.getAmountAfterReturn());	
		}
		LOG.info("CALC | ParkingStart: 		" + parkingCalculation.getParkingStart());
		LOG.info("CALC | ParkingEnd: 		" + parkingCalculation.getParkingEnd());
		LOG.info("CALC | ParkingTime: 		" + parkingCalculation.getParkingTime());
		LOG.info("CALC | Status: 			" + (parkingCalculation.getStatus().equals("300") ? "OK" : "NOK"));*/
		
		return parkingCalculation;
	}
	
	public Double calculateFine(){
		return 100.0;
	}

	public XMLGregorianCalendar getParkingStart() {
		return parkingStart;
	}

	public void setParkingStart(XMLGregorianCalendar parkingStart) {
		this.parkingStart = parkingStart;
	}

	public XMLGregorianCalendar getParkingEnd() {
		return parkingEnd;
	}

	public void setParkingEnd(XMLGregorianCalendar parkingEnd) {
		this.parkingEnd = parkingEnd;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(Double parkingTime) {
		this.parkingTime = parkingTime;
	}

	public Double getAmountAfterReturn() {
		return amountAfterReturn;
	}

	public void setAmountAfterReturn(Double amountAfterReturn) {
		this.amountAfterReturn = amountAfterReturn;
	}
	
}
