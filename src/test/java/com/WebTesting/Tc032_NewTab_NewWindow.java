package com.WebTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc032_NewTab_NewWindow {
  @Test
  public void testTabWindow()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  
	  //newTab--->open facebook 
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
	  //newWindow
	  WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  
	  Set<String> allWins=driver.getWindowHandles();
	  System.out.println("Total windows: "+allWins.size());
	  
	  List<String> allWindows=new ArrayList<String>(allWins);
	  
	  ElementUtil.switchToExpectedWindow(driver,allWindows,"Facebook");
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
