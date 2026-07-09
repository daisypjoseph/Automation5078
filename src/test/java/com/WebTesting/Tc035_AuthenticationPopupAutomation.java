package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc035_AuthenticationPopupAutomation {
  @Test
  public void testPopup() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String text=driver.findElement(By.xpath(" //p[contains(normalize-space(),'Congratulations')]")).getText();
	  
	  System.out.println(text);
	  
  }
}
