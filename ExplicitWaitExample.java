import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Automation\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/facebook.html");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("mohit");
	
	WebElement password = driver.findElement(By.id("pass"));
	
	WebElement login = driver.findElement(By.id("loginbutton"));
	
	
	//created object of webdriverwait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	
	//used expected condition's class methods to check element is present or not
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
	password.sendKeys("mohit123");
	
	//used expected condition's class methods to check element is clickable or not
		
	    wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		
	


	}

}
