package base;




import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class SpecificMethods  {

	public  ChromeDriver driver;
	public String fileName;
	
	
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(fileName);
	}
	
	@BeforeMethod
	public void preCondition() throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}
