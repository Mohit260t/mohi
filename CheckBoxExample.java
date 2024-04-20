

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Automation\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	WebElement checkbox = driver.findElement(By.id("checkbox1"));
    checkbox.click();
	// to check checkbox or radio button is selected or not
	if(checkbox.isSelected())
	{
		System.out.println("checkbox is selected by default");
	}
	else
	{
		System.out.println("checkbox is not selected");
		checkbox.click();
	}
	
	
//	WebElement male = driver.findElement(By.xpath("//*[@value='Male']"));
//	male.click();
//	
//	boolean isSelected = male.isSelected();
//	
//	if(isSelected == true)
//	{
//		System.out.println("radio button is selected");
//	}
//	else
//	{
//		System.out.println("radio button is not selected");
//		male.click();
//	}
	
	  //to select all checkbox
	
//	List<WebElement> allCheckbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
//	int size = allCheckbox.size();
//	for(int i =0;i<size;i++)
//	{
//		allCheckbox.get(i).click();
//	}
//    
//	for(int i =0; i<size;i++)
//	{
//		String value = allCheckbox.get(i).getAttribute("value");
//		if(value.equalsIgnoreCase("cricket"))
//		{
//			allCheckbox.get(i).click();
//		}
//	}
	
//	List<WebElement> radio = driver.findElements(By.xpath("//*[@type='radio']"));
//	for(int i =0;i<radio.size(); i++)
//	{
//		String value =radio.get(i).getAttribute("value");
//		if(value.equalsIgnoreCase("female"))
//		{
//			radio.get(i).click();
//		}
//	}
	
	


	}

}
