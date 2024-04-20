import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\software\\chrome\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
			
			//to maximize window
			driver.manage().window().maximize();
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("khajuriamohit49@gmail.com");
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("password123$");
			WebElement login = driver.findElement(By.id("loginbutton"));
			login.click();
			
	}

}
