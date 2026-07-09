package com.WebTesting;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc001_BrowserLaunch
{

	public static void main(String[] args)
	{
		// Create driver session with ChromeBrowser
		WebDriver driver=new ChromeDriver();
		
		//create driver session with EdgeBrowser
		WebDriver driver2=new EdgeDriver();
		
		//create driver session with Firefox
		WebDriver driver3=new FirefoxDriver();
		
		//we dont create searchContext object : as This Interface support only two methods
		//1.findElement() 2.findElements()
		
		SearchContext driver4=new ChromeDriver();
		
		
		

	}

}
