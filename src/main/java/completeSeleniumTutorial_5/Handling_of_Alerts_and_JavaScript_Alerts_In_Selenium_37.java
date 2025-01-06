package completeSeleniumTutorial_5;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_of_Alerts_and_JavaScript_Alerts_In_Selenium_37 {
	WebDriver driver;
	@Test(enabled = true, priority = 0)
	public void testAlertsAccept() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//open website
		driver.get("file:///C:/Users/Hari/Desktop/Selenium_Pages/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click JavaScriptAlert button
		driver.findElement(By.xpath("//a[@href='javaScriptAlert.html']")).click();
		Thread.sleep(5000);
		//Click Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		//click on OK
		 driver.switchTo().alert().accept();
		 //get text after click and assert
		 String msg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		 System.out.println("printed message :-"+msg);
		 assertEquals(msg, "You pressed OK!");
		 Thread.sleep(5000);
		 driver.close();
	}
	
	@Test(enabled = true, priority = 1)
	public void testAlertsDismiss() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//open website
		driver.get("file:///C:/Users/Hari/Desktop/Selenium_Pages/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click JavaScriptAlert button
		driver.findElement(By.xpath("//a[@href='javaScriptAlert.html']")).click();
		Thread.sleep(5000);
		//Click Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		//click on Cancell
		 driver.switchTo().alert().dismiss();;
		 //get text after click and assert
		 String msg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		 System.out.println("printed message :-"+msg);
		 assertEquals(msg, "You pressed Cancel!");
		 Thread.sleep(5000);
		 driver.close();
	}

}
