package completeSeleniumTutorial_5;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Open_And_Collapse_In_Selenium_40 {
	WebDriver driver;
	@Test //This Example is equal to the drop down button expand and dynamic class attribute value change as ACTIVE display
	public void testVerifyOpenAndCollapse() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch url in browser
		driver.get("https://www.hdfcbank.com/personal/insure/life-insurance/secure-childrens-future#/INVEST");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Before and after click text value display's
	    String textExpand = driver.findElement(By.xpath("//div[@class='arrow-icon']/div")).getText();
		System.out.println("Before Click text display :-"+textExpand);
		driver.findElement(By.xpath("//div[@class='arrow-icon']/div")).click(); // down arrow icon click
		textExpand = driver.findElement(By.xpath("//div[@class='arrow-icon']/div")).getText();
		System.out.println("After Click text display :-"+textExpand);
		
		
		//Dynamic Class value verify
		String classValue = driver.findElement(By.xpath("//div[@class='arrow-icon']/i")).getAttribute("class");		
		System.out.println("After click - class value :-"+classValue);
		
		if(classValue.equals("icon-up-open-big"))
		{
			assertTrue(true, "Verify success!!");
		}else
		{
			assertTrue(false, "Verify Fail!!");
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
