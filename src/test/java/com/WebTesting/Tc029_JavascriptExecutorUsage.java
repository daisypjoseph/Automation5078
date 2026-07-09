package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc029_JavascriptExecutorUsage {
  @Test
  public void testJavascriptUsage() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://formy-project.herokuapp.com/form");
	  
	  //on current session I want operation
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //to get title
	  System.out.println("Title: "+driver.getTitle());
	  String title=js.executeScript("return document.title").toString();
	  System.out.println("Title from JavascriptExecutor: "+title);
	  
	  //to refresh the page
	  //driver.navigate().refresh();
	  
	  Thread.sleep(2000);
	  
	  js.executeScript("history.go()");
	  System.out.println("Done");
	  
	  //click on element
	  WebElement radioEle=driver.findElement(By.id("radio-button-1"));
	  js.executeScript("arguments[0].click();",radioEle);
	  
	  
	  //enter text
	  WebElement jobEle=driver.findElement(By.id("job-title"));
	  js.executeScript("arguments[0].value='SDET'",jobEle);
	  
	  
	  //hidden element automation
	  driver.navigate().to("https://www.letskodeit.com/practice");
	  
	  Thread.sleep(2000);
	  
	  //click on hide button 
	  driver.findElement(By.id("hide-textbox")).click();
	  
	  //element will be hidden:.ElementNotInteractableException
	  //driver.findElement(By.id("displayed-text")).sendKeys("Hello All");//fail
	  
	  WebElement inputele=driver.findElement(By.id("displayed-text"));
	  js.executeScript("arguments[0].value='Hello All'",inputele);
	  //hidden element automation is only possible with JavascriptExecutor interface
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
