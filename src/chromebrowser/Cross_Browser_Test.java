package chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Cross_Browser_Test {
	public static WebDriver driver;
	public static int browser;
	public static String BrowserName;

	public static void main(String[] args)throws Exception {
		for(browser=1; browser<=3; browser++){
			if(browser == 1){
			System.setProperty("webdriver.chrome.driver", "E:\\MindQSelenium\\chromedriver.exe");
			Thread.sleep(5000);
			driver=new ChromeDriver();
			BrowserName="Google Chrome Browser";
			}
			else if(browser == 3){
				System.setProperty("webdriver.gecko.driver", "E:\\MindQSelenium\\geckodriver.exe");
				Thread.sleep(5000);
				driver=new FirefoxDriver();
				BrowserName="Mozilla Firefox Browser";
			}
			else if(browser == 2){
				System.setProperty("webdriver.ie.driver", "E:\\MindQSelenium\\IEDriverServer.exe");
				Thread.sleep(5000);
				driver=new InternetExplorerDriver();
				BrowserName="Internet Explorer";
			}
			driver.get("http://www.google.co.in");
			String PageTitle=driver.getTitle();
			if(PageTitle.equals("Google")){
			System.out.println(BrowserName+ " :Google Launched - passed");
			}
			else{
				System.out.println(BrowserName+ ": Google Chrome Launched - Failed");
				}
			driver.close();
		}
			
	}
}
