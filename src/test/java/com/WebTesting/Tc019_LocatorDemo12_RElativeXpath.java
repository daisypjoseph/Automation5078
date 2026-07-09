package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Tc019_LocatorDemo12_RElativeXpath {

	public static void main(String[] args)
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		//find the email which is above password
		driver.findElement(RelativeLocator.with(By.cssSelector("#email-id")).above(By.id("password"))).sendKeys("test@gmail.com");

		//find password which is below emailid
		driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email-id"))).sendKeys("test123");
		
		
		//toLeftOf(): find search box which if left side of SignIn
		driver.findElement(RelativeLocator.with(By.cssSelector("input[aria-label='Search']")).toLeftOf(By.linkText("Sign In"))).sendKeys("CRM");
		
				
		//toRightOf(): Find search box which is right side of Customer service
		driver.findElement(RelativeLocator.with(By.cssSelector("input[aria-label='Search']")).toRightOf(By.linkText("Customer Service"))).clear();
		
		//near(): find checkbox which is near to Remember me text
		driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();
		
		
		
		
		
		
		
	}
	

}
