package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc041_DragAndDropAction {
  @Test
  public void testDragAndDrop() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	  //element is inside the frame
	  driver.switchTo().frame(0);
	  
	  
	  //elements
	  WebElement src=driver.findElement(By.id("draggable"));
	  WebElement dest=driver.findElement(By.id("droppable"));
	  
	  Actions act=new Actions(driver);	
	  //act.clickAndHold(src).moveToElement(dest).release().build().perform();
	  
	  act.dragAndDrop(src,dest).perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  	
  }
}
