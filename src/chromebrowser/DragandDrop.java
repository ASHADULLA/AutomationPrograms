package chromebrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "E://MindQSelenium//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/droppable/");
Thread.sleep(5000);
File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f2=new File("E://Screenshots/DragDrop.png");
FileUtils.copyFile(f1,f2);
driver.switchTo().frame(0);
WebElement e1=driver.findElement(By.xpath("//*[@id='draggable']"));
WebElement e2=driver.findElement(By.xpath("//*[@id='droppable']"));
Actions a=new Actions(driver);
a.dragAndDrop(e1,e2).build().perform();
File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f4=new File("E://Screenshots/DragDroppped.png");
FileUtils.copyFile(f3,f4);
Thread.sleep(5000);
driver.close();
	}
}
