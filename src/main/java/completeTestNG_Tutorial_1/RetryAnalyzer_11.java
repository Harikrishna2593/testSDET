package completeTestNG_Tutorial_1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer_11 implements IRetryAnalyzer {

	int counter = 0;
	int retryLimit = 3;
	
	
	/*
	 * This method decides how many times a test needs to be rerun TestNG will call
	 * this method everytime a test fails. so we can put some code in here to decide
	 * when to rerun the test
	 * 
	 * Note: This method will return true if a tests needs to be retried and false
	 * if not.
	 */
	
	
	public boolean retry(ITestResult result) {
		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		return false; 
	}

}
