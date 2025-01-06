package completeTestNG_Tutorial_1;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listener_TestClass_10 {
	
	 int i = 0;
	@Test
	public void test1()
	{
		
	}
	
	@Test
	public void test2()
	{
		throw new SkipException("I am skipping the test");
	}
	
	@Test(successPercentage = 60, invocationCount = 5)
	public void test3()
	{
		i++;
		System.out.println("test3 test method, invocationCount: "+i);
		if(i == 1 || i == 2) {
			System.out.println("test failed!");
			assertEquals(i, 8);
		}
	}
}
