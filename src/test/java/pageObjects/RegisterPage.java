package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
	
//	constructor
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
//	elements
	@FindBy(css="#input-firstname")
	WebElement InputFname;
	
	@FindBy(css="#input-lastname")
	WebElement InputLname;
	
	@FindBy(css="#input-email")
	WebElement InputEmail;
	
	@FindBy(css="#input-telephone")
	WebElement InputPhone;
	
	@FindBy(css="#input-password")
	WebElement InputPWD;
	
	@FindBy(css="#input-confirm")
	WebElement InputConfirmPWD;
	
	@FindBy(css="input[type=\"checkbox\"]")
	WebElement CheckPrivacy;
	
	@FindBy(css="input[type=\"submit\"]")
	WebElement BtnSubmitReg;
	
	public void enterFname(String Fname) {
		InputFname.sendKeys(Fname);
	}
	
	public void enterLname(String Lname) {
		InputLname.sendKeys(Lname);
	}
	
	public void enterEmail(String Email) {
		InputEmail.sendKeys(Email);
	}
	
	public void enterPhone(String phone) {
		InputPhone.sendKeys(phone);
	}
	
	public void enterPwd(String pwd) {
		InputPWD.sendKeys(pwd);
	}
	
	public void confirmPwd(String pwd) {
		InputConfirmPWD.sendKeys(pwd);
	}
	
	public void checkPrivacy() {
		CheckPrivacy.click();
	}
	
	public void submitReg() {
		BtnSubmitReg.click();
	}
}
