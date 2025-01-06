package completeSeleniumTutorial_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_To_enter_Data_in_Textbox_13 {
	                                             //Enter test data into a textfield.
	WebDriver driver;
	@Test
	public void test()
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("/driver/chromedriver.exe")); --old way
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harikrishna@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("harikrishna");
		
		
		
	}
	
	
}
