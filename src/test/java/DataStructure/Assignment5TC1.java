package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Assignment5TC1 {
	
	WebDriver driver = null;
  
	@Test
  public void f() throws InterruptedException {
	 
	  
	  WebElement mainmenu1 = driver.findElement(By.xpath("//a[normalize-space()='Women']"));
	  WebElement mainsubmenu1 = driver.findElement(By.xpath("//a[normalize-space()='T-shirts']"));
	  Thread.sleep(3000);
	
	  Actions actobj = new Actions(driver);
	  actobj.moveToElement(mainmenu1).moveToElement(mainsubmenu1).click().perform();
	   
	  Reporter.log("Successfully displayed the only option -Faded Short Sleeve T-shirts");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.name("submit_search")).click();
	  Thread.sleep(5000);
	  Reporter.log("Item matched Sucsessfully");
	  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	 
	  //To launch the url
	  driver.get("https://www.google.com"); //Method 1
	  
	  driver.navigate().to(" http://automationpractice.com/index.php"); //method 2
	 
	  
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
