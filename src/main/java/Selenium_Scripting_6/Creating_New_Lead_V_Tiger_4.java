package Selenium_Scripting_6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Creating_New_Lead_V_Tiger_4 {
	
	WebDriver driver;
	@Test
	public void testCreateLeads2() throws Exception
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
		//Create Lead
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		//Enter Information
	    Select sel = new Select(driver.findElement(By.xpath("//select[@name='salutationtype']")));
	    sel.selectByIndex(1);
	 
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hari Krishna"); //First Name
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thadaboina"); //Last Name
	    driver.findElement(By.xpath("//input[@name='company']")).sendKeys("IBM Pvt Lmtd."); //company
	    driver.findElement(By.id("designation")).sendKeys("SDET"); //Title
	    WebElement leadSource = driver.findElement(By.xpath("//select[@name='leadsource']")); //Lead source
	    Select select = new Select(leadSource);
	    select.selectByVisibleText("Employee");
	    
	    WebElement industry = driver.findElement(By.xpath("//select[@name='industry']")); // industry
	     select = new Select(industry);
	    select.selectByVisibleText("Entertainment");
	    
	    driver.findElement(By.xpath("//input[@name='annualrevenue']")).sendKeys("1,00,000"); //Annual Revenue
	    driver.findElement(By.id("noofemployees")).sendKeys("25"); //No of employees
	    driver.findElement(By.id("secondaryemail")).sendKeys("test1997@gmail.com"); //Secondary email
	    driver.findElement(By.xpath("//textarea[@name='lane']")).sendKeys("2-3-603, Amberpet"); //street
	    driver.findElement(By.id("code")).sendKeys("500015"); //Postal code
	    driver.findElement(By.id("country")).sendKeys("India"); //Country
	    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Testing this application with automation practice"); //Description
	    
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
