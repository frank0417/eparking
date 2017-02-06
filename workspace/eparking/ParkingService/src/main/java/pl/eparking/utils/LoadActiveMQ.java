package pl.eparking.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.activemq.broker.BrokerService;
import org.apache.log4j.Logger;

public class LoadActiveMQ extends HttpServlet {

	/**
	 * serialVersionUID for serialization
	 */
	private static final long serialVersionUID = -8289081958495740549L;

	private BrokerService broker;

	private static final Logger logger = Logger.getLogger(LoadActiveMQ.class.getName());

	@Override
	public void init() throws ServletException {
		logger.info("Load activeMQ");
		try {
			broker = new BrokerService();
			broker.addConnector("tcp://eparking-mq:61616");
			broker.start();
			logger.info("ActiveMQ loaded succesfully");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Unable to load ActiveMQ!");
		}
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@Override
	public void destroy() {
		try {
			logger.info("ActiveMQ exiting");
			broker.stop();
			logger.info("ActiveMQ exit succesfully");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Unable to exit ActiveMQ!");
		}
	}
}
