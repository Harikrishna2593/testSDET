package Selenium_Scripting_6;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion_In_Scripts_6 {
	
	WebDriver driver;
	@Test
	public void verifyRecord() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("http://localhost:8888/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// VTiger -Login
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		
		//Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on record - Hari Krishna
		driver.findElement(By.linkText("Hari Krishna")).click();
		
		//verify record data
		String fName = driver.findElement(By.id("mouseArea_First Name")).getText();
		assertEquals(fName, "Mr.   Hari Krishna"); //verify first Name
		
		String cName = driver.findElement(By.id("mouseArea_Company")).getText();
		assertEquals(cName.substring(2), "IBM Pvt Lmtd."); //verify company
		
		String aRevenue = driver.findElement(By.id("mouseArea_Annual Revenue")).getText();
		assertEquals(aRevenue.substring(2), "100,000"); //verify anual revenue
		
		driver.close();
		
	}

}
