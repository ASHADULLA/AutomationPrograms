package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Sbi_Login {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "E://MindQSelenium//operadriver.exe");
		WebDriver d1=new OperaDriver();
		d1.get("https://retail.onlinesbi.com/retail/login.htm");
		Thread.sleep(3000);
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//div[@id='phishing_banner']/div[@class='continue_btn']")).click();
		d1.findElement(By.xpath("//INPUT[@id='username']")).sendKeys("ASHADULLA");
		d1.findElement(By.xpath("//INPUT[@id='label2']")).sendKeys("abc"); 
		d1.findElement(By.xpath("//INPUT[@id='Button2']")).click();
		Thread.sleep(3000);
	
		d1.findElement(By.linkText("Logout")).click();
		
	
	}

}
