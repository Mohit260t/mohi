import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\software\\chrome\\chromedriver.exe");
			
		 //to create chromedriver object we need to create webdriver interface refrence variable and need to create object for browser
		 
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			//to maximize window
			driver.manage().window().maximize();
			
			//simple alert which has only accept button
//		WebElement button =driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//		button.click();
//		driver.switchTo().alert();
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		driver.switchTo().alert().accept();
			
			// alert which has ok and cancel button
			
//			WebElement button =driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//			button.click();
//			
//			WebElement button1 =driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
//			button1.click();
//			Thread.sleep(1000);
//			driver.switchTo().alert().dismiss();
			
			//alert which has text field and ok as well as cancel button
//			WebElement button =driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
//			button.click();
//			
//			WebElement button1 =driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
//			button1.click();
//			Thread.sleep(3000);
//			driver.switchTo().alert().sendKeys("paresh");
//			driver.switchTo().alert().accept();
			
			

	}

}
