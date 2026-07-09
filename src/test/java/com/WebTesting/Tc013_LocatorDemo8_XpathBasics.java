package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc013_LocatorDemo8_XpathBasics 
{

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open application
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("test2525@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		
		//click on Login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
