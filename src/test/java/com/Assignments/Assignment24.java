package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assignment24 {
	/*
	 * Assignment 24:
Navigate to Orangehrm application and automate login and logout in headless mode
	 */
  @Test
  public void testCase01() throws InterruptedException {

	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless");
	  //start Chrome Driver session
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //Open OrangeHRM application
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //Enter username
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  //enter password
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  //Click Login button
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(2000);
	  //Click Dropdown arrow
	  driver.findElement(By.cssSelector("i.oxd-userdropdown-icon")).click();
	  //Click Logout button
	  driver.findElement(By.linkText("Logout")).click();
	  
	  
  
  }
}
