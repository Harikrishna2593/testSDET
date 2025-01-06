package Selenium_Scripting_6;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_Lead_Information_in_V_tiger_8 {
	
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
		
		driver.findElement(By.xpath("//a[contains(text(),'Jennifer')]/parent::*/following-sibling::td[6]/a[1]")).click(); // click on edit
		driver.findElement(By.id("country")).clear(); //clear country and enter new country name
		driver.findElement(By.id("country")).sendKeys("Pakistan");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click(); //save
		
		driver.findElement(By.linkText("Jennifer")).click(); //click on the jennifer link
		
		//verify country
		String countryValue = driver.findElement(By.id("mouseArea_Country")).getText();
		assertEquals(countryValue.substring(2), "Pakistan");
		
		driver.close();
		 
		
		
		
	}

}
