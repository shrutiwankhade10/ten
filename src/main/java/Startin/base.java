package Startin;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	  
	public WebDriver startDriver() throws IOException  {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\selenium workspace\\May15\\src\\main\\java\\Startin\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D://selenium-java-3.141.59//chromedriver.exe");
			driver=new ChromeDriver();
			}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D://selenium-java-3.141.59//geckodriver.exe");
			driver=new FirefoxDriver();
			}
		else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver","D://selenium-java-3.141.59//IEdriverserver.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshotPath(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File source =ts.getScreenshotAs(OutputType.FILE);
		 String destinationFile =System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		 FileUtils.copyFile(source, new File(destinationFile));
	}
	
}
