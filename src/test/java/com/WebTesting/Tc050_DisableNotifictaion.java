package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc050_DisableNotifictaion {
  @Test
  public void testDisableNotification() 
  {
	  
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.goibibo.com/");
	  
  }
}
