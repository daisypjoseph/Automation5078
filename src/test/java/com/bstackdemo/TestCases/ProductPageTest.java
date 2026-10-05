package com.bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bstackdemo.Pages.BaseTest;

public class ProductPageTest extends BaseTest{
	

@BeforeMethod
public void pageSetup() {
	pp=lp.doLogin("demouser", null);
	
}
	
 // @Test(priority=1)
  public void verifyFilter() throws InterruptedException  {
	  Assert.assertTrue(pp.doFilter("OnePlus"));
	  System.out.println("The vendor filter is filtering the listed products correctly!");
  }
  
 // @Test(priority=2)
  public void verifyAddToCart() {
	//  String cartQuantity=pp.addToCart("iPhone 12 Mini");
	//  Assert.assertEquals(cartQuantity,"1");
	  
  }
  
}
