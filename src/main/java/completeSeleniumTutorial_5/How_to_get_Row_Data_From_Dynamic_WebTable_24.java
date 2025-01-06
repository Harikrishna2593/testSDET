package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_get_Row_Data_From_Dynamic_WebTable_24 {

	WebDriver driver;
	@Test
	public void getRowData() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);");
		
		//get row data using specific Xpath
		String rowData = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[4]")).getText();
		System.out.println("Row Data 1 :-"+rowData); //2,608.85
		//get row data using visible or contains text, more flexible
		String rowData2 = driver.findElement(By.xpath("//a[contains(text(),'Ajanta Pharma Lt')]/parent::*/following-sibling::td[3]")).getText();										
		System.out.println("Row Data 2 :-"+rowData2); // 3,039.45	
						
		
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
	
}
