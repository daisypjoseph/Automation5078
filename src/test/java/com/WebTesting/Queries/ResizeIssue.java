package com.WebTesting.Queries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizeIssue {
  @Test
  
  public void f() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resizable/");

		//Maximize browser
		driver.manage().window().maximize();
				
		// handle frame
		driver.switchTo().frame(0);

		// element
		WebElement resizeEle = driver.findElement(By.cssSelector("div.ui-icon"));

		Thread.sleep(1500);
		// actions
		Actions act = new Actions(driver);
		 act.moveToElement(resizeEle).dragAndDropBy(resizeEle,100,50).build().perform();   //problem in this line
		 
  }
}
