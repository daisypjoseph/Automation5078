package com.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
		//Create Driver session with ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//Open Selenium Website
		driver.get("https://www.selenium.dev");
		
		//print page title
		System.out.println("Page Title is: "+driver.getTitle());
		
		//Print current URL
		System.out.println("Current title is: "+driver.getCurrentUrl());
		
		//maximize the browser 
		driver.manage().window().maximize();
		
		//verifying whether Page Title contains Selenium
		String str = driver.getTitle();
		if(str.contains("Selenium")) {
			System.out.println("Page Titile contains Selenium");
		}
		else
			System.out.println("Page Title does not contain Selenium");
		
		Thread.sleep(3000);
		
		//refresh browser
		driver.navigate().refresh();
		Thread.sleep(1500);
		
		driver.quit();;

	}

}
