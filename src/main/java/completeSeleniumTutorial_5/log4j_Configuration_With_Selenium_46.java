package completeSeleniumTutorial_5;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class log4j_Configuration_With_Selenium_46 {
	//log4j_46.properties  --> properties File     ---> FILE 1
	//automation.out       --> Log storage Area    ---> FILE 2
	
	//File Location
	static String projectLocation = System.getProperty("user.dir");
	static String configFilename = projectLocation+"\\log4j_46.properties";
	//Call Logger
	public static final Logger logger = Logger.getLogger(log4j_Configuration_With_Selenium_46.class.getName());
	
	@BeforeClass // configuring file
	public static void getLogger()
	{
		System.out.println(configFilename);
		PropertyConfigurator.configure(configFilename);
	}
	
	@Test  // Logger usage in test example
	public void testLogger()
	{
		//getLogger();
		logger.info("Log testA details....");
		logger.info("Log testB details....");
		logger.info("Log testC details....");
		logger.info("Log testD details....");
		logger.info("Log testE details....");
	}

}
