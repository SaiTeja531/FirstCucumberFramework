package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	private AccountsPage ap;
	@Given("user has already logged into the application")
	public void user_has_already_logged_into_the_application(DataTable dataTable) {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		ap = lp.doLogin(dataTable.cell(1, 0),dataTable.cell(1, 1));
	    
	}

	@Given("User is on accounts page")
	public void user_is_on_accounts_page() {
	    ap.getAccountsPageTitle();
	}


	@Then("User gets accounts section")
	public void user_gets_accounts_section(DataTable dataTable) {
	   List<String> expAccountSectionsList = dataTable.asList();
	   System.out.println(expAccountSectionsList);
	   List<String> actualAccountSectionsList=ap.getAccountsSectionsList();
	   System.out.println(actualAccountSectionsList);
	   Assert.assertTrue(expAccountSectionsList.containsAll(actualAccountSectionsList));
	}

	@Then("Accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
