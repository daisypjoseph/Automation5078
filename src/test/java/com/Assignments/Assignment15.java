package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment15 {
/*
 * Assignment 15:
Write automation script for Alert ,navigate to this app
https://formy-project.herokuapp.com/switch-window  and handle alert print alert 
message in console
 */
	@Test
  public void testCase01() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		driver.findElement(By.id("alert-button")).click();
		Alert alt1=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt1.getText());
		alt1.accept();
		
	  
  }
}
