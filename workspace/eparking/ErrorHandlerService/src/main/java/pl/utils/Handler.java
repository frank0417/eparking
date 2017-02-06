package pl.utils;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;

import pl.eparking.errorhandlerservice.HandleError;
import pl.eparking.technical.BaseError;
import pl.eparking.technical.BaseRequest;
import pl.eparking.technical.BaseResponse;

public class Handler implements Processor{

	public void process(Exchange exchange) throws Exception {
		
		Logger log = Logger.getLogger("handler");
		
		log.info("-----------------------------------");
		log.info("--- Eparking ErrorHandler Start ---");
		
		Exception camelException = (Exception) exchange.getProperty(Exchange.EXCEPTION_CAUGHT);
		
		String workerRoute = (String) exchange.getIn().getHeader("workerRoute");
		log.info("workerRoute            : " + workerRoute);
		
		String requestClass = null;
		String responseClass = null;
		
		if(exchange.getIn().getHeader("masterClass") != null){
			requestClass = (String) exchange.getIn().getHeader("masterClass");
		}else if(exchange.getIn().getHeader("workerClass") != null){
			requestClass = (String) exchange.getIn().getHeader("workerClass");
		}else{
			HandleError handleError = new HandleError();
			requestClass = handleError.getClass().getName();
		}
		responseClass = requestClass + "Response";
		
		log.info("requestClass           : " + requestClass);
		log.info("responseClass          : " + responseClass);
		
		Object input = new Object();
		Object output = new Object();
		
		try {
			Class<?> requestPivot = Class.forName(requestClass);
			input = requestPivot.newInstance();
			Class<?> responsePivot = Class.forName(responseClass);
			output = responsePivot.newInstance();
		} catch (Exception e) {
			log.info("ErrorHandlerException: " + e);
		}
		
		BaseError baseError = createBaseResponse(camelException, workerRoute);
		
		input = exchange.getIn().getHeader("requestOriginal");
		
		String requestId = null;
		XMLGregorianCalendar requestDate = null;
		Boolean missingRequest = false;
		
		if(input != null && input != ""){
			requestId = ((BaseRequest) input).getRequestId();
			requestDate = ((BaseRequest) input).getRequestDate();	
		}else if(exchange.getIn().getBody() != null && exchange.getIn().getBody() != ""){
			if(!exchange.getIn().getBody().getClass().getName().toString().contains("Response") && exchange.getIn().getBody().getClass().toString().contains("pl.eparking.")){
				requestId = ((BaseRequest) exchange.getIn().getBody()).getRequestId();
				requestDate = ((BaseRequest) exchange.getIn().getBody()).getRequestDate();
			} else{
				missingRequest = true;	
			}
		} else{
			missingRequest = true;
		}
		
		if(!missingRequest){
			log.info("requestId              : " + requestId);
			log.info("requestDate            : " + requestDate);			
			
			BaseRequest baseRequest = new BaseRequest();
			baseRequest.setRequestId(requestId);
			baseRequest.setRequestDate(requestDate);
			baseError.setBaseRequest(baseRequest);
		}
		
		((BaseResponse) output).setStatus("ERROR");
		((BaseResponse) output).setError(baseError);
		
		
		exchange.getIn().setHeader("EparkingExceptionCode", baseError.getErrorCode());
		exchange.getIn().setHeader("EparkingExceptionMessage", baseError.getErrorDescription());
		exchange.getIn().setHeader("EparkingExceptionClass", baseError.getExceptionCode());
		exchange.getIn().setHeader("EparkingExceptionRoute", baseError.getExceptionRoute());
		
		exchange.getIn().setBody(output);		
		exchange.getIn().setHeader("workerClass", requestClass);

		log.info("--- Eparking ErrorHandler End ---");
		log.info("---------------------------------");
		
	}
	
