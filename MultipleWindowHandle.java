import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\software\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
		button1.click();
		
		Set<String> childWindow = driver.getWindowHandles();
		Iterator<String> i= childWindow.iterator();
		while(i.hasNext())
		{
			String childWindow1 = i.next();
			if(!parentWindow.equalsIgnoreCase(childWindow1))
			{
				driver.switchTo().window(childWindow1);
				if(driver.getTitle().equalsIgnoreCase("Selenium"))
				{
					WebElement download = driver.findElement(By.linkText("Downloads"));
					download.click();
					Thread.sleep(5000);
					driver.close();
				}
				else
				{
					WebElement image = driver.findElement(By.id("enterimage"));
					image.click();
					Thread.sleep(5000);
					driver.close();
				}
			}
		}
		driver.switchTo().window(parentWindow);
		
		
		
		
		

	}

}
