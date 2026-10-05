package com.bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bstackdemo.Pages.BaseTest;

public class LoginPageTest extends BaseTest{
  @Test
  public void verifyLoginFunctionality() throws InterruptedException {
	  
	  Thread.sleep(1500);
	  lp.doLogin("demouser", "testingisfun99");
	  Thread.sleep(1500);
	  Assert.assertTrue(lp.getPageUrl().contains("signin=true"));
	  System.out.println("User Logged in successfully!");
	  
  }
}
