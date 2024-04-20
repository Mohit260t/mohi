import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\software\\chrome\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
	
		List <WebElement> noOfFrame = driver.findElements(By.tagName("iFrame"));
		int size = noOfFrame.size();
		System.out.println("No of iframes in HTML page is:"+size);
		
		// switch by index
		//driver.switchTo().frame(0);
		
		//switch by id
		//driver.switchTo().frame("SingleFrame");
		
		//switch by name
		driver.switchTo().frame("SingleFrame");
		
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("mohi123");
		

	}

}
