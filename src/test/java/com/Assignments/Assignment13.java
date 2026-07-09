package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment13 {
	/*
	 * Assignment 13:
Write automation script for https://the-internet.herokuapp.com/dropdown 
	 */
  @Test
  public void testCase1() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	  //Open url - 
	  driver.get("https://the-internet.herokuapp.com/dropdown");
	  //Locate the Dropdown
	  WebElement dropDowmEle=driver.findElement(By.id("dropdown"));
	  Select sc=new Select(dropDowmEle);
	  //Select option2 from drownDown
	  sc.selectByIndex(2);
	  
  }
}
