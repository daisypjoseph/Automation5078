package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc049_HeadlessBrowserTest {
  @Test
  public void testHeadlessMode() 
  {
	  
	  	//chromeOptions
	  		ChromeOptions options=new ChromeOptions();
	  		options.addArguments("--headless");
	  
	  
	  
	  		//Create driver session
			WebDriver driver=new ChromeDriver(options);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			System.out.println("Driver session created!");
			driver.get("https://www.google.com/");
			
			System.out.println("Application open!");
			//search for keyword
			driver.findElement(By.id("APjFqb")).sendKeys("Jenkins");
			
			System.out.println("Keyword Searched!");
			//get the suggestions from google in console
			List<WebElement> allOptions=driver.findElements(By.cssSelector("ul[role='listbox']>li"));
			
			System.out.println("Total options: "+allOptions.size());
			
			for(WebElement i:allOptions)
			{
				System.out.println(i.getText());
				
			}
			
  }
}
