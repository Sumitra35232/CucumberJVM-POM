package methods;

import org.testng.Assert;

import pageObjects.MyAccoutHomePage;
import pageObjects.RegistrationPage;
import testBase.TestBase;


public class RegistrationPageMethods{
	public static MyAccoutHomePage homepage;
	
	public RegistrationPageMethods()
	{
		super();
	}

public static String validateRegistrationPageTitle(){
		
		return TestBase.driver.getTitle();
	}

public static boolean validateCreateAccountForm()
{
	return RegistrationPage.createAccountForm.isDisplayed();
}

public static MyAccoutHomePage register()
{
	RegistrationPage.registerBtn.click();
	System.out.println("We are on my account home page");
	return homepage;
	
}

public static void validateErrorMessage()
{
	String actualError=RegistrationPage.errorMessage.getText();
	System.out.println("Actual error is "+actualError);
    String expectedError="An account using this email address has already been registered. Please enter a valid password or request a new one.";
	Assert.assertEquals(actualError, expectedError);
}


	
}

