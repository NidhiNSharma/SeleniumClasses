package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Assignment4TC1 {
	
	WebDriver driver = null;
  @Test
  public void f() throws InterruptedException {
	  
	  //TC 2
	  driver.findElement(By.linkText("Sign in")).click();
	  Reporter.log("Sign In link is selected");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	  Thread.sleep(300);
	  Reporter.log("Navigated url : " + driver.getCurrentUrl());
	 
	  //TC3
	  driver.findElement(By.id("email_create")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("email_create")).sendKeys("nidhi.sharma157@gmail.com");
	  Thread.sleep(1000);
  
      //TC4
	  
	  //driver.findElement(By.linkText("Create an account")).click();
	  driver.findElement(By.id("SubmitCreate")).click();
	  Reporter.log(" Create an account link is selected");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	  Thread.sleep(3000);
	  Reporter.log("Navigated url : " + driver.getCurrentUrl());
	 
	  //TC 5
     
	  
	  Thread.sleep(3);
	  
	  WebElement radiobutton =null;
	  radiobutton =  (driver.findElement(By.id("id_gender2"))) ;
  
      if(radiobutton!=null)
       { 
    	  radiobutton.click();
    	  Thread.sleep(3000);
    }else 
    {
  
    			  Reporter.log("Webelement is Displayed" +driver.findElement(By.id("id_gender1")).isDisplayed());
    			 
    			  Reporter.log("Webelement is enabled" + driver.findElement(By.id("id_gender1")).isEnabled());
   
    			  driver.findElement(By.id("id_gender1")).click();
    			  Reporter.log("Radio Button2 is selected successsfully");
    		      Thread.sleep(3000);
    	   }
    	
  
      // Get the WebElement corresponding to the First Name
       driver.findElement(By.id("customer_firstname")).sendKeys("Nidhi");	
       Reporter.log("First Name Entered");
	  Thread.sleep(1000);
      
	  // Get the WebElement corresponding to the Last Name
      driver.findElement(By.id("customer_lastname")).sendKeys("Sharma");
      Reporter.log("Last Name Entered");
      Thread.sleep(1000);		
       
      // Password
       driver.findElement(By.id("passwd")).sendKeys("j@b@lpur1");
       Thread.sleep(1000);
     
       driver.findElement(By.id("address1")).sendKeys("48,TC Road");
       Thread.sleep(1000);
      // City
       driver.findElement(By.id("city")).sendKeys("Sparta");
       Thread.sleep(1000);
      // State Dropdown
       WebElement dropdownstate = driver.findElement(By.id("id_state"));
       Select dropdownvalue = new Select(dropdownstate);
       //SelectByIndex
	   dropdownvalue.selectByIndex(31);
	   Reporter.log("Selected using index : 31 ");
	   Thread.sleep(2000);  
	   
	   //Zip/Postal Code 
	   driver.findElement(By.id("postcode")).sendKeys("07871");
       Thread.sleep(1000);
	    
       //Country
    // State Dropdown
       WebElement dropdowncoun = driver.findElement(By.id("id_state"));
       Select dropdownval = new Select(dropdowncoun);
       //SelectByIndex
	   dropdownval.selectByIndex(21);
	   Reporter.log("Selected using index : 21 ");
	   Thread.sleep(2000);  
	   
	   //Phone Number
	   driver.findElement(By.id("phone_mobile")).sendKeys("201-553-675");
       Thread.sleep(1000);
					
      driver.findElement(By.id("submitAccount")).click();					
      Thread.sleep(1000);
      Reporter.log("Login Done with Register");				
      
	  
      }
  

@BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	//TC1
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		  
		  //To launch the url
		  driver.get("http://automationpractice.com/index.php ");
		  
		  Reporter.log(" Page is launched successsfully");
		  
		  //To get the page title
		  Reporter.log("Page Title : " + driver.getTitle());
		  
		  //To get the page url
		  Reporter.log("Page Current Url : " + driver.getCurrentUrl());
		  
		  //To maximize the browser
		  driver.manage().window().maximize();
		  Reporter.log("Page is scrolled by pixel");
		  
		  //Implicit wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   Thread.sleep(300);
		   
		  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	 // driver.quit();
  }

}
