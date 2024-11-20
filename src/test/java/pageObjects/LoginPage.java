package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
//	constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
//	elements
	@FindBy(css="#input-email")
	WebElement InputEmail;
	
	@FindBy(css="#input-password")
	WebElement InputPWD;	
	
	@FindBy(css="input[type=\"submit\"]")
	WebElement BtnLogin;
	
	@FindBy(css=".form-group a")
	WebElement LinkForgotPwd;
	
	@FindBy(css="#account-login .alert-success")
	WebElement ForgotPwdConfirmMsg;
	
	public void enterEmail(String Email) {
		InputEmail.sendKeys(Email);
	}
	
	public void enterPwd(String pwd) {
		InputPWD.sendKeys(pwd);
	}
	
	public void login() {
		BtnLogin.click();
	}
	
	public void clickForgotPwdLink() {
		LinkForgotPwd.click();
	}
	
	public String getForgotPwdConfirmMsg() {
		return ForgotPwdConfirmMsg.getText();
	}
	
	public boolean checkForgotPwdConfirmMsg() {
		return ForgotPwdConfirmMsg.isDisplayed();
	}
}
