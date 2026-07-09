package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc038_RightClickAction {
  @Test
  public void testMouseOperationsRightClick()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //button ele
	  WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  
	  //perform right click: actions class
	  	  Actions act=new Actions(driver);
	  	  act.contextClick(button).perform();
	  	  
	  	  //list
	  	  List<WebElement> allOptions=driver.findElements(By.cssSelector("ul.context-menu-list>li>span"));
	  	  for(WebElement i:allOptions)
	  	  {
	  		  System.out.println(i.getText());
	  		  if(i.getText().contains("Delete"))
	  		  {
	  			  i.click();
	  			  break;
	  		  }
	  	  }
	  	  
	  	  
	  	  //alert will appear
	  	  
	  	  driver.switchTo().alert().accept();
	  	  
	  	  
	  	  
	  	  
	  	  
	  	  
	  	  
	  	  
	  	  
	  	  
	  	  
	  	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
