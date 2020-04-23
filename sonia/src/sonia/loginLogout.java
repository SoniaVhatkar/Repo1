package sonia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginLogout {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement( By.cssSelector(("#u_0_m"))).sendKeys("Sonia");
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("Whatkar");

}
}
