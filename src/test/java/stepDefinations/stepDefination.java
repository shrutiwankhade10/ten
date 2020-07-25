package stepDefinations;


import org.junit.runner.RunWith;

import PageObject.PageFirst;
import Startin.base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.cucumber.junit.Cucumber;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination extends base{

    @Given("^start browser$")
    public void start_browser() throws Throwable {
       // throw new PendingException();
    	driver=startDriver();
		driver.get(prop.getProperty("urlflip"));
    	
    }

    @When("^send text$")
    public void send_text() throws Throwable {
        //throw new PendingException();
    	PageFirst pr=new PageFirst(driver);
		pr.search().click();
		pr.search().sendKeys(" jhj");
    	
    }

    @Then("^click on search$")
    public void click_on_search() throws Throwable {
       // throw new PendingException();
    	PageFirst pr=new PageFirst(driver);
    	pr.binocular().click();
    }

}