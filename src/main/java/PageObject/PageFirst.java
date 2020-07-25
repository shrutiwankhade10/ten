package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageFirst {
	public WebDriver driver;
	
	By sear= By.xpath("//input[@name='q']");
	By bino=By.xpath("//button[@class='vh79eN']");
	By logi=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a");
	By text=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img");
	public PageFirst(WebDriver driver) {
		this.driver=driver;
	}

	
	public WebElement search() {
		return driver.findElement(sear);
		}
	public WebElement binocular() {
		return driver.findElement(bino);
		
	}
	public WebElement Login() {
		return driver.findElement(logi);
	}
	public WebElement Text(){
		return driver.findElement(text);
	}
	
}
