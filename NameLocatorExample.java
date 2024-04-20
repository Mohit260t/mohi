import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver", "C:\\Automation\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//to find element by using id locators
		WebElement username=driver.findElement(By.name("email"));
		
		// webElement interface method to send value to text box
		username.sendKeys("mohit");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("mohit123");
		
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();

	}

}
