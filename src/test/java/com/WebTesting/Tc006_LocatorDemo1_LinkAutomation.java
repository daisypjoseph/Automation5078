package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc006_LocatorDemo1_LinkAutomation {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		
		
		//open application 
		driver.get("https://automationplayground.com/crm/");
		
		//Sign In click
		//driver.findElement(By.id("SignIn")).click();
		
		//linkText() locator
		
		//driver.findElement(By.linkText("Sign In")).click();
		
		//driver.findElement(By.linkText("Sign")).click();//NoSuchElementException
		
		//for partial match use partialLinkText()
		driver.findElement(By.partialLinkText("Sign")).click();
		
		
		
		
		

	}

}
