package webAutomation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class WindowHandles {
	
	WebDriver driver;

	    @BeforeTest
	    public void BeforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashirbad\\com.TestApplication\\BrowserExecutables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");	
	   }
	
	    @Test  
	    public void getWindowCount() {
	   
	    String parent=driver.getWindowHandle();
	    System.out.println("Parent window"+parent);
	    
		Set<String>window=driver.getWindowHandles();
		int count=1;
		Iterator<String>itr=window.iterator();
		while(itr.hasNext()) {
			String AllOpenWindow=itr.next();
			System.out.println("This is window number"+count+": "+AllOpenWindow);
			count++;
			if(!parent.equalsIgnoreCase(AllOpenWindow)) {
			driver.switchTo().window(AllOpenWindow);
			driver.close();
			driver.switchTo().window(parent);	
			//System.out.println("This is window number"+count+": "+AllOpenWindow);
			}
		  }
		}	
	    @AfterTest
		public void afterTest(){
			driver.quit();
		}
		
	/*
	 * 
CDwindow-3D35D43CB496EAEEE4E735CE2D8E72BD
CDwindow-4CB2D041302E95947B1A67FEA502FFEF
CDwindow-AA05D50B72B44B3F6EA02A5CBA634999
	 */
	
}
