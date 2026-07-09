package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment19 {
	/*
	 * Assignment 19: Complete automation of all frames of this application
	 * https://ui.vision/demo/webtest/frames/
	 */
	@Test
	public void testCase01() {
		 //create driver session
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://ui.vision/demo/webtest/frames/");
		  //switch to frame1
		  driver.switchTo().frame(0);
		  //element inside frame
		  driver.findElement(By.name("mytext1")).sendKeys("Frame1 test");
		  //driver has to come back to main document--->switch to frame2
		  driver.switchTo().defaultContent();
		  //frame2--ele:NoSuchFrameException: no such frame
		  driver.switchTo().frame(1);
		  driver.findElement(By.name("mytext2")).sendKeys("frame2 test");
		  //get the driver focus on mainpage
		  driver.switchTo().defaultContent();
		  //frame3--->ele---->nested frame
		  driver.switchTo().frame(2);
		  driver.findElement(By.name("mytext3")).sendKeys("Parent frame!");
		  //nested frame
		  WebElement frameEle=driver.findElement(By.tagName("iframe"));//innerframe
		  driver.switchTo().frame(frameEle);//driver switch to nested frame now
		  //ele
		  driver.findElement(By.xpath("(//div[@role='radio'])[2]")).click();
		  //driver current focus is on child frame
		  //come to parent frame and clear text
		  driver.switchTo().parentFrame();//frame3
		  driver.findElement(By.name("mytext3")).clear();
		  
		  //Continued from Yesterday's session
		  //switch to mainpage
		  driver.switchTo().defaultContent();
		  //Switch to Frame 4
		  driver.switchTo().frame(3);
		  //Access Frame4 Element
		  driver.findElement(By.name("mytext4")).sendKeys("Frame 4");
		  //Switch back to main page
		  driver.switchTo().defaultContent();
		  //Switch to Frame 5 using WebElement
		  WebElement frame5Ele=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		  driver.switchTo().frame(frame5Ele);
		  //Capture the text
		  String str=driver.findElement(By.xpath("//form[@name='name5']/div")).getText();
		  System.out.println("Text in Frame 5 is: "+str);
		  
		  
	}
}
