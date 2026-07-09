package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc027_JavascriptExecutor_ScrollThePage {
  @Test
  public void scrollThePage() throws InterruptedException
    {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  Thread.sleep(2000);
	  
	  //convert driver to JavascriptExecutor interface
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  //scroll down
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	   Thread.sleep(2000);
	   //scroll up
	   js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	   Thread.sleep(2000);
	  //scrollupto the element
	   WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Electronics & accessories')]"));	  
	   js.executeScript("arguments[0].scrollIntoView(true);", ele);
	  
	  
	 
	  
  }
}
