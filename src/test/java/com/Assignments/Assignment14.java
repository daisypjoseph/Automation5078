package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment14 {
	/*
	 * Assignment 14:
	   Write automation script for datepicker from this 
	   https://demoqa.com/date-picker application
	 */
  @Test
  public void testCase01() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //driver.manage().window().maximize();
	  
	  driver.get("https://demoqa.com/date-picker");
	  //direct entering formated date value in the date field
	  WebElement dateField= driver.findElement(By.id("datePickerMonthYearInput"));
	  dateField.click();
	  for (int i = 0; i < 10; i++) {
		    dateField.sendKeys(Keys.BACK_SPACE);
		}
	  dateField.sendKeys("09/16/2026");
	  
	  //expected date to enter
	  String date="28";
	  String month="January";
	  String year="2027";
	  String time="03:30";
	  
	  //Click anywhere to move control from the 1st calendar
	  driver.findElement(By.xpath("//h1[@class='text-center']")).click();
	  
	  //click an open the Date calendar
	  driver.findElement(By.id("dateAndTimePickerInput")).click();
	  
	  while(true) {
	  //Capture the current month and year from the Calendar
	  String monthYear=driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']//h2")).getText();
	  String currMonth=monthYear.split(" ")[0];
	  String currYear=monthYear.split(" ")[1];
	 
	  if(currMonth.contains(month) && currYear.contains(year)) {
		  System.out.println("Current Month : "+currMonth);
		  System.out.println("Current Year : "+currYear);
		  break;
	  }
	  else
	  {
		 driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
	  }
	  
	  }
	  
	  //for selecting the date
	  List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='react-datepicker__month']//div[contains(@class,'react-datepicker__day') "
	  		+ "and not(contains(@class,'react-datepicker__day--outside-month'))]"));
	  for(WebElement i:allDates) {
		  
		  if(i.getText().contains(date)) 
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  //for selecting the time
	  List<WebElement> allTimes=driver.findElements(By.xpath("//div[@class='react-datepicker__time-box']/ul/li"));
	  System.out.println(allTimes.size());
	  
	  for(WebElement i:allTimes)
	  {
		  if(i.getText().contains(time))
		  { 
			  i.click();
			  break;
		  }
	  }
	  
  }
}
