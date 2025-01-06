package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_in_Selenium_30 {
	
	WebDriver driver;
	@Test
	public void testCheckBox() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to frame
		driver.switchTo().frame("iframeResult");
		//select checkbox's
		driver.findElement(By.id("vehicle1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vehicle2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vehicle3")).click();
		Thread.sleep(2000);
		//click on submit button
		driver.findElement(By.xpath("//input[@type='submit' and @value='Submit']")).click();
		//print the output text
		String text = driver.findElement(By.xpath("//body[@class='w3-container']/div[1]")).getText();
		System.out.println("Output :- "+text);
		
		driver.close();
	}

}
