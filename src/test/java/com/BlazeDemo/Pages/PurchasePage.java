package com.BlazeDemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {
	
	
	private WebDriver driver;
	
	public PurchasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

@FindBy(id="inputName")
private WebElement name;

@FindBy(id="address")
private WebElement address;

@FindBy(id="city")
private WebElement city;

@FindBy(id="state")
private WebElement state;

@FindBy(id="zipCode")
private WebElement zipCode;

@FindBy(id="creditCardNumber")
private WebElement creditCardNumber;

@FindBy(id="creditCardMonth")
private WebElement creditCardMonth;

@FindBy(id="creditCardYear")
private WebElement creditCardYear;

@FindBy(id="nameOnCard")
private WebElement nameOnCard;

@FindBy(css="label.checkbox")
private WebElement rememberMe;

@FindBy(xpath="//input[@type='submit']")
private WebElement purchaseBtn;

@FindBy(xpath="//div[@class='container']//h1")
private WebElement confirmText;

public String getPageUrl()
{
	return driver.getCurrentUrl();
}


public String  fillPurchaseData(String n, String a, String c, String s, String z, String cn, String cm, String cy, String nc) {
	
	name.sendKeys(n);
	address.sendKeys(a);
	city.sendKeys(c);
	state.sendKeys(s);
	zipCode.sendKeys(z);
	creditCardNumber.sendKeys(cn);
	creditCardMonth.sendKeys(cm);
	creditCardYear.sendKeys(cy);
	nameOnCard.sendKeys(nc);
	rememberMe.click();
	purchaseBtn.click();
	
	return confirmText.getText();
	
}



	
}
