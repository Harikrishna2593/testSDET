package completeSeleniumTutorial_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver_In_selenium_16 {
                                            //Mouse over on an element to display dropdown menu
	WebDriver driver;
	@Test
	public void mouseOverTest() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.homelane.com/?utm_source=Youtube&utm_medium=Google&utm_campaign=11266877419&utm_content=107368073501&gclid=Cj0KCQjwjPaCBhDkARIsAISZN7TaTcVO626t38LF-7l5TInmXjJ8XbkdAmW9VEhV6qN4kxHtYsDHm5UaAjnWEALw_wcB");
		
		
		Thread.sleep(5000);
		WebElement cities = driver.findElement(By.xpath("//p[contains(text(),'Cities')]/parent::div[1]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(cities).build().perform();
	}
	
}
