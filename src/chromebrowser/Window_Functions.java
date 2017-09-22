package chromebrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Window_Functions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "E://MindQSelenium//operadriver.exe");
		WebDriver d1=new OperaDriver();
		d1.get("http://site24.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		d1.manage().window().maximize();
		int x=d1.manage().window().getSize().getHeight();
		int y=d1.manage().window().getSize().getWidth();
		System.out.println(x+" "+y);
		Dimension di=new Dimension(500,1000);
		d1.manage().window().setSize(di);
		int a=d1.manage().window().getPosition().getX();
		int b=d1.manage().window().getPosition().getY();
		System.out.println(a+" "+b);
		Point p=new Point(200,300);
		d1.manage().window().setPosition(p);
		}

}
