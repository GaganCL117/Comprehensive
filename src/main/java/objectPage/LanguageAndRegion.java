package objectPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.LanguageAndRegionUI;

public class LanguageAndRegion {

	WebDriver driver;

	public LanguageAndRegion(WebDriver driver) {
		this.driver = driver;
	}

	HelperClass help = new HelperClass();
	
	public void changeLang() throws Exception {
		help.click(LanguageAndRegionUI.USlang);
	}
	
	public void selectLang() throws Exception {
		help.click(LanguageAndRegionUI.selectLang);
	}
	
	public void Verify() throws Exception {
		String text = help.getText(LanguageAndRegionUI.gettext);
		System.out.println(text);
		if(text.contains("Find the right")) {
			Assert.assertTrue(true);
			System.out.println("Validation Pass");
		}else {
			Assert.assertTrue(false);
			System.out.println("Validation Pass");
		}
	}
	
	public void select1() throws Exception {
		help.click(LanguageAndRegionUI.cnLang);
	}
	
	public void selectBack() throws Exception {
		help.click(LanguageAndRegionUI.selectBack);
	}
}
