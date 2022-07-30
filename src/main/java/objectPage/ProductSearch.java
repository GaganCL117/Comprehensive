package objectPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.ProductSearchUI;

public class ProductSearch {


	WebDriver driver;
	
	public ProductSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	HelperClass help = new HelperClass();
	
	public void searchPowder(String text) {
		help.sendkeysAndEnter(ProductSearchUI.input, text);
	}
	
	public void products() throws Exception {
		help.click(ProductSearchUI.button);
	}
	
	public void findRetailor() throws Exception {
		help.click(ProductSearchUI.findRetailors);
	}
	
	public void close() throws Exception {
		help.click(ProductSearchUI.close);
	}
	
	public void verify() {
		boolean val = help.isDisplayed(ProductSearchUI.verify);
		if(val) {
			Assert.assertTrue(true);
			System.out.println("Validation Pass");
		}else {
			Assert.assertTrue(false);
			System.out.println("Validation Fail");
		}
	}
}
