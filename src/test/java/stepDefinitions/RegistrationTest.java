package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.RegistrationPageMethods;
import methods.SignUpMethods;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import pageObjects.signUpPage;
import testBase.TestBase;

public class RegistrationTest extends TestBase {
	RegistrationPage RegPage;
	
	public RegistrationTest(){
		super();
		super.initialization();
		signUpPage.initElements();
		RegistrationPage.RegPageinitElements();
		LoginPage.loginInitElements();
		RegPage=new RegistrationPage();
		
	}
	
	@Given("^the user is on registration page$")
	public void the_user_is_on_registration_page() throws Throwable {
		RegPage=SignUpMethods.signUp();
	    System.out.println("We are on Registration Page");
	    
	}
	

	@Then("^I enter email address of new user as \"([^\"]*)\"$")
	public void i_enter_email_address_of_new_user_as(String customerEmail) throws Throwable {
		RegistrationPage.emailAddress.sendKeys(customerEmail);
	}
	
	@Then("^I fill all mandatory details  with parameters as \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_fill_all_mandatory_details_with_parameters_as( String title, String customerFirstName, String customerLastName, String password, String addrFirstName, String addrLastName, String addr1, String city, String state, String zip, String mobile) throws Throwable {
	    
		
		
		if("Mr".equals(title))
		{
			RegistrationPage.MrRadioBton.click();
		}else if("Mrs".equals(title))
		{
			RegistrationPage.MrsRadioBton.click();
		}
		RegistrationPage.customerFirstName.sendKeys(customerFirstName);
		RegistrationPage.customerLastName.sendKeys(customerLastName);
		RegistrationPage.password.sendKeys(password);
		RegistrationPage.addrFirstName.sendKeys(addrFirstName);
		RegistrationPage.addrLastName.sendKeys(addrLastName);
		RegistrationPage.addr1.sendKeys(addr1);
		RegistrationPage.city.sendKeys(city);
		Select state1=new Select(RegistrationPage.stateLocator);
		state1.selectByVisibleText(state);
//		RegistrationPage.state.sendKeys(state);
		RegistrationPage.zipCode.sendKeys(zip);
		RegistrationPage.Mobile.sendKeys(mobile);
		
	}



	@Then("^I click on CreateAccount button$")
	public void i_click_on_CreateAccount_button() throws Throwable {
		RegistrationPage.createAccountButton.click();
	}
	
	@When("^I click on Register button and redirected to MyAccount Home Page$")
	public void i_click_on_Register_button_and_redirected_to_MyAccount_Home_Page() throws Throwable {
	    
		RegistrationPageMethods.register();
	}

	
	@When("^I enter  an already registered emailID$")
	public void i_enter_an_already_registered_emailID(DataTable emailID) throws Throwable {
		List<Map<String,String>> data = emailID.asMaps(String.class,String.class);
		RegistrationPage.emailAddress.sendKeys(data.get(0).get("registeredEmail")); 
	}

	@Then("^I validate the error message received$")
	public void i_validate_the_error_message_received() throws Throwable {
	   RegistrationPageMethods.validateErrorMessage();
	}
	
	
	@Then("^I enter login credentials and click on submit button$")
	public void i_enter_login_credentials_and_click_on_submit_button(DataTable userCredentials) throws Throwable {
		List<Map<String,String>> data = userCredentials.asMaps(String.class,String.class);
		LoginPage.emailAddress.sendKeys(data.get(0).get("username")); 
		LoginPage.pwd.sendKeys(data.get(0).get("password")); 
		LoginPage.submitBtn.click();
	    
	}
	
	




}
