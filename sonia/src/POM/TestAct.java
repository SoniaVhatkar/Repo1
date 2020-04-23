package POM;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAct {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void  main(String[] args) throws Exception {
		String path= "C:\\Users\\Sonia\\eclipse-workspace\\Excels\\Excel_Auto.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		String username;
		String password;
		Acti_login a1=new Acti_login(driver);
		username = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		System.out.println(username);
		password=wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(password);
		a1.addUN(username);
		Thread.sleep(1000);
		a1.addpass(password);
		Thread.sleep(1000);
		a1.Btn();
		Thread.sleep(2000);
		
	}
	
}
