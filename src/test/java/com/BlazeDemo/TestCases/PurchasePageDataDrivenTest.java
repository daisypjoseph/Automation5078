package com.BlazeDemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.BlazeDemo.DataDrivenTesting.CustomDataSet;
import com.BlazeDemo.Pages.BaseTest;

public class PurchasePageDataDrivenTest extends BaseTest{
	
	
@BeforeMethod
public void pageSetup() throws InterruptedException {



	Thread.sleep(1500);
	  hp.selectSource("Boston");
	  hp.selectDest("Berlin");
	  rp=hp.clickFindFlightsBtn();
	  Thread.sleep(1000);
	  pp=rp.selectFlight("United Airlines");
	  
	
}
	
  @Test(dataProvider = "ExcelData", dataProviderClass = CustomDataSet.class)
  public void verifyCompletePurchase(String name,String addr, String city, String state, String zipCode, String creditCardNumber, String creditCardMonth, String creditCardYear, String nameOnCard) throws InterruptedException {
	  
	//This Test Case is for Data Driven Test for the complete Flight booking
	  
	  String conText=pp.fillPurchaseData(name, addr,  city,  state,  zipCode,  creditCardNumber,  creditCardMonth,  creditCardYear,  nameOnCard);
	  Thread.sleep(1000);
	  Assert.assertTrue(conText.contains("Thank you for your purchase today!"));
	  
	  System.out.println("Purchase completed succesfully");
	  
  }
}
