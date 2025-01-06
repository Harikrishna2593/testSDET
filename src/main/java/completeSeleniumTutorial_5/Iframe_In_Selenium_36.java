package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_In_Selenium_36 {
	
	WebDriver driver;
	@Test
	public void iframeExamples() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Hari/Desktop/Selenium_Pages/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// switch to frame
		driver.switchTo().frame(0);
		//driver.switchTo().frame("nameOrId");
		//driver.switchTo().frame("/*[@class='abc']");
		//driver.switchTo().frame("nameOrId").switchTo().frame(2);    --------> Nested Frames, frame inside frame
		driver.findElement(By.xpath("/html/body/div/form/div/input[1]")).sendKeys("Hari Krishna");
		
		driver.switchTo().defaultContent();     // return to default page
		
		driver.findElements(By.xpath("//input[@name='textbox1']")).get(0).sendKeys("Hari Krishna1");
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
