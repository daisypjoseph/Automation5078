package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment20 {
	/*
	 * Assignment 20: Automate https://the-internet.herokuapp.com/context_menu
	 * application
	 */
	@Test
	public void testCase01() {
		// create session with Chrome Driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Open Url
		driver.get("https://the-internet.herokuapp.com/context_menu");
		WebElement ele = driver.findElement(By.id("hot-spot"));
		// Perform right click using Actions Class
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		// To move control to the Alert
		Alert alt1 = driver.switchTo().alert();
		System.out.println("Alert Text is: " + alt1.getText());
		// Click Ok on the Alert
		alt1.accept();
		// close the browser
		driver.quit();

	}
}
