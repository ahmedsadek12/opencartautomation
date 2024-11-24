package pageObjects;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
//	constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
//	Featured Products Elements
	@FindBy(css="#content .row .product-thumb")
	List<WebElement> FeaturedProducts;
	
//	Featured Products Actions
	public WebElement getFeaturedProductByName(String FeaturedProductName) {
		WebElement FeaturedProduct = FeaturedProducts.stream().filter(product -> product.findElement(By.cssSelector("h4 a")).getText().equalsIgnoreCase(FeaturedProductName)).findFirst().orElse(null);
		return FeaturedProduct;
	}
	
	public void addFeaturedProductToCart(WebElement FeaturedProduct) {
		WebElement desiredProductsAddToCartBtn = FeaturedProduct.findElement(By.cssSelector("#content .row button:nth-child(1)"));
		desiredProductsAddToCartBtn.click();
	}
	
	public void addFeaturedProductToWishList(WebElement FeaturedProduct) {
		WebElement desiredProductsAddToWishListBtn = FeaturedProduct.findElement(By.cssSelector("#content .row button:nth-child(2)"));
		desiredProductsAddToWishListBtn.click();
	}
	
	public void addFeaturedProductToComparison(WebElement FeaturedProduct) {
		WebElement desiredProductsCompareBtn = FeaturedProduct.findElement(By.cssSelector("#content .row button:nth-child(3)"));
		desiredProductsCompareBtn.click();
	}
	
}