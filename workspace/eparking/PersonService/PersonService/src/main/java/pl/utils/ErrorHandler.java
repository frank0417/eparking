package pl.utils;

import org.apache.camel.Exchange;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.log4j.Logger;

import pl.eparking.errorhandlerservice.HandleError;
import pl.eparking.errorhandlerservice.HandleErrorResponse;
import pl.eparking.personservice.AddPersonResponse;
import pl.eparking.technical.ExceptionInfo;

public class ErrorHandler {
	
	public AddPersonResponse addPersonConnectorResponse(HandleErrorResponse input) {
		AddPersonResponse output = new AddPersonResponse();
		output.setStatus("ERROR");
		output.setError(input.getBaseResponse().getError());
		return output;
	}

	
	public HandleError transformToHandleError(Exchange exchange) {

		Logger log = Logger.getLogger("utils");
		
		Exception camel_exception = null;
		Exception camel_exception_cause = null;
		Exception camel_root_cause = null;

		String camel_exception_class = null;
		String camel_exception_message = null;
		String camel_exception_cause_class = null;
		String camel_exception_cause_message = null;
		String camel_root_cause_class = null;
		String camel_root_cause_message = null;
		String camel_exception_route_service = null;
		String camel_exception_route_client = null;
		
		try {
			camel_exception = (Exception) exchange.getProperty(Exchange.EXCEPTION_CAUGHT);
			if(exchange.getIn().getHeader("serviceName") != null){ camel_exception_route_service = exchange.getIn().getHeader("serviceName").toString(); }
			if(exchange.getIn().getHeader("serviceClient") != null){ camel_exception_route_client = exchange.getIn().getHeader("serviceClient").toString(); }
		} catch (Exception e2) {
			log.info("ErrorHandler exception: " + e2);
		}
		
		if (camel_exception != null) {
			camel_exception_class = camel_exception.getClass().getName();
			camel_exception_message = camel_exception.getMessage();
			
			try{
				camel_exception_cause = (Exception) camel_exception.getCause();
				camel_root_cause = (Exception) ExceptionUtils.getRootCause(camel_exception);				
			} catch (Exception e2) {
				log.info("ErrorHandler exception: " + e2);
			}
			
			if (camel_exception_cause != null) {
				camel_exception_cause_class = camel_exception_cause.getClass().getName();
				camel_exception_cause_message = camel_exception_cause.getMessage();
			}
			if (camel_root_cause != null) {
				camel_root_cause_class = camel_root_cause.getClass().getName();
				camel_root_cause_message = camel_root_cause.getMessage();
			}
		}
		
		ExceptionInfo exceptionInfo = new ExceptionInfo();
		exceptionInfo.setCamelExceptionClass(camel_exception_class);
		exceptionInfo.setCamelExceptionMessage(camel_exception_message);
		exceptionInfo.setCamelExceptionCauseClass(camel_exception_cause_class);
		exceptionInfo.setCamelExceptionCauseMessage(camel_exception_cause_message);
		exceptionInfo.setCamelRootCauseClass(camel_root_cause_class);
		exceptionInfo.setCamelRootCauseMessage(camel_root_cause_message);
		exceptionInfo.setCamelExceptionRoute(camel_exception_route_service);
		
		log.info("----------");
		log.info("[camel_exception_route_client]:  " + camel_exception_route_client);
		log.info("[camel_exception_route_service]: " + camel_exception_route_service);
		
		HandleError handleError = new HandleError();
		handleError.setExceptionInfo(exceptionInfo);
		handleError.setRequestId(Operator.randomInt(100000, 999999).toString());
		handleError.setRequestDate(Operator.transformStringToGregorian(Operator.generateDate()));

		return handleError;
	}
	
}
