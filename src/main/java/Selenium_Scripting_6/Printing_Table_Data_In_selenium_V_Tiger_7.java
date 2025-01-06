package Selenium_Scripting_6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printing_Table_Data_In_selenium_V_Tiger_7 {
	
	WebDriver driver;
	@Test
	public void verifyRecord() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Launch browser
		driver.get("http://localhost:8888/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// VTiger -Login
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		
		//Leads link
		driver.findElement(By.linkText("Leads")).click();
	
		int rowSize = driver.findElements(By.xpath("//table[@class='lvtBg']/tbody/tr[1]/td/div/table/tbody/tr")).size();
	    int colSize = driver.findElements(By.xpath("//table[@class='lvtBg']/tbody/tr[1]/td/div/table/tbody/tr[3]/td")).size();
	    // Row and Column sizes
	    System.out.println("Row size :-"+rowSize);
	    System.out.println("Column size :-"+colSize);
	    //printin table data on console - rows and columns data
	    for(int i = 3; i <= rowSize; i++)
	    {
	    	for(int j = 2; j <= colSize; j++)
		    {
	    		//table[@class='lvtBg']/tbody/tr[1]/td/div/table/tbody/tr[3]/td[2]
	    		String fPart = "//table[@class='lvtBg']/tbody/tr[1]/td/div/table/tbody/tr[";
	    		String sPart = "]/td[";
	    		String tPart = "]";
	    		
	    		String columnData = driver.findElement(By.xpath(fPart+i+sPart+j+tPart)).getText();
	    		System.out.print(columnData+" |");
	    		
		    }
	    	System.out.println();
	    	
	    }
	    
	    driver.close();
	}
	
	

}
