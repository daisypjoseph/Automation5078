package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc056_ExplicitWaitUsingWebDriverWaitUtility {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locator
	  By email=By.id("input-email");
	  By password=By.id("input-password");
	  By loginBtn=By.xpath("//input[@value='Login']");
	  
	  boolean statusUrl=ElementUtil.waitForUrlContains(driver,"login",5);
	  System.out.println("Url is valid: "+statusUrl);
	  
	  boolean statusTitle=ElementUtil.waitForTitleContains(driver,"Account",5);
	  System.out.println("Title is valid: "+statusTitle);
	  
	  
	  WebElement emailEle=ElementUtil.waitForVisibilityOfElement(driver,email,10);
	  emailEle.sendKeys("test2525@gmail.com");
	  
	  WebElement passEle=ElementUtil.waitForPresenceOfElement(driver,password,5);
	  passEle.sendKeys("test123");
	  
	  WebElement loginButton=ElementUtil.waitForElementClickable(driver,loginBtn,3);
	  loginButton.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
