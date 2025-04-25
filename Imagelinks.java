package MavenDemo.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		
		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Soldsdution"))
		{
			System.out.println("Title is matched");
		}
		else
		{
			System.out.println("The home page is incorrect");
		
		}
		driver.close();
	}

}
