package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc040_MouseHover {
  @Test
  public void testMouseHover() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.naukri.com/");
	  
	  //ele
	  WebElement jobEle=driver.findElement(By.xpath("//span[text()='Jobs']"));
	  
	  //action
	  Actions act=new Actions(driver);
	  act.moveToElement(jobEle).perform();
	  
	  //get the list of options
	  
	  List<WebElement> allOptions=driver.findElements(By.cssSelector("div.nI-gNb-Jobs>ul>li>a"));
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
	  }
		 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
			  
  }
}
