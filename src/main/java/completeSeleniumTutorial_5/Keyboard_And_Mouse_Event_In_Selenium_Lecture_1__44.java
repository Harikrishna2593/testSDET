package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_And_Mouse_Event_In_Selenium_Lecture_1__44 {
	
	WebDriver driver;
	@Test
	public void verifyActionsTest() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
		//Enter text through actions
		Actions action = new Actions(driver);
		action.keyDown(searchBox, Keys.SHIFT).sendKeys("hyderabad").keyUp(searchBox, Keys.SHIFT).build().perform();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
