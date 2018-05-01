package methods;

import pageObjects.RegistrationPage;
import pageObjects.signUpPage;
import testBase.TestBase;

public class SignUpMethods {

//	public SignUpMethods(){
//		super();
//	}
	
	public static String validateSignUpPageTitle(){
		
		return TestBase.driver.getTitle();
	}
	

	
	public static RegistrationPage signUp(){
		    	
		signUpPage.SignInButton.click();
		return new RegistrationPage();
	}
	
}

