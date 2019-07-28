package StepDefinitions;

import com.cucmber.utility.Interaction;
import com.cucumber.Initiate.Base;

import PageObjects.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps extends Base
{
	Interaction action = new Interaction(driver);
	LoginPage loginpage = new LoginPage(driver);
	
	@Before
	public void SetUp()
	{
		BrowserSetUp();
		GetUrl("ADMIN");
	}
	
	@Given("^Open application$")
	public void open_application() {
		System.out.println("Application launched");
	}

	@Then("^Login with valid credentials$")
	public void login_with_valid_credentials() {
		loginpage.VerifyLoginPage();
		
	}

	@Then("^Verify Home Page$")
	public void verify_Home_Page() {
	   System.out.println("Verify Home page");
	}

	@After
	public void TearDown()
	{
		CleanUp();
	}

}
