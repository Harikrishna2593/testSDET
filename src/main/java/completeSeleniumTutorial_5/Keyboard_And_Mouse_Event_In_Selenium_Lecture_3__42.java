package completeSeleniumTutorial_5;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.Context.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_And_Mouse_Event_In_Selenium_Lecture_3__42 {

	WebDriver driver;
	@Test
	public void verifyActionsTest() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//scroll down by pixel
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 150)");
	
		//open link in new tab
		WebElement devlopmentLink = driver.findElement(By.xpath("//a[text()='Development']"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(devlopmentLink).keyUp(Keys.CONTROL).keyDown(Keys.SHIFT).build().perform();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
		
		

	
}
