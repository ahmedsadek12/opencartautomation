package pageObjects;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	navigation links
	@FindBy(css="a[title=\"My Account\"]")
	WebElement LinkMyAcc;
	@FindBy(css = ".dropdown-menu-right li:first-child")
	WebElement LinkRegister;
	@FindBy(css=".dropdown-menu-right li:last-child")
	WebElement LinkLogin;
	@FindBy(css=".list-group-item:last-child")
	WebElement LinkLogout;
	@FindBy(css="a[title='Shopping Cart']")
	WebElement LinkShoppingCart;
	@FindBy(css="#wishlist-total")
	WebElement LinkWishList;
	@FindBy(css="#logo a")
	WebElement LinkHomePage;
	@FindBy(css=".alert-success a:nth-of-type(2)")
	WebElement LinkProductComparisonPage;
	
//	Search Elements
	@FindBy(css="#search input[type=\"text\"]")
	WebElement SearchBarInput;
	@FindBy(css="#search .input-group-btn")
	WebElement SearchBtn;
	
//	Change Currency Elements
	@FindBy(css="#form-currency")
	WebElement CurrencyLink;
	@FindBy(css=".btn-group.open button[name=\"EUR\"]")
	WebElement EuroLink;
	@FindBy(css=".btn-group.open button[name=\"GBP\"]")
	WebElement PoundSterlingLink;
	@FindBy(css=".btn-group.open button[name=\"USD\"]")
	WebElement USDLink;
	@FindBy(css=".btn-group strong")
	WebElement CurrencySymbol;
	
//	waiting functionality
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	public void waitElToAppear(WebElement el) {
		wait.until(ExpectedConditions.visibilityOf(el));
	}
	public void waitElToBeClickable(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}
	
//	Navigation Actions
	public void clickOnMyAcc() {
		LinkMyAcc.click();
	}
	public void clickOnRegister() {
		waitElToAppear(LinkRegister);
		LinkRegister.click();
	}
	public void clickOnLogin() {
//		waitElToAppear(LinkLogin);
		LinkLogin.click();
	}
	
	public void clickOnLogout() {
		LinkLogout.click();
	}
	
	public void goToShoppingCart() {
		LinkShoppingCart.click();
	}
	
	public void goToWishList() {
		LinkWishList.click();
	}
	
	public void goToHomePage() {
		LinkHomePage.click();
	}
	
	public void goToProductComparisonPage() {
		waitElToBeClickable(LinkProductComparisonPage);
		LinkProductComparisonPage.click();
	}
	
//	Search Functionality
	public void enterSearchKeyword(String keyword) {
		SearchBarInput.clear();
		SearchBarInput.sendKeys(keyword);;
	}
	public void clickSearch() {
		SearchBtn.click();
	}
	
//	Select Currency Actions
	public void ClickOnCurrency() {
		CurrencyLink.click();
	}
	
	public boolean EuroIsSelected() {
		EuroLink.click();
		if(CurrencySymbol.getText().equalsIgnoreCase("€")) {
			return true;
		}
		else {return false;}
	}
	
	public boolean PoundSterlingIsSelected() {
		PoundSterlingLink.click();
		if(CurrencySymbol.getText().equalsIgnoreCase("£")) {
			return true;
		}
		else {return false;}
	}
	
	public boolean USDIsSelected() {
		USDLink.click();
		if(CurrencySymbol.getText().equalsIgnoreCase("$")) {
			return true;
		}
		else {return false;}
	}
	
//	public boolean EuroIsSelected = CurrIsSelected(EuroLink, "€");
//	public boolean PoundSterlingIsSelected = CurrIsSelected(PoundSterlingLink, "£");
//	public boolean USDIsSelected = CurrIsSelected(USDLink, "$");
	
}
