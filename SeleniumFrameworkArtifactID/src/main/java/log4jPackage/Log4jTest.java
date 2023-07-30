package log4jPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest {

	static Logger logger = LogManager.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n    Hello World....!      \n");
		
		logger.trace("This is a trace message");
		logger.debug("This is a debug message");		
		logger.info("This is an information message");
		logger.error("This is an error message");
		logger.warn("This is a warning  message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n     Test Completed      \n");
	}

}
