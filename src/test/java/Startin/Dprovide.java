package Startin;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.FaceObject;

public class Dprovide extends base {

	
	@Test(dataProvider="getData")
	public void checkit(String username,String password) throws IOException {
		driver=startDriver();
		driver.get("https://www.facebook.com/");
		FaceObject j=new FaceObject(driver);
		j.loginDone().sendKeys(username);
		j.pwdDone().sendKeys(password);
		j.searchDone().click();
		}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[2][2];
		data[0][0]="hello@gmail.com";
		data[0][1]="shruti";
		data[1][0]="bye@gmail.com";
		data[1][1]="wankhade";
		
		return data;
		
	}
	
}
