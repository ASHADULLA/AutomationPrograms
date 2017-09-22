package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DiasableElement {

public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "E://MindQSelenium//chromedriver.exe");
WebDriver d1=new ChromeDriver();
d1.get("http://newtours.demoaut.com/");
d1.manage().window().maximize();
Thread.sleep(2000);
d1.findElement(By.linkText("REGISTER")).click();
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor) d1;
//js.executeScript("document.getElementById('firstName').setAttribute('disabled',true)");
String todisable = "document.getElementsByName('firstName')[0].setAttribute('disabled', '');";
js.executeScript(todisable);
Thread.sleep(10000);

d1.findElement(By.name("lastName")).sendKeys("Shaik");
d1.findElement(By.name("phone")).sendKeys("9949457356");
d1.findElement(By.name("userName")).sendKeys("ashudulla@gmail.com");
d1.findElement(By.name("address1")).sendKeys("appa street");
d1.findElement(By.name("address2")).sendKeys("Bangalore Road");
d1.findElement(By.name("city")).sendKeys("Madanapalle");
d1.findElement(By.name("state")).sendKeys("Andhra Pradseh");
d1.findElement(By.name("postalCode")).sendKeys("517325");
Select drpCountry=new Select(d1.findElement(By.name("country")));
drpCountry.selectByVisibleText("INDIA");
d1.findElement(By.name("email")).sendKeys("ashudulla@gmail.com");
d1.findElement(By.name("confirmPassword")).sendKeys("12345");
d1.findElement(By.name("password")).sendKeys("12345");
d1.findElement(By.name("register")).click();
}
}