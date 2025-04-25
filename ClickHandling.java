package MavenDemo.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		// to click Right Button
		WebElement rightbtn= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		
		Actions act = new Actions(driver);
		act.contextClick(rightbtn).perform();
		
		// to double click
		
	WebElement doubleclk=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	act.doubleClick(doubleclk).build().perform();
	
		
		
		
	}

}
