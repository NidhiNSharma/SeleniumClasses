package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class DataScChrome1{
 
	WebDriver Driver = null;
  
	
  @Test
  public void Launch() {
	  
	  
	// browser navigation commands
      
	  Driver.navigate().back();
      Reporter.log("Page Title : " + Driver.getTitle()); 
	  
	  
	  Driver.navigate().forward();
      Reporter.log("Page Current Url : " + Driver.getCurrentUrl());
	  
}
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  Driver = new ChromeDriver();
	  
	 
	  //To launch the url
	  Driver.get("https://www.google.com"); //Method 1
	  
	  Driver.navigate().to("https://dsportalapp.herokuapp.com/"); //method 2
	 
	  
	 //To maximize the browser
	  Driver.manage().window().maximize(); 
	  
	 
  }

  @AfterTest
  public void afterTest() {
	  
	  Driver.close();
	  
	  Driver.quit();
	  
  }

}
