package MavenDemo.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.ie/");
		WebElement hoverEle = driver.findElement(By.linkText("Collectables & Antiques"));
		Actions act=new Actions(driver);
		
		act.moveToElement(hoverEle).build().perform();
		WebElement sportHover = driver.findElement(By.linkText("Sports & Leisure"));
		Thread.sleep(500);
		act.moveToElement(sportHover).build().perform();
		
	}

}
