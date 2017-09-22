package chromebrowser;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GmailRegistration {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter avd or ard: ");
		Scanner sc=new Scanner(System.in);
		String device=sc.nextLine();
		WebDriver driver;
		if(device.equals("avd"))
			{	
			DesiredCapabilities c=new DesiredCapabilities();
			c.setCapability(MobileCapabilityType.BROWSER_NAME,"Browser" );
			c.setCapability("deviceName", "emulator -5554");
			c.setCapability("platformName", "andriod");
			c.setCapability("platformVersion", "5.1.1");
			//c.setCapability("platformVersion", "4.2.2");
			c.setCapability(MobileCapabilityType.ACCEPT_SSL_CERTS, true); 
			URL u=new URL("http://127.0.0.1:4723/wd/hub");
			//URL u=new URL("http://0.0.0.0:4723/wd/hub");
			//URL u=new URL("http://127.0.0.1:5037/wd/hub");
			driver=new AndroidDriver(u,c);
			}
		else 
			{
			DesiredCapabilities c=new DesiredCapabilities();
			c.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME );
			c.setCapability("deviceName", "VWKVS4ZLOJYD9HJ7");
			c.setCapability("platformName", "andriod");
			c.setCapability("platformVersion", "5.1.1");
			//URL u=new URL("http://0.0.0.0:4723/wd/hub");
			URL u=new URL("http://127.0.0.1:4723/wd/hub");
			//URL u=new URL("http://127.0.0.1:5037/wd/hub");
			driver=new AndroidDriver(u,c);
			}
 		driver.get("https://accounts.google.com/ServiceLogin/identifier");
 		driver.manage().window().maximize();
 		Thread.sleep(5000);
 		driver.findElement(By.xpath("//*[text()='More options']")).click();
 		Thread.sleep(5000);
 		driver.findElement(By.xpath("//div[@class='jO7h3c']")).click();
 		Thread.sleep(5000);
 		WebElement ee=driver.findElement(By.id("FirstName"));
 		ee.sendKeys("Ashadulla");
 		Thread.sleep(10000);
 		ee.sendKeys("Ashadulla");
 		driver.findElement(By.id("LastName")).sendKeys("Shaik");
 		driver.findElement(By.id("GmailAddress")).sendKeys("ashhadullaaah");
 		driver.findElement(By.name("Passwd")).sendKeys("ashu123456");
 		driver.findElement(By.name("PasswdAgain")).sendKeys("ashu123456");
 		//div tag selection month using actions
 		Actions a=new Actions(driver);
 		WebElement e=driver.findElement(By.xpath("//label[@class='month']"));
 		a.click(e).build().perform();
 		a.sendKeys("o").build().perform();
 		a.sendKeys(Keys.ENTER).build().perform();
 		driver.findElement(By.name("BirthDay")).sendKeys("25");
 		driver.findElement(By.name("BirthYear")).sendKeys("1992");
 		WebElement e1=driver.findElement(By.xpath("//div[@title='Gender']"));
 		a.click(e1).build().perform();
 		a.sendKeys("m").build().perform();
 		a.sendKeys(Keys.ENTER).build().perform();
 		driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("9071151402");
 		driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("ashudulla@gmail.com");
 		Thread.sleep(5000);
 		driver.findElement(By.name("submitbutton")).click();
 		for(int i=0;i<20;i++){
 		a.sendKeys(Keys.DOWN).build().perform();	}
 		Thread.sleep(3000);
 		driver.findElement(By.id("iagreebutton")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.id("next-button")).click(); 
 		//20 seconds gap to enter mobile code
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.findElement(By.name("VerifyPhone")).click();  
 		Thread.sleep(5000);
 		driver.close();
 		
	}

}
