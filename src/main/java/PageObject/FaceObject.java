package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceObject {
	public WebDriver driver;
	
	By login=By.id("email");
	By pwd=By.id("pass");
	By sear=By.id("u_0_b");
	
	
	
	public FaceObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement loginDone() {
		return driver.findElement(login);
	}
	
	public WebElement pwdDone() {
		return driver.findElement(pwd);
	}
	
	public WebElement searchDone() {
		return driver.findElement(sear);
	}

}
