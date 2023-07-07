package com.logClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = LogManager.getLogger("LoggerDemo");
		System.out.println("this is logger demo");

		logger.info("for info only");
		logger.debug("for debug only");
		logger.error("error message");
		logger.warn("warning message");
	}

}
