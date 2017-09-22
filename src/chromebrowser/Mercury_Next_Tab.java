package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Mercury_Next_Tab {

	

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.opera.driver", "E://MindQSelenium//operadriver.exe");
	WebDriver d1=new OperaDriver();
	d1.get("http://newtours.demoaut.com/");
	d1.manage().window().maximize();
	Thread.sleep(2000);
	d1.findElement(By.linkText("REGISTER")).click();
	Thread.sleep(2000);
	d1.findElement(By.name("firstName")).sendKeys("Ashadulla",Keys.TAB,"Shaik",Keys.TAB,"9949457356",Keys.TAB,"ashudulla@gmail.com");
	Thread.sleep(5000);
	d1.close();
	}
	}