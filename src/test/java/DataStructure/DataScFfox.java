package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class DataScFfox {
	
	
	WebDriver driver = null;
   
	
 @Test
  public void LaunchFF() {
	  
	 
	  // browser navigation commands
      
	 driver.navigate().back();
     Reporter.log("Page Title : " + driver.getTitle());
	 
	 
	 driver.navigate().forward();
      Reporter.log("Page Current Url : " + driver.getCurrentUrl());
	  
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Apps\\GeckoDriver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	 
	  //To launch the url
	  driver.get("https://www.google.com"); //Method 1
	  
	  driver.navigate().to("https://dsportalapp.herokuapp.com/"); //method 2
	 
	  
	 //To maximize the browser
	  driver.manage().window().maximize(); 
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
