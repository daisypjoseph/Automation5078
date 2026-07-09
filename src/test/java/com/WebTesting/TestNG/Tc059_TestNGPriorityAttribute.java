package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc059_TestNGPriorityAttribute 
{/*
  @Test
  public void firefoxTest() 
  {
	  //create driver session
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
  }
  
  @Test
  public void chromeTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("Title is: "+driver.getTitle());
  }
  
  
  @Test
  public void edgeTest()
  {
	  WebDriver driver=new EdgeDriver();
	  
	  driver.get("https://www.amazon.in");
	  System.out.println("Title is: "+driver.getTitle());
  }
  
  
  */
	
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
  
  
  @Test(priority=3,description = "This is Add product to cart")
  public void addToCart()
  {
	  System.out.println("user add to cart()");
  }
  
  @Test(priority=4,description = "This is Logout Test")
  public void logout()
  {
	  System.out.println("user logout");
  }
  
}
