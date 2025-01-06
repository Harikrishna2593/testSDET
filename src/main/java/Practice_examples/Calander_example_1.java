package Practice_examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calander_example_1 {
	WebDriver driver;                        //calander example 1
	String eDate = "25";
	String eMonth = "June";
	String eYear = "2025";
	@Test
	public void testCal() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		
		 String aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		 String aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		
		while(!(aMonth.equals(eMonth) && aYear.equals(eYear)))
		{
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			 aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			 aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
			
			
		}
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[contains(text(),'"+eDate+"')]")).click();
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
