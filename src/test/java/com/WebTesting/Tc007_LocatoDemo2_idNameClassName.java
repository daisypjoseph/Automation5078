package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc007_LocatoDemo2_idNameClassName {

	
	public static void main(String[] args)
	{
		// Create driver session chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Sign in
		driver.findElement(By.linkText("Sign In")).click();
		
		//email id
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		
		//checkbox
		driver.findElement(By.id("remember")).click();
			
		
		//submit button
		//InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		driver.findElement(By.className("btn-primary")).click();
		
		
		
		
		
		

	}

}
