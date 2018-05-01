package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SummerDressesPage extends TestBase {

	@FindBy(id="selectProductSort")
	public static WebElement sortBy;
	
	@FindBy(xpath=".//span[@class='price product-price']")
	public static List<WebElement> price;
	
	public static void summerPageinitElements()
	{
		PageFactory.initElements(driver, SummerDressesPage.class);
	}
}
