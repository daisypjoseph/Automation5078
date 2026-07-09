package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tc055_ExplicitWaitUsingWebDriverWaitClass {
  @Test
  public void testWait()
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locator
	  By email=By.id("input-email");
	  By password=By.id("input-password");
	  By loginBtn=By.xpath("//input[@value='Login']");
	  
	  /*
	   * selenium.TimeoutException: 
	   * Expected condition failed: waiting for visibility of element found by 
	   * By.id: input-email###, but... 
	   * org.openqa.selenium.NoSuchElementException: no such element:
	   *  Unable to locate element: 
	   *  {"method":"css selector","selector":"#input\-email\#\#\#"}.
		(tried for 5 seconds with 500 milliseconds interval)
		interval time is called polling time
		this the time where selenium server look for the element on Application
	   * 
	   * 
	   * 
	   */
	  
	  
	  
	  
	  //explicit wait: WebDriverWait class
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  
	  
	  //emailId:Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
	  WebElement emailEle=wait.until(ExpectedConditions.visibilityOfElementLocated(email));
	  //perform action
	  emailEle.sendKeys("test@gmail.com");
	  
	  //password:An expectation for checking that an element is present on the DOM of a page. This does notnecessarily mean that the element is visible.
	  WebElement pswEle=wait.until(ExpectedConditions.presenceOfElementLocated(password));
	  //action
	  pswEle.sendKeys("test123");
	  
	  
	  //button:An expectation for checking an element is visible and enabled such that you can click it.
	  WebElement loginEle=wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
	  //action
	  loginEle.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
