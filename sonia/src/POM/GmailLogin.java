package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailLogin {
	WebDriver driver ;
	public  GmailLogin (WebDriver driver)
	{
		this.driver= driver;
	}
	// finding locators
	
	@FindBy(how=How.ID, using="identifierId") WebElement UserID;
	@FindBy(how=How.ID, using="identifierNext") WebElement Next_1;
	@FindBy(how=How.NAME,  using="password") WebElement PSWD;
	@FindBy(how=How.ID, using="passwordNext") WebElement Next_2;
	
		public void setEmail(String strEmail){
		UserID.sendKeys(strEmail);
		}
		public void Next1()
	{
		Next_1.click();
	}
		
	public void setPass(String StrPass){
		PSWD.sendKeys(StrPass);
		}
	public void Next2()
	{
		Next_2.click();
	}
	
	}