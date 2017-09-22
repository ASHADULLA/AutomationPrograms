package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:/MindQSelenium/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://semantic-ui.com/modules/dropdown.html");
driver.manage().window().maximize();
Thread.sleep(5000);
JavascriptExecutor js= (JavascriptExecutor) driver;
//Scroll page to bottom
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//Scroll page to top
Thread.sleep(5000);
js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
Thread.sleep(5000);
WebElement e=driver.findElement(By.xpath("//div[@class='ui selection dropdown error']"));
js.executeScript("arguments[0].scrollIntoView();",e);
js.executeScript("arguments[0].style.border='2px dotted blue';",e);
Thread.sleep(5000);
js.executeScript("arguments[0].setAttribute('disable',true);",e);




	}

}
