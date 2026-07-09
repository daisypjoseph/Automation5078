package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc057_ExplicitWaitForDynamicLoading {
  @Test
  public void testExplicitWait()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  	
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By button=By.xpath("//button[text()='Start']");
	  
	  By textEle=By.xpath("(//h4)[2]");
	  
	  
	  driver.findElement(button).click();
	  
	 WebElement ele=ElementUtil.waitForVisibilityOfElement(driver,textEle,5);
	  //loading
	  //String text=driver.findElement(textEle).getText();
	 String text=ele.getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
  }
}
