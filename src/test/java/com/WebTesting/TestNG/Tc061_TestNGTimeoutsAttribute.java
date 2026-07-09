package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc061_TestNGTimeoutsAttribute 
{
  @Test(priority=1,timeOut = 5000 )//expected timeout for test case
  public void testCase1() throws InterruptedException
  {
	  System.out.println("Test started.....");
	  Thread.sleep(6000);
	  System.out.println("This is test case 1 completed with 6sec");
  }
  
  
  @Test(priority=2,timeOut =5000)
  public void testCase2() throws InterruptedException
  {
	  System.out.println("Test started.....");
	  Thread.sleep(4000);
	  System.out.println("This is test case 2 completed with 4sec");
  }
}
