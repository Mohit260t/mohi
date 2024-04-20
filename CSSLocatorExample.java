import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSLocatorExample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Automation\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//by using tag and id in css selector
		
//		WebElement username = driver.findElement(By.cssSelector("input#email"));
//	     username.sendKeys("mohit");
		
		//by using tag and class in css selector
		
//				WebElement password = driver.findElement(By.cssSelector("input.inputtext"));
//				password.sendKeys("mohit123");
		
		// by using tag and attribute
//		WebElement username = driver.findElement(By.cssSelector("input[tabindex='1'][name='email']"));
//	username.sendKeys("mohit");
//		
//		WebElement password = driver.findElement(By.cssSelector("input[id ='pass']"));
//		password.sendKeys("mohit123");
		
		//by using the tag,class and attributes
//		WebElement login = driver.findElement(By.cssSelector("label.uiButtonConfirm[for='u_0_b']"));
//		login.click();
		
		//by using tag,id and attributes
		
		WebElement username = driver.findElement(By.cssSelector("input#email[type='text']"));
		username.sendKeys("mohit");
		



	}

}
