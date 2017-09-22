package chromebrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromefaceboklogin1 {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:/MindQSelenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        WebElement element1 = driver.findElement(By.id("email"));
        element1.sendKeys("9949457356");

        WebElement element2 = driver.findElement(By.id("pass"));
        element2.sendKeys("Ashu,128793#");

        WebElement element3 = driver.findElement(By.id("u_0_r"));
        element3.click();

        System.out.println("Login");

        WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
        lstitem.click();

        driver.manage().timeouts().implicitlyWait(600,TimeUnit.SECONDS);

        driver.findElement(By.partialLinkText("Log Out")).click();

        System.out.println("Log out");


	
	}

}
