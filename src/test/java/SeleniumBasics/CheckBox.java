package SeleniumBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class CheckBox {
	
	WebDriver driver = null;
  
	@Test
 
  
	//To select the single checkbox	
	public void SpecificCheckBox () throws InterruptedException {
		  
		  //Is Displayed
		  Reporter.log("Checkbox:" +driver.findElement(By.id("checkbox1")).isDisplayed());
		  //Is Enabled
		  Reporter.log("Checkbox:" + driver.findElement(By.id("checkbox1")).isEnabled());
		 
		  //Is Selected
		  Reporter.log("Before checkbox status:" + driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());
	      
		  //To select the particular checkbox
		  driver.findElement(By.id("checkbox1")).click();
		
		  //Is Selected
		  Reporter.log("After checkbox status:"+driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());
		  
		  Reporter.log("Checkbox is selected successfully");
		  Thread.sleep(3000);
	      
	}
		  
	      //To select all the Checkbox using Dynamically
		  
		 /* @Test
	      
		  public void selectallcheckbox() throws InterruptedException {
  
	     //Java Collections - List
	     //Java for...each loop
			  
	    //select all the checkbox
			  List <WebElement> checkboxcount = driver.findElements(By.xpath("//input[@type='checkbox']"));
			  checkboxcount.size();
			  
			  Reporter.log("Dynamically number of checkbox is:" +checkboxcount.size()); //count of checkbox
			  
			  //using for..each loop
			  for (WebElement chkboxvalue : checkboxcount) //directly assigning to the webelement reads the checkboxes one after other
				  
			  {
			 
                 chkboxvalue.click(); //select the checkbox
				  Reporter.log("Selected Checkbox ID:" + chkboxvalue.getAttribute("id"));
				  Reporter.log("Selected Checkbox Value:" + chkboxvalue.getAttribute("value"));
			  }  
			  
			  Thread.sleep(30);
			  
		  }
	
	       private void click() {
			// TODO Auto-generated method stub
			
		}*/
	@BeforeTest
	  
	  public void beforeTest() throws InterruptedException {
		  
		  //Setting the Chrome driver version 90 path
		  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		  
		  //To launch the url
		  driver.navigate().to("http://demo.automationtesting.in/Register.html");
		  
		  Reporter.log("Page is launched successsfully");
		  
		  //To get the page title
		  Reporter.log("Page Title : " + driver.getTitle());
		  
		  //To get the page url
		  Reporter.log("Page Current Url : " + driver.getCurrentUrl());
		  
		  //To maximize the browser
		  driver.manage().window().maximize();
		  Reporter.log("Page is scrolled by pixel");
		  
		  //Implicit wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   Thread.sleep(3000);
  }

  @AfterTest
   
	  public void tearDown() throws Exception {
		   System.out.println("Inside tearDownTest");
		  //To close the current browser
		   driver.close();
		   
		   //To exit the browser instance
		   driver.quit();
		     
  }

}
