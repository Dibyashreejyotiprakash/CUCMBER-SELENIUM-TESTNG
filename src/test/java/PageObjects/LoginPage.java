package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
	
	 By txtusername = By.xpath("//*[@id='txtUsername']");
	 By txtpassword = By.xpath("//*[@id='txtPassword']");
	 By loginbtn = By.xpath("//*[@id='btnLogin']");
	 By invalidloginmsg = By.xpath("//*[@id='spanMessage']");
	
	
	public void verifyLogin(String username,String pwd)
	{
		try{
			action.Type(txtusername, username);
			action.Type(txtpassword,pwd);
			action.Click(loginbtn);	
			action.WaitTime(10);
		}
		catch(Exception e){
			System.out.println("Verify login failed due to "+ e);
		}
	}
	
	public void verifyLognWithInvalidCredentials(String username,String invalidpwd){
		try{
			action.Type(txtusername, username);
			action.Type(txtpassword, invalidpwd);
			action.Click(loginbtn);	
			action.WaitTime(10);
			
			boolean statusoferrormsg = action.IsElementDisplayed(invalidloginmsg);
			Assert.assertTrue(statusoferrormsg);
		}
		catch(Exception e){
			System.out.println("Verify login with invalid credentials failed due to "+ e);
		}
	}
	
	
	public void verifyLoginWithTestDriven(String username,String pwd)
	{
		try{
			action.Type(txtusername, username);
			action.Type(txtpassword,pwd);
			action.Click(loginbtn);	
			action.WaitTime(10);
		}
		catch(Exception e){
			System.out.println("Verify login failed due to "+ e);
		}
	}
	
	public void verifyHomePage(){
		try{
			String expurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
			String acturl = driver.getCurrentUrl();
			Assert.assertEquals(acturl, expurl);
		}
		catch(Exception e){
			System.out.println("Verify home page failed due to "+ e);
		}
	}
	
	
	

}
