package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.RegistrationPageMethods;
import methods.SignUpMethods;
import pageObjects.RegistrationPage;
import pageObjects.signUpPage;
import testBase.TestBase;

public class SignUpTest extends TestBase{
	
	RegistrationPage registrationPage;
	
	public SignUpTest(){
		super();
		super.initialization();
		signUpPage.initElements();
		 registrationPage=new RegistrationPage();
	}
	

	
	@Given("^user is present in automationpractice website$")
	public  void user_is_present_in_automationpractice_website() throws Throwable {
		String title=SignUpMethods.validateSignUpPageTitle();
		Assert.assertEquals(title, "My Store");
		System.out.println("We are in SignUp Page");
	}

	
	@When("^user clicks on Sign Up$")
	public  void user_clicks_on_Sign_Up() throws Throwable {

//	  Assert.assertTrue(signUpPage.SignInButton.isDisplayed(),"Button is not displayed");
//	  signUpPage.SignInButton.click();
	  registrationPage=SignUpMethods.signUp();
	}

	@Then("^user should get redirected to Registartion Page$")
	public void user_should_get_redirected_to_Registartion_Page() throws Throwable {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate")));
		String reg_title=RegistrationPageMethods.validateRegistrationPageTitle();
		Assert.assertEquals(reg_title, "Login - My Store", "We are not on Registration Page..Check Code");
	}

}
