package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAssignment {
/*
 * Assignment 4: Assignment Statement:

Navigate to https://www.naukri.com/, identify all the links available on the webpage, 
count the total number of links, and print the link text along with the 
corresponding href attribute value for each link in the console.
 
*/
	public static void main(String[] args) {
		
		//create driver session with Chrome Driver
		WebDriver driver=new ChromeDriver();
		//navigate to url
		driver.get("https://www.naukri.com");
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize the browser
		driver.manage().window().maximize();
		//Find all the items with tagname <a>
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on the WebPage are: "+allLinks.size());
		System.out.println("--------------------------Link Details------------------------------");
		for(WebElement i:allLinks) {
			System.out.println(i.getText());
			System.out.println(i.getDomAttribute("href"));
		}
		
	}

}
