package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Tc058_ExplicitWaitUsingFluentWait {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  	
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By button=By.xpath("//button[text()='Start']");
	  
	  By textEle=By.xpath("(//h4)[2]");
	  
	  
	  driver.findElement(button).click();
	  
	  
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(5))
			  .pollingEvery(Duration.ofMillis(200))
			  .ignoring(ElementNotInteractableException.class);
	  
	  
	  WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(textEle));
	  
	  System.out.println(ele.getText());
	  
	  
	  
	  
	  
	  
  }
}
