package completeSeleniumTutorial_5;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_Handel_Calendar_in_Selenium_20 {
	
	WebDriver driver;
	String eDate = "25";
	String eMonth = "June";
	String eYear = "2025";
	@Test
	public void HandleCalandar() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open website
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//Click on calandar
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		//get montha and year
		 String aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		 String aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		//check for the expected values to match the values
		while(!(aMonth.equals(eMonth) && aYear.equals(eYear)))
		{
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();//click on next value
			 aMonth = driver.findElement(By.className("ui-datepicker-month")).getText(); //we are getting this values to update
			 aYear = driver.findElement(By.className("ui-datepicker-year")).getText();//our condition values to match.
			
			
			
		}
		//select the expected date
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[contains(text(),'"+eDate+"')]")).click();
		
		Thread.sleep(10000);
		driver.close();
		
		
		
	}

}
