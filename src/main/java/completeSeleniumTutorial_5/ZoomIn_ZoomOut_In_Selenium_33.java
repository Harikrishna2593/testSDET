package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;import dev.failsafe.function.CheckedRunnable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomIn_ZoomOut_In_Selenium_33 {
	WebDriver driver;
	@Test
	public void testZoomInZoomOut() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Zoom Out - 40%
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='40%'");
		Thread.sleep(3000);
		//Zoom In - 100%
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		//Zoom In - 200%
		js.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
