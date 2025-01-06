package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_Verify_Checkbox_is_checked_or_Not_in_Selenium_31 {
	
	WebDriver driver;
	@Test(enabled = true, priority = 0)
	public void verifyCheckBox()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//before check
		boolean beforeSelectVerify = driver.findElement(By.id("vehicle1")).isSelected();
		System.out.println("Before Select:- "+beforeSelectVerify);
		//click on check box
		driver.findElement(By.id("vehicle1")).click();
		
		//After check
		boolean afterSelectVerify = driver.findElement(By.id("vehicle1")).isSelected();
		System.out.println("After Select:- "+afterSelectVerify);
		
		driver.close();
		
	}
	
	@Test(enabled = true, priority = 1)
	public void verifyCheckBoxs()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
	    //check bike
		driver.findElement(By.id("vehicle1")).click();
		//check boat
		driver.findElement(By.id("vehicle3")).click();
		
		
		//verify check box's
		boolean verifyBike = driver.findElement(By.id("vehicle1")).isSelected();
		boolean verifyCar = driver.findElement(By.id("vehicle2")).isSelected();
		boolean verifyBoat = driver.findElement(By.id("vehicle3")).isSelected();
		
		if(verifyBike==true && verifyCar==false && verifyBoat==true )
		{
			System.out.println("Working as expected! - Verify passed");
		}else {
			System.out.println("One of the check box is incorrect! - verify failed");
		}
	
		
		driver.close();
		
	}
	
	
	

}
