package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Assignment 6:
Navigate to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
app and automate login and logout with only cssSelector

 */
public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		//create a driver session
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//launch browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//maximize browser
		driver.manage().window().maximize();
		//locate and enter email id
		driver.findElement(By.cssSelector("input[name*='user']")).sendKeys("Admin");
		//locate and enter password
		driver.findElement(By.cssSelector("input[placeholder^='Pass']")).sendKeys("admin123");
		//locate and click Login
		driver.findElement(By.cssSelector("button[type$='mit']")).click();
		//Thread.sleep(3000);
		//System.out.println(driver.getPageSource());
		//locate the arrow to open the menu for logout
		driver.findElement(By.cssSelector("span.oxd-userdropdown-tab>img")).click(); 
		Thread.sleep(3000);
		//click on logout button
		driver.findElement(By.cssSelector("ul.oxd-dropdown-menu>li:nth-child(4)>a")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
