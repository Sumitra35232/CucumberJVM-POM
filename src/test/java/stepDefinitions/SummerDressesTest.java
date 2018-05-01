package stepDefinitions;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import methods.MyAccountHomePageMethods;
import pageObjects.LoginPage;
import pageObjects.MyAccoutHomePage;
import pageObjects.RegistrationPage;
import pageObjects.SummerDressesPage;
import pageObjects.signUpPage;
import testBase.TestBase;

public class SummerDressesTest extends TestBase{
	
	
	
	public SummerDressesTest(){
//		super();
//		super.initialization();
		MyAccoutHomePage.homePageInitElements();
		SummerDressesPage.summerPageinitElements();
		
	}
	

	@Then("^I go to Summer Dresses Page from menu Dresses->Summer Dresses$")
	public void i_go_to_Summer_Dresses_Page_from_menu_Dresses_Summer_Dresses() throws Throwable {
		
		MyAccountHomePageMethods.goToSummerDresses();
	    
	}
	

	
	@Then("^I select sort by price Lowest first to check its sorted properly$")
	public void i_select_sort_by_price_Lowest_first_to_check_its_sorted_properly() throws Throwable {
	    
		Select sortByPrice=new Select(SummerDressesPage.sortBy);
		sortByPrice.selectByVisibleText("Price: Lowest first");
		System.out.println("Size of price is" +SummerDressesPage.price.size());
		List<String> prices = new ArrayList<String>();
		for (WebElement e : SummerDressesPage.price)
		{
			System.out.println("Values in price is" +e.getText());
		    prices.add(e.getText());
		}

		// make a copy of the list
		List<String> sortedPrices = new ArrayList<String>(prices);

		// sort the list
		Collections.sort(sortedPrices);

		// true if the prices are sorted
		System.out.println(sortedPrices.equals(prices));
		Assert.assertEquals(sortedPrices, prices);
		
	}

	@Then("^I select sort by price Highest first to check its sorted properly$")
	public void i_select_sort_by_price_Highest_first_to_check_its_sorted_properly() throws Throwable {
	   
		Select sortByPrice=new Select(SummerDressesPage.sortBy);
		sortByPrice.selectByVisibleText("Price: Highest first");
		
		List<String> prices = new ArrayList<String>();
		for (WebElement e : SummerDressesPage.price)
		{
		    prices.add(e.getText());
		}

		// make a copy of the list
		List<String> sortedPrices = new ArrayList<String>(prices);

		// sort the list
		Collections.sort(sortedPrices);
		Collections.reverse(sortedPrices);

		// true if the prices are sorted
		System.out.println(sortedPrices.equals(prices));
		Assert.assertEquals(sortedPrices, prices);
	}


}
