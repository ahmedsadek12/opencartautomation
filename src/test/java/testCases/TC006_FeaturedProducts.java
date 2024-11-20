package testCases;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductComparisonPage;
import pageObjects.SearchPage;
import pageObjects.WishListPage;
import utilities.DataProviders;

public class TC006_FeaturedProducts extends BaseTest {
	
	
//	@Test(priority= 2)
//	public void AddFeaturedProductToCart() {
//		String FeaturedProductName = properties.getProperty("FeaturedProductAddedToCart");
//		HomePage homepage = new HomePage(driver);
//		WebElement FeaturedProduct = homepage.getFeaturedProductByName(FeaturedProductName);
//		homepage.addFeaturedProductToCart(FeaturedProduct);
//		homepage.goToShoppingCart();
//		CartPage cartpage = new CartPage(driver);
//		Assert.assertEquals(FeaturedProductName, cartpage.getProductName());
//	}
//	
//	@Test(priority= 2)
//	public void AddFeaturedProductToWishList() {
//		String FeaturedProductName = properties.getProperty("FeaturedProductAddedToWishList");
//		HomePage homepage = new HomePage(driver);
//		homepage.goToHomePage();
//		WebElement FeaturedProduct = homepage.getFeaturedProductByName(FeaturedProductName);
//		homepage.addFeaturedProductToWishList(FeaturedProduct);
//		homepage.goToWishList();
//		WishListPage wishList = new WishListPage(driver);
//		Assert.assertEquals(FeaturedProductName, wishList.getProductName());
//	}
	
	@Test(priority= 2)
	public void AddFeaturedProductToCompare() {
		String FeaturedProductName1 = properties.getProperty("FeaturedProductCompare1");
		String FeaturedProductName2 = properties.getProperty("FeaturedProductCompare2");
		HomePage homepage = new HomePage(driver);
		homepage.goToHomePage();
		WebElement FeaturedProduct1 = homepage.getFeaturedProductByName(FeaturedProductName1);
		WebElement FeaturedProduct2 = homepage.getFeaturedProductByName(FeaturedProductName2);
		homepage.addFeaturedProductToCompare(FeaturedProduct1);
		homepage.addFeaturedProductToCompare(FeaturedProduct2);
		homepage.goToProductComparisonPage();
		ProductComparisonPage productcomparisonpage = new ProductComparisonPage(driver);
		if(FeaturedProductName1.equalsIgnoreCase(productcomparisonpage.getFirstProductName()) &&
				FeaturedProductName2.equalsIgnoreCase(productcomparisonpage.getSecondProductName())) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	
}

