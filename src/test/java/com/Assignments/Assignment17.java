package com.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment17 {
	/*
	 * Assignment 17:
Write automation script to automate all buttons like(New Tab,New Window,New Window Message)
from this app https://demoqa.com/browser-windows
	 */
  @Test
  public void testCase01() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/browser-windows");
	  System.out.println("Current Window Url is : "+driver.getCurrentUrl());
	  //Parent Handle
	  String parentId=driver.getWindowHandle();
	  
	  //Automate New Tab button 
	  driver.findElement(By.id("tabButton")).click();
	  Set<String> allTab=driver.getWindowHandles();
	  List<String> allTabList=new ArrayList<String>(allTab);
	  
	  //Navigate to Child Tab
	  driver.switchTo().window(allTabList.get(1));
	  System.out.println("Current Window Url is : "+driver.getCurrentUrl());
	  Thread.sleep(1500);
	  driver.close();
	  
	  //Switch to Parent Window
	  driver.switchTo().window(parentId); 
	  
	  //Automate New Window
	  driver.findElement(By.id("windowButton")).click();
	  Set<String> allWins=driver.getWindowHandles();
	  List<String> allWinsList=new ArrayList<String>(allWins);
	  
	  //Navigate to Child Window
	  driver.switchTo().window(allWinsList.get(1));
	  Thread.sleep(1500);
	  System.out.println("Current Window Url is : "+driver.getCurrentUrl());
	  driver.close();
	  
	  //Switch to Parent Window
	  driver.switchTo().window(parentId); 
	  
	  //Automate New Window Message
	  driver.findElement(By.id("messageWindowButton")).click();
	  allWins=driver.getWindowHandles();
	  allWinsList=new ArrayList<String>(allWins);
	  
	  //Navigate to Child Window
	  driver.switchTo().window(allWinsList.get(1));
	  Thread.sleep(1500);
	  driver.close();
	 //Switch to Parent Window
	  driver.switchTo().window(parentId); 
	  driver.quit();
	 
  }
}




















//System.out.println("Current Window Url is : "+driver.getCurrentUrl());
//




