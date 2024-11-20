package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import utilities.DataProviders;

public class TC005_SelectCurrency extends BaseTest {
	
	
	@Test(priority= 2)
	public void ConfirmEuroCurrency() {
		HomePage homepage = new HomePage(driver);
		homepage.ClickOnCurrency();
		Assert.assertTrue(homepage.EuroIsSelected());
	}
	
	@Test(priority= 2)
	public void ConfirmPoundSterlingCurrency() {
		HomePage homepage = new HomePage(driver);
		homepage.ClickOnCurrency();
		Assert.assertTrue(homepage.PoundSterlingIsSelected());
	}
	
	@Test(priority= 2)
	public void ConfirmUSDCurrency() {
		HomePage homepage = new HomePage(driver);
		homepage.ClickOnCurrency();
		Assert.assertTrue(homepage.USDIsSelected());
	}
}

