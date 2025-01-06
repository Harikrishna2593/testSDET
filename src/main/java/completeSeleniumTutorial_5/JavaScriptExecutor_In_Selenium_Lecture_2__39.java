package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor_In_Selenium_Lecture_2__39 {
	
	WebDriver driver;
	@Test
	public void javaScriptFunctions() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Open browser
		driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//JavaScript functions 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Domain Name of the site
		String domainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of the site :-"+domainName);
		//URL of the Site
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site :-"+url);
		//Title of the site
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title of the Website :-"+title);
		Thread.sleep(2000);
		//Scrolls down completely
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		//Scrolls UP completely
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(2000);
		//scroll down by pixel
		js.executeScript("window.scrollBy(0, 200)");
		Thread.sleep(2000);
		//scroll UP by pixel
		js.executeScript("window.scrollBy(0, -200)");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[text()='SERVICE WITH A SMILE']")));
		
		Thread.sleep(2000);
		driver.close();
	}

}
