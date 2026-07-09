package com.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		//Create Driver session with Chrome Driver 
		WebDriver driver=new ChromeDriver();
		//Open https://www.demoblaze.com 
		driver.get("https://www.demoblaze.com");
		Thread.sleep(1500);
		//Navigate to https://demoqa.com
		driver.navigate().to("https://demoqa.com");
		Thread.sleep(1500);
		//Navigate to https://automationexercise.com
		driver.navigate().to("https://automationexercise.com");
		Thread.sleep(1500);
		//Click browser Back button using Selenium
		driver.navigate().back();
		Thread.sleep(1500);
		//Verify the URL belongs to DemoQA
		String url=driver.getCurrentUrl();
		if(url.contains("demoqa")) {
			System.out.println("Url belongs to DemoQA");
		}
		else
			System.out.println("Url does not belong to DemoQA");
		Thread.sleep(1500);
		//Click browser Forward button
		driver.navigate().forward();
		//Verify the URL belongs to Automation Exercise.
		String url2=driver.getCurrentUrl();
		if(url2.contains("automationexercise")) {
			System.out.println("Url belongs to Automation Exercise");
		}
		else
			System.out.println("Url does not belong to Automation Exercise");
		Thread.sleep(1500);
		//Refresh the page
		driver.navigate().refresh();
		//Print the title after refresh.
		System.out.println("Current Page Title is: "+driver.getTitle());
		driver.quit();
	}

}
