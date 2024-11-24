package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgortPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

public class TC003_ForgotPasswordTest extends BaseTest {
	
//	other login scenarios
	@Test(dataProvider="ForgotPwdData", dataProviderClass=DataProviders.class)
	public void ForgortPassword(String email, String testResult) {

//		Home Page
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAcc();
		homepage.clickOnLogin();
//		Login Page
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickForgotPwdLink();
		ForgortPasswordPage forgortpasswordpage = new ForgortPasswordPage(driver);
		forgortpasswordpage.enterEmail(email);
		forgortpasswordpage.ClickSendNewPwd();
		
//		boolean targetPage =  myaccountpage.checkHeader();
		
		if(testResult.equalsIgnoreCase("valid")) {
			if (loginpage.checkForgotPwdConfirmMsg()) {
				Assert.assertEquals("An email with a confirmation link has been sent your email address.", loginpage.getForgotPwdConfirmMsg());
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(testResult.equalsIgnoreCase("invalid")) {
			if(forgortpasswordpage.checkEmailNotFoundMsg()) {
				Assert.assertEquals("Warning: The E-Mail Address was not found in our records, please try again!", forgortpasswordpage.getEmailNotFoundMsg());
			}
			else {
				Assert.assertTrue(false);
			}
		}

	}
}