import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Automation\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/facebook.html");
	
	//using basic xpath
//		WebElement un =driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement pass =driver.findElement(By.xpath("//*[@type='password']"));
//		WebElement login =driver.findElement(By.xpath("//input[@value='log In']"));
	
	// by using and condition syntax
//	WebElement un =driver.findElement(By.xpath("//input[@type='text' and @id='email']"));
//	WebElement pass =driver.findElement(By.xpath("//input[@name='pass' and @tabindex='2']"));
//	WebElement login =driver.findElement(By.xpath("//input[@type='submit'and @value='Log In']"));
//	
	//using or condition
//	WebElement un =driver.findElement(By.xpath("//input[@type='text' or @id='email']"));
//	WebElement pass =driver.findElement(By.xpath("//input[@name='pass' or @tabindex='2']"));
//	WebElement login =driver.findElement(By.xpath("//input[@type='submit'or @value='log In']"));
	
//	
//	WebElement un =driver.findElement(By.xpath("//input[contains(@name,'em')]"));
//	WebElement pass =driver.findElement(By.xpath("//input[contains(@type,'ord')]"));
//	WebElement login =driver.findElement(By.xpath("//*input[contains(@id,'butt')]"));
//	
//	
//		
//	un.sendKeys("mohit");
//	pass.sendKeys("mohit123");
//		login.click();
	
	WebElement project = driver.findElement(By.xpath("//*[text()='Agile Project']"));
	project.click();
	
//	WebElement un =driver.findElement(By.xpath("//*[starts-with(@name,'em')]"));
//	WebElement pass =driver.findElement(By.xpath("//*[starts-with(@type,'pas')]"));
//	WebElement login =driver.findElement(By.xpath("//*[starts-with(@value,'Log')]"));
//	un.sendKeys("mohit");
//	pass.sendKeys("mohit123");
//	login.click();

	
	}

}
