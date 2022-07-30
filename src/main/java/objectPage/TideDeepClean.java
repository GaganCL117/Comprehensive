package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.ShopProductPacsUI;
import uistore.TideDeepCleanUI;

public class TideDeepClean {

	WebDriver driver;

	public TideDeepClean(WebDriver driver) {
		this.driver = driver;
	}

	HelperClass help = new HelperClass();

	public void moveToShopProducts() throws Exception {
		help.hover(TideDeepCleanUI.shopProduct);
	}

	public void clickOnDeepClean() throws Exception {
		help.click(TideDeepCleanUI.deepClean);
	}
	
	public void selectType(String value) {
		help.selection(TideDeepCleanUI.select, value);
	}
	
	public void verify() {
		String text = help.getText(TideDeepCleanUI.verify);
		System.out.println(text);
		Assert.assertEquals(text, "Detergent for Deep Clean");
		System.out.println("Validation Pass");
	}
}
