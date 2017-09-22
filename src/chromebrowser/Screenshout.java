//Program to take google home page screenshot and search result screenshot
package chromebrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshout {
	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "E://MindQSelenium//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
Thread.sleep(5000);
File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f2=new File("E://Screenshots/G_Home.png");
FileUtils.copyFile(f1, f2);
Thread.sleep(5000);
driver.findElement(By.name("q")).sendKeys("Mits Madanapalle",Keys.ENTER);
File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f4=new File("E://Screenshots/G_Home1.png");
FileUtils.copyFile(f3, f4);
Thread.sleep(5000);
	}

}
