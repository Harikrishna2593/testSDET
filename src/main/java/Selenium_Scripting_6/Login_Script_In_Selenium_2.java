package Selenium_Scripting_6;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Script_In_Selenium_2 {
	
	WebDriver driver;
	@Test
	public void testLoginVtiger()
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
		
		driver.close();
	}

}
