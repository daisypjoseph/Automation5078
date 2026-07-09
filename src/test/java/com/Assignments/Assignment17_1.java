package com.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment17_1 {
  @Test
  public void testCase() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/browser-windows");
	  System.out.println("Current Window Url is : "+driver.getCurrentUrl());
	  //Parent Handle
	  String parentId=driver.getWindowHandle();
	  
	  //Automate New Window Message
	  driver.findElement(By.id("messageWindowButton")).click();
	  Set<String>allWins=driver.getWindowHandles();
	  List<String >allWinsList=new ArrayList<String>(allWins);
	  
	  //Navigate to Child Window
	  driver.switchTo().window(allWinsList.get(1));
	  Thread.sleep(1500);
	  //Capturing the text in <body> tag
	  String str=driver.findElement(By.tagName("body")).getText();
	  System.out.println("Window Message is :"+str);
	
  }
}
