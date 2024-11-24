package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ConfirmAccPage;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import utilities.DataProviders;

public class TC001_AccountRegisterTest extends BaseTest {
//	@Test
//	public void validRegister() {
//		HomePage homepage = new HomePage(driver);
//		homepage.clickOnMyAcc();
//		homepage.clickOnRegister();
//		RegisterPage registerpage = new RegisterPage(driver);
//		registerpage.enterFname(randomString().toUpperCase());
//		registerpage.enterLname(randomString().toUpperCase());
//		registerpage.enterEmail(randomString() + "@gmail.com");
//		registerpage.enterPhone(randomNum());
//		String pwd = randomStrNum();
//		registerpage.enterPwd(pwd);
//		registerpage.confirmPwd(pwd);
//		registerpage.checkPrivacy();
//		registerpage.submitReg();
//		ConfirmAccPage confirmaccpage = new ConfirmAccPage(driver);
//			if(confirmaccpage.isAccountCreated()) {
//				Assert.assertTrue(true);
//			}
//			else {
//				Assert.assertTrue(false);
//			}
//		
//	}
	
	@Test(dataProvider="registerData", dataProviderClass=DataProviders.class)
	public void invalidRegister(String fName, String lName, String mail, String phone, String pwd, String confirmpwd) {
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAcc();
		homepage.clickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		String regPageTitle = driver.getTitle();
		System.out.println(regPageTitle);
		registerpage.enterFname(fName);
		registerpage.enterLname(lName);
		registerpage.enterEmail(mail);
		registerpage.enterPhone(phone);
		registerpage.enterPwd(pwd);
		registerpage.confirmPwd(confirmpwd);
		registerpage.checkPrivacy();
		registerpage.submitReg();
		ConfirmAccPage confirmaccpage = new ConfirmAccPage(driver);
		String currTitle = driver.getTitle();
		System.out.println(currTitle);
		if(currTitle.equalsIgnoreCase(regPageTitle)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
//			if(confirmaccpage.isAccountCreated()) {  
//				confirmaccpage.clickOnLogout();
//				Assert.assertTrue(false);
//			}
//			else {
//				Assert.assertTrue(true);
//			}
//		Assert.assertTrue(true);
//		
	}
	
}
