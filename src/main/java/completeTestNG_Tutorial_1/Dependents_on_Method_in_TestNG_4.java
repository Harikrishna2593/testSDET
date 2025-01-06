package completeTestNG_Tutorial_1;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Dependents_on_Method_in_TestNG_4 {
	
	@Test
	public void test1()
	{
		System.out.println("test1 - failed");
		assertTrue(false);
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("test2 - skipped");
	}
	
	@Test(dependsOnMethods = {"test1", "test2"})
	public void test3()
	{
		System.out.println("test3 - skipped");
	}
	
	@Test
	public void test4()
	{
		System.out.println("test4 - passed");
		assertTrue(true);
		
	}
	
	@Test(dependsOnMethods = "test4")
	public void test5()
	{
		System.out.println("test5 - passed");
	}
	
	
	

}
