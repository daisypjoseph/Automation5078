package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment11 {
	/*
	 * Assignment 11: 
Write automation script for https://formy-project.herokuapp.com/form this form.
	 */
  @Test
  public void testCase1() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	  //open url
	  driver.get("https://formy-project.herokuapp.com/form");
	  //locate and enter firstname
	  driver.findElement(By.id("first-name")).sendKeys("Shanon");
	  //locate and enter lastname
	  driver.findElement(By.id("last-name")).sendKeys("Dias");
	  //locate on enter Job Title
	  driver.findElement(By.id("job-title")).sendKeys("QA");
	  //select Radio button from Grad School
	  driver.findElement(By.xpath("//div[normalize-space()='Grad School']/input")).click();
	  //select checkbox for gender
	  driver.findElement(By.xpath("//div[normalize-space()='Female']/input")).click();
	  //select an option from dropdown
	  WebElement dropdownEle=driver.findElement(By.id("select-menu"));
	  Select sc=new Select(dropdownEle);
	  sc.selectByVisibleText("5-9");
	  
  }
}




















