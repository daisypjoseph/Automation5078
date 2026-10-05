package com.BlazeDemo.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseTest;

public class SmokeTestCompleteFlow extends BaseTest {
  @Test(groups = {"smoke"})
  public void smokeTestCompleteFlow() throws InterruptedException {
	 
	  	Thread.sleep(1500);
		hp.selectSource("Boston");
		hp.selectDest("Berlin");
		rp=hp.clickFindFlightsBtn();
		Thread.sleep(1000);
		pp=rp.selectFlight("United Airlines");
		String conText=pp.fillPurchaseData("Daisy", "Gokul Miraroad",  "Thane",  "Maharashtra",  "4011589",  "8978589896",  "9",  "2030",  "Daisy Joseph");
		Thread.sleep(1000);
		AssertJUnit.assertTrue(conText.contains("Thank you for your purchase today!"));
		System.out.println("Purchase completed succesfully");
	  
  }
}
