package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment12 {
  @Test
  public void testCase01() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	  //Open the url
	  driver.get("https://www.redbus.in/");
	  //locate the autosuggestion box
	  driver.findElement(By.id("srcinput")).sendKeys("Mumbai");
	  Thread.sleep(1500);
	  List<WebElement> allOptions=driver.findElements(By.xpath("//div[contains(@class,'searchCategory')]//div[@role='heading']"));
	  System.out.println("Total options are: "+allOptions.size());
	  
	  //select Vashi
	  for(WebElement i:allOptions) {
		  System.out.println(i.getText());
		  if(i.getText().contains("Vashi")) {
			  i.click();
			  break;
		  }
	  }
	  
	  //destination input 
	  driver.findElement(By.id("destinput")).sendKeys("Bangalore");
	  Thread.sleep(1500);
	  List<WebElement> destOptions=driver.findElements(By.cssSelector("div[id^='suggestion'] div[role='heading']"));
	  System.out.println("Total options are: "+destOptions.size());
	  
	  //select Yeshwantpur
	  for(WebElement i:destOptions) {
		  System.out.println(i.getText());
		  if(i.getText().contains("Yeshwantpur"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
  }
}










