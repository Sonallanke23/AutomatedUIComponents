package MavenDemo.Test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		List <WebElement> numberOfRadioBtn= driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total number of radio Button : "+numberOfRadioBtn.size());
		
	
driver.close();
	}

}
