import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Automation\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://demo.guru99.com/test/table.html");

		driver.manage().window().maximize();
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		int rowsize = rows.size();
		
		for(int i=0; i<rowsize;i++)
		{
			List<WebElement> tableData = rows.get(i).findElements(By.tagName("td"));
			int size1= tableData.size();
			for(int j=0;j<size1;j++)
			{
				String text = tableData.get(j).getText();
				System.out.println("Cell Value of row number "+i+" and column number "+j+" is "+text);
				
			}
		}

	}

}
