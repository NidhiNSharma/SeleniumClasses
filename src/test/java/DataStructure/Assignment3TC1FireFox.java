package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Assignment3TC1FireFox {
	
	WebDriver driver = null;
  
	@Test
  
	public void selection() throws InterruptedException {
		Thread.sleep(30);

		// Linktext
		// driver.findElement(By.linkText("https://courses.letskodeit.com/practice")).click();

		Reporter.log("The Link is selected");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(30);
		Reporter.log("Navigated url : " + driver.getCurrentUrl());

		// RadioButton
		// Is Displayed
		Reporter.log("Radiobutton:" + driver.findElement(By.xpath("//input[@value ='bmw']")).isDisplayed());
		// Is Enabled
		Reporter.log("Radiobutton:" + driver.findElement(By.xpath("//input[@value ='bmw']")).isEnabled());

		// To select the specific radio button
		driver.findElement(By.xpath("//input[@value ='bmw']")).click();
		Reporter.log("Radio Button is selected successsfully");
		Thread.sleep(30);

		// Checkbox1

		// Is Displayed
		Reporter.log("Checkbox:" + driver.findElement(By.xpath("//input[@id='bmwcheck']")).isDisplayed());
		// Is Enabled
		Reporter.log("Checkbox:" + driver.findElement(By.xpath("//input[@id='bmwcheck']")).isEnabled());

		// To select the particular checkbox
		driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
		Reporter.log("Checkbox is selected successfully");
		Thread.sleep(30);

		// Checkbox2

		// Is Displayed
		Reporter.log("Checkbox:" + driver.findElement(By.xpath("//input[@id='benzcheck']")).isDisplayed());
		// Is Enabled
		Reporter.log("Checkbox:" + driver.findElement(By.xpath("//input[@id='benzcheck']")).isEnabled());

		// To select the particular checkbox
		driver.findElement(By.xpath("//input[@id='benzcheck']")).click();

		Reporter.log("Checkbox is selected successfully");
		Thread.sleep(30);

 }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	//Setting the FireFox driver
	  System.setProperty("webdriver.gecko.driver", "C:\\Apps\\GeckoDriver\\geckodriver.exe");
	  
	 
	//FF Browser
	  driver = new FirefoxDriver();
	  
	  //To launch the url
	  driver.get("https://www.google.com"); 
	  driver.navigate().to("https://courses.letskodeit.com/practice");
	   
	 //To maximize the browser
	  driver.manage().window().maximize(); 
	  
	  //Implicit wait
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   Thread.sleep(30);

  
  }

  @AfterTest
	 public void tearDown() {
	 
	  //To close the current browser
	  driver.close();
	   
	   //To exit the browser instance
	   driver.quit();
		     
  }

}

