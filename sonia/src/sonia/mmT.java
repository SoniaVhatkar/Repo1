package sonia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmT {
		static {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		WebElement To = driver.findElement(By.id("fromCity")); 
		To.sendKeys("Lon");
		Thread.sleep(1000);
		List<WebElement> auto=driver.findElements(By.xpath("//p[contains(.,'Lon')]"));
		System.out.println(auto.size());
		auto.get(2).click(); 
		Thread.sleep(1000);
		driver.close();
	 
		}

}
