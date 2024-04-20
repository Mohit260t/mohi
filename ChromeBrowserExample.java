
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


@SuppressWarnings("unused")
public class ChromeBrowserExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\software\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
			driver.navigate().refresh();
			
//			WebElement flight = driver.findElement(By.linkText("Flights"));
//			flight.click();
//			
//			Thread.sleep(1000);
			
			//to redirect in one step back on page
			driver.navigate().back();
			
			Thread.sleep(1000);
			// to redirect in one step forward on page
			driver.navigate().forward();
			
//			WebElement country = driver.findElement(By.name("country"));
//			Select select = new Select(country);
			//select by value
			//select.selectByValue("ARGENTINA");
			//select by visible text
			//select.selectByVisibleText("INDIA");
			//select by index
//			select.selectByIndex(4);
			
			driver.manage().window().maximize();
			
			driver.manage().window().minimize();
			
			WebElement flight =driver.findElement(By.linkText("Flights"));
			flight.click();
			

	}

}
