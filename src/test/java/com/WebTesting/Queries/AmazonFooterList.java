package com.WebTesting.Queries;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooterList {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		List<WebElement> allLinks=driver.findElements(By.cssSelector("div.navAccessibility ul>li>a"));
		System.out.println("Total links: "+allLinks.size());
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
		}

	}

}
