package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc045_StaticWebTableAutomation {
  @Test
  public void testStaticTable()
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement tableHeading=driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
	  ElementUtil.scrollUpToElement(driver,tableHeading);
	  
	  //get the number of rows
	  int totalRows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	  System.out.println("Number of rows are: "+totalRows);//7
	  
	  //get the number of columns
	  int totalColumns=driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td")).size();	  
	  System.out.println("Number of columns are: "+totalColumns);//4
	  
	  //print heading of the table
	  List<WebElement> headings=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("-------------------");
	  //Specific row: row number is 5
	  List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]"));
	 for(WebElement i:row)
	 {
		 System.out.print(i.getText()+"    ");
	 }
	
	  System.out.println("--------------------");
	  //specific column
	  List<WebElement> cell=driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[2]"));
	  for(WebElement i:cell)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  /*
	   * Assignment
	   * Scenario:
	   * get the price for every book and print total
	   */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
