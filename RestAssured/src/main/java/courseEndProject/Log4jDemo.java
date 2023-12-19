package courseEndProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jDemo {
	
	Logger logger =LogManager.getLogger(Log4jDemo.class);

	@Test
	public void method1() {
		
		System.out.println("this is method1");
		
		logger.trace("this is a trace method");
		logger.info("this is a info method");
		logger.error("this is a error method");
		logger.fatal("this is a fatal method");
	}
}
