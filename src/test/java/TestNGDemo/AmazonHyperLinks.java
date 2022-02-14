package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHyperLinks {
	
	WebDriver driver= null;
  
 @Test
    
	  public void HyperLinkSelection() throws InterruptedException 
	  {
	   Thread.sleep(3000);
	    	
	  
	   //Linktext
	  driver.findElement(By.linkText("Gift Cards")).click();
	  Reporter.log("Gift cards link is selected");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	  Thread.sleep(3000);
	  Reporter.log("Navigated url : " + driver.getCurrentUrl());
	   

	   
	  //PartialLinkText
	  driver.findElement(By.partialLinkText("Service")).click();
	  Reporter.log("CustomerService link is selected");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	  Thread.sleep(3000);
	  Reporter.log("Navigated url : " + driver.getCurrentUrl());
	
	  
	    	   
 }
 
 
  @BeforeTest
	  
	  public void beforeTest() throws InterruptedException 
	  {
	    
	    //Setting the Chrome driver version 90 path
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  //To launch the url
	  driver.get("https://www.amazon.com/");
	  
	  Reporter.log("Amazon Page is launched successsfully");
	  
	  //To get the page title
	  Reporter.log("Page Title : " + driver.getTitle());
	  
	  //To get the page url
	  Reporter.log("Page Current Url : " + driver.getCurrentUrl());
	  
	  //To maximize the browser
	  driver.manage().window().maximize();
	  Reporter.log("Page is scrolled by pixel");
	  
	  //Implicit wait
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   Thread.sleep(200);

  }
  
  
   @AfterTest
	public void afterTest() {

		System.out.println("Done");
		// To close the current browser
		driver.close();

		// To exit the browser instance
		driver.quit();

	}
  }
