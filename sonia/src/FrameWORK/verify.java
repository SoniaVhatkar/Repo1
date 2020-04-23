package FrameWORK;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.GmailLogin;
import POM.Home_Pg;

public class verify extends Home_Pg {
	
	@Test
	
	public void init() throws InterruptedException {
		GmailLogin login= PageFactory.initElements(driver, GmailLogin.class);
		login.setEmail("vhatkarsonia05");
		login.Next1();
		login.setPass("Sonia@123");
		login.Next2();
		Thread.sleep(3000);
	}

	}
