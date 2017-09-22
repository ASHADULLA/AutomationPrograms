package chromebrowser;

//import java.util.Scanner;  
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Way2Sms {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.opera.driver", "E://MindQSelenium//operadriver.exe");
		WebDriver d1=new OperaDriver();
		d1.get("http://site24.way2sms.com/content/index.html?");
		Thread.sleep(3000);
	   // Scanner sc=new Scanner(System.in);
	    d1.manage().window().maximize();
	    //System.out.println("Enter n vallue: ");
	   // int n=sc.nextInt();
	   // sc.close();
		d1.findElement(By.xpath("//INPUT[@id='username']")).sendKeys("9949457356");
		d1.findElement(By.xpath("//INPUT[@id='password']")).sendKeys("ashuhacker");
		d1.findElement(By.id("loginBTN")).click();
		/*Thread.sleep(3000);
		for(int i=1;i<=n;i++){
		d1.findElement(By.xpath("//*[@id='sendSMS']/a")).click();
		Thread.sleep(2000);
		d1.switchTo().frame("frame");
		d1.findElement(By.id("mobile")).sendKeys("9949457356");
		d1.findElement(By.id("message")).sendKeys("Hello This is Ashadulla, This is a Test Automation Message from way2sms.com");
		Thread.sleep(2000);
		d1.findElement(By.name("Send")).click();
		Thread.sleep(5000);
		d1.switchTo().defaultContent();
		Thread.sleep(5000);
		System.out.println("Message has been submitted successfully "+i);
		}
		*/
		//Thread.sleep(3000);
		//d1.findElement(By.xpath("//*[@id='sentSMS']/a"));
		Thread.sleep(3000);
		// select day greetings and send to ur favourite
		d1.findElement(By.xpath("//*[@id='smsGreets']/a")).click();
		d1.switchTo().frame("frame");
		//d1.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]/div/input")).click();//1st day morning sms
		//d1.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/div/input")).click();//2nd day morning sms
		d1.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/div/input")).click();//3rd day morning sms
		//d1.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/div/input")).click();//4th day morning sms
		//d1.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/div/input")).click();//5th day morning sms
		//d1.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/div/input")).click();//6th day morning sms
		// here pop up box opens
		 ArrayList<String> al=new ArrayList<String>(d1.getWindowHandles());
		 System.out.println(al.size());
		 d1.switchTo().defaultContent();
		 d1.switchTo().frame("nmeSMSFrame");
		d1.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9949457356");
		d1.findElement(By.xpath("//*[@id='Send']")).click();
		Thread.sleep(3000);
		//d1.findElement(By.xpath("//*[@class='chati cloi']")).click();// close popup window ////*[@id="nmSMSDIV"]/a/i
		//Thread.sleep(3000);
		d1.switchTo().defaultContent();
		d1.findElement(By.xpath("//li[@class='lout']")).click();//
		d1.close();
		d1.quit();
	}
	
}
		