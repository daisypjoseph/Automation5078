package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc023_SelectBasedDropdown_Rediffmail {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
	  
	  //day
	  WebElement daydd=driver.findElement(By.className("day"));
	  ElementUtil.selectBasedDropdown(daydd,"28");
	  
	  //month
	  WebElement monthdd=driver.findElement(By.className("month"));
	  ElementUtil.selectBasedDropdown(monthdd,"DEC");
	  
	  //year
	  WebElement yeardd=driver.findElement(By.className("year"));
	  ElementUtil.selectBasedDropdown(yeardd,"2010");
	  
	  
	  
	  
	  
	  
	  
	  
			  
			  
			  
	  /*
	  Select sc=new Select(daydd);
	  System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
	  
			  List<WebElement> allOptions=sc.getOptions();
			  System.out.println("Total options are: "+allOptions.size());
			  for(WebElement i:allOptions)
			  {
				  System.out.println(i.getText());
				  if(i.getText().contains("27"))
				  {
					  i.click();
					  break;
				  }
			  }
	  */
	  
	  
	  //month
	  
	  
	  
	  //year
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
