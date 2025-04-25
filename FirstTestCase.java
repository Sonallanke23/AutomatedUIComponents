package MavenDemo.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertmsg =alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(5000);
		alert.accept();
		
		String currWindow= driver.getWindowHandle();
		driver.switchTo().window(currWindow);
		
		
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		//driver.close();
		
		
		
	
	
	}

}
