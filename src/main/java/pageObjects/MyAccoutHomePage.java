package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class MyAccoutHomePage extends TestBase {

	
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[2]/a")
	public static WebElement MenuDresses;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
	public static WebElement SummerDresses;
	
	public static void homePageInitElements()
	{
		PageFactory.initElements(driver, MyAccoutHomePage.class);
	}
	
	


}

