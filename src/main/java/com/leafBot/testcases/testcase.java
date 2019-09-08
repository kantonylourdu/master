package com.leafBot.testcases;
import org.testng.annotations.Test;

import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.pages.Login;
import com.leafBot.pages.MyHomePage2;

public class testcase extends ProjectSpecificMethods{
	//"./data/testdata.xlsx"
	@Test(dataProvider="fetchdata")
	public void runtest(String Uname,String Pwd,String Compyname, String fname, String lname) throws InterruptedException
	{
		new Login()
	     .enterUserName(Uname)
	     .EnterPassword(Pwd)
	     .ClickLogin()
	     .clickCRMSFA()
	     .clickleads()
	     .clickCreateCLeads()
	     .selectCompany(Compyname)
	     .selectFirstName(fname)
	     .selectLastName(lname)
	     .clickCreateLeadbutton()
		.CheckviewLeadsPage()
		.CheckFirstnameViewLeadsPage(fname);
		
		new MyHomePage2()
		.clickleads()
		.findLead()
		.EnterFirstnametosearch(fname)
		.clickFindsearch()
		.clickFindFirstRow();
	    
		
	}

}
