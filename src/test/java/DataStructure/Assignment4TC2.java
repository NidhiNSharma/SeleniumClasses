package DataStructure;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment4TC2 {
	
	WebDriver driver =null;
  
 @Test
  public void f() throws InterruptedException, IOException 
 
 {
	   
	
	  

      driver.findElement(By.linkText("Sign in")).click();
	  Thread.sleep(1000);
      Reporter.log("Page opened Sucsessfully");
      
      driver.findElement(By.id("email_create")).sendKeys("yt787y7yuyu");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("authentication")).click();
	  
	  Reporter.log("Invalid email address");
	  
	  //Take screenshot
	   TakesScreenshot ts = (TakesScreenshot)driver; //Typecasting to TakesScreenshot interface
	   File sourcepath = ts.getScreenshotAs(OutputType.FILE); //Temporary Location
	   
	   File targetpath = new File("ScreenShot\\deepak.png"); //Specifying the file path to save
	   FileUtils.copyFile(sourcepath, targetpath); //Copying the file     
	   Reporter.log("Taken the Screenshot successsfully");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	 
	  //To launch the url
	  driver.get("https://www.google.com"); //Method 1
	  
	  driver.navigate().to("http://automationpractice.com/index.php"); //method 2
	 
	  
	 //To maximize the browser
	  driver.manage().window().maximize(); 
  }

  @AfterTest
  public void afterTest() {
	  
	  Reporter.log("Done");
			// To close the current browser
			driver.close();

			// To exit the browser instance
			driver.quit();
  }

}
