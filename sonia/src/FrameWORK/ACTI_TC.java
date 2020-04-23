package FrameWORK;

import POM.Home_Pg;
import POM.Acti_login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import POM.Acti_Logout;

public class ACTI_TC extends Home_Pg{
	
	@Test
	
	public void init() throws InterruptedException {
		
		Acti_login login= PageFactory.initElements(driver, Acti_login.class);
		login.addUN("trainee");
		login.addpass("trainee");
		login.Btn();
		Thread.sleep(5000);
		
		Acti_Logout logout= PageFactory.initElements(driver, Acti_Logout.class);
		logout.LogOutBtn();
		
	}
	
	}


