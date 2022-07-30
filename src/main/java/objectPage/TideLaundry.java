package objectPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.TideLaundryUI;

public class TideLaundry {

	WebDriver driver;

	public TideLaundry(WebDriver driver) {
		this.driver = driver;
	}

	HelperClass help = new HelperClass();

	public void moveToHowToWashCloths() throws Exception {
		help.hover(TideLaundryUI.washCloths);
	}

	public void clickOnLaundry() throws Exception {
		help.click(TideLaundryUI.laundry);
	}

	public void verify() throws Exception {
		String text = help.getText(TideLaundryUI.verify);
		System.out.println(text);
		Assert.assertEquals(text, "How to Do Laundry");
		System.out.println("Validation Pass");
	}

}
