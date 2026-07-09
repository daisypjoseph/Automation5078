package com.WebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc039_DoubleClickAction {
  @Test
  public void testDoubleClick()
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  
	  //element
	  WebElement buttonEle=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  
	  
	  //action
	  Actions act=new Actions(driver);
	  act.doubleClick(buttonEle).perform();
	  
	  //alert will open
	  Alert alt1=driver.switchTo().alert();
	  
	  System.out.println("Alert message is: "+alt1.getText());
	  
	  //OK
	  alt1.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
