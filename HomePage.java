package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.SpecificMethods;

public class HomePage extends SpecificMethods
{
	public  HomePage(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	public MyHome clickCRMLink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHome(driver);

	}

}
