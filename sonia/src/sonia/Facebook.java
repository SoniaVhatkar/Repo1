package sonia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
			public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#email")).sendKeys("SoniaVhatkar");
			driver.findElement(By.cssSelector("#pass")).sendKeys("Sonu1234");
			driver.findElement(By.cssSelector("#u_0_b")).click();
			driver.close();
	
	}

}
