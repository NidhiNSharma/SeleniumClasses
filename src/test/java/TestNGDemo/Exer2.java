package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Exer2 {

	
	
	@Test
  public void welcome() {
 
       //  System.out.println("Welcome Method");	
       Reporter.log("Welcome One");
	
	
	}
  
    @Test	
	public void hello()  {
		//  System.out.println("Hello Method");
	    Reporter.log("Hello Good Morning");
	
	}
	
	@BeforeTest
  public void beforeTest() {
  
	System.out.println("Inside Before Test");
 }

	
	
	
	
	@AfterTest
  public void afterTest() {
 
		System.out.println("Inside After Test");
	
 }

}
