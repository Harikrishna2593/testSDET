package completeSeleniumTutorial_5;

import java.text.NumberFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_get_Max_Price_From_Dynamic_WebTable_25 {
  
	WebDriver driver;
	@Test
	public void getCurrentPriceValues() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Scroll Down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);");
		
		//Row Size
		int rowSize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("Row Size :-"+rowSize);
		
		//table[@class='dataTable']/tbody/tr[1]/td[4]
		
		String firstPart = "//table[@class='dataTable']/tbody/tr[";
		String secondPart = "]/td[4]";
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 1; i <= rowSize; i++)
		{
			String finalPart = firstPart+i+secondPart;
			String currText = driver.findElement(By.xpath(finalPart)).getText();
			
			NumberFormat num = NumberFormat.getInstance();
			Number number = num.parse(currText);
			String numVal = number.toString();
			
			Double doubVal = Double.parseDouble(numVal);
			int currentPrice = doubVal.intValue();
			System.out.println("Current price table data :-"+currentPrice);
			//Row Data -- current price
			al.add(currentPrice);
			
				
		}
		
		Collections.sort(al);//sort data 
		System.out.println("AL size :-"+al.size());
		System.out.println("Mininum value :-"+al.get(0));
		System.out.println("Maximun Value :-"+al.get(al.size()-1));	
		System.out.println(al);
		
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
}
