package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor_In_Selenium_Lecture_1__38 {
	WebDriver driver;
	@Test
	public void javaScriptFunctions() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//JavaScript functions for enter text and click. 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').setAttribute('value','harikrishna.thadaboina@gmail.com')");
		js.executeScript("document.getElementById('pass').setAttribute('value','harikrishna.thadaboina@gmail.com')");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")));
	
		Thread.sleep(5000);
		driver.close();
	}

}
