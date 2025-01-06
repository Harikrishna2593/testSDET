package completeSeleniumTutorial_5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_get_All_Links_From_WebPage_27 {
	
	WebDriver driver;
	@Test
	public void getLinks() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250);");
		
		//links size
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links:- "+links.size());
		
		ArrayList<String> alLinks = new ArrayList<String>();
		
		//Get Link text and Links
		for(int i = 0; i < links.size(); i++ )
		{
			System.out.println(links.get(i).getText());
			
			String link = links.get(i).getAttribute("href");
			alLinks.add(link);
			System.out.println(link);
			System.out.println();
		}
		//Array List size
		System.out.println("Total ArrayList size:- "+alLinks.size());
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
