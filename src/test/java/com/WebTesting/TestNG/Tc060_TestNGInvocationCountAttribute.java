package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc060_TestNGInvocationCountAttribute
{
  @Test(priority=1)
  public void resgister()
  {
	  System.out.println("This is register test");
  }
  
  
  @Test(priority=2,invocationCount=3)
  public void login()
  {
	  System.out.println("This is Login test");
  }
  
  
  @Test(priority=3)
  public void searchProduct()
  {
	  System.out.println("This is Search Product test");
  }
}
