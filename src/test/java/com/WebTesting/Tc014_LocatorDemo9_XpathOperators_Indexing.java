package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc014_LocatorDemo9_XpathOperators_Indexing {

	public static void main(String[] args) 
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//fname: xpath with and operator
		driver.findElement(By.xpath("//input[@class='form-control'  and  @placeholder='First Name']")).sendKeys("Sarita");
		
		//lname: xpath with or Operator
		driver.findElement(By.xpath("//input[@placeholder='Last Name' or @class='form-contro' ]")).sendKeys("sharma");
		
		//random email id
		String email="sarita"+System.currentTimeMillis()+"@gmail.com";
		
		//email: xpath with indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys(email);
		
		//telephone: xpath with position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("55678999");
		
		//password
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("test123");
		
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("test123");
		
		/*
		 * Scenario: 
		 * 1.Get the status of yes radio button(selected? or not?)
		 * 
		 * 2.if yes radio button is not selected then select it
		 * 
		 * 
		 */
		
		WebElement radioEle=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		System.out.println("Current status of Radio button is selected?: "+radioEle.isSelected());
		
		//validation : if radio button is not selected then select it
		
		if(!radioEle.isSelected())
		{
			//then select
			radioEle.click();
		}
		
		System.out.println("Current status of Radio button is selected?: "+radioEle.isSelected());

		
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//click on Continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//success message
		String msg=driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		System.out.println("Success Message: "+msg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
