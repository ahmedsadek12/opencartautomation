package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import utilities.DataProviders;

public class TC004_SearchTest extends BaseTest {
	
	
	@Test(priority= 2)
	public void validSearch() {
		String searchProductName = properties.getProperty("searchProductName");
		HomePage homepage = new HomePage(driver);
		homepage.enterSearchKeyword(searchProductName);
		homepage.clickSearch();
		SearchPage searchpage = new SearchPage(driver);
		Assert.assertTrue(searchpage.ValidSearch(searchProductName));
	}
	
	@Test(dataProvider="SearchData", dataProviderClass=DataProviders.class)
	public void invalidSearch(String keyword, String testResult) {
		HomePage homepage = new HomePage(driver);
		homepage.enterSearchKeyword(keyword);
		homepage.clickSearch();
		SearchPage searchpage = new SearchPage(driver);
		
		if(testResult.equalsIgnoreCase("invalid")) {
			if(searchpage.invalidSearch(keyword)) {
				
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
	}
}

