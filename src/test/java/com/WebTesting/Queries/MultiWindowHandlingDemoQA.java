package com.WebTesting.Queries;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class MultiWindowHandlingDemoQA
{
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/browser-windows");
	  String pid=driver.getWindowHandle();
	  
	  driver.findElement(By.cssSelector("button#tabButton")).click();
	  
	  Set<String> allwin1=driver.getWindowHandles();
	  
	  for(String i:allwin1) {
		  
		  if(!pid.equals(i)) {
			  
			  driver.switchTo().window(i);
			  
			  System.out.println(" driver on child window ");
			  
			  System.out.println(driver.getCurrentUrl());
			  
			  driver.findElement(By.cssSelector("h1#sampleHeading"));
			 driver.close();
		  }
		  
	  }
	  System.out.println("-----------------------------------------");
	  driver.switchTo().window(pid);
	  
	  Thread.sleep(1500);
	  
	  driver.findElement(By.id("windowButton")).click();
	  
	  Set <String> allwin2=driver.getWindowHandles();
	 
	  System.out.println(allwin2.size());
	  
      for(String i1: allwin2) {
    	  
    	  if(!pid.equals(i1)) {
    		  
	  driver.switchTo().window((i1));
	  Thread.sleep(1500);
	  //driver.findElement(By.tagName("//h1")).getText();
	  String text=driver.findElement(By.tagName("body")).getText();
	  System.out.println(text);
	  //driver.close();
	  
    	  }
  }
	  System.out.println("-----------------------------------------");
	  
	  driver.switchTo().window(pid);
	  Thread.sleep(1500);
	  //driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	  driver.findElement(By.id("messageWindowButton")).click();
	Set<String> allwin3=driver.getWindowHandles();
	
	for( String i2:allwin3) {
		
		if(!pid.equals(i2)) 
		{
	  driver.switchTo().window(i2);
	  //Thread.sleep(1500);
	  
	  //driver.findElement(By.tagName("//body")).getText();
	  System.out.println(driver.getPageSource());
	  //driver.close();
  }
  


  }
}
}
