package completeSeleniumTutorial_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_Handel_Calendar_OR_TextBox_OR_Select_Box_21_22 {

	WebDriver driver;
	String eMonth_Year = "May 2025";
	String eDate = "26";
	int numberOfAdultsAdded = 3;

	@Test
	public void testCalndr() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// Website launch and maximize
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// scroll down upto 200 pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);");

		// Click on flying from box and enter the desired value
		driver.findElement(By.xpath("//div[@id='onereturn']/descendant::span[4]")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("JED");
		// put wait condition on load the value and click on the value
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='select2--results']/li")));
		driver.findElement(By.xpath("//ul[@id='select2--results']/li")).click();

		// Click on Destination to box and enter the desired value, put wait to load and
		// click on the desired value shown
		driver.findElement(By.xpath("//div[@id='onereturn']/descendant::span[12]")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("DEL");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='select2--results']/li")));
		driver.findElement(By.xpath("//ul[@id='select2--results']/li/button")).click();
		//Thread.sleep(5000);
		// Select Journey type as Business
		WebElement JType = driver.findElement(By.xpath("//select[@id='flight_type']"));
		Select select = new Select(JType);
		select.selectByVisibleText("Business");

		// select journey dates in calendar
		driver.findElement(By.id("departure")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datepicker dropdown-menu'][3]")));
		WebElement aMonth_Year = driver
				.findElement(By.xpath("//div[@class='vt-container']/following-sibling::div[3]/descendant::th[2]"));

		while (true) {
			if (aMonth_Year.getText().equals(eMonth_Year)) {
				break;
			} else {
				driver.findElement(By.xpath("//div[@class='vt-container']/following-sibling::div[3]/descendant::th[3]"))
						.click();
			}
		}
		
		driver.findElement(By.xpath("//div[@class='vt-container']/following-sibling::div[3]/descendant::tbody[1]/tr/td[contains(text(),'"+ eDate + "')]")).click();
		
		
		//click on travellers drop down and select number of adults to add on top of one
		driver.findElement(By.xpath("//*[@id='onereturn']/div[4]/descendant::div/a")).click();
		
		while(true)
		{
			for(int i=1;i<=numberOfAdultsAdded;i++) {
		driver.findElement(By.xpath("//*[@id='onereturn']/div[4]/div/div/div/div/div[1]/div/div/div[2]")).click();
		}
			break;
		}
		
		//Click on search
		driver.findElement(By.xpath("//button[@id='flights-search']")).click();
		
		Thread.sleep(10000);
		
		
		//List the number of flights found for JED to DEL
		
		String totalFlights = driver.findElement(By.xpath("//*[@id='fadein']/main/div[2]/div/div/div[2]/div[1]/div[2]")).getText();
		System.out.println("Listing the number of flights found for JED to DEL:-"+totalFlights);
		
		//Close browser
		driver.close();
	}
	
	

}
