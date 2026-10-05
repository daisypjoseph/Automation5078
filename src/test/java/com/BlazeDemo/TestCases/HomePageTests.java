package com.BlazeDemo.TestCases;

import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;


import com.BlazeDemo.Pages.BaseTest;

public class HomePageTests extends BaseTest {
  @Test(priority=1,groups = {"functional"})
  public void verifyUrl() {
	  //Capturing and validating the Page url is as expected
	  String url=hp.getPageUrl();
	  Assert.assertTrue(url.contains("blazedemo"));
	  System.out.println("Page url is validated successfully");
  }
  
  @Test(priority=2,groups = {"functional"})
  public void verifyTitle() {
	  //Capturing and validating the Page title is as expected
	  String title=hp.getPageTitle();
	  Assert.assertTrue(title.contains("BlazeDemo"));
	  System.out.println("Page Title validated successfully");
  }
  
  
  @Test(priority=3,groups = {"functional"})
  public void verifySearchFlights() throws InterruptedException {
	 
	  Thread.sleep(1500);
	  //Selecting the Source city from the dropdown
	  hp.selectSource("Boston");
	  //Selecting the Destination city from the dropdown
	  hp.selectDest("Berlin");
	  //Clicking on the Find Flights Button
	  hp.clickFindFlightsBtn();
	  Thread.sleep(1000);
	  //Verifying that user is navigated to Reserve Page
	  Assert.assertTrue(hp.getPageUrl().contains("reserve"));
	  System.out.println("User navigated successfully to Reserve page on the click of FindFlights button");
  }
  
  
}
