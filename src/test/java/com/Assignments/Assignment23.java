package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assignment23 {
	/*
	 * Assignment 23:
Open Incognito browser & Navigate to amazon application and search for mobile and get all the options in
console.
	 */
  @Test
  public void testcase01() {
	  
	  //Add incognito Capability
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("incognito");
	   
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //Open amazon app url
	  driver.get("https://www.amazon.in/");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	  
	  List<WebElement> allOptions2=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//span"));
	  
	  for(WebElement i:allOptions2) {
		  
		  System.out.println("mobile "+i.getText());
	  }
	  
  }
}
