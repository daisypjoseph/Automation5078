package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc036_FrameAutomation {
  @Test
  public void testFrame() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/frames");
	  
	  
	  //switchTo frame
	  //based on index
	  //driver.switchTo().frame(0);
	  
	  //based on id/name
	  //driver.switchTo().frame("frame1");
	  
	  
	  //based on WebElement
	  WebElement frameEle=driver.findElement(By.xpath("(//iframe[@src='/sample.html'])[1]"));
	  driver.switchTo().frame(frameEle);
	  
	  
	  //element is inside frame
	  String text=driver.findElement(By.id("sampleHeading")).getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
