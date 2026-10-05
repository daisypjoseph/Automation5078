package com.bstackdemo.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.bstackdemo.Utilities.BrowserProvider;
import com.bstackdemo.Utilities.PropertiesUtil;


public class BaseTest {
	//declare project level variable
	
	protected WebDriver driver;
	protected LoginPage lp;
	protected ProductPage pp;
	protected CartPage cp;
	protected CheckoutPage ckp;
	
	
	protected PropertiesUtil prop;
	
	@Parameters({"bname"})
	@BeforeMethod(alwaysRun = true)
	public void setUp(String bname)
	{
		
		
		prop=new PropertiesUtil("Project");
		
		driver=BrowserProvider.setDriver(bname);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(prop.getValue("swagUrl"));
		
		lp=new LoginPage(driver);
		pp=new ProductPage(driver);
		cp=new CartPage(driver);
		ckp=new CheckoutPage(driver);
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
