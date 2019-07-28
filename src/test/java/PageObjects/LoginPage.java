package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cucmber.utility.Interaction;
import com.cucumber.Initiate.Base;



public class LoginPage extends Base
{
	
	Interaction action;
	public LoginPage(WebDriver driver)
	{
		driver = this.driver;
		action = new Interaction(driver);
	}
	
	public static By txtusername = By.xpath("//*[@id='txtUsername']");
	public static By txtpassword = By.xpath("//*[@id='txtPassword']");
	public static By loginbtn = By.xpath("//*[@id='btnLogin']");
	
	@Test
	public void VerifyLoginPage()
	{
		action.Type(txtusername, "Admin");
		action.Type(txtpassword,"admin123");
		action.Click(loginbtn);
	
		
	}

}
