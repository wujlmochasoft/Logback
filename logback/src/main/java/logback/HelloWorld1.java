package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld1 {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloWorld1.class);
		logger.error("--------------->error");
		logger.debug("--------------->debug");
		logger.info("--------------->info");
		logger.trace("--------------->trace");
		logger.warn("--------------->warn");
		
	}
}
