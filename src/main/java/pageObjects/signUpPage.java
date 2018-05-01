package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class signUpPage extends TestBase {

	@FindBy(how=How.XPATH,using=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	public static WebElement SignInButton;
	
	public static void initElements()
	{
		PageFactory.initElements(driver, signUpPage.class);
	}
	

}
