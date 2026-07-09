package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc018_LocatorDemo11_XpathAxies {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=test1232&submit-name=");

		//Find the parent tagname for John element
	String parentTagName=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent tag name for John is: "+parentTagName);//tr
		
		//Find the ancestor tagname for John
		String tagName2=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor tagname for John: "+tagName2);//tbody
		
	//find the all childs from row 4 and print text in console
		List<WebElement> allChilds=driver.findElements(By.xpath("//tbody/tr[4]//child::td"));
		System.out.println("For row 4 total childs elements are: "+allChilds.size());
		
		for(WebElement i:allChilds)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("-------------------------------");
		
		//find the all rows after John element
		int rows=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		
		System.out.println("After John total number of rows: "+rows);//2
		
		//Find all rows before John element
		int beforeRows=driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
		System.out.println("Number of rows before John: "+beforeRows);//4
		
		//find the siblings<td> after John
		int followsibling=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
		System.out.println("Find all siblings after John: "+followsibling);//3
		
		//find the all before sibling of Ashley
		
		int beforeSibling=driver.findElements(By.xpath("//td[text()='Ashley']//preceding-sibling::td")).size();
				
		System.out.println("Find all before sibling for Ashley: "+beforeSibling);//1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
