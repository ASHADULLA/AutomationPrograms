package chromebrowser;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MultiSelect {
public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "E://MindQSelenium//chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(5000);
driver.get("http://jqueryui.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Selectable")).click();
driver.switchTo().frame(0);
WebElement e1=driver.findElement(By.xpath("//*[text()='Item 1']"));
WebElement e2=driver.findElement(By.xpath("//*[text()='Item 2']"));
Actions a=new Actions(driver);
a.keyDown(Keys.CONTROL).doubleClick(e1).doubleClick(e2).keyUp(Keys.CONTROL).build().perform();




	}

}
