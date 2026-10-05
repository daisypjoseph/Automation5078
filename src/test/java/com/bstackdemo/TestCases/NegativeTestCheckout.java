package com.bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bstackdemo.Pages.BaseTest;

public class NegativeTestCheckout extends BaseTest {
	
  @BeforeMethod
  public void pageSetup() {
	  lp.doLogin("demouser", "testingisfun99");
  }
	
  @Test
  public void verifyCheckoutWithoutProd() {
	  cp.clickCheckoutWithoutProd();
	  Assert.assertTrue(cp.pageUrl().contains("signin=true"));
	  System.out.println("Successfully validated Checkout without Product in Cart does not navigate to Checkout Page!");
	  
  }
}
