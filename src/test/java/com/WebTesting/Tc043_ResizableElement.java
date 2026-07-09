package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc043_ResizableElement {
  @Test
  public void testResizeElement() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://jqueryui.com/resizable/");
	  
	  //handle frame
	  driver.switchTo().frame(0);
	  
	  //element
	  WebElement resizeEle=driver.findElement(By.cssSelector("div.ui-icon"));
	  
	  //actions
	  Actions act=new Actions(driver);
	  act.moveToElement(resizeEle).dragAndDropBy(resizeEle,100,50).build().perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
