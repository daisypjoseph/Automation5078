package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc004_NavigationCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		// Create driver session with Chrome
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");

		//get the title
		System.out.println("Application title is: "+driver.getTitle());
		
		//navigate in same session to facebook
		
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println("Application title is: "+driver.getTitle());
		
		//static wait
		Thread.sleep(1500);

		//back()
		driver.navigate().back();//google
		
		//static wait
		Thread.sleep(1500);
		
		//forward()
		driver.navigate().forward();
		
		//static wait
		Thread.sleep(2000);
		
		//refresh()
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
