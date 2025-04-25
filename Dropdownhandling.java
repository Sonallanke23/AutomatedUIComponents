package MavenDemo.Test2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// launch chrome
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	// got to url
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		// find dropdown on the page
		WebElement element= driver.findElement(By.id("input-country"));
		
	// get the select class to select the dropdown
		
	Select dropdown = new Select(element);
	//dropdown.selectByVisibleText("Bahrain");
	//dropdown.selectByValue("3");
	//dropdown.selectByIndex(45);
	
	if(dropdown.isMultiple()==true)
	{
	System.out.print("Dropdown is multiple");
	}
	else
	{
		System.out.println("Dropdown is not multiple");
	}
	
	List <WebElement> AllDropdownOptions=dropdown.getOptions();
	
	for(WebElement el:AllDropdownOptions)
	{
		System.out.println(el.getText());
		
	}
	}
}

    
