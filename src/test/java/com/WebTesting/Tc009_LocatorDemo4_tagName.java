package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc009_LocatorDemo4_tagName {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Number of input boxes 
		List<WebElement> allInputBoxes=driver.findElements(By.tagName("input###"));
		System.out.println(allInputBoxes);//[]
		System.out.println("Total input boxes: "+allInputBoxes.size());//0
		
		//Number of images
		int totalImages=driver.findElements(By.tagName("img")).size();
		System.out.println("Total images are: "+totalImages);//3
		
		//Number of links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());//5
		
		/*
		 * Scenario: identify all links and get every link text and value of href attribute in console
		 * 
		 */
		
		
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getDomAttribute("href"));
			
		}
		
		
		System.out.println("-----------------------");
		
		String expLink="https://www.youtube.com/c/OrangeHRMInc";
		for(WebElement i:allLinks)
		{
			System.out.println(i.getDomAttribute("href"));
			
			if(i.getDomAttribute("href").equals(expLink))
			{
				System.out.println("Link Found!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
