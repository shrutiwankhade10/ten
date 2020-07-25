package Startin;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
import org.apache.logging.log4j.*;
import PageObject.LoginObj;
import PageObject.PageFirst;

public class LoginTest extends base {
	public WebDriver driver;
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	@Test(dataProvider="getData")
	
	public void loginMe(String un,String pwd) throws IOException {
		driver=startDriver();
		driver.get(prop.getProperty("urlflip"));
		PageFirst pr=new PageFirst(driver);
		pr.Login().click();
		LoginObj l=new LoginObj(driver);
		l.username().sendKeys(un);
		l.password().sendKeys(pwd);
		l.LoginButt().click();
		Log.info("done");
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="fsgg@gmail.com";
		data[0][1]="jjgkjsb";
		data[1][0]="jksh@gmail.com";	
		data[1][1]="jqgdkj";		
		data[2][0]="gdjh@gmail.com";
		data[2][1]="jhsxuo";	
		return data;
	}
	
	@AfterTest
	public void termni() {
		driver.close();
	}

}
