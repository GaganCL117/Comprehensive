package objectPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.TideLiquidProductUI;

public class TideLiquidProduct {

	WebDriver driver;

	public TideLiquidProduct(WebDriver driver) {
		this.driver = driver;
	}

	HelperClass help = new HelperClass();

	public void moveToShopProducts() throws Exception {
		help.hover(TideLiquidProductUI.shopProduct);
	}

	public void clickOnLiquid() throws Exception {
		help.click(TideLiquidProductUI.liquid);
	}
	
	public void clickOnSensitive() throws Exception {
		help.click(TideLiquidProductUI.sensitive);
	}
	
	public void verify() throws Exception {
		String text = help.getText(TideLiquidProductUI.verify);
		System.out.println(text);
		if(text.equals("Shop Tide Liquid Detergents")) {
			Assert.assertTrue(true);
			System.out.println("Validation Pass");
		}else {
			Assert.assertTrue(false);
			System.out.println("Validation Fail");
		}
	}

}
