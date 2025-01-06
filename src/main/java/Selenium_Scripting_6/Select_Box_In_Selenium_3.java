package Selenium_Scripting_6;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Box_In_Selenium_3 {
	
	WebDriver driver;
	@Test
	public void testCreateLeads()
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
	    
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hari Krishna");
		
		
		
		driver.close();
	}

}
