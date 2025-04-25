package MavenDemo.Test2;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//set the time wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://www.deadlinkcity.com/");
		
		// get all the lionks on the page
		
		List <WebElement> allLinks=driver.findElements(By.tagName("a"));
		int responseCode=200;
		int brokenLinks=0;
	System.out.println("Total no. of links on webpage"+allLinks.size());
	
	//get all urls
	for(WebElement urlEl :allLinks)
	{
		String urls = urlEl.getDomProperty("href");
		
		
		try {
			
			URL urlLink=new URL(urls);
			HttpURLConnection huc= (HttpURLConnection)urlLink.openConnection();
			huc.setRequestMethod("HEAD");
			huc.connect();
			responseCode=huc.getResponseCode();
			
			if(responseCode>=400)
			{
				System.out.println(urls+"Broken link");
				brokenLinks ++;
				
			}
			
			
		}
		catch(MalformedURLException me)
		{
		
		}
		catch (Exception e)
		{
	}
		
}
	System.out.println("Total Broekn links"+brokenLinks);
	}
}
