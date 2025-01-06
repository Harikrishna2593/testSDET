package completeTestNG_Tutorial_1;

import org.testng.annotations.Test;

public class Priority_In_TestNG_8 {
	
	
	@Test(priority = 2)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority = 1)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(priority = 0)
	public void test3()
	{
		System.out.println("test3");
	}

}
