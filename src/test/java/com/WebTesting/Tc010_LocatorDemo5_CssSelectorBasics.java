package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc010_LocatorDemo5_CssSelectorBasics {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationplayground.com/crm/");
		
		//sign in: CssSelector with id
		driver.findElement(By.cssSelector("a#SignIn")).click();
		
		//email: CssSelector with attribute
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");
		
		//password: CssSelector with attribute
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test123");
		
		
		//checkbox
		driver.findElement(By.cssSelector("input#remember")).click();
		
		//submit button: CssSelector with className
		//driver.findElement(By.cssSelector("button.btn.btn-default.btn-primary")).click();
		
		//submit button: CssSelector with id,classname and attribute
		driver.findElement(By.cssSelector("button#submit-id.btn[name='submit-name']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
