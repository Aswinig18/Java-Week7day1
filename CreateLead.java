package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.SpecificMethods;
import pages.LoginPage;

public class CreateLead extends SpecificMethods{
	@BeforeTest
	public void setFileName() 
	{
		fileName = "CreateLead";

	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String username,String password,String firstname,String lastname,String companyname ) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUsername(username)
		.enterPassword(password)
		.clickOnLoginButton()
		.clickCRMLink()
		.clickLeads()
		.clickOnCreateLead()
		.enterFirstname(firstname)
		.enterLasttname(lastname)
		.enterCompanyname(companyname)
		.enterCreateLead()
		.verifyFirstname();
	}

}
