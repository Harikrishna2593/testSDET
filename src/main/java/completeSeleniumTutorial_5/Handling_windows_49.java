package completeSeleniumTutorial_5;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_windows_49 {

	WebDriver driver;
	@Test
	public void testWindowHandles() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch HDFC site
		driver.get("https://www.hdfcbank.com/nri-banking");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Get parent window ID and click on Login button
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent window handle :-"+parentHandle);
		driver.findElement(By.xpath("//*[@id='custom-button']/div/div/button")).click();
		//After new window opens, get all the window handles for open tabs
		//switch focus to the child tab and enter some text in the text box and close the tab
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			System.out.println(handle);
			if(!(parentHandle.equals(handle)))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//a[@href='http://www.hdfcbank.com/']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='search-chatInput']")).sendKeys("Hyderabad");
				Thread.sleep(10000);
				driver.close();	
			}
		}
		//switch the driver focus to parent window and enter the text into the text box and close.
		driver.switchTo().window(parentHandle);
		
		driver.findElement(By.xpath("//input[@id='search-chatInput']")).sendKeys("HDFC Bank in Hyderabad!!");
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}
	
	
}