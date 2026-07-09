package com.WebTesting.Queries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipIssue {
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://jqueryui.com/tooltip/");
	  
	//Maximize browser
	driver.manage().window().maximize();
	  
	  //handle frame
	  driver.switchTo().frame(0);
	  
	  //age
	  WebElement ageEle=driver.findElement(By.id("age"));
	  
	  Thread.sleep(1500);
	  //mouse hover
	  Actions act=new Actions(driver);
	  act.moveToElement(ageEle).perform();
      Thread.sleep(1500);
	  
	  //tooltip
	  String text=driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
	  System.out.println("ToolTip: "+text);
	  
  }
}
