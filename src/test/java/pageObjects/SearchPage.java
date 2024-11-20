package pageObjects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
//	constructor
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
//	elements
	
	@FindBy(css=".caption h4 a")
	List<WebElement> PrductsNames;
	
	
	public boolean ValidSearch(String keyword) {
		if(PrductsNames.isEmpty() ) {
			return false;
		}
		return PrductsNames.stream().allMatch(product -> product.getText().toLowerCase().contains(keyword.toLowerCase()));
	}
	
	public boolean invalidSearch(String keyword) {
		if(PrductsNames.isEmpty() ) {
			return true;
		}
		else return false;
	}
}