	BaseError createBaseResponse(Exception camelException, String currentRouteId){
		Logger log = Logger.getLogger("utils");
		
		BaseError baseError = new BaseError();
		
		Exception camelExceptionCause = null;
		Exception camelRootCause = null;
		String camelExceptionClass = null;
		String camelExceptionMessage = null;
		String camelExceptionCauseClass = null;
		String camelExceptionCauseMessage = null;
		String camelRootCauseClass = null;
		String camelRootCauseMessage = null;
		String errorCause = null;
		
		try {
			camelExceptionClass = camelException.getClass().getName();
			camelExceptionMessage = camelException.getMessage();
		} catch (Exception e) {}
		try {
			camelExceptionCause = (Exception) camelException.getCause();
		} catch (Exception e) {}
		try {
			camelExceptionCauseClass = camelExceptionCause.getClass().getName();
			camelExceptionCauseMessage = camelExceptionCause.getMessage();
		} catch (Exception e) {}
		try {
			camelRootCause = (Exception) ExceptionUtils.getRootCause(camelException);			
		} catch (Exception e) {}
		try {
			camelRootCauseClass = camelRootCause.getClass().getName();
			camelRootCauseMessage = camelRootCause.getMessage();			
		} catch (Exception e) {}
		
		log.info("camelExceptionClass    : " + camelExceptionClass);
		log.info("camelExceptionMessage  : " + camelExceptionMessage);
		
		if(camelExceptionClass != null){
			if (camelExceptionClass.equals("org.apache.cxf.interceptor.Fault") && camelExceptionMessage.startsWith("Could not send Message")) {
				baseError.setErrorCode("SIMPLE/CODE/100002");
				baseError.setErrorDescription("Connection exception");
			} else if (camelExceptionClass.equals("org.apache.cxf.interceptor.Fault") && camelExceptionMessage.startsWith("Could not parse the XML")) {
				baseError.setErrorCode("SIMPLE/CODE/100003");
				baseError.setErrorDescription("Invalid output exception");
			} else if (camelExceptionClass.equals("org.apache.cxf.interceptor.Fault") && camelExceptionMessage.startsWith("Response was of unexpected")) {
				baseError.setErrorCode("SIMPLE/CODE/100004");
				baseError.setErrorDescription("Invalid output exception");
			} else if (camelExceptionClass.equals("org.apache.cxf.binding.soap.SoapFault")) {
				baseError.setErrorCode("SIMPLE/CODE/100005");
				baseError.setErrorDescription("SoapFault exception");
			} else if (camelExceptionClass.equals("java.net.ConnectException")) {
				baseError.setErrorCode("SIMPLE/CODE/100006");
				baseError.setErrorDescription("Connection exception");
			} else if ((camelExceptionClass.equals("java.io.IOException") && camelExceptionMessage.startsWith("javax.xml.bind.UnmarshalException")) || camelExceptionClass.equals("org.apache.camel.processor.validation.PredicateValidationException")) {
				baseError.setErrorCode("SIMPLE/CODE/100007");
				baseError.setErrorDescription("Message validation exception");
			} else if (camelExceptionClass.equals("org.apache.camel.TypeConversionException") && camelExceptionMessage.startsWith("Error during type conversion from type")) {
				baseError.setErrorCode("SIMPLE/CODE/100008");
				baseError.setErrorDescription("Message format exception");
			} else if (camelExceptionMessage.startsWith("EparkingValidationException")) {
				baseError.setErrorCode("SIMPLE/CODE/100009");
				baseError.setErrorDescription(camelExceptionMessage);
			} else if (camelExceptionClass.equals("java.io.IOException") && camelExceptionMessage.startsWith("EparkingProcessingException:")) {
				baseError.setErrorCode("SIMPLE/CODE/100016");
				baseError.setErrorDescription(camelExceptionMessage);
			} else if (camelExceptionClass.equals("org.apache.camel.language.bean.RuntimeBeanExpressionException") && !camelExceptionMessage.startsWith("Failed to invoke method")) {
				baseError.setErrorCode("SIMPLE/CODE/100010");
				baseError.setErrorDescription(camelExceptionMessage);
			} else if (camelExceptionClass.equals("org.apache.camel.language.bean.RuntimeBeanExpressionException") && camelExceptionMessage.startsWith("Failed to invoke method")) {
				baseError.setErrorCode("SIMPLE/CODE/100016");
				baseError.setErrorDescription(camelExceptionCauseMessage);									
			} else if (camelExceptionClass.equals("org.apache.openjpa.persistence.EntityExistsException")) {
				baseError.setErrorCode("SIMPLE/CODE/100012");
				baseError.setErrorDescription("Database constraint violation exception");
			} else if (camelExceptionClass.equals("java.lang.IndexOutOfBoundsException")) {
				baseError.setErrorCode("SIMPLE/CODE/100013");
				baseError.setErrorDescription("Database no results found exception");
			} else if (camelExceptionClass.equals("java.lang.NumberFormatException") && camelExceptionMessage.startsWith("For input string")) {
				baseError.setErrorCode("SIMPLE/CODE/100014");
				baseError.setErrorDescription("Database bad query values exception");
			} else if (camelExceptionClass.equals("java.lang.NumberFormatException")) {
				baseError.setErrorCode("SIMPLE/CODE/100019");
				baseError.setErrorDescription("Missing numeric values exception");
			} else if (camelExceptionClass.equals("org.apache.openjpa.persistence.PersistenceException") && camelExceptionCauseMessage.startsWith("Duplicate entry")) {
				baseError.setErrorCode("SIMPLE/CODE/100015");
				baseError.setErrorDescription("Database duplicate inserted values exception");
			} else if (camelExceptionClass.equals("org.apache.openjpa.persistence.PersistenceException") && camelRootCauseClass.startsWith("java.sql.SQLException")) {
				baseError.setErrorCode("SIMPLE/CODE/100018");
				baseError.setErrorDescription(camelRootCauseMessage);
			} else if (camelExceptionClass.equals("org.apache.camel.component.restlet.RestletOperationException") && camelExceptionMessage.startsWith("Restlet operation failed")) {
				baseError.setErrorCode("SIMPLE/CODE/100017");
				baseError.setErrorDescription(camelExceptionMessage);
			} else {
				baseError.setErrorCode("SIMPLE/CODE/100001");
				baseError.setErrorDescription("Other exception");
			}
		}
		
		if(camelRootCauseClass != null){
			if(camelRootCauseClass.equals("java.io.FileNotFoundException")){
				baseError.setErrorCode("SIMPLE/CODE/100011");
				baseError.setErrorDescription("Billing file read exception");
			}
		} 
		
		if(camelExceptionClass != null && camelExceptionMessage != null) {
			if (!camelExceptionClass.equals("") && !camelExceptionMessage.equals("")) {
				errorCause = camelExceptionClass.concat(":").concat(camelExceptionMessage);
				if (camelExceptionCauseClass != null && camelExceptionCauseMessage != null) {
					if (!camelExceptionCauseClass.equals("") && !camelExceptionCauseMessage.equals("")) {
						errorCause = errorCause.concat(" | ").concat(camelExceptionCauseClass).concat(" : ").concat(camelExceptionCauseMessage);
						if (camelRootCauseClass != null && camelRootCauseMessage != null) {
							if (!camelRootCauseClass.equals("") && !camelRootCauseMessage.equals("")) {
								errorCause = errorCause.concat(" | ").concat(camelRootCauseClass).concat(" : ").concat(camelRootCauseMessage);

							}
						}
					}
				}
			}
		}

		if(errorCause != null && !errorCause.equals("")){
			errorCause = errorCause.replaceAll("(\\r|\\n)", "");
			baseError.setExceptionCode(errorCause);
		}
		
		if(currentRouteId != null && !currentRouteId.equals("")){
			baseError.setExceptionRoute(currentRouteId);
		}
		
		log.info("camelErrorCode         : " + baseError.getErrorCode());
		log.info("camelErrorDescription  : " + baseError.getErrorDescription());
		
		return baseError;
	}
}
