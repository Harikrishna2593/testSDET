package Practice_examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calandar_Example_2 {
	WebDriver driver;
	String eDate = "25";
	String eMonth = "February";
	String eYear = "2025";
	@Test
	public void testCalEx2() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			
		driver.get("https://www.sastasafar.com/airline/vistara?utm_source=google_ss_vistara&website=ss&gad_source=1&gclid=Cj0KCQiAvbm7BhC5ARIsAFjwNHu-h6L2DVki3BnBO2Mxqm_yXh7y-3EBymk7TmhOnbdcbxpqVzjvpYUaAsKYEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("dateNew")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dateNew_root']/div/div/div/div")));
		
		
		String aMonth = driver.findElement(By.xpath("//div[@id='dateNew_root'][1]/descendant::div[6]")).getText();
		String aYear = driver.findElement(By.xpath("//div[@id='dateNew_root'][1]/descendant::div[7]")).getText();
		
		while(!(aMonth.equals(eMonth) && aYear.equals(eYear)))
		{
		
			driver.findElement(By.xpath("//div[@id='dateNew_root']/descendant::div[9]")).click();
			aMonth = driver.findElement(By.xpath("//div[@id='dateNew_root'][1]/descendant::div[6]")).getText();
		    aYear = driver.findElement(By.xpath("//div[@id='dateNew_root'][1]/descendant::div[7]")).getText();
			
			
		}
		
		
		
		driver.findElement(By.xpath("//table[@id='dateNew_table']/tbody/tr/td/div[contains(text(),'"+eDate+"')]")).click();
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
