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
	
//	other login scenarios
//	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
//	public void invalidLogin(String email, String password, String testResult) {
//
////		Home Page
//		HomePage homepage = new HomePage(driver);
//		homepage.clickOnMyAcc();
//		homepage.clickOnLogin();
////		Login Page
//		LoginPage loginpage = new LoginPage(driver);
//		String loginPageTitle = driver.getTitle();
//		loginpage.enterEmail(email);
//		loginpage.enterPwd(password);
//		loginpage.login();
//		MyAccountPage myaccountpage = new MyAccountPage(driver);
//		String currPageTitle = driver.getTitle();
//		
////		boolean targetPage =  myaccountpage.checkHeader();
//		
//		if(testResult.equalsIgnoreCase("valid")) {
//			if (!loginPageTitle.equals(currPageTitle)) {
//				myaccountpage.clickOnLogout();
//				Assert.assertTrue(true);
//			}
//			else {
//				System.out.println("failed at email " + email + "and password " + password);
//				Assert.assertTrue(false);
//			}
//		}
//		
//		if(testResult.equalsIgnoreCase("invalid")) {
//			if(loginPageTitle.equals(currPageTitle)) {
//				Assert.assertTrue(true);
//			}
//			else {
//				myaccountpage.clickOnLogout();
//				System.out.println("failed at email " + email + " and password " + password);
//				Assert.assertTrue(false);
//			}
//		}
//
//	}
}

