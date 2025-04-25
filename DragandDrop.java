package MavenDemo.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement srcElement = driver.findElement(By.id("box6"));
		WebElement trgtElement= driver.findElement(By.id("box106"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(srcElement, trgtElement).build().perform();
	}

}
