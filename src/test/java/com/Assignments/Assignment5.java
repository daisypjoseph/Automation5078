package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
/*
 * Assignment 5:
Navigate to https://tutorialsninja.com/demo/index.php?route=account/login app
and automate login using only cssSelector
 */
	public static void main(String[] args) {
		
		//create driver session with Chrome Driver
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open the url
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//maximize browser
		driver.manage().window().maximize();
		//entering email address
		driver.findElement(By.cssSelector("#input-email")).sendKeys("shanon123@gmail.com");
		//entering password
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Shanon@123");
		//click login
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

}
