package SeleniumBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class ScreenShot {
	
	WebDriver driver = null;
	  
	  @Test
	  public void CaptureScreenshot() throws IOException 
	  {
	   //Take screenshot
	   TakesScreenshot ts = (TakesScreenshot)driver; //Typecasting to TakesScreenshot interface
	   File sourcepath = ts.getScreenshotAs(OutputType.FILE); //Temporary Location
	   
	   //ts.getScreenshotAs(OutputType.FILE);
	   
	   File targetpath = new File(".\\ScreenShot\\pages89.png"); //Specifying the file path to save
	   FileUtils.copyFile(sourcepath, targetpath); //Copying the file     
	   Reporter.log("Taken the Screenshot successsfully");
	  }

  @BeforeTest
	  
	  public void beforeTest() throws InterruptedException
	   {
		  
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
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		   Thread.sleep(3);

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