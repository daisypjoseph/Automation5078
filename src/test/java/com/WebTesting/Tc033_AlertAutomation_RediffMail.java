package com.WebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc033_AlertAutomation_RediffMail {
  @Test
  public void testAlert() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  //rediff mail
	  driver.findElement(By.name("login")).sendKeys("test123");
	  
	  //click on login button
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(1500);
	  //alert will open
	  //if you missed to handle it then selenium throws exception UnhandledAlertException
	  
	  //driver.switchTo().alert().accept();
	  
	  //handle alert: use alert() whose return type Alert interface Object
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert Text is: "+alt1.getText());
	  //Click on OK
	  alt1.accept();
	  
	  Thread.sleep(1500);
	  
	  driver.findElement(By.id("password")).sendKeys("1234");
	  
	  
	  
	  
	  
	  
	  
  }
}
