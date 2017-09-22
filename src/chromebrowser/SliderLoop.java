package chromebrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderLoop{

public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "E://MindQSelenium//chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(5000);
driver.get("http://jqueryui.com/");
driver.manage().window().maximize();
File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f2=new File("E://Screenshots/Jqueryuisite.png");
FileUtils.copyFile(f1, f2);
Thread.sleep(5000);
driver.findElement(By.linkText("Slider")).click();
File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f4=new File("E://Screenshots/horizontalSlider.png");
FileUtils.copyFile(f3, f4);
Thread.sleep(5000);
driver.switchTo().frame(0);
WebElement e=   driver.findElement(By.xpath("//*[@id='slider']"));
Thread.sleep(5000);
Actions a=new Actions(driver);
for(int i=0;i<20;i++){
a.click(e).sendKeys(Keys.RIGHT).build().perform();
//int x=e.getLocation().getX();
//int y=e.getLocation().getY();
//a.dragAndDropBy(e, x+50, y).build().perform();
Thread.sleep(5000);
File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f6=new File("E://Screenshots/horizontalSlider1.png");
FileUtils.copyFile(f5, f6);
//a.dragAndDropBy(e, x-150, y).build().perform();
a.click(e).sendKeys(Keys.LEFT).build().perform();
Thread.sleep(5000);
File f7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f8=new File("E://Screenshots/horizontalSlider2.png");
FileUtils.copyFile(f7, f8);
driver.switchTo().defaultContent();
// Vertical slider functionality

driver.findElement(By.linkText("Vertical slider")).click();
File f9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f10=new File("E://Screenshots/Verticalslider.png");
FileUtils.copyFile(f9, f10);
Thread.sleep(5000);
driver.switchTo().frame(0);
WebElement e1=driver.findElement(By.id("slider-vertical"));
a.click(e1).build().perform();
for(int j=0;j<20;j++){
	a.sendKeys(Keys.UP).build().perform();
}
//int x1=e1.getLocation().getX();
//int y1=e1.getLocation().getY();

File f11=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f12=new File("E://Screenshots/Verticalslider1.png");
FileUtils.copyFile(f11, f12);
Thread.sleep(5000);
//a.dragAndDropBy(e1, x1, y1-100);
a.click(e1).build().perform();
for(int j=0;j<20;j++){
	a.sendKeys(Keys.DOWN).build().perform();
}
File f13=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f14=new File("E://Screenshots/Verticalslider2.png");
FileUtils.copyFile(f13, f14);
Thread.sleep(5000);
driver.close();

	}

}
}
