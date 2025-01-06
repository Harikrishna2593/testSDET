package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_Button_and_Auto_Suggestion_textBox_in_Selenium_28_29 {
    WebDriver driver;
	                          //Dynamic text box scenario covered in php travels testcase - done

	@Test(enabled = true, priority = 0) //suggestion box and experience(radio box) -done
	public void handleRadioButton() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page&entry_point=login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Female
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/span[1]/label/input")).click();
		Thread.sleep(3000);
		//Male
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/span[2]/label/input")).click();
        Thread.sleep(3000);
		//Custom
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/span[3]/label/input")).click();
		
		driver.close();
	}
	
	@Test(enabled = true, priority = 1) // java script - alert button - done
	public void handleJavaScriptAlert() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//try it button
		driver.findElement(By.xpath("/html/body/button")).click();
		
		//After click on alert
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text :-"+alert.getText());
		alert.dismiss();
		
		//After Alert button click
		String msg = driver.findElement(By.id("demo")).getText();
		System.out.println("After alert button click :-"+msg);
				
		driver.close();
	}
	
	
	@Test(enabled = true, priority = 2) //	actions class -- click - done	
	public void testActions()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		
		WebElement source = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		WebElement target = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
}
