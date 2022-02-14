package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class BrowserNavigation {
 
   WebDriver driver = null;
   
	
	  @Test 
	  public void BrowserNav() { 
	 
		 
     // browser navigation commands
      driver.navigate().forward();
      Reporter.log("Page Current Url : " + driver.getCurrentUrl());
	  
	  
	  driver.navigate().back();
      Reporter.log("Page Title : " + driver.getTitle());
      
      driver.navigate().refresh();
      Reporter.log("Page Source : " + driver.getPageSource());

	  
	  }
   
   @BeforeTest
   public void beforeTest() {
  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	 
	  //To launch the url
	  driver.get("https://www.google.com"); //Method 1
	  
	  driver.navigate().to("https://www.facebook.com"); //method 2
	 
	  
	 //To maximize the browser
	  driver.manage().window().maximize(); 
	  
   }


  @AfterTest
  public void afterTest() {
 
  driver.close();
  
  driver.quit();
  
  
  }

}
