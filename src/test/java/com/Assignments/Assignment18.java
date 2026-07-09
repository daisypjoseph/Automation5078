package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment18 {
	/*
	 * Assignment 18: Handling Nested Frames Application URL:
	 * https://demoqa.com/nestedframes 
	 * Objective: Practice handling nested frames
	 * using Selenium WebDriver by switching between the parent frame, child frame,
	 * and the main web page. 
	 * The page contains one parent frame with a nested child
	 * frame.
	 */
	@Test
	public void testcase01() {
		//create a driver session with Chrome Driver
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Open url on the browser
		driver.get("https://demoqa.com/nestedframes");
		//Switch to Parent frame
		driver.switchTo().frame("frame1");
		//Capture the Text from Parent Frame
		String str=driver.findElement(By.xpath("//body[contains(normalize-space(),'Parent')]")).getText();
		System.out.println("Text inside Parent Frame is : "+str);
		//Switch to Child Frame(Nested Frame)
		WebElement childFrame=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);
		//Capture Text from Child Element
		String str1=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println("Text Inside Child Frame is :"+str1);
		//Switching to Main Document
		driver.switchTo().defaultContent();
		String str2=driver.findElement(By.xpath("//div[@id='framesWrapper']//div")).getText();
		System.out.println("Text inside Main Document is: "+str2);
		
	}
}










