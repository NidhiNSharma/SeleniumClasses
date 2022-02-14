package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class HyperLinkCount {
	
	WebDriver driver = null;
  
	
 @Test
  public void f() throws InterruptedException {
	  
	  Thread.sleep(300);
  	
	  
	   //TagNameLocator
	  List<WebElement>countlists = driver.findElements ( By.tagName ("a"));
	  for (int i = 0; i<=countlists.size();i++);
	  
	  {
		  int i = 0;
		//To retrieve the text of that particular link
		  //getText
		  Reporter.log(countlists.get(i).getText());
		  
		//To retrieve the href attribute of that particular link
		//getAttribute
		 Reporter.log(countlists.get(i).getAttribute("href"));
		 Reporter.log(countlists.get(i).getAttribute("https://m.media-amazon.com"));
	  }
	 
	
}  
	    	   


  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  //Setting the Chrome driver version 90 path
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  //To launch the url
	  driver.get("https://www.amazon.com/");
	  
	  Reporter.log("Amazon Page is launched successsfully");
	  
	  //To get the page title
	  Reporter.log("Page Title : " + driver.getTitle());
	  
	  //To get the page url
	  Reporter.log("Page Current Url : " + driver.getCurrentUrl());
	  
	  //To maximize the browser
	  driver.manage().window().maximize();
	  Reporter.log("Page is scrolled by pixel");
	  
	  //Implicit wait
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   Thread.sleep(200);

  }

  @AfterTest
  public void afterTest() {
	  
		System.out.println("Done");
		// To close the current browser
		driver.close();

		// To exit the browser instance
		driver.quit();
  }

}
