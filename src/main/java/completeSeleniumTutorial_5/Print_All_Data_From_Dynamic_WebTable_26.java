package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_All_Data_From_Dynamic_WebTable_26 {
	
	WebDriver driver;
	@Test
	public void printWebTableData() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);");
		
		int rowSize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println(rowSize);
		
		int columnSize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(columnSize);
		
		//table[@class='dataTable']/tbody/tr[1]/td[1]
		String firstPart = "//table[@class='dataTable']/tbody/tr[";
		String secondPart = "]/td[";
		String thirdPart = "]";
		
		for(int i = 1; i <= rowSize; i++)
		{
			for (int j = 1; j <= columnSize; j++) {
				
				String finalPart = firstPart+i+secondPart+j+thirdPart;
				
				String rowData = driver.findElement(By.xpath(finalPart)).getText();
				
				System.out.print(rowData+" | ");
				
			}
			System.out.println();
			
		}
		
		Thread.sleep(5000);
		driver.close();
		
		
	}
	

}
