package com.bstackdemo.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	
	private WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//Locators

	@FindBy(css="div.shelf-item")
	private List<WebElement> allItems;
	
	@FindBy(css="span.bag__quantity")
	private WebElement bagQuantity;

	@FindBy(css="p.title")
	private List<WebElement> cartProdTitle;

	@FindBy(css="div.float-cart__close-btn")
	private WebElement cartCloseBtn;
	
	@FindBy(css="div.buy-btn")
	private WebElement checkoutBtn;
	
	@FindBy(css="div.float-cart__shelf-container>div.shelf-item")
	private List<WebElement> allCartItems;
	
	@FindBy(css="p.sub-price__val")
	private WebElement cartTotalPrice;
	
	@FindBy(css="span.bag.bag--float-cart-closed")
	private WebElement cartIcon;
	
//Action methods
	
	public String pageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String addToCartSingle(String title) {
		for(WebElement item:allItems) {
			String prodTitle=item.findElement(By.xpath(".//p")).getText();
			if(prodTitle.contains(title)) {
				item.findElement(By.cssSelector("div.shelf-item__buy-btn")).click();
				break;
			}
			
		}
		////p[@class='title']//parent::div//following-sibling::div/p
		for(WebElement i:cartProdTitle)
		{
		System.out.println("Product added to Cart is "+i.getText());
		WebElement temp=i.findElement(By.xpath("./parent::div//following-sibling::div/p"));
		System.out.println("Price of " +i.getText()+ " added to Cart is "+temp.getText());
		}
		
		return bagQuantity.getText();
	}

	public String addToCartMultiple(String pTitle1, String pTitle2) throws InterruptedException {
		
		for(WebElement item:allItems) {
			String prodTitle=item.findElement(By.xpath(".//p")).getText();
			if(prodTitle.contains(pTitle1)) {
				item.findElement(By.cssSelector("div.shelf-item__buy-btn")).click();
				break;
			}
			
		}
		Thread.sleep(1500);
		cartCloseBtn.click();
		Thread.sleep(1000);
		for(WebElement item:allItems) {
			String prodTitle=item.findElement(By.xpath(".//p")).getText();
			if(prodTitle.contains(pTitle2)) {
				item.findElement(By.cssSelector("div.shelf-item__buy-btn")).click();
				break;
			}
			
		}
		Thread.sleep(1500);
		for(WebElement i:cartProdTitle)
		{
		System.out.println("Product added to Cart is "+i.getText());
		WebElement temp=i.findElement(By.xpath("./parent::div//following-sibling::div/p"));
		System.out.println("Price of "+i.getText()+" added to Cart is "+temp.getText());
		}
		
		return bagQuantity.getText();
	} 
	
	public boolean priceCheck() {
		double actualPrice=0;
		for(WebElement item:allCartItems) {
			String price=item.findElement(By.xpath("./div[@class='shelf-item__price']/p")).getText();
			System.out.println(price);
			String p=price.split(" ")[1];
			actualPrice=actualPrice+Double.parseDouble(p);
		}
		
		System.out.println("Actual cummulated Price of all products in Cart is "+actualPrice);
		//System.out.println(cartTotalPrice.getText());
		
				String exp=(cartTotalPrice.getText().split(" "))[1];
				double expectedPrice=Double.parseDouble(exp);
				System.out.println("Total Price displayed on the Cart "+expectedPrice);
				
			if(actualPrice==expectedPrice)	
				return true;
			else
				return false;
	}
	
	public String removeItemFromCart(String pTitle) {
		
		for(WebElement item:allCartItems) {
			String prodTitle=item.findElement(By.xpath(".//p")).getText();
			if(prodTitle.contains(pTitle)) {
				WebElement deleteBtn =item.findElement(By.cssSelector("div.shelf-item__del"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", deleteBtn);
				deleteBtn.click();
				break;
			}
		}
		return bagQuantity.getText();
	}
	
	public CheckoutPage clickOnCheckout() {
		checkoutBtn.click();
		return new CheckoutPage(driver);
	} 
	
	public void clickCheckoutWithoutProd() {
		cartIcon.click();
		checkoutBtn.click();
	}
}
