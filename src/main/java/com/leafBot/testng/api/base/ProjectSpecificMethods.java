package com.leafBot.testng.api.base;

import java.io.IOException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.leafBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {
	
	@DataProvider(name = "fetchdata")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData("TC001");
	}	
	
	@BeforeClass
	public void setReportvalue() 
	{
		 testcaseName="TC001";
		  testcaseDec="TestLeads";
		  author="anonyl";
		  category="smoke";
		
	}
  
  @BeforeMethod
  public void beforeMethod() {
	 
	startApp("chrome", "http://leaftaps.com/opentaps");
	node = test.createNode(testcaseName);
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }
  
 
  
  
  
  
  
  
  
  
  
  

}
