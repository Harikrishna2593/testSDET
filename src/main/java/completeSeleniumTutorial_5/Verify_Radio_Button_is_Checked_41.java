package completeSeleniumTutorial_5;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Radio_Button_is_Checked_41 {
	
	WebDriver driver;
	@Test
	public void verifyRadioButton() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 150)");
		
		//switch to frame and click radio button
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']"))); 
		driver.findElement(By.xpath("//div[@class='widget']/descendant::label[@for='radio-1']/span[1]")).click();
		//Get dynamic Class value
		String classValue = driver.findElement(By.xpath("//div[@class='widget']/descendant::label[@for='radio-1']")).getAttribute("class");
		System.out.println("Dynamic Class Value :-"+classValue);
		//verify the status of the class value as active
		if(classValue.contains("ui-checkboxradio-checked ui-state-active"))
		{
			assertTrue(true, "Verify Radio Button test Passed!!");
		}else
		{
			assertTrue(false, "Verify Radio Button test Failed!!");
		}
		
		driver.close();
		
		
	}

}
