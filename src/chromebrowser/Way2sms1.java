package chromebrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Way2sms1 {public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.opera.driver", "E://MindQSelenium//operadriver.exe");
	WebDriver d1=new OperaDriver();
	d1.get("http://site24.way2sms.com/content/index.html?");
	Thread.sleep(5000);
	d1.manage().window().maximize();
	d1.findElement(By.xpath("//INPUT[@id='username']")).sendKeys("9949457356");
	d1.findElement(By.xpath("//INPUT[@id='password']")).sendKeys("ashuhacker");
	d1.findElement(By.id("loginBTN")).click();
	Thread.sleep(5000);
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter n value: ");
	int n=sc.nextInt();
	for (int i=1;i<=n;i++){
	d1.findElement(By.xpath("//li[@id='sendSMS']")).click();
	Thread.sleep(5000);
	d1.switchTo().frame("frame");
	d1.findElement(By.id("mobile")).sendKeys("9949457356");
	d1.findElement(By.id("message")).sendKeys("Hello This is msg, This is a Test Automation Message from way2sms.com");
	Thread.sleep(5000);
	d1.findElement(By.name("Send")).click();
	Thread.sleep(5000);
	String x=d1.findElement(By.className("mess")).getText(); //get message printed after sms sent in the web page.
	if(x.contains("Message has been submitted successfully.")) // compare message printed and confirm sent status success or fail
	{
		System.out.println(x+" "+i);
	}
	d1.switchTo().defaultContent();
	sc.close();
}
}}