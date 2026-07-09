package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc028_JavascriptExecutor_ScrollThePageUsingIUtility {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  Thread.sleep(2000);
	  
	  //scroll down
	  ElementUtil.scrollDown(driver);
	  
	  Thread.sleep(2000);
	  
	  //scroll up
	  ElementUtil.scrollUp(driver);
	  
	  Thread.sleep(2000);
	  
	  //scroll upto element
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Top home essentials from Small Businesses')]"));
	  
	  ElementUtil.scrollUpToElement(driver,ele);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
