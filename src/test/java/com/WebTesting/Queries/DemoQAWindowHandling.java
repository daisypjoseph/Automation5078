package com.WebTesting.Queries;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoQAWindowHandling {
  @Test
  public void testNewWindowMessage() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/browser-windows");
	  
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  driver.findElement(By.id("messageWindowButton")).click();
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  for(String childId:allWindows)
	  {
		  if(!parentId.equals(childId))
		  {
			  driver.switchTo().window(childId);
			  System.out.println(driver.getPageSource());
		  }
	  }
	  
	  
  }
}
