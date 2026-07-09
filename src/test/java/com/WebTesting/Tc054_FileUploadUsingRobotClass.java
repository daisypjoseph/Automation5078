package com.WebTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc054_FileUploadUsingRobotClass {
  @Test
  public void testFileUpload() throws AWTException, InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //click on Choose file button
	  //driver.findElement(By.name("file")).click();
	  
	  WebElement ele=driver.findElement(By.name("file"));
//	  
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	  js.executeScript("arguments[0].click();",ele);
	  
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).click(ele).build().perform();
	  
	  //Robot class 
	  Robot rb=new Robot();
	  //delay
	  rb.delay(2000);
	    
	  //ctrl+C copy file
	  StringSelection sc=new StringSelection("C:\\Users\\piyun\\OneDrive\\Desktop\\Appiumsetup.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  
	  //ctrl+v-->press the key
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  //ctrl+v-->release the key
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  //press Enter key
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("file-submit")).click();
	  
	  Thread.sleep(2000);
	  
	  //validate text
	  String text=driver.findElement(By.id("content")).getText();
	  
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
