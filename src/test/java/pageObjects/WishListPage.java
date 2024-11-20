package pageObjects;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {
	
//	constructor
	public WishListPage(WebDriver driver) {
		super(driver);
	}
	
//	Featured Products Elements
	@FindBy(css="#content td:nth-child(2) a")
	WebElement ProductName;
	
	
	public String getProductName() {
		if(ProductName.isDisplayed()) {
			return ProductName.getText().toLowerCase();
		}
		else {return null;}
	}

}