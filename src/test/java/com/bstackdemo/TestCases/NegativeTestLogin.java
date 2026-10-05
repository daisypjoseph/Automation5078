package com.bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bstackdemo.Pages.BaseTest;

public class NegativeTestLogin extends BaseTest {
  @Test(priority=1)
  public void verifyInvalidUserNameLogin() {
	  String text=lp.doLoginInvalidCreds();
	  Assert.assertTrue(text.contains("Invalid Username"));
	  System.out.println("Invalid credentials validation is working as expected!");
  }
  
  
  @Test(priority=2)
  public void verifyBlankCredsLogin() {
	  String text=lp.doLoginBlankCreds();
	  Assert.assertTrue(text.contains("Invalid Username"));
	  System.out.println("Blank credentials validation is working as expected!");
	  
  }
  
}
