package SeleniumBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class IFrame {
	
	WebDriver driver = null;
  @Test

	  
	  public void IframeOperation() throws InterruptedException
	  { 
	   
	      //  driver.get("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
	        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='eduFooterWrap']//iframe[1]")));
	        Thread.sleep(5000);
	        Reporter.log("Identifying the IFrame ");   
	        
	        //Performing operation inside the IFrame
	        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SoftwareTestingHelp.com");
	        Thread.sleep(5000);
	        Reporter.log("Entering the value for the edit which is placed inside the frame");
	        
	        //Switch to the page
	        driver.switchTo().defaultContent();
	        
	        Reporter.log("Switching to the default page");
	     
	   
	  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	 
	  //To launch the url
	  driver.get("https://www.google.com"); //Method 1
	  
	  driver.navigate().to("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/"); //method 2
	 
	  
	 //To maximize the browser
	  driver.manage().window().maximize(); 
  }

  @AfterTest
	  
	  public void tearDown() throws Exception {
		   Reporter.log("Inside tearDownTest");
		  //To close the current browser
		   driver.close();
		   
		   //To exit the browser instance
		   driver.quit();
		     
  }

}
