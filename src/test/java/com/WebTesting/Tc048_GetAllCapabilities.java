package com.WebTesting;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc048_GetAllCapabilities {
  @Test
  public void getAllCapabilities() 
  {
	  
	  
	  //chrome
	  ChromeDriver driver=new ChromeDriver();
	  
	  //Capabilities is interface
	 Capabilities cap= driver.getCapabilities();
	 
	 System.out.println(cap.getBrowserName());
	 System.out.println(cap.getBrowserVersion());
	 System.out.println(cap.getPlatformName());
	 
	 //all supported properties: asMap()
	 Map<String,Object> allProp=cap.asMap();
	 System.out.println(allProp);
	 
	 /*
	  * {acceptInsecureCerts=false,
	  *  browserName=chrome, browserVersion=149.0.7827.201,
	  *   chrome={chromedriverVersion=149.0.7827.155 (07b52360cc15066f987c910ab34dfbcd4a8778d2-refs/branch-heads/7827@{#3246}), 
	  *   userDataDir=C:\Users\piyun\AppData\Local\Temp\scoped_dir22196_799634842}, 
	  *   fedcm:accounts=true, goog:chromeOptions={debuggerAddress=localhost:52083}, 
	  *   goog:processID=30656, networkConnectionEnabled=false, pageLoadStrategy=normal,
	  *    platformName=windows, proxy=Proxy(),
	  *     se:cdp=ws://localhost:52083/devtools/browser/c3015153-4768-4947-b705-1307223ac8f5, 
	  *     se:cdpVersion=149.0.7827.201, setWindowRect=true, 
	  *     strictFileInteractability=false, 
	  *     timeouts={implicit=0, pageLoad=300000, script=30000},
	  *      unhandledPromptBehavior=dismiss and notify, 
	  *      webauthn:extension:credBlob=true, webauthn:extension:largeBlob=true, 
	  *      webauthn:extension:minPinLength=true,
	  * 
	  *  webauthn:extension:prf=true, webauthn:virtualAuthenticators=true}
	  */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
