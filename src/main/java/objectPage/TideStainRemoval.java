package objectPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.TideStainRemovalUI;

public class TideStainRemoval {

	WebDriver driver;

	public TideStainRemoval(WebDriver driver) {
		this.driver = driver;
	}

	HelperClass help = new HelperClass();

	public void moveToShopProducts() throws Exception {
		help.hover(TideStainRemovalUI.shopProduct);
	}

	public void clickOnStainRemoval() throws Exception {
		help.click(TideStainRemovalUI.stainRemoval);
	}
	
	public void verify() throws Exception {
		String text = help.getText(TideStainRemovalUI.verify);
		System.out.println(text);
		if(text.equals("Detergents for Stain Removal")) {
			Assert.assertTrue(true);
			System.out.println("Validation Pass");
		}else {
			Assert.assertTrue(false);
			System.out.println("Validation Fail");
		}
	}
	
}
