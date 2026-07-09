package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc022_SelectBasedDropdownAutomation_Formy {
  @Test
  public void testDropDown() throws InterruptedException
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://formy-project.herokuapp.com/form");
	  
	  
	  //dropdown
	  WebElement dropdownEle=driver.findElement(By.id("select-menu"));
	  
	  //select
	  Select sc=new Select(dropdownEle);
	  
	  System.out.println("Is dropdown support multiSelection?: "+sc.isMultiple());
	  
	  //select selection
	  sc.selectByVisibleText("10+");
	  Thread.sleep(1000);
	  sc.selectByIndex(2);
	  Thread.sleep(1000);
	  sc.selectByValue("3");
	  
	  
	  //get all options
	  
	  List<WebElement> allOptions=sc.getOptions();
	  System.out.println("Total options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  }
}
