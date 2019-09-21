import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getAllPredictionText {

	WebDriver driver;
	@BeforeTest
	public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\BrowserExecutables\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		
	}
	
	@Test
    public void logic() {
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("selenium");
		try {
			Thread.sleep(3000);
			int length=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li")).size();
			System.out.println(length);
			String str1="//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[";
			String str2="]/div/div[1]/div/span";
			for(int i=1;i<length;i++) {
				String text=driver.findElement(By.xpath(str1+i+str2)).getText();
				System.out.println(text);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}	
	}
	
	@AfterTest
    public void afterTest() {
		driver.close();
	}

	
}
