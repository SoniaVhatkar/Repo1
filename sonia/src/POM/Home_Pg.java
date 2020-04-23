package POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class Home_Pg {
	public ChromeDriver driver;
	
	@BeforeSuite
	public void initialize() {
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		driver = new ChromeDriver();
		//To maximize browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To open url
		 driver.get("https://www.gmail.com");
		
		/* driver.get("https://demo.actitime.com/login.do"); */
	}
	
	@AfterSuite
	
	public void close()
	{
	  driver.close();
	}
	
}

