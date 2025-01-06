package completeTestNG_Tutorial_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_of_TestNG_2 {
	                     
	                                         // Test-Output --> emailable-report.html
	
	@BeforeTest
	public void test1()
	{
		System.out.println("@BeforeTest");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@BeforeClass
	public void test3()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeSuite
	public void test4()
	{
		System.out.println("@BeforeSuite");
	}
	
	@AfterMethod
	public void test5()
	{
		System.out.println("@AfterMethod");
	}
	
	@AfterSuite
	public void test6()
	{
		System.out.println("@AfterSuite");
	}
	
	@BeforeMethod
	public void test7()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void test8()
	{
		System.out.println("Test8");
	}
	
	@AfterClass
	public void test9()
	{
		System.out.println("@AfterClass");
	}
	@AfterTest
	public void test10()
	{
		System.out.println("@AfterTest");
	}

}
