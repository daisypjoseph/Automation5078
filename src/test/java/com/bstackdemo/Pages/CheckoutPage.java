package com.bstackdemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

//Locators
	@FindBy(id="firstNameInput")
	private WebElement firstName;
	
	@FindBy(id="lastNameInput")
	private WebElement lastName;
	
	@FindBy(id="addressLine1Input")
	private WebElement addr;
	
	@FindBy(id="provinceInput")
	private WebElement state;
	
	@FindBy(id="postCodeInput")
	private WebElement postalCd;
	
	@FindBy(id="checkout-shipping-continue")
	private WebElement submitBtn;
	
	
//Action Methods
	public CheckoutPage fillCheckoutForm(String fn, String ln, String ad, String st, String pc) {
		
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		addr.sendKeys(ad);
		state.sendKeys(st);
		postalCd.sendKeys(pc);
		submitBtn.click();
		
		
		return this;
		
	}
	
	public String pageUrl() {
		return driver.getCurrentUrl();
	}
	
	
}
