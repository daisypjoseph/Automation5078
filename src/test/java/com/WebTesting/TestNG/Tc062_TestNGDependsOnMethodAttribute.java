package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc062_TestNGDependsOnMethodAttribute {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("User register first");
	  AssertJUnit.assertEquals(true,true);//pass
	  
  }
  
  
  @Test(priority=2,dependsOnMethods = "registerTest")
  public void loginTest() 
  {
	  System.out.println("Register User can login ");
	  AssertJUnit.assertEquals(false,true);//fail:AssertionError
  }
  
  
  @Test(priority=3,dependsOnMethods = "loginTest")
  public void logoutTest() 
  {
	  System.out.println("User logout ");
  }
}
