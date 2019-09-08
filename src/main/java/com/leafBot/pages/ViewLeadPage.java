package com.leafBot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage CheckviewLeadsPage()
	{
		String viewLead = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if (viewLead.equals("View Lead"))
		{
			System.out.println("View Lead page Reached");


		}
		return this;
	}

	public ViewLeadPage CheckFirstnameViewLeadsPage(String fname)
	{
		String fnametxt = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (fnametxt.equals(fname))
		{
			System.out.println("First name Matched");
		}


	return this;
	}

}
