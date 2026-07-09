package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc025_DatePickerAiutomation_FormyPage {
  @Test
  public void testDatePicker() 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://formy-project.herokuapp.com/form");
	  
	  
	  //date picker("mm/dd/yyyy")
	  driver.findElement(By.id("datepicker")).sendKeys("07/27/2026");
	  
	  
	  
	  
  }
}
