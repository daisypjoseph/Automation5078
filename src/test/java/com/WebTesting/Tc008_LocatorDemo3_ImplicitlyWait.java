package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc008_LocatorDemo3_ImplicitlyWait {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//login button
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
