package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

public class TC002_LoginTest extends BaseTest {
	
//	valid login scenario
	@Test
	public void validLogin() {
//		Home Page
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAcc();
		homepage.clickOnLogin();
//		Login Page
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmail(properties.getProperty("email"));
		loginpage.enterPwd(properties.getProperty("password"));
		loginpage.login();
//		My Account Page
		MyAccountPage myaccountpage = new MyAccountPage(driver);
		if(myaccountpage.checkHeader()) {
			myaccountpage.clickOnLogout();
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
//	other login scenarios
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void Login(String email, String password, String testResult) {

//		Home Page
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAcc();
		homepage.clickOnLogin();
//		Login Page
		LoginPage loginpage = new LoginPage(driver);
		String loginPageTitle = driver.getTitle();
		loginpage.enterEmail(email);
		loginpage.enterPwd(password);
		loginpage.login();
		MyAccountPage myaccountpage = new MyAccountPage(driver);
		String currPageTitle = driver.getTitle();
		
//		boolean targetPage =  myaccountpage.checkHeader();
		
		if(testResult.equalsIgnoreCase("valid")) {
			if (!loginPageTitle.equals(currPageTitle)) {
				myaccountpage.clickOnLogout();
				Assert.assertTrue(true);
			}
			else {
				System.out.println("failed at email " + email + "and password " + password);
				Assert.assertTrue(false);
			}
		}
		
		if(testResult.equalsIgnoreCase("invalid")) {
			if(loginPageTitle.equals(currPageTitle)) {
				Assert.assertTrue(true);
			}
			else {
				myaccountpage.clickOnLogout();
				System.out.println("failed at email " + email + " and password " + password);
				Assert.assertTrue(false);
			}
		}

	}
}

