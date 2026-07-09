package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc053_FileUploadUsingSendKeys {
  @Test
  public void testFileUpload() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  driver.findElement(By.id("file-upload")).sendKeys("C://Users//piyun//OneDrive//Desktop//Appiumsetup.txt");
	  
	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  Thread.sleep(1000);
	  
	  String text=driver.findElement(By.tagName("h3")).getText();
	  System.out.println("Status: "+text);
	  
	  
	  
	  
  }
}
