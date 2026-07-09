package com.Assignments;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTimePractice {
  @Test
  public void testcase01() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  By nameLoc=By.name("username");
	  By pwdLoc=By.name("password");
	  By btnLoc=By.xpath("//button[@type='submit']");
	  
	  //WebDriverWait
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  
	  //username
	  WebElement usrname=wait.until(ExpectedConditions.visibilityOfElementLocated(nameLoc));
	  usrname.sendKeys("Admin");
	  
	  //password
	  WebElement pwdEle=wait.until(ExpectedConditions.presenceOfElementLocated(pwdLoc));
	  pwdEle.sendKeys("admin123");
	  
	  //Login button
	  WebElement btnEle=wait.until(ExpectedConditions.elementToBeClickable(btnLoc));
	  btnEle.click();
	  
	  /*
	   *  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(5))
			  .pollingEvery(Duration.ofMillis(200))
			  .ignoring(ElementNotInteractableException.class);
	   */
	  
	  FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
			  					  .withTimeout(Duration.ofSeconds(10))
			  					  .pollingEvery(Duration.ofMillis(200))
			  					  .ignoring(NoSuchElementException.class);
	  
	  //Logout drop down arrow
	  By dd=By.cssSelector("i.oxd-userdropdown-icon");
	  
	  WebElement ddEle=wait.until(ExpectedConditions.elementToBeClickable(dd));
	  ddEle.click();
	  
	  
  }
}





















