package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Assignment3TC2 {
	
	WebDriver driver = null;
 
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(300);
  	
	  
	 
 //RadioButton
	  //Is Displayed
	  Reporter.log("Radiobutton:" +driver.findElement(By.id("female")).isDisplayed());
	  //Is Enabled
	  Reporter.log("Radiobutton:" + driver.findElement(By.id("female")).isEnabled());
	 
	  //To select the specific radio button
	  driver.findElement(By.id("female")).click();
	  Reporter.log("Radio Button is selected successsfully");
      Thread.sleep(3000); 
  
 //Checkbox1
      
      //Is Displayed
	  Reporter.log("Checkbox1:" +driver.findElement(By.id("tuesday")).isDisplayed());
	  //Is Enabled
	  Reporter.log("Checkbox1:" + driver.findElement(By.id("tuesday")).isEnabled());
      
	  //To select the particular checkbox
	  driver.findElement(By.id("tuesday")).click();
	  
	  Reporter.log("‘Which days of the week are best to start something new?'");
	  Thread.sleep(3000);
	  
 //Checkbox2
      
      //Is Displayed
	  Reporter.log("Checkbox2:" +driver.findElement(By.id("friday")).isDisplayed());
	  //Is Enabled
	  Reporter.log("Checkbox2:" + driver.findElement(By.id("friday")).isEnabled());
      
	  //To select the particular checkbox
	  driver.findElement(By.id("friday")).click();
	  
	  Thread.sleep(3000);
  
  }
  @BeforeTest
	  
	  public void Test() throws InterruptedException {
		  
	//Setting the Chrome driver version 90 path
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		  
		  //To launch the url
		  driver.get("https://itera-qa.azurewebsites.net/home/automation ");
		  
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

