package pageObjects;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {
	
//	constructor
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
//	elements
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement MyAccHeader;
	
	public boolean checkHeader() {
		try {
		return MyAccHeader.isDisplayed();
		}
		catch(NoSuchElementException e) {
			return false;
		}
	}
}
