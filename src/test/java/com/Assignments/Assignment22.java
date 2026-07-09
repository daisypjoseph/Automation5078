package com.Assignments;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment22 {
	/*
	 * Assignment 22:
Get all capabilities for MicrosoftEdge browser and Firefox Browser
	 */
  @Test
  public void testcase01() {
	  
	  //MicrosoftEdge browser
	  EdgeDriver driverE=new EdgeDriver();
	  Capabilities cap=driverE.getCapabilities();
	  
	  Map<String,Object> allEdgeProp=cap.asMap();
	  System.out.println("Edge Borwser Properties: ");
	  System.out.println(allEdgeProp);
	  
	  System.out.println("---------------------------------------------------");
	  System.out.println("---------------------------------------------------");
	  
	  //FireFox Browser
	  FirefoxDriver driverF=new FirefoxDriver();
	  Capabilities cap1=driverF.getCapabilities();
	  
	  
	  Map<String,Object> allFirefoxProp=cap1.asMap();
	  System.out.println("Firefox Borwser Properties: ");
	  System.out.println(allFirefoxProp);
	  
  }
}
