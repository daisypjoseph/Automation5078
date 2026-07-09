package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc026_DatePickerAutomation_RedBus {
  @Test
  public void testCalendar() throws InterruptedException
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  driver.get("https://www.redbus.in/");
	  
	  
	  Thread.sleep(2000);
	  //driver.manage().window().maximize();
	  //open calendar
	  driver.findElement(By.cssSelector("div[class^='dateInputWrapper']")).click();
	  
	 //expectation
	  String day="27";
	  String month="December";
	  String year="2026";
	    
	  
	  //month selection
	  while(true)
	  {
	  //get the current year and current year
	  String date=driver.findElement(By.cssSelector("p[class^='monthYear']")).getText();
	  
	  String cmonth=date.split(" ")[0];
	  String cyear=date.split(" ")[1];
	  
	  if(cmonth.contains(month) && cyear.contains(year))
	  {
		  System.out.println("Expected month found!");
		  break;
	  }
	  else
	  {
		  //click on arrow
		  driver.findElement(By.xpath("(//i[contains(@class,'icon-arrow')])[2]")).click();
	  }
	  
	  }
	  
	  
	  //date selection
	  
	  List<WebElement> allDates=driver.findElements(By.cssSelector("ul[class^='datesWrap'] li span"));
	  
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(day))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
