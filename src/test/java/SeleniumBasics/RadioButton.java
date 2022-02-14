package SeleniumBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

@Test
public class RadioButton {
	
	WebDriver driver = null;
  
  public void f() throws InterruptedException 
  {
	  
	  Thread.sleep(3);
  	
	  
	  Reporter.log("Inside Radio Button");
	  
	  
	  //Is Displayed
	  Reporter.log("Webelement is Displayed" +driver.findElement(By.xpath("//input[@value ='Male']")).isDisplayed());
	  //Is Enabled
	  Reporter.log("Webelement is enabled" + driver.findElement(By.xpath("//input[@value ='Male']")).isEnabled());
	 
	  
	  //To select the specific radio button
	  driver.findElement(By.xpath("//input[@value ='Male']")).click();
	  Reporter.log("Radio Button is selected successsfully");
      Thread.sleep(3);
      
      /*Is Displayed
	  Reporter.log("Webelement is Displayed" +driver.findElement(By.xpath("//input[@value ='FeMale']")).isDisplayed());
      //Is Enabled
	  Reporter.log("Webelement is enabled" + driver.findElement(By.xpath("//input[@value ='FeMale']")).isEnabled());
	 
	  
	  //To select the specific radio button
	  driver.findElement(By.xpath("//input[@value ='FeMale']")).click();
      Reporter.log("Radio Button is selected successsfully");
      Thread.sleep(3);*/
  
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
