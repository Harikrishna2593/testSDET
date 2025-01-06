package completeTestNG_Tutorial_1;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class RetryTest_11 {
	int i = 0;
	
	                              //total 3 classes and 1 xml file
	@Test
	public void test1()
	{
		System.out.println("retrying..");
		i++;
		System.out.println("counter i is: "+i);
		if(i < 3) {
			System.out.println("Failure happened");
		assertTrue(false);
		}else {
			System.out.println("passed");
			assertTrue(true);
		}
	}

}
