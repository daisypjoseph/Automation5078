package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc063_TestNGDisableTestFromExecutionusingEnabledAttribute {
 
	
	@Test(priority=1,description = "This is Register test")
	  public void register()
	  {
		  System.out.println("user register");
	  }
	  
	  @Test(priority=2,description = "This is Login test")
	  public void login()
	  {
		  System.out.println("user login");
	  }
	  
	  //disable this using xml
	  @Test(priority=3,description = "This is search product")
	  public void search()
	  {
		  System.out.println("user search product");
	  }
	  
	  //disabled this test case
	  @Test(priority=4,description = "This is Add product to cart",enabled=false)
	  public void addToCart()
	  {
		  System.out.println("user add to cart()");
	  }
	  
	  @Test(priority=5,description = "This is Logout Test")
	  public void logout()
	  {
		  System.out.println("user logout");
	  }
	  
	
	
}
