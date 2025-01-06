package completeTestNG_Tutorial_1;

import org.testng.annotations.Test;

public class Grouping_In_TestNG_7 {
	
	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("*sanity*");
	}
	
	@Test(groups = {"sanity","regression"})
	public void test2()
	{
		System.out.println("*{\"sanity\",\"regression\"}*");
	}
	
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("*regression*");
	}
	

}
