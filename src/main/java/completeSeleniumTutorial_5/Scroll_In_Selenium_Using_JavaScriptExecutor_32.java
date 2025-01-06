package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_In_Selenium_Using_JavaScriptExecutor_32 {
	WebDriver driver;
	@Test
	public void testScrollWindow() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Scroll down complete
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//Scroll Up complete
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//Scroll by pixel 1500 down
		js.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(3000);
		
		//Scroll by pixel -1500 up
		js.executeScript("window.scrollBy(0, -1500)");
		Thread.sleep(3000);
		
		//Scroll into view - specific webElement
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h2[text()='THE BEST OF THE BEST']")));
		Thread.sleep(3000);
		
		driver.close();
	}

}
