package fileHandling;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Test {
		static WebDriver driver;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
		       String downloadFilepath = "C:\\";
	 
		       HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		       chromePrefs.put("profile.default_content_settings.popups", 0);
		       chromePrefs.put("download.default_directory", downloadFilepath);
		       
		       ChromeOptions options = new ChromeOptions();
		       options.setExperimentalOption("prefs", chromePrefs);
		       options.addArguments("--test-type");
		       options.addArguments("--disable-extensions"); //to disable browser extension popup
		       options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	 
		       driver = new ChromeDriver(options);  
		                driver.get("http://www.seleniumhq.org/download/");
		                driver.findElement(By.linkText("32 bit Windows IE")).click();
		}
	}
