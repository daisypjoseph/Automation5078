package com.BlazeDemo.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.BlazeDemo.Utilities.ExcelUtil;

public class CustomDataSet 
{
	
	@DataProvider(name="myArrayData")
	public Object[][] getDataSet()
	{
		Object arr[][]= {{"Admin","admin123"},{"Richa","test123"},{"Poonam","test123"},{"Amit","test123"}};
		return arr;
	}
	
	public XSSFWorkbook wb;
	
	
	@DataProvider(name="ExcelData")
	public Object[][] testData()
	{
		//file path
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //FileStream
		  FileInputStream fs;
		  Object arr[][]=null;
		try {
			fs = new FileInputStream(f1);
			//Wb->sheet-->row-->cell-->value
			   wb=new XSSFWorkbook(fs);
			  
			  //number of rows
			  int rows=wb.getSheet("LoginData").getPhysicalNumberOfRows();
			  System.out.println("Total rows: "+rows);//5
			  
			  //number of columns
			  int cells=wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Total Columns: "+cells);//2
			  
			  
			  //design array of same size like file data
			   arr=new Object[rows-1][cells];//skip heading size should be rows-1
			  
			  //read data from file and store it inside file
			  for(int i=1;i<rows;i++)//rows
			  {
				  for(int j=0;j<cells;j++)//column
				  {
					  //array should start from 0
					  arr[i-1][j]=ExcelUtil.getData("LoginData", i, j);
					  
				  }
			
				  
			  }
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return arr;
	}
	
	
	
	
	
	
	
	
	

}
