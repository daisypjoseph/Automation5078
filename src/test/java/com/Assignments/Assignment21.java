package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Assignment21 {
	/*
	 * Assignment 21:
Automate Dynamic WebTable from https://testautomationpractice.blogspot.com/
app with all usecases
Memory Size of Firefox process: 38.6 MB

Network speed of Chrome process: 6.9 Mbps

Disk space of Firefox process: 0.59 MB/s
	 */
  @Test
  public void testcase01() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll to the table
	  WebElement ele=driver.findElement(By.id("taskTable"));
	  ElementUtil.scrollUpToElement(driver, ele);
	  
	 
	  //Scenario 1: Memory Size of Firefox process: 38.6 MB
	  //Capture All browsers
	  List<WebElement> allBrowser=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//td[1]"));
	  
	  String expBrowser="Firefox";
	  int rowCount=0;
	  //Loop thru to find browser Firefox rowCount
	  for(WebElement i:allBrowser) {
		  rowCount++;
		  if(i.getText().contains(expBrowser)) {
			  
			 String actualMem=driver.findElement(By.xpath("//table[@id='taskTable']//tr["+rowCount+"]/td//following-sibling::td[contains(text(),'MB')and not(contains(text(), 'MB/s'))]")).getText();
			 System.out.println("Actual Memory Value : "+actualMem);
			 String expMem=driver.findElement(By.xpath("//strong[@class='firefox-memory']")).getText();
			 System.out.println("Expected Memory value : "+expMem);
			 
			 if(actualMem.equals(expMem)) {
				 System.out.println("Memory Value matched!");
			 }
			 else
				 System.out.println("Memory Value not matched!");
		  }
		  
	  }
	  
	 
	  //Scenario 2:Network speed of Chrome process: 6.9 Mbps
	   System.out.println("--------------------------------------------------");
	  expBrowser="Chrome";
	  rowCount=0;
	  //Loop thru to find browser Chrome rowCount
	  for(WebElement i:allBrowser) {
		  rowCount++;
		  if(i.getText().contains(expBrowser)) {
			  
			 String actualMem=driver.findElement(By.xpath("//table[@id='taskTable']//tr["+rowCount+"]/td//following-sibling::td[contains(text(),'Mbps')]")).getText();
			 System.out.println("Actual Network Value : "+actualMem);
			 String expMem=driver.findElement(By.xpath("//strong[@class='chrome-network']")).getText();
			 System.out.println("Expected Network value : "+expMem);
			 
			 if(actualMem.equals(expMem)) {
				 System.out.println("NetWork Value matched!");
			 }
			 else
				 System.out.println("NetWork Value not matched!");
			  }
			  }
	  	  //Scenario 3:Disk space of Firefox process: 0.59 MB/s
	  System.out.println("--------------------------------------------------");
	  expBrowser="Firefox";
	  rowCount=0;
	  //Loop thru to find browser Firefox rowCount
	  for(WebElement i:allBrowser) {
		  rowCount++;
		  if(i.getText().contains(expBrowser)) {
			 String actualMem=driver.findElement(By.xpath("//table[@id='taskTable']//tr["+rowCount+"]/td//following-sibling::td[contains(text(),'MB/s')]")).getText();
			 System.out.println("Actual Disk space Value : "+actualMem);
			 String expMem=driver.findElement(By.xpath("//strong[@class='firefox-disk']")).getText();
			 System.out.println("Expected Disk space value : "+expMem);
			 
			 if(actualMem.equals(expMem)) {
				 System.out.println("Disk space Value matched!");
			 }
			 else
				 System.out.println("Disk space Value not matched!");
			
		  }
		  
	  }
	  
	  
  }
}























