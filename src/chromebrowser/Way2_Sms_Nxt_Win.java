package chromebrowser;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Way2_Sms_Nxt_Win {

	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.opera.driver", "E://MindQSelenium//operadriver.exe");
			WebDriver d1=new OperaDriver();
			d1.get("http://site24.way2sms.com/content/index.html?");
			Thread.sleep(3000);
			d1.manage().window().maximize();
			
			d1.findElement(By.xpath(".//*[@id='Login']/div[1]/div/a/img")).click();
			Thread.sleep(10000);
			//Count Browser Window On Desktop
			ArrayList<String> al=new ArrayList<String>((d1.getWindowHandles()));
			System.out.println(al.size());
			//Display Browser Window Handles
			for(int i=0;i<al.size();i++){
				System.out.println(al.get(i));
			}
			//Switch to 2nd window browser
			d1.switchTo().window(al.get(1));
			d1.close();
			Thread.sleep(5000);
			d1.switchTo().window(al.get(0));
			d1.close();
			Thread.sleep(5000);
			d1.quit();
			
	}

}
