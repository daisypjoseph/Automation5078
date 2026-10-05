package com.BlazeDemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseTest;

public class ReservePageTests extends BaseTest{
 
@BeforeMethod(alwaysRun = true)
public void pageSetUp() throws InterruptedException {
	 
	  Thread.sleep(1500);
	  hp.selectSource("Boston");
	  hp.selectDest("Berlin");
	  rp=hp.clickFindFlightsBtn();
	  Thread.sleep(1000);
}
	
	
@Test(priority=1,groups = {"functional"})
public void verifyCountOfFlight() {
		//Capturing and displaying the count of Flight displayed on the Reserve Page
		int i=rp.countNumOfFlights();
		Assert.assertEquals(i, 5);
		System.out.println("Flight count matched!");
		
}
	
@Test(priority=2,groups = {"functional"})	
public void chooseFlight() {
	//Passing the airlines to be selected
	String airlines="United Airlines";
	//Printing the price of the selected airline
	System.out.println("Flight price is "+rp.flightPrice("United Airlines"));
	//Clicking the Choose flight button of the corresponding airline flight
	rp.selectFlight(airlines);
	
	//Verifying user is navigated to the next page i.e Purchase Page
	Assert.assertTrue(rp.getPageUrl().contains("purchase"));
	System.out.println("Flight Select and user navigated to purchase page");
	
}
	
}
