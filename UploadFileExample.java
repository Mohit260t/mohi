import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Automation\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
			
			
			driver.get("https://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();
			WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
			uploadFile.sendKeys("C:\\Users\\Admin\\Desktop\\mohit's updated resume 2.pdf");
			WebElement submit =driver.findElement(By.id("submitbutton"));
			submit.click();

	}

}
