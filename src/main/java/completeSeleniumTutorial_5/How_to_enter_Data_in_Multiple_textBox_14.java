package completeSeleniumTutorial_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_enter_Data_in_Multiple_textBox_14 {
	                                  //Enter test data into multiple fields.
	WebDriver driver;
	@Test
	public void enterMultipleTextData()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("FirstName");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("LastName");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test567@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password");
		
		
		
		
	}

}
