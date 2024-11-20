package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgortPasswordPage extends BasePage {
	
//	constructor
	public ForgortPasswordPage(WebDriver driver) {
		super(driver);
	}
	
//	elements
	@FindBy(css="#input-email")
	WebElement InputEmail;	
	
	@FindBy(css="input[type=\"submit\"]")
	WebElement BtnContinue;
	
	@FindBy(css=".alert")
	WebElement EmailNotFoundMsg;
	
	public void enterEmail(String Email) {
		InputEmail.sendKeys(Email);
	}
	
	public void ClickSendNewPwd() {
		BtnContinue.click();
	}
	
	public boolean checkEmailNotFoundMsg() {
		return EmailNotFoundMsg.isDisplayed();
	}
	
	public String getEmailNotFoundMsg() {
		return EmailNotFoundMsg.getText();
	}
}
