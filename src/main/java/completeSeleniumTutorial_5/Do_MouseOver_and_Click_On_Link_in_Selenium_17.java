package completeSeleniumTutorial_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Do_MouseOver_and_Click_On_Link_in_Selenium_17 {

	WebDriver driver;

	@Test
	public void mouseOverAndClickElement() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.homelane.com/");

		WebElement cities = driver.findElement(By.xpath("//p[contains(text(),'Cities')]/parent::*"));

		Actions actions = new Actions(driver);
		 actions.moveToElement(cities).build().perform();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"headerDesktop_city_link_desk__34y4A\"]/section/div/div[8]/a")).click();

	}

}
