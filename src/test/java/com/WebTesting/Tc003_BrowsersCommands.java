package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc003_BrowsersCommands {

	public static void main(String[] args)
	{
		// create driver session with chromeBrowser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//get current page title:getTitle()
		System.out.println("Application title is: "+driver.getTitle());
		
		//get current page Url:getCurrentUrl()
		System.out.println("Application url is: "+driver.getCurrentUrl());
		
		//get the current page source code: getPageSource()
		System.out.println(driver.getPageSource());
		
		
		//close the browser: close()  quit()
		
		//driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
