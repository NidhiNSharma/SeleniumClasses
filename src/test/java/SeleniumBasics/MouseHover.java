package SeleniumBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class MouseHover {
	WebDriver driver = null;
  @Test
 
	  public void MouseHoverOperation() throws InterruptedException
	  {
	  
	  WebElement mainmenu1 = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	  WebElement mainsubmenu1 = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	 
	  Thread.sleep(3000); 
	  
	  Actions actobj = new Actions(driver);
	  actobj.moveToElement(mainmenu1).moveToElement(mainsubmenu1).click().perform();
	 
	  Reporter.log("Mouse Hover operation performed successfully");
	   
	  Thread.sleep(5000);
	  }
	  

  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	 
	  //To launch the url
	  driver.get("https://www.google.com"); //Method 1
	  
	  driver.navigate().to("https://demo.opencart.com/"); //method 2
	 
	  
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
