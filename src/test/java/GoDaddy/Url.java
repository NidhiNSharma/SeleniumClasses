

// TESTCASE 1

package GoDaddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Url  {
	
	WebDriver Driver = null;
	
	
  
	@Test
  public void launch() {
		
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		  Driver = new ChromeDriver();
		  
		
		  Driver.get("https://www.google.com"); 
		  
		  Driver.navigate().to("https://www.godaddy.com");  	
		
		
		
		
			
  }
	
	
	  @BeforeTest 
	  public void beforeTest() {
	  	  
	  
	  }
	 

  @AfterTest
  public void afterTest() {
	  

	  Driver.close();
	  
	  Driver.quit();
  }

}
