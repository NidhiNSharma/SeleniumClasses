package DataStructure;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class UsLoginInvalidPw {
	
	WebDriver driver = null;
  
  @Test
	  
	  public void invalid() throws InterruptedException {
			 
		  driver.findElement(By.linkText("Get Started")).click(); //using Selenium click button method
	      

	      Reporter.log("DS Algo Page Sucsessfully open");
		  
	      driver.findElement(By.linkText("Sign in")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("id_username")).sendKeys("Nidhi");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("id_password")).sendKeys("rfffff");
		  Thread.sleep(1000);
		  
		  //Driver.findElement(By.linkText("submit")).click();
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(1000);
	      Reporter.log("Invalid Password");
  }
  @BeforeTest
	  
 public void f() throws InterruptedException {
		  
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
