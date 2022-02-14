package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class RegistrationPwInvalid {
	WebDriver driver = null;
	
  @Test
  
  public void f() throws InterruptedException {
	  
	    
	  driver.get("https://dsportalapp.herokuapp.com/");
	  
	  driver.findElement(By.linkText("Get Started")).click(); //using Selenium click button method
      Thread.sleep(1000);
      Reporter.log("DS Algo Page Sucsessfully open");
	  
      driver.findElement(By.linkText("Register")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("id_username")).sendKeys("Nidhi");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("id_password1")).sendKeys("fgr@4rtt");
	  
	  driver.findElement(By.id("id_password2")).sendKeys("fgr@4rtt");
	  
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
      Reporter.log("Password Invalid");
	  
  }
  @BeforeTest
  
 public void Positive() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		 
		  //To launch the url
		  driver.get("https://www.google.com"); //Method 1
		  
		  driver.navigate().to("https://dsportalapp.herokuapp.com/"); //method 2
		  Thread.sleep(1000);
		  
		 //To maximize the browser
		  driver.manage().window().maximize(); 
  }

  @AfterTest
  public void afterTest() {
  }

}
