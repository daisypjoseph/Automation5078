package com.BlazeDemo.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	
	public Properties prop;
	
	//when you create object for class file should be loaded
	public PropertiesUtil(String fileName)
	{
		  //Properties file use Properties class
		   prop=new Properties();
		 File f1=new File(System.getProperty("user.dir")+"//TestData//"+fileName+".properties");
		  
		  //read data as stream
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			//load file
			  prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		 }

	
	//method to get the value of key
	public String getValue(String key)
	{
		return prop.getProperty(key);
		
	}
	
	
}
