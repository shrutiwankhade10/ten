package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObj {
	public WebDriver driver;
	By un=By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	By pwd=By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");
	By logbt=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	
			
	
	public LoginObj(WebDriver driver) {
		this.driver=driver;
			}
	
	public WebElement username() {
		return driver.findElement(un);
	}
	
	public WebElement password() {
		return driver.findElement(pwd);
	}
	public WebElement LoginButt() {
		return driver.findElement(logbt);
		
	}

}
