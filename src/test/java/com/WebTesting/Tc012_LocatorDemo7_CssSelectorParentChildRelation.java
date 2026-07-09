package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc012_LocatorDemo7_CssSelectorParentChildRelation {

	public static void main(String[] args) 
	{
		//create driver sesion
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//get all links text in console
		List<WebElement> allLinks=driver.findElements(By.cssSelector("div.list-group>a"));
		System.out.println("Total links from list: "+allLinks.size());
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("-------------------------");
		
		//search for Forgotten Password and click 
		for(WebElement i: allLinks)
		{
			if(i.getText().contains("Password"))
			{
				System.out.println("Link found!");
				
				//click
				i.click();
				break;
				
			}
		}
 
		
		
		
		
		
		
		
		
		

	}

}
