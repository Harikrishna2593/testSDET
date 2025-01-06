package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_And_Mouse_Event_In_Selenium_Lecture_2__43 {
	
	WebDriver driver;
	@Test
	public void verifyActionsTest() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElements
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement emailAddress = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		//entering text through Action class	
		Actions action = new Actions(driver);
		action.keyDown(firstName, Keys.SHIFT).sendKeys("hari krishna").keyUp(firstName, Keys.SHIFT).build().perform();
		action.keyDown(lastName, Keys.SHIFT).sendKeys("thadaboina").keyUp(lastName, Keys.SHIFT).build().perform();
		action.keyDown(emailAddress, Keys.SHIFT).sendKeys("harikrishna.thadaboina@gmail.com").keyUp(emailAddress, Keys.SHIFT).build().perform();
		action.keyDown(password, Keys.SHIFT).sendKeys("password").keyUp(password, Keys.SHIFT).build().perform();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
