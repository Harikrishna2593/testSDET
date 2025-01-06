package completeTestNG_Tutorial_1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_inTestNG_10 implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("starting test is : "+getMethodName(result));
		Reporter.log("starting test is : "+getMethodName(result));
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed : "+getMethodName(result));
		Reporter.log("Test passed : "+getMethodName(result));
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed : "+getMethodName(result));
		Reporter.log("Test failed : "+getMethodName(result));
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped : "+getMethodName(result));
		Reporter.log("Test skipped : "+getMethodName(result));
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test will pass based on percentage: "+getMethodName(result));
		Reporter.log("Test is passed based on percentage: "+getMethodName(result));
	}

	/*
	 * public void onTestFailedWithTimeout(ITestResult result) { // TODO
	 * Auto-generated method stub
	 * ITestListener.super.onTestFailedWithTimeout(result); }
	 */
	public void onStart(ITestContext context) {
		System.out.println("All Test execution started ");
		Reporter.log("All Test execution started ");
	}

	public void onFinish(ITestContext context) {
		System.out.println("All test finished");
		Reporter.log("All test finished");
	}

	private static String getMethodName(ITestResult arg0)
	{
		return arg0.getMethod().getConstructorOrMethod().getName();
	}
	

}
