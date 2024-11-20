package pageObjects;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparisonPage extends BasePage {
	
//	constructor
	public ProductComparisonPage(WebDriver driver) {
		super(driver);
	}
	
//	Featured Products Elements
	@FindBy(css="#content td:nth-child(2) a")
	WebElement Product1Name;
	@FindBy(css="#content td:nth-child(3) a")
	WebElement Product2Name;
	
	
	public String getFirstProductName() {
		if(Product1Name.isDisplayed()) {
			return Product1Name.getText().toLowerCase();
		}
		else {return null;}
	}
	
	public String getSecondProductName() {
		if(Product1Name.isDisplayed()) {
			return Product2Name.getText().toLowerCase();
		}
		else {return null;}
	}

}