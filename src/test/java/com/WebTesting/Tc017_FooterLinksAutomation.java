package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc017_FooterLinksAutomation {

	public static void main(String[] args) 
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?");
		
		List<WebElement> allFooterLinks=driver.findElements(By.cssSelector("div[class*='col-sm'] ul>li>a"));
		System.out.println("Total Footer links are: "+allFooterLinks.size());
		
		for(WebElement i:allFooterLinks)
		{
			System.out.println(i.getText());
		}
		
		

	}

}
