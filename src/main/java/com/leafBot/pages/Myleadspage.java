package com.leafBot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Myleadspage extends ProjectSpecificMethods{
	
	public CreateLeadsPage clickCreateCLeads()
	{
		driver.findElement(By.linkText("Create Lead")).click();
     	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return new CreateLeadsPage();
	}
	
	public FindLeads findLead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
     	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return new FindLeads();
	}
	

}
