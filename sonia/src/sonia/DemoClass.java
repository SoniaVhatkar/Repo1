package sonia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		
		String projectLocation=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation+"driver\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Bags");
		driver.findElement(By.cssSelector("#gh-btn")).click();
		}

}
