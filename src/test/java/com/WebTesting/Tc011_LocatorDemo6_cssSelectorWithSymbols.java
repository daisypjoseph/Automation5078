package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc011_LocatorDemo6_cssSelectorWithSymbols {

	public static void main(String[] args)
	{
		//  create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.amazon.in/");
		
		//search for watch: cssSelector with * contains()
		driver.findElement(By.cssSelector("input[id*='searchtext']")).sendKeys("watch",Keys.ENTER);
		
		
		//clear the search text : CssSelector with ^ startswith()
		driver.findElement(By.cssSelector("input[id^='twotab']")).clear();
		
		//search for bags: cssSelector with $ endsWith()
		driver.findElement(By.cssSelector("input[id$='box']")).sendKeys("bag",Keys.ENTER);
		
		
		
		
		
		
		

	}

}
