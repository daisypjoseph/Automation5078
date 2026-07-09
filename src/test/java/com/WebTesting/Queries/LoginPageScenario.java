package com.WebTesting.Queries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageScenario {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='https://github.com/tourdedave/the-internet']//img")).click();
	}

}
