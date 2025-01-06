package completeSeleniumTutorial_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_select_Data_from_Select_box_15 {
	                                                   //Select value from select drop down
	WebDriver driver;
	@Test
	public void selectBox()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Krishna");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select select = new Select(day);
		select.selectByValue("25");
		
		select = new Select(month);
		select.selectByIndex(1);
		
		select = new Select(year);
		select.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("test123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password");
		
		
		
	}

}
