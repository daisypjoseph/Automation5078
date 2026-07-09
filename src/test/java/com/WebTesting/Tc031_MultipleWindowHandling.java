package com.WebTesting;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc031_MultipleWindowHandling {
  @Test
  public void testMultipleWindows() throws InterruptedException
  {
	  //create driver  session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //parent window
	  String parentId=driver.getWindowHandle();
	  
	  
	  
	  List<WebElement> allLinks=driver.findElements(By.xpath("//a[@href]"));
	  for(WebElement i:allLinks)
	  {
		  i.click();
	  }
	  
	  
	  //collect all open windows Ids
	  Set<String> allWins=driver.getWindowHandles();
	  System.out.println("Total windows are open: "+allWins.size());
	  //convert into order collection List
	  List<String> allWindows=new ArrayList<String>(allWins);
	  
	  ElementUtil.switchToExpectedWindow(driver,allWindows,"YouTube");
	  
	  Thread.sleep(2000);
	  
	  //Facebook
	   ElementUtil.switchToExpectedWindow(driver,allWindows,"Facebook");
	  
	   Thread.sleep(2000);
	  //switch to parent
	   ElementUtil.switchToParentWindow(driver,parentId);
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*
	  for(String childId:allWindows)
	  {
		  //we are switching to every window and collecting title
		  String appTitle=driver.switchTo().window(childId).getTitle();
		  if(appTitle.contains("YouTube"))
		  {
			  System.out.println("Expected Window found");
			  System.out.println("Current url: "+driver.getCurrentUrl());
			  break;
		  }
	  }*/
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
