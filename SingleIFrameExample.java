import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleIFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Automation\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		List<WebElement> noofFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of iframes are"+noofFrames.size());
		
		// by index
	//	driver.switchTo().frame(0);
//		
//		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
//		text.sendKeys("mohit");
		
		//by name
//		driver.switchTo().frame("singleFrame");
//		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
//		text.sendKeys("mohit");
		
		//by id
//		driver.switchTo().frame("singleframe");
//		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
//		text.sendKeys("mohit");
		
		//by tagname
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("mohit");
		
		
		
		

	}

}
