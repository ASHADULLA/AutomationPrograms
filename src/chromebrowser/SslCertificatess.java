package chromebrowser;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertificatess {

	public static void main(String[] args) throws InterruptedException {
	//Before using below two lines first change date in ur system
	//For Chrome Browser
		
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME, "IE");
	dc.setCapability(InternetExplorerDriver.
	  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

	//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	//For Chrome browser
	//FirefoxProfile pf=new FirefoxProfile();
	//pf.setAcceptUntrustedCertificates(true);
	//pf.setAssumeUntrustedCertificateIssuer(false);
	System.setProperty("webdriver.ie.driver", "E://MindQSelenium//IEDriverServer.exe");
	// pass Desired Capabilities class object dc into web driver object 
	WebDriver driver=new InternetExplorerDriver(dc);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("http://www.google.co.in/");
	}

}
