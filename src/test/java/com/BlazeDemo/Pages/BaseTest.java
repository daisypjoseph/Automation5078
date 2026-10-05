package com.BlazeDemo.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.BlazeDemo.Utilities.BrowserProvider;
//import com.SwagLab.Utilities.PropertiesUtil;
import com.BlazeDemo.Utilities.PropertiesUtil;




public class BaseTest {
	//declare project level variable
	
	protected WebDriver driver;
	protected HomePage hp;
	protected ReservePage rp;
	protected PurchasePage pp;
	protected PropertiesUtil prop;

	@Parameters({"bname"})
	@BeforeMethod(alwaysRun = true)
	public void setUp(String bname)
	{
		/*
		switch(bname.toLowerCase().trim()) {
		case"chrome":driver =new ChromeDriver();break;
		case"edge":driver=new EdgeDriver();break;
		case"firefox":driver=new FirefoxDriver();break;
		default:driver=new ChromeDriver();break;
		} */
		
		//System.out.println("========== SETUP START ==========");
	   // System.out.println("Browser parameter = " + bname);

		
		prop=new PropertiesUtil("Project");
		//driver=BrowserProvider.setDriver(bname);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver=BrowserProvider.setDriver(bname);
		 //System.out.println("Driver after setDriver = " + driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getValue("swagUrl"));
		//driver.get("https://blazedemo.com/");
		hp=new HomePage(driver);
		rp=new ReservePage(driver);
		pp=new PurchasePage(driver);
		// System.out.println("========== SETUP END ==========");
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
