package pageObjects;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
	
//	constructor
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
//	Featured Products Elements
	@FindBy(css="#content td:nth-child(2) a")
	WebElement ProductName;
	
	
	public String getProductName() {
		return ProductName.getText().toLowerCase();
	}

}