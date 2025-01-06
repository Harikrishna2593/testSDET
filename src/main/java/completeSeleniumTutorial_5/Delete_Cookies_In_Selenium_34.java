package completeSeleniumTutorial_5;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_Cookies_In_Selenium_34 {
	WebDriver driver;
	@Test
	public void testCookies()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//open website and delete cookies
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		
		//get the available cookies 
		Set<Cookie> cookieList = driver.manage().getCookies();
		for(Cookie getCookie:cookieList)
		{
			System.out.println("cookie_List :-"+getCookie);
		}
		
		driver.close();
	}

}
