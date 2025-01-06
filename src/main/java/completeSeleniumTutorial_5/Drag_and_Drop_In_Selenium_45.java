package completeSeleniumTutorial_5;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop_In_Selenium_45 {

	WebDriver driver;
	@Test
	public void dragAndDrop() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//source and target webElement
		WebElement sourceObject = driver.findElement(By.id("draggable"));
		WebElement targetobject = driver.findElement(By.id("droppable"));
		//Actions class, drag and drop function
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceObject, targetobject).build().perform();
		//get message from target location and validate
		System.out.println("Target Object message :-"+targetobject.getText());
		assertEquals(targetobject.getText(), "Dropped!");
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
	}
	
}
