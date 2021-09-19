package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.SpecificMethods;

public class MyLeads extends SpecificMethods {
	public  MyLeads(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	public CreateLead clickOnCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);

	}

}
