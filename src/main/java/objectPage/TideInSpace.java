package objectPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.TideInSpaceUI;
import uistore.TideStainRemovalUI;

public class TideInSpace {

	WebDriver driver;

	public TideInSpace(WebDriver driver) {
		this.driver = driver;
	}

	HelperClass help = new HelperClass();

	public void moveToOurCommitment() throws Exception {
		help.hover(TideInSpaceUI.ourCommitment);
	}

	public void clickOnTideInSpace() throws Exception {
		help.click(TideInSpaceUI.tideInSpace);
	}

	public void verify() throws Exception {
		String text = help.getText(TideInSpaceUI.verify);
		System.out.println(text);
		Assert.assertEquals(text, "TIDE IN SPACE");
		System.out.println("Validation Pass");
	}

}
