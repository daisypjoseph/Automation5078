package com.bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bstackdemo.Pages.BaseTest;

public class CheckoutTest extends BaseTest{
	
	
  @BeforeMethod
  public void pageSteup() throws InterruptedException {
	  lp.doLogin("demouser", null);
	  Thread.sleep(1000);
	  //System.out.println("Step 1 complete");
	  cp.addToCartMultiple("iPhone 12 Pro", "iPhone 12 Mini");
	  //System.out.println("Step 2 complete");
	  ckp=cp.clickOnCheckout();
	  //System.out.println("Step 3 complete");
	  Thread.sleep(1500);
	  Assert.assertTrue(cp.pageUrl().contains("checkout"));
	  System.out.println("User navigated to Checkout Page successfully");
}
	
  @Test
  public void verifyCheckoutFlow() throws InterruptedException {
	  
	  ckp.fillCheckoutForm("Daisy", "Joseph", "IC Colony Borivali", "Maharashtra", "401109");
	  Thread.sleep(1000);
	  Assert.assertTrue(ckp.pageUrl().contains("confirmation"));
	  
	  
  }
  
  
}
