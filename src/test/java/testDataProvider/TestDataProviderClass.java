package testDataProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelReader.ExcelReader;

public class TestDataProviderClass {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashirbad\\com.TestApplication\\BrowserExecutables\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		capabilities.setCapability("chrome.binary", "<Path to binary>");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		driver=new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru");
	}
	
	@DataProvider
	public Iterator<Object[]> data()throws IOException{
		ArrayList<Object[]>al1=ExcelReader.getDataFromExcel();
		return al1.iterator();	
	}

	
  @Test(dataProvider="data")
  public void dataProviderExample(String firstname, String lastname, String address1, String address2, String city, String state, String zipcode, String emailaddress) {
	 driver.findElement(By.id("firstname")).sendKeys(firstname);
	 driver.findElement(By.id("lastname")).sendKeys(lastname);
	 driver.findElement(By.id("address1")).sendKeys(address1);
	 driver.findElement(By.id("address2")).sendKeys(address2);
	 driver.findElement(By.id("city")).sendKeys(city);
	 driver.findElement(By.id("state")).sendKeys(state);
	 driver.findElement(By.id("emailaddress")).sendKeys(emailaddress);
	 driver.close();
	 
	  
	  
  }
	

	
}
