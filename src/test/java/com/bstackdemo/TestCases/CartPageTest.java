package com.bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bstackdemo.Pages.BaseTest;

public class CartPageTest extends BaseTest{
	
	
	@BeforeMethod
	public void pageSetup() {
		lp.doLogin("demouser", null);
		
	}
	
  @Test(priority=1)
  public void verifySingleItemInCart() {
	  
	  String bagCount=cp.addToCartSingle("iPhone 12 Mini");
	  Assert.assertEquals(bagCount, "1");
	  System.out.println("Cart count is displayed as 1 when a single product is added on to the Cart!");
  } 
	
  
  @Test(priority=2)
  public void verifyMultipleItemsInCart() throws InterruptedException {

	 String bagCount= cp.addToCartMultiple("iPhone 12 Pro", "iPhone 12 Mini");
  	 Assert.assertEquals(bagCount, "2");
  	 System.out.println("Cart count is displayed as expected for adding 2 products in the Cart!");
  	 Thread.sleep(1500);
  	bagCount=cp.removeItemFromCart("iPhone 12 Mini");
  	 System.out.println("After removing item from Cart, the Cart count is "+bagCount);
  	 Assert.assertEquals(bagCount, "1");
  	 System.out.println("Product successfully removed from Cart!");
  }
  
  @Test(priority=3)
  public void verifyNavigationtoCheckoutPage() throws InterruptedException {
	  
	  cp.addToCartMultiple("iPhone 12 Pro", "iPhone 12 Mini");
	  
	  cp.clickOnCheckout();
	  Thread.sleep(1500);
	  Assert.assertTrue(cp.pageUrl().contains("checkout"));
	  System.out.println("User navigated to Checkout Page successfully");
	
  } 
  @Test(priority=4)
  public void verifyCartPrice() throws InterruptedException {
	  String bagCount= cp.addToCartMultiple("iPhone 12 Pro", "iPhone 12 Mini");
	  	 Assert.assertEquals(bagCount, "2");
	  	 System.out.println("Cart count is displayed as expected for adding 2 products in the Cart!");
	  	 Thread.sleep(1500);
	  	 boolean result=cp.priceCheck();
	  	 Assert.assertTrue(result);
	  	 System.out.println("Price verification is successfull!");
	  
  }
  
}
