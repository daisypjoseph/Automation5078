package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc020_TestNGDemo
{
  @Test
  public void testcase1()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
  }
  
  
  @Test
  public void testcase2()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
  }
}
