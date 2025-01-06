package completeSeleniumTutorial_5;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTest_In_Selenium_48 {
	
	public WebDriver driver;
	@Test(enabled = true, priority = 0)
	public void testScreenShot() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on mutual funds
		driver.findElement(By.xpath("//a[text()='Mutual Funds']")).click();
		Thread.sleep(5000);
		//take screenshot
		TakesScreenshot sShot = (TakesScreenshot)driver;
		File file = sShot.getScreenshotAs(OutputType.FILE);
		//copy file to folder
		FileUtils.copyFile(file, new File("./Screenshots/Image1.png"));
		
		driver.close();
	}
	
	
	public void takeScreenShot(WebDriver driver, String imageName) throws Exception
	{
	        	//take screenshot
				TakesScreenshot sShot = (TakesScreenshot)driver;
				File file = sShot.getScreenshotAs(OutputType.FILE);
				//copy file to folder
				FileUtils.copyFile(file, new File("./Screenshots/"+imageName));
	}
	
	
	@Test(enabled = true, priority = 1)
	public void testScreenShotTake1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		takeScreenShot(driver, "ImageA.jpg");
		//Click on mutual funds
		driver.findElement(By.xpath("//a[text()='Mutual Funds']")).click();
		takeScreenShot(driver, "ImageB.png");
		Thread.sleep(5000);
		
		
		driver.close();
	}

}
