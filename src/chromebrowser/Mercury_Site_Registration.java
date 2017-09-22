package chromebrowser;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Mercury_Site_Registration {
public static void main(String[] args) throws Exception {
	
System.out.println("Enter avd or ard or Computer: ");
Scanner sc=new Scanner(System.in);
String device=sc.nextLine();
WebDriver d1;
if(device.equals("avd"))
{
DesiredCapabilities c=new DesiredCapabilities();
c.setCapability(CapabilityType.BROWSER_NAME,"Browser" );
c.setCapability("deviceName", "emulator-5554");
c.setCapability("platformName", "andriod");
c.setCapability("platformVersion", "5.1.1");
//URL u=new URL("http://0.0.0.0:4723/wd/hub");
URL u=new URL("http://127.0.0.1:4723/wd/hub");
d1=new AndroidDriver(u,c);
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
	d1=new AndroidDriver(u,c);
	}

else{
	System.setProperty("webdriver.chrome.driver", "E:/MindQSelenium/chromedriver.exe");
	 d1 = new ChromeDriver(); 
}

d1.get("http://newtours.demoaut.com");
//Thread.sleep(10000);
JavascriptExecutor js=(JavascriptExecutor) d1;
WebElement e=d1.findElement(By.linkText("REGISTER"));
js.executeScript("arguments[0].click()",e);
Thread.sleep(10000);
WebElement e1=d1.findElement(By.name("firstName"));
js.executeScript("arguments[0].value='Ashadulla'",e1);
js.executeScript("document.getElementsByName('lastName')[0].value='Shaik'");
js.executeScript("document.getElementsByName('phone')[0].value='9949457356'");
js.executeScript("document.getElementsByName('userName')[0].value='ashudulla@gmail.com'");
js.executeScript("document.getElementsByName('address1')[0].value='apparao street'");
js.executeScript("document.getElementsByName('address2')[0].value='Bangalore Road'");
js.executeScript("document.getElementsByName('city')[0].value='Madanapalle'");
js.executeScript("document.getElementsByName('state')[0].value='Andhra Pradesh'");
js.executeScript("document.getElementsByName('postalCode')[0].value='517325'");
//WebElement e2=d1.findElement(By.name("country"));
//Actions a=new Actions(d1);
//a.click(e2).build().perform();
//Thread.sleep(5000);
//a.sendKeys("UNITED STATES").build().perform();
js.executeScript("document.getElementsByName('email')[0].value='ashudulla@gmail.com'");
js.executeScript("document.getElementsByName('confirmPassword')[0].value='12345'");
js.executeScript("document.getElementsByName('password')[0].value='12345'");
js.executeScript("document.getElementsByName('postalCode')[0].value='517325'");
WebElement e2=d1.findElement(By.name("register"));
js.executeScript("arguments[0].click()",e2);
Thread.sleep(5000);
d1.close();
}
}