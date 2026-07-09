package com.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment16 {
	/*
	 * Assignment 16: Write automation script where navigate to google app and in
	 * next 10 tab open facebook app.
	 */

	@Test
	public void testCase01() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String parentId = driver.getWindowHandle();

		for (int i = 0; i < 10; i++) {
			WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
			newTab.get("https://www.facebook.com/");
		}

		// Move to Parent Window
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.quit();
	}
}
