package stepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	private static String title;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    
	}

	@When("User gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title =lp.getLoginPageTitle();
	    System.out.println("Login page title is: "+title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		
	    Assert.assertTrue(title.contains(string));
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
	    Assert.assertTrue(lp.isForgotPwdLinkExist());
	}

	@When("User enters username {string}")
	public void user_enters_username(String string) {
	    lp.enterPassword(string);
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
	   lp.enterPassword(string);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    lp.clickOnLogin();
	}



}
