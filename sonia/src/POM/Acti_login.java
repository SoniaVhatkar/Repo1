package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Acti_login {
	
	WebDriver driver;
	
	public Acti_login (WebDriver driver) {
		this.driver=driver;
	}
	
	// find locators
	
	@FindBy(how=How.NAME, using="username")WebElement Username;
	@FindBy(how=How.NAME, using="pwd") WebElement Pass;
	@FindBy(how=How.CLASS_NAME, using="initial")WebElement Button;
	
	public void addUN(String user)
	{
		Username.sendKeys(user);
	}
	public void addpass(String pasd)
	{
		Pass.sendKeys(pasd);
	}
	public void Btn()
	{
		Button.click();
	}
}

