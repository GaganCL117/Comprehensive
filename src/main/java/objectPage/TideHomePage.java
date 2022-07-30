package objectPage;

import org.openqa.selenium.WebDriver;

import reusableComponents.HelperClass;
import uistore.TideHomePageUI;

public class TideHomePage {

	WebDriver driver;
	
	public TideHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	HelperClass help = new HelperClass();
	
	public void waitToCancel() throws Exception {
		help.explicitWaite(TideHomePageUI.cancel);
	}
	
	public void clickOnElement() throws Exception {
		help.click(TideHomePageUI.cancel);
	}
}
