package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Assignment5TC2 {
	
	WebDriver driver =null;
  @Test
  public void f() throws InterruptedException {
	  
	  
	  WebElement mainmenu1 = driver.findElement(By.xpath("//a[normalize-space()='Women']"));
	  WebElement mainsubmenu1 = driver.findElement(By.xpath("//a[normalize-space()='T-shirts']"));
	  Thread.sleep(3000); 
	  
	  Actions actobj = new Actions(driver);
	  actobj.moveToElement(mainmenu1).moveToElement(mainsubmenu1).click().perform();
	  Thread.sleep(3000);
	  
	  //To scroll the page
      JavascriptExecutor js = (JavascriptExecutor) driver;  //Interface
      js.executeScript("window.scrollBy(0,300)");
      Thread.sleep(3000);
      Reporter.log("Page is scrolled by pixel");  
      
     
      //For MouseHover on the item
      WebElement item = driver.findElement(By.xpath("//*[@class='product-container']"));
      
      Actions actionProvider = new Actions(driver);
      actionProvider.moveToElement(item).build().perform();
      Thread.sleep(3000); 
	  
	  Reporter.log("Mouse Hover operation performed successfully");
	  Thread.sleep(5000);
	 
	 // Add to cart
	  driver.findElement(By.linkText("Add to cart")).click();
	  Thread.sleep(3000);
	  Reporter.log("Item added successfully");
	  
	  //Checkout
	  driver.findElement(By.linkText("Proceed to checkout")).click();
	  Thread.sleep(3000);
	  Reporter.log("Successfully Done");
	  
	 //validate no of products
	  Reporter.log("Number of products in the cart : " + 
	                driver.findElement(By.id("summary_products_quantity")).getText());
	  
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
	  
	  public void tearDown() throws Exception {
		   Reporter.log("Inside tearDownTest");
		  //To close the current browser
		   driver.close();
		   
		   //To exit the browser instance
		   driver.quit();
		     
  }

}
