package completeSeleniumTutorial_5;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Extent_Report_In_Selenium_47 {
	//extent.html  ---> 1 File
	
	
	public ExtentHtmlReporter extentHtmlReporter;
	public ExtentTest extentTest;
	public ExtentReports extentReports;
	
	@BeforeClass //Initializing  Class objects
	public void beforeClass()
	{
		extentHtmlReporter = new ExtentHtmlReporter("extent.html"); 
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		extentTest = extentReports.createTest(getClass().getSimpleName());
		
	}
	//Before starting any test
	@BeforeMethod
	public void beforeMethod(Method result)
	{
		extentTest.log(Status.INFO, result.getName()+" started...");
	}
	
	@Test //Test 1
	public void testLogin()
	{
		extentTest.log(Status.INFO, "test1 started");
		extentTest.log(Status.INFO, "test2 started");
		
	}
	
	@Test //Test 2
	@BeforeClass
	public void testLogout()
	{
		extentTest.log(Status.INFO, "test3 started");
		extentTest.log(Status.INFO, "test4 started");
		
	}
	//After test display's result
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		logReport(result);
	}
	
	public void logReport(ITestResult result) {
		if(result.getStatus()==result.FAILURE) {
			extentTest.log(Status.ERROR, result.getName()+" Failed");
			extentTest.log(Status.ERROR, result.getThrowable());
		}
		else if(result.getStatus()==result.SKIP) {
			extentTest.log(Status.SKIP, result.getName()+" Skipped");
			extentTest.log(Status.SKIP, result.getThrowable());
		}
		else if(result.getStatus()==result.SUCCESS) {
			extentTest.log(Status.INFO, result.getName()+" PASSED");
			
		}
	}
	
	@AfterClass
	public void afterClass()
	{
		extentReports.flush();
		
	}

}
