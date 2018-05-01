package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class RegistrationPage extends TestBase {
	
@FindBy(id="create-account_form")
public static WebElement createAccountForm;

@FindBy(id="email_create")
public static WebElement emailAddress;

@FindBy(id="SubmitCreate")
public static WebElement createAccountButton;

@FindBy(id="id_gender1")
public static WebElement MrRadioBton;

@FindBy(id="id_gender2")
public static WebElement MrsRadioBton;

@FindBy(id="customer_firstname")
public static WebElement customerFirstName;

@FindBy(id="customer_lastname")
public static WebElement customerLastName;

@FindBy(id="email")
public static WebElement customerEmail;

@FindBy(id="passwd")
public static WebElement password;

@FindBy(id="id_gender2")
public static WebElement dob;

@FindBy(id="firstname")
public static WebElement addrFirstName;

@FindBy(id="lastname")
public static WebElement addrLastName;

@FindBy(id="company")
public static WebElement company;

@FindBy(id="address1")
public static WebElement addr1;

@FindBy(id="address2")
public static WebElement addr2;

@FindBy(id="city")
public static WebElement city;

@FindBy(id="id_state")
public static WebElement stateLocator;

@FindBy(id="postcode")
public static WebElement zipCode;

@FindBy(id="id_country")
public static WebElement country;

@FindBy(id="other")
public static WebElement additionalRemarks;

@FindBy(id="phone")
public static WebElement homePhone;

@FindBy(id="phone_mobile")
public static WebElement Mobile;

@FindBy(id="alias")
public static WebElement alternateAddress;

@FindBy(id="submitAccount")
public static WebElement registerBtn;

@FindBy(xpath=".//*[@id='create_account_error']/ol/li")
public static WebElement errorMessage;

public static void RegPageinitElements()
{
	PageFactory.initElements(driver, RegistrationPage.class);
}

}
