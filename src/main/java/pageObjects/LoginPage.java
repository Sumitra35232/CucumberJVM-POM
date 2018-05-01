package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase{
   
	@FindBy(id="email")
	public static WebElement emailAddress;
	
	@FindBy(id="passwd")
	public static WebElement pwd;
	
	@FindBy(id="SubmitLogin")
	public static WebElement submitBtn;
	
	public static void loginInitElements()
	{
		PageFactory.initElements(driver, LoginPage.class);
	}
	
}
