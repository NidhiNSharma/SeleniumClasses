package SeleniumBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class MouseDragDrop {
	
	WebDriver driver =null;
	  
	  @Test
	  public void dragdropoperation() throws InterruptedException
	  
	  {
	   WebElement dragimage1 = driver.findElement(By.id("box6"));
	   WebElement dropimage1 = driver.findElement(By.id("box106"));
	   
	   //Action Class
	   Actions actobj = new Actions(driver);  
	   actobj.dragAndDrop(dragimage1, dropimage1).perform(); //drag and drop
	    
	   Reporter.log("Drag and drop performed successfully");
	   
	   Thread.sleep(5000); 
	   
	  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	 
	  //To launch the url
	  driver.get("https://www.google.com"); //Method 1
	  
	  driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); //method 2
	 
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

