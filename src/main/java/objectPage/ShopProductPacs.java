package objectPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.ShopProductPacsUI;

public class ShopProductPacs {

	WebDriver driver;
	
	public ShopProductPacs(WebDriver driver) {
		this.driver = driver;
	}
	
	HelperClass help = new HelperClass();
	
	public void moveToShopProducts() throws Exception {
		help.hover(ShopProductPacsUI.shopProduct);
	}
	
	public void clickOnPacs() throws Exception {
		help.click(ShopProductPacsUI.pacs);
	}
	
	public void retailer() throws Exception {
		help.click(ShopProductPacsUI.findRetailers);
	}
	
	public void verify() {
		boolean text = help.isDisplayed(ShopProductPacsUI.chennai);
		if(text) {
			Assert.assertTrue(true);
			System.out.println("Validation Pass");
		}else {
			Assert.assertTrue(false);
			System.out.println("Validation Fail");
		}
	}
	
	public void close() throws Exception {
		help.click(ShopProductPacsUI.close);
	}
}
