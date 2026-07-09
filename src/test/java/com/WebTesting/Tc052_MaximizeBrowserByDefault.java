package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc052_MaximizeBrowserByDefault {
  @Test
  public void testMaximizeBrowser()
  {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.google.com");
	  
  }
}
