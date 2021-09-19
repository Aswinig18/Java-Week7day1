package testcase;

import org.testng.annotations.Test;

import base.SpecificMethods;
import pages.LoginPage;

public class VerifyLoginPage extends SpecificMethods {
	@Test
	public void VerifyLogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername("DemoCSR")
		.enterPassword("crmsfa")
		.clickOnLoginButton();
	}

}
