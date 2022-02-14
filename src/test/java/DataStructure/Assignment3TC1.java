package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Assignment3TC1 {
	
	WebDriver driver = null;

  @Test
  
	  public void selection() throws InterruptedException 
	  {
	   Thread.sleep(300);
	    	
	  
	   //Linktext
	   driver.findElement(By.linkText("https://courses.letskodeit.com/practice")).click();
	  //driver.navigate().to("https://courses.letskodeit.com/practice");
	  Reporter.log("The Link is selected");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	  Thread.sleep(3000);
	  Reporter.log("Navigated url : " + driver.getCurrentUrl());
	  
	  //RadioButton
	  //Is Displayed
	  Reporter.log("Radiobutton:" +driver.findElement(By.xpath("//input[@value ='bmw']")).isDisplayed());
	  //Is Enabled
	  Reporter.log("Radiobutton:" + driver.findElement(By.xpath("//input[@value ='bmw']")).isEnabled());
	 
	  //To select the specific radio button
	  driver.findElement(By.xpath("//input[@value ='bmw']")).click();
	  Reporter.log("Radio Button is selected successsfully");
      Thread.sleep(3000);
      
      //Checkbox1
      
      //Is Displayed
	  Reporter.log("Checkbox:" +driver.findElement(By.id("bmwcheck")).isDisplayed());
	  //Is Enabled
	  Reporter.log("Checkbox:" + driver.findElement(By.id("bmwcheck")).isEnabled());
	 
	  //Is Selected
	  //Reporter.log("Before checkbox status:" + driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());
      
	  //To select the particular checkbox
	  driver.findElement(By.id("bmwcheck")).click();
	
	  //Is Selected
	 // Reporter.log("After checkbox status:"+driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());
	  
	  Reporter.log("Checkbox is selected successfully");
	  Thread.sleep(3000);
	  
	

  //Checkbox2
  
  //Is Displayed
  Reporter.log("Checkbox:" +driver.findElement(By.id("benzcheck")).isDisplayed());
  //Is Enabled
  Reporter.log("Checkbox:" + driver.findElement(By.id("benzcheck")).isEnabled());
 
  //Is Selected
  //Reporter.log("Before checkbox status:" + driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());
  
  //To select the particular checkbox
  driver.findElement(By.id("benzcheck")).click();

  //Is Selected
 // Reporter.log("After checkbox status:"+driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());
  
  Reporter.log("Checkbox is selected successfully");
  Thread.sleep(3000);
  
  
 }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  //Setting the Chrome driver version 90 path
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  //To launch the url
	  driver.get("https://letskodeit.teachable.com/p/practice ");
	  
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
