package com.WebTesting.Queries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerQuery {
	@Test
	  public void exampleofdatepicker() throws InterruptedException {
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://formy-project.herokuapp.com/");
		  
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //driver.findElement(By.xpath("//div[@class='dropdown-menu']//a[@href='/datepicker']")).click();
		  
		 //driver.findElement(By.xpath("//th[@class='datepicker-switch' and contains(text(),'July')]")).click();
		 
		 driver.findElement(By.linkText("Datepicker")).click();
		 driver.findElement(By.id("datepicker")).sendKeys("07/08/2026");
		 
		 
}
}