package sonia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Removelemet {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		WebElement e = driver.switchTo().activeElement();
		System.out.println(e);
		e.sendKeys("abcde");
		Thread.sleep(3000);
		e.clear();
		driver.close();	
		
		
	}

}
