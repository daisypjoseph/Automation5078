package com.BlazeDemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseTest;

public class PurchasePageTests extends BaseTest {

@BeforeMethod(alwaysRun = true)
public void pageSetup() throws InterruptedException {

	Thread.sleep(1500);
	hp.selectSource("Boston");
	hp.selectDest("Berlin");
	rp=hp.clickFindFlightsBtn();
	Thread.sleep(1000);
	pp=rp.selectFlight("United Airlines");
			
	}

@Test(groups = {"functional"})
public void verifyCompletePurchase() throws InterruptedException {
	
	//This Test Case is for a single functional flow for the complete Flight booking
	
	
	String conText=pp.fillPurchaseData("Daisy", "Gokul Miraroad",  "Thane",  "Maharashtra",  "4011589",  "8978589896",  "9",  "2030",  "Daisy Joseph");
	  Thread.sleep(1000);
	  Assert.assertTrue(conText.contains("Thank you for your purchase today!"));
	  
	  System.out.println("Purchase completed succesfully");


}
}
