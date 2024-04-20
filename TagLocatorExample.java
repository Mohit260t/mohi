import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\software\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			
			driver.get("https://demo.guru99.com/test/facebook.html");
//			WebElement username=driver.findElement(By.className("inputtext"));
//			username.sendKeys("mohit");
//			WebElement password = driver.findElement(By.id("pass"));
//			password.sendKeys("mohit123");
//			WebElement login = driver.findElement(By.className("uiButtonConfirm"));
//			login.click();
			
			// by using starts with
			
			WebElement un =  driver.findElement(By.cssSelector("input[name^='ema']"));
			un.sendKeys("mohit");
			
			//by using ends with
			WebElement pass =  driver.findElement(By.cssSelector("input[type$='word']"));
			pass.sendKeys("mohit123");
			
			// by using contains
			
			WebElement login =  driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
			login.click();
			
			
			
			

	}

}
