package com.Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class FileUploadPractice {
  @Test
  public void testcase01() throws InterruptedException, AWTException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	  driver.get("https://practice.expandtesting.com/upload");
	  WebElement fileInputEle=driver.findElement(By.id("fileInput"));
	  
	  ElementUtil.scrollUpToElement(driver, fileInputEle);
	  
	  /*
	  fileInputEle.sendKeys("C:\\Users\\daisy\\Desktop\\Daisy Professional Work Docs\\STAR Agile\\Online Live Sessions\\Java Sessions\\Chatinfo.txt");
	  driver.findElement(By.id("fileSubmit")).click();
	  */
	  
	  //Actions class
	  Actions act=new Actions(driver);
	  
	  act.moveToElement(fileInputEle).click(fileInputEle).build().perform();
	  Thread.sleep(3000);
	  //fileInputEle.click();
	  
	  //ctrl+C copy file
	  StringSelection sc=new StringSelection("C:\\Users\\daisy\\Desktop\\Daisy Professional Work Docs\\STAR Agile\\Online Live Sessions\\Java Sessions\\Chatinfo.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  //Robot Class
	  Robot rb=new Robot();
	  
	  //ctrl+V
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);

	  //Release
	  rb.keyRelease(KeyEvent.VK_V);
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  
	  rb.delay(2000);
	  //Enter key
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  
	  //Click Submit
	  WebElement subEle=driver.findElement(By.id("fileSubmit"));
	  ElementUtil.scrollUpToElement(driver, subEle);
	  
	  subEle.click();
	
	  
	  
	  
  }
}















