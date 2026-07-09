package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		//create Driver session with Chrome Driver
		WebDriver driver=new ChromeDriver();
		//Open the url
		driver.get("https://the-internet.herokuapp.com/login");
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter Username
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//Click Login Button
		driver.findElement(By.className("radius")).click();
		//Quit the browser
		driver.quit();
	}

}
