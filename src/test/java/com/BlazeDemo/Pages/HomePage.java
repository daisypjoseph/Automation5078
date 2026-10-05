package com.BlazeDemo.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {//pass driver from the Base Test
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	

//Locators
@FindBy(name="fromPort")
private WebElement sourceDropDown;

@FindBy(name="toPort")
private WebElement destDropDown;

@FindBy(xpath="//input[@type='submit']")
private WebElement findFlightBtn;

@FindBy(xpath="//h1")
private WebElement pageLabel;


//Action Methods
public String getPageTitle()
{
	return driver.getTitle();
}


public String getPageUrl()
{
	return driver.getCurrentUrl();
}

public boolean sourceDropdnVisibility() {
	return sourceDropDown.isDisplayed();
}

public boolean destDropdnVisibility() {
	return destDropDown.isDisplayed();
}

public boolean textVisibility() {
	return pageLabel.isDisplayed();
}


public HomePage selectSource(String source) {
		
	Select sc=new Select(sourceDropDown);
	List<WebElement> allOptions=sc.getOptions();

	for(WebElement i:allOptions) {
		if(i.getText().contains(source)) {
			i.click();
			break;
		}
	}
	return this;
}


public HomePage selectDest(String dest) {
	Select sc=new Select(destDropDown);
	List<WebElement> allOptions=sc.getOptions();
	for(WebElement i:allOptions) {
		if(i.getText().contains(dest)) {
			i.click();
			break;
		}
	}
	return this;
}

public ReservePage clickFindFlightsBtn() {
	findFlightBtn.click();
	//navigating to reserve Page
	return new ReservePage(driver);
}


}
