package com.bstackdemo.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Locators

	@FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'])[1]")
	private WebElement username;

	@FindBy(id="react-select-2-input")
	private WebElement usernameInput;
	
	@FindBy(xpath = "//div[@class=' css-1wa3eu0-placeholder']")
	private WebElement password;

	@FindBy(id = "login-btn")
	private WebElement loginBtn;

	@FindBy(xpath = "//div[contains(@id,'react-select-2-option')]")
	private List<WebElement> usernameOptions;

	@FindBy(xpath = "//div[contains(@id,'react-select-3-option')]")
	private WebElement passwordOption;
	
	@FindBy(css="h3.api-error")
	private WebElement errorText;

//Action Methods

	public String getPageUrl() {
		//To get the current Page url
		return driver.getCurrentUrl();
	}

	public ProductPage doLogin(String un, String pw){
		//Click on Username dropdown
		username.click();
		//To select the username from dropdown as per the argument passed in the method
		for (WebElement i : usernameOptions) {
			if (i.getText().contains(un)) {
				i.click();
				break;
			}
		}
		//Click on the password dropdown
		password.click();
		//click on the password from the dropdown
		passwordOption.click();
		loginBtn.click();

		return new ProductPage(driver);

	}

	public String doLoginInvalidCreds() {
		
		username.click();
		usernameInput.sendKeys("sedfr");
		driver.findElement(By.id("react-select-2-option-1")).click();
		//Click on the password dropdown
		password.click();
		//click on the password from the dropdown
		passwordOption.click();
		loginBtn.click();
		
		return errorText.getText();
		
	}
	
	public String doLoginBlankCreds() {
		loginBtn.click();
		return errorText.getText();
	}
	
}
