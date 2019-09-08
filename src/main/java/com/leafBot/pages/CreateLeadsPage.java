package com.leafBot.pages;

import org.openqa.selenium.By;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadsPage extends ProjectSpecificMethods {
	
public CreateLeadsPage selectCompany(String mycomp) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(mycomp);
	
	return this;
}

public CreateLeadsPage selectFirstName(String fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	
	return this;
}


public CreateLeadsPage selectLastName(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	
	return this;
}
public ViewLeadPage clickCreateLeadbutton() {
	
	driver.findElement(By.name("submitButton")).click();
	
	return new ViewLeadPage();
}

}












