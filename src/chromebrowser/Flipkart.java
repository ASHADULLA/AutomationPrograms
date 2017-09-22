package chromebrowser;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter avd or ard or Computer: ");
		Scanner sc=new Scanner(System.in);
		String device=sc.nextLine();
		WebDriver driver;
		if(device.equals("avd"))
		{
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability(CapabilityType.BROWSER_NAME,"Browser" );
		c.setCapability("deviceName", "emulator -5554");
		c.setCapability("platformName", "andriod");
		c.setCapability("platformVersion", "5.1.1");
		//URL u=new URL("http://0.0.0.0:4723/wd/hub");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(u,c);
		}
		else if(device.equals("ard"))
			{
			DesiredCapabilities c=new DesiredCapabilities();
			c.setCapability(CapabilityType.BROWSER_NAME,BrowserType.CHROME );
			c.setCapability("deviceName", "VWKVS4ZLOJYD9HJ7");
			c.setCapability("platformName", "andriod");
			c.setCapability("platformVersion", "5.1.1");
			//URL u=new URL("http://0.0.0.0:4723/wd/hub");
			URL u=new URL("http://127.0.0.1:4723/wd/hub");
			driver=new AndroidDriver(u,c);
			}

		else{
			System.setProperty("webdriver.chrome.driver", "E:/MindQSelenium/chromedriver.exe");
			 driver = new ChromeDriver(); 
		}

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("(//INPUT[contains(@type, 'text')])[2]")).sendKeys("9949457356");
		driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys("Flipkart,128793");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(@type, 'submit')])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Track Order")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[contains(text(), 'View Details')])[1]")).click();
		ArrayList<String> l=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		if(!driver.findElement(By.xpath("//span[contains(text(), 'More details')]")).isDisplayed())
		{
		System.out.println("More details option is not found in the webpage");
		}
		else
		{
			driver.findElement(By.xpath("//span[contains(text(), 'More details')]")).click();
			Thread.sleep(5000);
			Actions a=new Actions(driver);
			for(int i=0;i<5;i++){
			a.sendKeys(Keys.DOWN).build().perform();
		}
			driver.close();
		}
	}	
	}