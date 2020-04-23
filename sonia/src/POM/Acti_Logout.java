package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Acti_Logout {
		WebDriver driver;
		
		public Acti_Logout (WebDriver driver) {
			this.driver=driver;
		}
		
		// find locators
		
		@FindBy(how=How.ID, using="logoutLink")WebElement Logout;
		
		public void LogOutBtn()
		{
			Logout.click();
		}

	}

