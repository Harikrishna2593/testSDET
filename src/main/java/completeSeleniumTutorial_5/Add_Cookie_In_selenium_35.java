package completeSeleniumTutorial_5;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_Cookie_In_selenium_35 {
	WebDriver driver;
	@Test
	public void addCookies()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Add cookies
		Cookie addCookie = new Cookie("HarisCookie", "ILoveCookies123");
		driver.manage().addCookie(addCookie);
		//get cookies
		Set<Cookie> getCookies = driver.manage().getCookies();
		for(Cookie getcookie:getCookies)
		{
			System.out.println("cookie_List :-"+getcookie);
		}
		
		driver.close();
	}

}
