package com.WebTesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc030_WindowHandling {
  @Test
  public void testWindowHandling()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://formy-project.herokuapp.com/switch-window");
	  //home page
	  
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  //click on button
	  driver.findElement(By.id("new-tab-button")).click();
	  //open new window/tab

	  //to get total window count use getWindowHandles()
	  
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println("Total windows open: "+allWindows.size());
	  
	  for(String childId:allWindows)
	  {
		  //When parent id and child id are not equal then driver has to switch 
		  if(!parentId.equals(childId))
		  {
			  //switch to child window
			  driver.switchTo().window(childId);
			  //click on checkbox
			  driver.findElement(By.linkText("Checkbox")).click();
			  //close current window:childWindow
			  //driver.close();
			  //close all open windows by selenium
			  //driver.quit();
		  }
	  }
	  
	  //parent window
	  driver.switchTo().window(parentId);
	  String text=driver.findElement(By.tagName("h1")).getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
