package Startin;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.PageFirst;


public class FlipTest extends base {
	public WebDriver driver;
	public static Logger Log=LogManager.getLogger(base.class.getName());

	@Test(groups= {"smoke"})
	public void searchTe() throws IOException {
		driver=startDriver();
		driver.get(prop.getProperty("urlflip"));
		PageFirst pr=new PageFirst(driver);
		pr.search().click();
		pr.search().sendKeys(" jhj");
		pr.binocular().click();
		//Assert.assertEquals("Flipkart",pr.Text().getText());
		Log.info("alright");
		Log.debug("hello");
		Log.info("shruti");
		Log.debug("hello");
		Log.info("shruti");
		
	}
	
	
@Test (groups= {"smoke"})
public void hello() {
	System.out.println("hello");
}
	
		@Test(dependsOnMethods=("hello"))
		public void bye() {
			System.out.println("bye");
		}
	
	    @Parameters({"url"})
		@Test
		public void passed(String urlname) {
			System.out.println("passed");
			System.out.println(urlname);
		}
	
	
	@AfterTest
	public void termi() {
		driver.close();
	}

}
