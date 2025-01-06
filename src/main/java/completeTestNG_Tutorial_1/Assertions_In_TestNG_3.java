package completeTestNG_Tutorial_1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Assertions_In_TestNG_3 {

	@Test
	public void test1()
	{
		assertTrue(true);
		//assertTrue(false);
	}
	
	@Test
	public void test2()
	{
		assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		assertEquals("Test", "Test");
	}
	
	@Test
	public void test4()
	{
		assertEquals("Test", "Test");
	}
	
	@Test
	public void test5()
	{
		assertTrue(false, "not matching the expected condition");
	}
	
	@Test
	public void test6()
	{
		assertFalse(false, "This is expected");
	}
	
	@Test
	public void test7()
	{
		assertNotEquals("test", "test1");
	}
	
	
	
	
}
