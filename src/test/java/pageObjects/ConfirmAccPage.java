package pageObjects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmAccPage extends BasePage {
	
//	constructor
	public ConfirmAccPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement ConfrimMsg;
	
	public boolean isAccountCreated() {
		if (!ConfrimMsg.isDisplayed()) {
			return false;
		}
		else {
			return true;
		}
	}
}