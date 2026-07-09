package com.Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {
/*
 * Automate Test case 3: Negative password test
Open page
Type username student into Username field
Type password incorrectPassword into Password field
Push Submit button
Verify error message is displayed
Verify error message text is Your password is invalid!
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
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		//click login
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//Verify error message is displayed
		System.out.println("Error message displayed? "+driver.findElement(By.xpath("//div[@id='error']")).isDisplayed());
		//Verify error message text is Your password is invalid!
		String str=driver.findElement(By.xpath("//div[@id='error']")).getText();
		if(str.equals("Your password is invalid!"))
			System.out.println("Error message text is - Your password is invalid!");
		else
			System.out.println("Error message text is not - Your password is invalid!");
		driver.quit();

	}

}
