package completeSeleniumTutorial_5;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_Work_with_Multiple_windows_18_19 {
	
	WebDriver driver;
	@Test
	public void handlingWindows() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  -- Deprecated
		
		//click on Login button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]/parent::div[1]")).click();
		//select net banking link after click on login button showing drop down list
		driver.findElement(By.xpath("//a[contains(text(),'NetBanking')]")).click();
		
		//get the set of handles
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		String parentID = itr.next();
		String childID = itr.next();
		
		//switch to new window(child window)
		driver.switchTo().window(childID);
	    //close child window
		driver.close();
		//switch to parent window
		driver.switchTo().window(parentID);
		Thread.sleep(10000);
		//enter name "hari" into search box
		driver.findElement(By.xpath("//*[@id='search-chatInput']")).sendKeys("hari");
		
		Thread.sleep(10000);
		
		driver.close();
		
		
		
		
		
		
	}

}
