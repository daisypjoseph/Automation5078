package com.bstackdemo.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	private WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//Locators
@FindBy(css="div.shelf-item")
private List<WebElement> allItems;
	
@FindBy(css="div.filters-available-size")
private List<WebElement> filterOptions;

@FindBy(css="span.bag.bag--float-cart-closed")
private WebElement cartBtn;


//Action Methods
public boolean doFilter(String vendor) throws InterruptedException {
	boolean filterPass=true;
	Thread.sleep(1500);
	for(WebElement i:filterOptions) {
		if(i.getText().contains(vendor))
		{
		i.click();
		break;
		}
	}
	Thread.sleep(1500);
	
	 String expectedText = "";

	    if (vendor.equals("Apple")) {
	        expectedText = "iphone";
	    }
	    else if (vendor.equals("Samsung")) {
	        expectedText = "galaxy";
	    }
	    else if (vendor.equals("Google")) {
	        expectedText = "pixel";
	    }
	    else if (vendor.equals("OnePlus")) {
	        expectedText = "plus";
	    }

	    for (WebElement item : allItems) {

	        String name = item.findElement(By.xpath(".//p")).getText();

	        if (!name.toLowerCase().contains(expectedText)) {

	            System.out.println("Unexpected product found: " + name);

	            filterPass = false;
	            break;
	        }
	    }
	
	return filterPass;
}

public int productCount() {
	return allItems.size();
}




}
