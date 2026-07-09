package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc005_ElementIdentification {

	public static void main(String[] args)
	{
		//create driver session
		
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com/");
		
		
		//automate searchbox
		
		//technique3: Identify + action
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		
		
		
		
		
		/*
		//technique2: Identify+ Validate + perform action
		
		WebElement searchEle=driver.findElement(By.id("APjFqb"));
		
		if(searchEle.isDisplayed() && searchEle.isEnabled())
		{
			//perform action
			searchEle.sendKeys("Java");
		}
		
		
		
		
		/*
		//technique1: By locator +Identify element+ validate + action
		
		//get the address of element selenium use By class
		By searchBoxAddress=By.id("APjFqb");
		
		//identify element using selenium
		WebElement searchEle=driver.findElement(searchBoxAddress);
		
		//validate
		System.out.println("Search box is displayed on the page?: "+searchEle.isDisplayed());
		System.out.println("Searchbox is enabled?: "+searchEle.isEnabled());
		
		
		//action:search fro keyword Jenkins
		searchEle.sendKeys("Jenkins");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
