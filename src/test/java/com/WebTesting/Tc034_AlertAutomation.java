package com.WebTesting;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc034_AlertAutomation {
  @Test
  public void testAlerts() throws InterruptedException
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  
	  //alert1:Simple Alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  //alert will open
	  Thread.sleep(1500);
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  
	  //Ok
	  alt1.accept();
	  
	  //result
	  WebElement resultEle=driver.findElement(By.id("result"));
	  System.out.println("Result is: "+resultEle.getText());
	  
	  
	  System.out.println("-----------------------");
	  //alert2: Confirmation alert
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  //alert will open
	  Thread.sleep(1500);
	  
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Alert2 text is: "+alt2.getText());
	  
	  //cancel
	  alt2.dismiss();
	  
	  //result
	  System.out.println("Result is: "+resultEle.getText());
	  
	  
	  System.out.println("-----------------------");
	  
	  //alert3: Prompt Alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  
	  //alert will open
	  Thread.sleep(1000);
	  
	  Alert alt3=driver.switchTo().alert();
	  System.out.println("Alert3 text is: "+alt3.getText());
	  
	  //enter some data
	  alt3.sendKeys("Hello All");
	  
	  //ok
	  alt3.accept();
	  
	  System.out.println("Result is: "+resultEle.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
