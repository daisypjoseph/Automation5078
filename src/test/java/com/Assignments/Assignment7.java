package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
/*
 * Assignment 7: Login Functionality Testing – The Internet Herokuapp
Application URL:https://the-internet.herokuapp.com/login
Test Data
Valid Credentials
Username: tomsmith
Password: SuperSecretPassword!
Automate this application login and logout using xpath
 */
	public static void main(String[] args) {
		//create a driver session using Chrome driver
		WebDriver driver=new ChromeDriver();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open the url
		driver.get("https://the-internet.herokuapp.com/login");
		//maximize browser
		driver.manage().window().maximize();
		//locate and enter email
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		//locate and enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		//click on Login
		driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
		//click on Logout
		driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
		//quit the browser
		driver.quit();

	}

}
