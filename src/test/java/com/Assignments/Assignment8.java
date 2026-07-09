package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
/*
* automate Test case 1: Positive LogIn test
Open page
Type username student into Username field
Type password Password123 into Password field
Push Submit button
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page
 */
	public static void main(String[] args) {
		//create driver session with Chrome driver
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open url
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//maximize browser
		driver.manage().window().maximize();
		//locate and enter email
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
		//locate and enter pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		//click login
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//Verify page url contains - practicetestautomation.com/logged-in-successfully/
		System.out.println("Current url contans - practicetestautomation.com/logged-in-successfully/ ? "+driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
		//Verify new page contains expected text ('Congratulations' or 'successfully logged in')
		String str=driver.findElement(By.xpath("//div[@class='post-content']//strong")).getText();
		//System.out.println(str);
		if(str.contains("Congratulations")||str.contains("successfully logged in")) {
			System.out.println("New Page contains the expected text ('Congratulations' or 'successfully logged in')");
		}
		else 
			System.out.println("New Page does not contain the expected text ('Congratulations' or 'successfully logged in')");
		//Verify button Log out is displayed on the new page
		System.out.println("Logout button displayed ? "+driver.findElement(By.xpath("//div[@class='wp-block-group']//a")).isDisplayed());
		//quit browser
		driver.quit();
	
	
	}
	
	
	
	
		
}
