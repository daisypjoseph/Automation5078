package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generics.ElementUtil;

public class DynamicWebTableAssignment {
  @Test
  public void testcase01() {
WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement tableHeading=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
	  ElementUtil.scrollUpToElement(driver,tableHeading);
	  
	  //get the headings
	  List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@id='taskTable']//tr//th"));
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("------------Specific Column---------------");

	  String expHeading="Disk";
	  int count=0;
	  for(WebElement i:allHeadings)
	  {
		  count++;
		  if(i.getText().contains(expHeading))
		  {
			  //position of column
			  System.out.println("Expected heading "+expHeading+" found at position: "+count );
			  
			  //based on position we can get that specific column
			  List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+count+"]"));
			  for(WebElement j:cellData)
			  {
				  System.out.println(j.getText());
			  }
			  
			  
			  
		  }
	  }
	  
	  
	  
	  System.out.println("-------Specific Row------------------");
	  
	  //table[@id='taskTable']//tbody/tr[4]//td[5]
	//table[@id='taskTable']//tbody/tr/td[1]
	  /*
	   * Scenario CPU load of Chrome process: 8.0%
	   */
	//  String expLoad="8.0%";
	  expHeading="Name";
	  String expRow="Chrome";
	  int rowCount=0,colCount=0;
	  count=0;
	  for(WebElement i:allHeadings) 
	  {
		 count++;
		 if(i.getText().contains(expHeading)) {
			 List<WebElement> browserNames=driver.findElements(By.xpath("//table[@id='taskTable']//tbody/tr/td["+count+"]"));
			 
			 for(WebElement j:browserNames) {
				 rowCount++;
				 if(j.getText().contains(expRow)) {
					 System.out.println("Row number is "+rowCount);
					 expHeading="CPU";
					 for(WebElement k:allHeadings) {
						 colCount++;
						 if(k.getText().contains(expHeading)) {
							 System.out.println("Col number is "+colCount);
							 String actualLoad=driver.findElement(By.xpath("//table[@id='taskTable']//tbody/tr["+rowCount+"]//td["+colCount+"]")).getText();
							 System.out.println("Actual Load is : "+actualLoad);
							 String expLoad=driver.findElement(By.xpath("//strong[@class='chrome-cpu']")).getText();
							 System.out.println("Expected Load is : "+expLoad);
							 if(actualLoad.equals(expLoad)) {
								 System.out.println("CPU Load matches");
							 }
							 
						 }
					 }
				 }
				 
				 
			 }
			 
		 }
  }
  }
}
