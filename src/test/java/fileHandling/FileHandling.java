package fileHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileHandling {
	
	WebDriver driver;
	Logger log=Logger.getLogger(FileHandling.class);

	@BeforeTest
	public void preConditions() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		log.info("Chrome Driver object is created:");
		driver.manage().window().maximize();
		log.info("Driver maximization done:");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		log.info("Timeout is set to 10 secs:" );
		driver.get("http://demo.guru99.com/test/upload/");
		log.info("Url is launched");
	}
	@Test
	public void handlingFiles()throws InterruptedException{
	
		WebElement element=driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		element.sendKeys("C:\\Users\\Ashirbad\\Desktop\\DateSheet.xlsx");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		List<WebElement>lst=driver.findElements(By.xpath("//*[@id='res']/center"));
		
		String text= lst.get(0).getText()/*+lst.get(1).toString()*/;

		System.out.println("---"+text+"---");
		//Assert.assertEquals("1 file has been successfully uploaded.", text, "File Not Uploaded");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
