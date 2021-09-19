package pages;



import org.openqa.selenium.chrome.ChromeDriver;

import base.SpecificMethods;

public class ViewLead extends  SpecificMethods {
	public  ViewLead(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	public ViewLead verifyFirstname()
	{
		System.out.println("FirstName");
		return this;
	}
}
