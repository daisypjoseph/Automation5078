package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc015_LocatorDemo10_XpathMethods {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");

		//sell: xpath with text()
		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		
		
		//click on cart: Xpath with normalize-space()
		driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
		
		//cart message:Xpath with normalize-space()
		String text1=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println(text1);
		
		
		//cart message: Xpath with contains() with text()/normalize-space()
		String text2=driver.findElement(By.xpath("//h3[contains(normalize-space(),'Cart is empty')]")).getText();
		System.out.println(text2);
		
		
		//searchbox automation with contains() with attribute
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("Laptop",Keys.ENTER);
		
		//searchbox automation using xpath with starts-with()
		WebElement searchBox=driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		
		//clear the text
		searchBox.clear();
		
		//search for mobiles
		searchBox.sendKeys("mobiles",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
