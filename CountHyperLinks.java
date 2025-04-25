package MavenDemo.Test2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://calculator.net");
		
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		
	
		
		System.out.println(linkElements.size());
		 for(WebElement el : linkElements)
		 {
			 System.out.println(el.getText());
		 }
		
		
		
		
	}

}
