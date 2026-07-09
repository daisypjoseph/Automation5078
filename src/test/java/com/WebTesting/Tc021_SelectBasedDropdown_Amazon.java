package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc021_SelectBasedDropdown_Amazon {
  @Test
  public void testDropdown() throws InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  driver.get("https://www.amazon.in/");
	  
	//identify dropdown element
	  WebElement dropdownEle=driver.findElement(By.cssSelector("div#nav-search-dropdown-card select"));
	  System.out.println("Is element displayed?: "+dropdownEle.isDisplayed());//false
	  Select sc=new Select(dropdownEle);
	  System.out.println("Is dropdown support single selection or multiple selection?: "+sc.isMultiple());
	  
	  //single option selection
	  sc.selectByVisibleText("Books");
	  
	  
	  
	  
	  /*
	  
	  
	  ElementUtil.selectBasedDropdown(dropdownEle,"Kindle Store");
	  
	  
	  
	  
	  //As dropdown is <select> based so create object of Select class
	  
	  
	  sc.selectByIndex(3);
	  Thread.sleep(2000);
	  sc.selectByValue("search-alias=stripbooks");
	 
	  //to get all options
	  List<WebElement> allOptions=sc.getOptions();
	  System.out.println("Total options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("MP3 Music"))
		  {
			  //select it
			  i.click();
			  break;
		  }
	  }
	  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
