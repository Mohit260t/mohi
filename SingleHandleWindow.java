import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleHandleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\software\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://demo.automationtesting.in/Windows.html");
			driver.manage().window().maximize();
			String parentWindow = driver.getWindowHandle();
			System.out.println(parentWindow);
			
			WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
			button.click();
			
			//to store all opened window after clicking on button
			Set<String> childWindow = driver.getWindowHandles();
			java.util.Iterator<String> i = childWindow.iterator();
			while(i.hasNext())
			{
				String childWindow1 = i.next();
				System.out.println(childWindow1);
				if(!parentWindow.equalsIgnoreCase(childWindow1))
				{
					driver.switchTo().window(childWindow1);
					WebElement download = driver.findElement(By.linkText("Downloads"));
					download.click();
					Thread.sleep(1000);
					driver.close();
				}
			}
			
			driver.switchTo().window(parentWindow);

	}

	

}
