package com.BlazeDemo.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePage {

private WebDriver driver;
	
public ReservePage(WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

//Locators
@FindBy(linkText="Travel The World")
private WebElement previousPageLinktext;
	
@FindBy(xpath="//table[@class='table']//tr/td[1]")
private List<WebElement> allFlights;

@FindBy(xpath="//table[@class='table']//tr/td[3]")
private List<WebElement> allOptions;

//public methods
public String getPageTitle()
{
	return driver.getTitle();
}

public String getPageUrl()
{
	return driver.getCurrentUrl();
}

public HomePage navigateToPreviousPage() {
	previousPageLinktext.click();
	return new HomePage(driver);
}

public int countNumOfFlights() {
	return allFlights.size();
}

public String flightPrice(String airlines) {

	int rCount=0;
	String price="";
	for(WebElement i:allOptions) {
		rCount++;
		if(i.getText().contains(airlines))
		{
			price=driver.findElement(By.xpath("//table[@class='table']//tr["+rCount+"]//following-sibling::td[6]")).getText();
			break;
		}
	}
return price;
}

public PurchasePage selectFlight(String airlines) {
int rCount=0;
for(WebElement i:allOptions) {
	rCount++;
	if(i.getText().contains(airlines))
	{
		driver.findElement(By.xpath("//table[@class='table']//tr["+rCount+"]//following-sibling::td[1]")).click();                            
		break;
	}
}
return new PurchasePage(driver);
}



}
