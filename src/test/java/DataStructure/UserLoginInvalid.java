package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class UserLoginInvalid {
	
	WebDriver Driver = null;
  @Test
	  
	  public void negative() throws InterruptedException {
		  
	  Driver.findElement(By.linkText("Get Started")).click(); //using Selenium click button method
	      Reporter.log("DS Algo Page Sucsessfully open");
		  
	      Driver.findElement(By.linkText("Sign in")).click();
		  Thread.sleep(1000);
		  
		  Driver.findElement(By.id("id_username")).sendKeys("66777");
		  Thread.sleep(1000);
		  
		  Driver.findElement(By.id("id_password")).sendKeys("@@@@");
		  Thread.sleep(1000);
		  
		  //Driver.findElement(By.linkText("submit")).click();
		  Driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(1000);
	      Reporter.log("Login Failed");
	  }
	  
  @BeforeTest
  	  public void Positive() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		  Driver = new ChromeDriver();
		  
		 
		  //To launch the url
		  Driver.get("https://www.google.com"); //Method 1
		  
		  Driver.navigate().to("https://dsportalapp.herokuapp.com/"); //method 2
		  Thread.sleep(1000);
		  
		 //To maximize the browser
		  Driver.manage().window().maximize(); 
  }

  @AfterTest
  public void afterTest() {
  }

}
