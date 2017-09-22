package chromebrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class Upload {

public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "E://MindQSelenium//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.get("http://demo.guru99.com/selenium/upload/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.name("uploadfile_0")).sendKeys("E://java wipro practice.txt");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='terms']")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("submitbutton")).click();
	System.out.print(driver.getCurrentUrl());
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(5000);
	ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(al.get(0));
	Thread.sleep(5000);
	driver.switchTo().window(al.get(1));
	driver.navigate().to("https://www.guru99.com/selenium-tutorial.html");
	Thread.sleep(5000);
	Keyboard keyboard = ((HasInputDevices) driver).getKeyboard();
	keyboard.pressKey(Keys.ALT);
	keyboard.pressKey(Keys.CONTROL);
	keyboard.pressKey(Keys.DELETE);
	keyboard.releaseKey(Keys.ALT);
	keyboard.releaseKey(Keys.CONTROL);
	keyboard.releaseKey(Keys.DELETE);
	Thread.sleep(5000);
	driver.close();
	}

}
