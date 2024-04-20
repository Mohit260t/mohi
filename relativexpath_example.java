import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\software\\chrome\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		// 1 using tag and attributes
		
//		WebElement username =driver.findElement(By.xpath("//input[@id='email']"));
//		username.sendKeys("mohit");
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("mohit123");
//
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
//		login.click();
		
		//using and condition
		
//		WebElement username =driver.findElement(By.xpath("//input[@id='email' and @class='inputtext']"));
//		username.sendKeys("mohit");
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass' and @tabindex='2']"));
//		password.sendKeys("mohit123");
//
//		WebElement login = driver.findElement(By.xpath("//input[@value ='Log In' and @type = 'submit']"));
//		login.click();
		
		//using or condition
//		WebElement username =driver.findElement(By.xpath("//input[@id='email' or @class='inputtext']"));
//		username.sendKeys("mohit");
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass' or @tabindex='1000']"));
//		password.sendKeys("mohit123");

//		WebElement login = driver.findElement(By.xpath("//input[@value ='Log In' or @type = 'submit']"));
//		login.click();
		
		//using contains
		
//		WebElement username =driver.findElement(By.xpath("//input[contains(@id,'ma')]"));
//		username.sendKeys("mohit");
//		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pas')]"));
//		password.sendKeys("mohit123");
//
//		WebElement login = driver.findElement(By.xpath("//input[contains(@type,'subm')]"));
//		login.click();
		
		// using starts with
		
//		WebElement username =driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));
//		username.sendKeys("mohit");
//		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pa')]"));
//		password.sendKeys("mohit123");
//
//		WebElement login = driver.findElement(By.xpath("//input[starts-with(@value,'Log')]"));
//		login.click();
		
		// using text method
		WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));
		link.click();

		
	}

}
