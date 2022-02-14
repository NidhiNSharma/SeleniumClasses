package SeleniumBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {
	
	 WebDriver driver = null;
  
  @Test
 
	   public void SelectDropdownExample() throws InterruptedException
	  {
	  
	   //To scroll the page
	      JavascriptExecutor js = (JavascriptExecutor) driver;  //Interface
	      js.executeScript("window.scrollBy(0,300)");
	      Reporter.log("Page is scrolled by pixel");  
	      
	   //Define the Webelement first
	   WebElement dropdownskills = driver.findElement(By.id("Skills"));
	   
	   //Inbuilt Select class
	   Select dropdownvalue = new Select(dropdownskills);
	   
	   //SelectByVisibleText()
	   dropdownvalue.selectByVisibleText("Adobe InDesign");
	   Reporter.log("Selected using VisibleText : Adobe InDesign " );
	   
	   Thread.sleep(2000);
	   
	   //SelectByValue using Value Attribute
	   
	   dropdownvalue.selectByValue("Android"); //Android
	   Reporter.log("Selected using value : Android ");
	   Thread.sleep(2000);
	    
	   //SelectByIndex
	   dropdownvalue.selectByIndex(3);
	   Reporter.log("Selected using index : 3 ");
	   Thread.sleep(2000);  
	 
	   
	   
	   //Without using select By using getOptions
	   selectoption(dropdownskills,"Art Design");
	   Thread.sleep(5000);   
	   Reporter.log("Select drop down");
	   
	 
	   //Define the Webelement first
	   WebElement dropdownskills1 = driver.findElement(By.id("countries"));
	   selectoption(dropdownskills1,"Algeria");
	   Thread.sleep(2000);
	  }  
	//Reusable function 
	  //Parameters : Dropdown name and Value
	  //Dynamically without the select methods
	  public static void selectoption(WebElement ele, String value)
	  {
	   
	   Select dropdownvalue = new Select(ele);
	   
	    List<WebElement> optionscount = dropdownvalue.getOptions();
	   
	  //using for...each  loop
	   for(WebElement option:optionscount)
	   {
	     if(option.getText().equals(value)) //Condition
	     {
	     option.click();  
	     Reporter.log("Dynamically Without Select method by using get options count  :  " + value);
	     break;
	     }
	   }
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
	  
		System.out.println("Done");
		// To close the current browser
		driver.close();

		// To exit the browser instance
		driver.quit();
  }
  }

