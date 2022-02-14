package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class GoogleBrowser {
  
	WebDriver Driver = null;
	
	
	@Test
  public void GoogleChrome() {
 
		Reporter.log("Google Home Page is launched successfully");
	
	
		//To get the page title
		String valuetitle = Driver.getTitle();
		    

		//Reporter.log("Page Title : " + Driver.getTitle()); METHOD 2
		    Reporter.log("Page Title : " + valuetitle);


		//To get the url of the page    
		    Reporter.log("Page Current Url : " + Driver.getCurrentUrl());


		//To get the page source
		    Reporter.log("Page Source : " + Driver.getPageSource());
	
	}
	
	@BeforeTest
	public void beforeTest() {
 

		System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		  Driver = new ChromeDriver();
		  
		//To launch the url
		  Driver.get("https://www.google.com"); //Method 1
		 
		  //To maximize the browser
		  Driver.manage().window().maximize();
  
  
   }

  @AfterTest
  public void afterTest() {
	  
	
  }

}
