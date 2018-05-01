package methods;

import org.openqa.selenium.interactions.Actions;

import pageObjects.MyAccoutHomePage;
import pageObjects.SummerDressesPage;
import testBase.TestBase;

public class MyAccountHomePageMethods {

	public static SummerDressesPage summerdressespage=new SummerDressesPage();
	
	public static SummerDressesPage goToSummerDresses() throws InterruptedException
	{
		

		Actions action=new Actions(TestBase.driver);
		action.moveToElement(MyAccoutHomePage.MenuDresses).build().perform();
		Thread.sleep(500);
		action.moveToElement(MyAccoutHomePage.SummerDresses).click().build().perform();;
		System.out.println("We are on SummerDresses Page");
		return summerdressespage;
	}
	
	
	
}
