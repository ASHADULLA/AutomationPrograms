package testng_programs;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;			
public class NewTest {	
	
	WebDriver driver;
	
	//Chrome Browser
	@Test
	public void chromeStart() throws Exception{
	System.setProperty("webdriver.chrome.driver","E:/MindQSelenium/chromedriver.exe");	
	     driver = new ChromeDriver();	
	     driver.get("http://www.google.com");
	     driver.manage().window().maximize();
	     Thread.sleep(5000);
	     driver.close();
	    }	
		
		//Firefox Browser
		@AfterMethod 
		public void firefoxStart() throws Exception{
			System.setProperty("webdriver.gecko.driver","E:/MindQSelenium/geckodriver.exe");		
		driver = new FirefoxDriver();	
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		     }
			
			@BeforeMethod
			public void internetStart() throws Exception{
				System.setProperty("webdriver.ie.driver","E:/MindQSelenium/IEDriverServer.exe");	
			driver = new InternetExplorerDriver();	
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
			     }
			
	}		