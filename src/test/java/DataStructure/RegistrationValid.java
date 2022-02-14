package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class RegistrationValid{
	
	WebDriver Driver = null;
	
  @Test
  public void f() throws InterruptedException {
	  
	    
	  Driver.get("https://dsportalapp.herokuapp.com/");
	  
	  Driver.findElement(By.linkText("Get Started")).click(); //using Selenium click button method
      Thread.sleep(1000);
      Reporter.log("DS Algo Page Sucsessfully open");
	  
      Driver.findElement(By.linkText("Register")).click();
	  Thread.sleep(1000);
	  
	  Driver.findElement(By.id("id_username")).sendKeys("sdfrrewweew");
	  Thread.sleep(1000);
	  
	  Driver.findElement(By.id("id_password1")).sendKeys("jggdfhu7ii");
	  
	  Driver.findElement(By.id("id_password2")).sendKeys("jggdfhu7ii");
	  
	  Driver.findElement(By.xpath("//input[@type='submit']")).click();
      Reporter.log("Registration Done Sucsessfully");
	   
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  Driver = new ChromeDriver();
	  
	 
	  //To launch the url
	  Driver.get("https://www.google.com"); //Method 1
	  
	  Driver.navigate().to("https://dsportalapp.herokuapp.com/"); //method 2
	 
	  
	 //To maximize the browser
	  Driver.manage().window().maximize(); 
	  
	 
  }
	  
	  
	

  @AfterTest
  public void afterTest() {
  }

}
