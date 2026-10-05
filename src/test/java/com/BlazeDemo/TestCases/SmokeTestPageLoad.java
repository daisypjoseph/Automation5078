package com.BlazeDemo.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseTest;

public class SmokeTestPageLoad extends BaseTest{
  @Test(priority=1,groups = {"smoke"})
  public void verifyPageLoaded() {
	  //Verifying that Page is loaded successfully by capturing the text element visibility from the page
	  Assert.assertTrue(hp.textVisibility());
	System.out.println("Page Loaded successfully");  
  }
  
  
  @Test(priority=2,groups = {"smoke"})
  public void verifyDropdownVisibility() throws InterruptedException {
	  Thread.sleep(1500);
	  //Verifying that the source city dropdown is visible
	  Assert.assertTrue(hp.sourceDropdnVisibility());
	  System.out.println("Source Dropdown is visbile");
	  //Verifying that the destination city dropdown is visible
	  Assert.assertTrue(hp.destDropdnVisibility());
	  System.out.println("Destination Dropdown is visibile");
	 
  }
  
}
