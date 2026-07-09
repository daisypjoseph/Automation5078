package com.WebTesting;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class Tc047_PeginationWebTableAutomation {
  @Test
  public void testPegination() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
	  ElementUtil.scrollUpToElement(driver,ele);
	  
	  //Number of pages
	  List<WebElement> allPages=driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
	  System.out.println("Number of pages are : "+allPages.size());//4
	  
	  Iterator<WebElement> ir=allPages.iterator();
	  
	  while(ir.hasNext())
	  {
		  WebElement page=ir.next();
		  //open page
		  page.click();
		  
		  int numOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		  System.out.println("For page "+page.getText()+" Number of rows : "+numOfRows);
		  
		  
	  }
	  
	  
	  System.out.println("---------------");
	  Thread.sleep(2000);
	  //scenario 2: goto page number 2 and get the all product in console
	  
	  Iterator<WebElement> ir2=allPages.iterator();
	  
	  while(ir2.hasNext())
	  {
		  WebElement page=ir2.next();
		  
		  if(page.getText().contains("2"))
		  {
			  page.click();//open page
			  
			  //all product
			  List<WebElement> allProducts=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr/td[2]"));
			  
			  for(WebElement i:allProducts)
			  {
				  System.out.println(i.getText());
			  }
			  
			  
			  
			  
		  }
		  
	  }
	  
	  
	  
	  System.out.println("---------------");
	  Thread.sleep(2000);
	  //scenario 2: goto page number 3 and from the product find "Fitness tracker" and check checkbox
	  
	  Iterator<WebElement> ir3=allPages.iterator();
	  
	  while(ir3.hasNext())
	  {
		  WebElement page=ir3.next();
		  
		  if(page.getText().contains("3"))
		  {
			  page.click();//open page
			  
			  //all product
			  List<WebElement> allProducts=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr/td[2]"));
			  
			  for(WebElement i:allProducts)
			  {
				  if(i.getText().contains("Fitness Tracker"))
				  {
					  //click on checkbox
					  driver.findElement(By.xpath("//td[text()='Fitness Tracker']//following-sibling::td/input")).click();
				  }
				  
				  
			  }
			  
			  
			  
			  
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
