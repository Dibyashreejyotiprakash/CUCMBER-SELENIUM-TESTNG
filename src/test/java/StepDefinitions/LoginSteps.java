package StepDefinitions;

import java.util.List;

import com.cucmber.utility.Interaction;
import com.cucumber.Initiate.Base;

import PageObjects.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Base
{
	Interaction action = new Interaction(driver);
	LoginPage loginpage = new LoginPage(driver);
	
	@Before
	public void SetUp()
	{
		BrowserSetUp();
		
	}
	
	@Given("^Open application$")
	public void open_application() {
		GetUrl("ADMIN");
		System.out.println("Application launched");
	}

	@When("^Login with valid username \"([^\"]*)\" password \"([^\"]*)\"$")
    public void login_with_valid_username_something_password_something(String username, String pwd) {
        loginpage.verifyLogin(username, pwd);
    }
	

	@When("^Login with invalid username \"([^\"]*)\" password \"([^\"]*)\"$")
	    public void login_with_invalid_username_something_password_something(String username, String invalidpwd) throws Throwable {
	        loginpage.verifyLognWithInvalidCredentials(username, invalidpwd);
	    }
	
	 @Then("^Login with valid credentials$")
	    public void login_with_valid_credentials(DataTable data) throws Throwable {
	        List<List<String>> obj= data.raw();
	        
	        String username = obj.get(0).get(0);
	        String pwd = obj.get(0).get(1);
	       loginpage.verifyLoginWithTestDriven(username, pwd);
	    }
	
	

	@Then("^Verify Home Page$")
	public void verify_Home_Page() {
		loginpage.verifyHomePage();
	   System.out.println("Verify Home page");
	}

	@After
	public void TearDown()
	{
		CleanUp();
	}

}
