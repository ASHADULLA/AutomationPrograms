package Autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Guru_Demo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E://MindQSelenium//chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.guru99.com/become-an-instructor.html");
		d1.manage().window().maximize();
		Thread.sleep(2000);
		d1.switchTo().frame("JotFormIFrame-71343386835462");
		d1.findElement(By.xpath("//*[@id='input_1']")).sendKeys("Ashadulla");
		d1.findElement(By.xpath(".//*[@id='input_2']")).sendKeys("aasa@gmail.com");
		d1.findElement(By.xpath(".//*[@id='input_3']")).sendKeys("Hello Guru....");
		d1.findElement(By.xpath(".//*[@id='cid_7']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:/MindQSelenium/Fileupload.exe");
		

	}

}
