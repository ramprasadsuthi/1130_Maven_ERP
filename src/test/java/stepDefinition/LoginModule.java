package stepDefinition;

import org.openqa.selenium.By;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginModule {
	
	BaseMethods base;
	
	@Given("ERP Application is launched")
	public void erp_application_is_launched() {
	   base = new BaseMethods();
	   base.openBrowser();
	   base.launchERP();
	}
	@When("User Enters username, password and click on login")
	public void user_enters_username_password_and_click_on_login() {
	  base.loginERP();  
	}
	@Then("Validate the result")
	public void validate_the_result() {
		String pageName = base.driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(pageName, "Dashboard");
	}

}
