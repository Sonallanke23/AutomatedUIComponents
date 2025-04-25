package MavenDemo.Test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadandDownloadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement uploadFile =driver.findElement(By.id("uploadFile"));
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", uploadFile);
			
		
		//Actions act=new Actions(driver);
		//act.moveToElement(uploadFile).build().perform();
		
		//uploadFile.click();
				//driver.findElement(By.xpath("//input[@id='uploadFile']")).click();
		uploadFile.sendKeys("C:\\Automation\\DemoTestMavenProject\\Test2\\src\\test\\resources\\uploadfile.txt");
	}

}
