
//TESTCASE 4


package GoDaddy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class PrintCU {
	
	WebDriver Driver = null;
 
		
	
 @Test
  public void f() {
	 
	 Reporter.log("Page Current Url : " + Driver.getCurrentUrl()); 
	 
		 
  }
  
 @BeforeTest
 public void beforeTest () {

 System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
 Driver = new ChromeDriver();
 

 Driver.get("https://www.google.com"); //Method 1
 
 Driver.navigate().to("https://www.godaddy.com");  
 
 Driver.manage().window().maximize(); 
	 
	  
	 
  }

  @AfterTest
  public void afterTest() {
	  
     Driver.close();
	  
	  Driver.quit();
  }
 
  
  
}


