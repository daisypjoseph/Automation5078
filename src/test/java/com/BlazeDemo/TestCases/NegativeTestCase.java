package com.BlazeDemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BlazeDemo.Pages.BaseTest;

public class NegativeTestCase extends BaseTest{
	
	
	
@BeforeMethod(alwaysRun = true)
public void pageSetup() throws InterruptedException {

	Thread.sleep(1500);
	  hp.selectSource("Boston");
	  hp.selectDest("Berlin");
	  rp=hp.clickFindFlightsBtn();
	  Thread.sleep(1000);
	  pp=rp.selectFlight("United Airlines");
	
}
	
  @Test(priority=1,groups = {"negative"})
  public void verifyBlankCC() throws InterruptedException {
	  
	  pp.fillPurchaseData("Daisy", "Gokul Miraroad",  "Thane",  "Maharashtra",  "4011589",  "",  "9",  "2030",  "Daisy Joseph");
	  Thread.sleep(1000);
	  Assert.assertTrue(pp.getPageUrl().contains("https://blazedemo.com/purchase.php"));
	  
	  
  }
  
  @Test(priority=2,groups = {"negative"})
  public void verifyNonMumericCC() throws InterruptedException {
	  
	  pp.fillPurchaseData("Daisy", "Gokul Miraroad",  "Thane",  "Maharashtra",  "4011589",  "qweqwe@#$@#ewr",  "9",  "2030",  "Daisy Joseph");
	  Thread.sleep(1000);
	  Assert.assertTrue(pp.getPageUrl().contains("https://blazedemo.com/purchase.php"));
	  
	  
  }
  
  @Test(priority=3,groups = {"negative"})
  public void verifyBlankReqFeilds() throws InterruptedException {
	  
	  pp.fillPurchaseData("", "",  "",  "",  "",  "qweqwe@#$@#ewr",  "9",  "2030",  "Daisy Joseph");
	  Thread.sleep(1000);
	  Assert.assertTrue(pp.getPageUrl().contains("https://blazedemo.com/purchase.php"));
	  
	  
  }
}
